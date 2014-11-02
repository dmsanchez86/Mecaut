package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;
import modelo.Logica.Cuenta;
import modelo.Logica.DetalleFactura;
import modelo.Logica.Empleados;
import modelo.Logica.Factura;
import modelo.Logica.GrupoClientes;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;

public class Conexion {

    Connection conect = null;   
    //--------------------------CONEXION CON MYSQL------------------------------
    private final String driver = "com.mysql.jdbc.Driver"; //Clase del driver de jConnector 
    private final String url = "jdbc:mysql://localhost:3306/db_mecaut"; //Cadena de conexion
    private final String usuario = "root"; //Usuario con permisos a la base de datos
    private final String contraseña = "";
    private Connection conexion;
    private PreparedStatement consulta;
    private ResultSet r;
    private ArrayList<Cliente> clientes;
    private ArrayList<GrupoClientes> grupo;
    private ArrayList<Auto> autos;
    private ArrayList<Mantenimiento> mantenimientos;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Empleados> empleados;
    private ArrayList<Repuesto> repuestos;

    public Conexion() {
    }

    //metodo para crear la conexion 
    public boolean crearConexion() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "MECAUT", JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }

    //Metodo para cerrar la conexion
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
        }
    }

    //metodo para validar cuenta
    public String validarCuentas(Cuenta c) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM cuentas WHERE cue_usuario = '" + c.getUsuario() + "' AND cue_contrasena = MD5('" + c.getContrasena() + "')");
            consulta.executeQuery();
            r = consulta.getResultSet();
            while (r.next()) {
                return r.getString(4);
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return null;
    }

    //metodo para registrar una cuenta
    public boolean registrarCuenta(Cuenta c) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO cuentas VALUES(?,?,MD5(?),?)");
            consulta.setString(1, null);
            consulta.setString(2, c.getUsuario());
            consulta.setString(3, c.getContrasena());
            consulta.setString(4, c.getTipo());
            consulta.executeUpdate();
            conexion.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    /* 1. Modulo clientes */
    // *Clientes    
    public boolean agregarCliente(Cliente cli) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?,?,?)");
            consulta.setString(1, cli.getIdentificacion());
            consulta.setString(2, cli.getNombre());
            consulta.setString(3, cli.getApellidos());
            consulta.setString(4, cli.getSexo());
            consulta.setString(5, cli.getTelefono());
            consulta.setString(6, cli.getDireccion());
            consulta.setString(7, cli.getCorreo());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean modificarCliente(Cliente cli) {
        try {
            consulta = conexion.prepareStatement("UPDATE clientes SET cli_nombre = ?, cli_apellidos = ?, cli_sexo = ?, cli_telefono = ?, cli_direccion = ?, cli_correo = ? WHERE cli_id = ?");
            consulta.setString(1, cli.getNombre());
            consulta.setString(2, cli.getApellidos());
            consulta.setString(3, cli.getSexo());
            consulta.setString(4, cli.getTelefono());
            consulta.setString(5, cli.getDireccion());
            consulta.setString(6, cli.getCorreo());
            consulta.setString(7, cli.getIdentificacion());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean eliminarCliente(String id) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM clientes WHERE cli_id = ?");
            consulta.setString(1, id);
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Cliente> consultarClientes() {
        clientes = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM clientes ORDER BY cli_nombre");
            r = consulta.executeQuery();
            while (r.next()) {
                clientes.add(new Cliente(r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7)));
            }
            return clientes;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Cliente> verClientesPorDato(String dato) {
        clientes = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM clientes WHERE cli_id LIKE '" + dato + "%' OR cli_nombre LIKE '" + dato + "%' OR cli_apellidos LIKE '" + dato + "%' OR  cli_direccion LIKE '" + dato + "%' ORDER BY cli_nombre");
            r = consulta.executeQuery();
            while (r.next()) {
                clientes.add(new Cliente(r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7)));
            }
            return clientes;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet TraerDatosClientes(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM clientes WHERE cli_id = " + id + "");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet IdsClientes() {
        try {
            consulta = conexion.prepareStatement("SELECT cli_id FROM clientes");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {
            return null;
        }
    }

    // *Grupo Clientes
    public boolean agregarGrupoCliente(String id, String cod, String nom, String est) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO grupoclientes VALUES (?,?,?,?)");
            consulta.setString(1, cod);
            consulta.setString(2, nom);
            consulta.setString(3, id);
            consulta.setString(4, est);
            consulta.executeUpdate();
            conexion.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean modificarGrupoCliente(String id, String cod, String nom, String est) {
        try {
            consulta = conexion.prepareStatement("UPDATE grupoclientes set gru_nombre = ?, cli_id = ?, cli_estado = ? WHERE gru_codigo = ?");
            consulta.setString(1, nom);
            consulta.setString(2, id);
            consulta.setString(3, est);
            consulta.setString(4, cod);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<GrupoClientes> verGrupoClientes(String dato) {
        grupo = new ArrayList<>();
        try {
            switch (dato) {
                case "Habitual":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '" + dato + "' OR gru_nombre = '" + dato + "'");
                    break;
                case "Ocasional":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '" + dato + "' OR gru_nombre = '" + dato + "'");
                    break;
                case "Potencial":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '" + dato + "' OR gru_nombre = '" + dato + "'");
                    break;
                case "Activo":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '" + dato + "' OR gru_nombre = '" + dato + "'");
                    break;
                case "Inactivo":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '" + dato + "' OR gru_nombre = '" + dato + "'");
                    break;
                default:
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = 'Activo'");
            }
            r = consulta.executeQuery();
            while (r.next()) {
                grupo.add(new GrupoClientes(r.getString(1), r.getString(2), r.getString(3), r.getString(4)));
            }
            return grupo;
        } catch (SQLException e) {
            return null;
        }
    }

    // *Auto
    public boolean agregarAuto(Auto aut) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO autos VALUES (?,?,?,?,?,?,?,?,?)");
            consulta.setString(1, aut.getPlaca());
            consulta.setString(2, aut.getCiudad());
            consulta.setString(3, aut.getTipo());
            consulta.setString(4, aut.getModelo());
            consulta.setString(5, aut.getMarca());
            consulta.setString(6, aut.getKilometraje());
            consulta.setString(7, aut.getCombustible());
            consulta.setString(8, aut.getIdCliente());
            consulta.setString(9, aut.getNombreCliente());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Auto> consultarAutos() {
        autos = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM autos");
            r = consulta.executeQuery();
            while (r.next()) {
                autos.add(new Auto(r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7), r.getString(8), r.getString(9)));
            }
            return autos;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet ConsultarAutosClientes(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM autos WHERE cli_id = '" + id + "'");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet consultarDatosAuto(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM clientes WHERE cli_id = " + id + "");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public ResultSet consultarDatosRepuestos(String codigo) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM repuestos WHERE rep_codigo = " + codigo + "");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet placasAutos() {
        try {
            consulta = conexion.prepareStatement("SELECT aut_placa FROM autos");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet datosMantenimiento(String placa) {
        try {
            consulta = conexion.prepareStatement("SELECT cli_id, cli_nombre FROM autos WHERE aut_placa = ?");
            consulta.setString(1, placa);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }
    /* 2. Modulo Servicios */

    public boolean agregarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO mantenimientos VALUES (?,?,?,?,?,?)");
            consulta.setString(1, man.getTipo());
            consulta.setDate(2, man.getFecha());
            consulta.setString(3, man.getDescripcion());
            consulta.setString(4, man.getCosto());
            consulta.setString(5, man.getPlacaAuto());
            consulta.setString(6, man.getIdMecanico());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean actualizarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("UPDATE mantenimientos SET man_tipo = ?, man_fecha = ?, man_descripcion = ?, man_costo = ? WHERE man_codigo = ?");
            consulta.setString(1, man.getTipo());
            consulta.setDate(2, man.getFecha());
            consulta.setString(3, man.getDescripcion());
            consulta.setString(4, man.getCosto());
            consulta.setInt(5, man.getCodigo());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean eliminarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("Delete From mantenimientos Where man_codigo = ?");
            consulta.setInt(1, man.getCodigo());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Mantenimiento> consultarMantenimientos() {
        mantenimientos = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("SELECT * FROM mantenimientos");
            r = consulta.executeQuery();
            while (r.next()) {
                mantenimientos.add(new Mantenimiento(r.getInt(1), r.getString(2), r.getDate(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7)));
            }
            return mantenimientos;
        } catch (SQLException e) {
            return null;
        }
    }
    /* 3. Modulo Suministros */

    public boolean agregarProveedor(Proveedor prov) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO proveedores VALUES (?,?,?,?,?)");
            consulta.setString(1, prov.getNit());
            consulta.setString(2, prov.getNombre());
            consulta.setString(3, prov.getDireccion());
            consulta.setString(4, prov.getTelefono());
            consulta.setString(5, prov.getDescripcion());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean modificarProveedor(Proveedor prov) {
        try {
            consulta = conexion.prepareStatement("UPDATE proveedores SET prov_nombre = ?, prov_direccion = ?, prov_telefono = ?, prov_descripcion = ? WHERE prov_nit = ?");
            consulta.setString(1, prov.getNombre());
            consulta.setString(2, prov.getDireccion());
            consulta.setString(3, prov.getTelefono());
            consulta.setString(4, prov.getDescripcion());
            consulta.setString(5, prov.getNit());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean eliminarProveedor(int nit) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM proveedores WHERE prov_nit = ?");
            consulta.setInt(1, nit);
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Proveedor> consultarProveedores() {
        proveedores = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM proveedores ORDER BY prov_nombre");
            r = consulta.executeQuery();
            while (r.next()) {
                proveedores.add(new Proveedor(r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5)));
            }
            return proveedores;
        } catch (SQLException e) {
            return null;
        }
    }
    /* 4. Modulo Personal */

    public boolean agregarEmpleado(Empleados emp) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO empleados VALUES (?,?,?,?,?,?,?,?,?)");
            consulta.setString(1, emp.getIdentificacion());
            consulta.setString(2, emp.getNombre());
            consulta.setString(3, emp.getApellidos());
            consulta.setString(4, emp.getSexo());
            consulta.setString(5, emp.getTipo());
            consulta.setString(6, emp.getTelefono());
            consulta.setString(7, emp.getDireccion());
            consulta.setString(8, emp.getSalario());
            consulta.setString(9, emp.getCorreo());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean modificarEmpleado(Empleados mec) {
        try {
            consulta = conexion.prepareStatement("UPDATE empleados SET emp_nombre = ?, emp_apellidos = ?, emp_sexo = ?, emp_tipo = ?, emp_telefono = ?, emp_direccion = ?, emp_salario = ?, emp_correo = ? WHERE emp_id = ?");
            consulta.setString(1, mec.getNombre());
            consulta.setString(2, mec.getApellidos());
            consulta.setString(3, mec.getSexo());
            consulta.setString(4, mec.getTipo());
            consulta.setString(5, mec.getTelefono());
            consulta.setString(6, mec.getDireccion());
            consulta.setString(7, mec.getSalario());
            consulta.setString(8, mec.getCorreo());
            consulta.setString(9, mec.getIdentificacion());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean eliminarEmpleado(String id) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM empleados WHERE emp_id = ?");
            consulta.setString(1, id);
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Empleados> consultarEmpleados() {
        empleados = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM empleados ORDER BY emp_nombre");
            r = consulta.executeQuery();
            while (r.next()) {
                empleados.add(new Empleados(r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7), r.getString(8), r.getString(9)));
            }
            return empleados;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Empleados> verEmpleadosPorDato(String dato) {
        empleados = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM empleados WHERE emp_id LIKE '" + dato + "%' OR emp_nombre LIKE '" + dato + "%' OR emp_apellidos LIKE '" + dato + "%' OR  emp_direccion LIKE '" + dato + "%' ORDER BY emp_nombre");
            r = consulta.executeQuery();
            while (r.next()) {
                empleados.add(new Empleados(r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7), r.getString(8), r.getString(9)));
            }
            return empleados;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet TraerDatosEmpleado(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM empleados WHERE emp_id = " + id + "");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet idsMecanicos() {
        try {
            consulta = conexion.prepareStatement("SELECT emp_id FROM empleados WHERE emp_tipo = 'Mécanico'");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }
    /* 5. Modulo Inventario */

    public boolean agregarRepuesto(Repuesto rep) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO repuestos VALUES (?,?,?,?,?,?)");
            consulta.setString(1, rep.getCodigo());
            consulta.setString(2, rep.getTipo());
            consulta.setString(3, rep.getMarca());
            consulta.setString(4, rep.getCantidad());
            consulta.setString(5, rep.getPrecio());
            consulta.setString(6, rep.getNitProv());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public ArrayList<Repuesto> verRepuestos() {
        repuestos = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM repuestos ORDER BY rep_codigo");
            r = consulta.executeQuery();
            while (r.next()) {
                repuestos.add(new Repuesto(r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6)));
            }
            return repuestos;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet TraerDatosRepuesto(String codigo) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM repuestos WHERE rep_codigo = " + codigo + "");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet codRepuestos() {
        try {
            consulta = conexion.prepareStatement("SELECT rep_codigo FROM repuestos");
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet datosRepuesto(String c) {
        try {
            consulta = conexion.prepareStatement("SELECT rep_tipo FROM repuestos WHERE rep_codigo = ?");
            consulta.setString(1, c);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }
    /* 6. Modulo Ventas */

    boolean detallesMantenimiento(String codMan, String tipoMan, String descripcion, String fecha, String placa, String cli_nombre, String id_mec, String nom_mec, String cod_rep, String tip_rep, String can_rep) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO detallesmantenimientos VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setString(1, codMan);
            consulta.setString(2, tipoMan);
            consulta.setString(3, descripcion);
            consulta.setString(4, fecha);
            consulta.setString(5, placa);
            consulta.setString(6, cli_nombre);
            consulta.setString(7, id_mec);
            consulta.setString(8, nom_mec);
            consulta.setString(9, cod_rep);
            consulta.setString(10, tip_rep);
            consulta.setString(11, can_rep);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    boolean registrarMantenimiento(String codigoMantenimiento, String fechaInicio, String observaciones, String costo, String estado) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO mantenimientos VALUES(?,?,?,?,?)");
            consulta.setString(1, null);
            consulta.setString(2, fechaInicio);
            consulta.setString(3, estado);
            consulta.setString(4, costo);
            consulta.setString(5, observaciones);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean registrarFactura(Factura fac) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO factura VALUES(?,?,?,?,?)");
            consulta.setString(1, fac.getNumero());
            consulta.setDate(2, fac.getFecha());
            consulta.setString(3, fac.getIdCliente());
            consulta.setString(4, fac.getNombreCliente());
            consulta.setString(5, fac.getTotal());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean registrarDealleFactura(DetalleFactura det) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO detallefactura VALUES(?,?,?,?,?,?)");
            consulta.setString(1, det.getNumeroFactura());
            consulta.setString(2, det.getCodigoRepuesto());
            consulta.setString(3, det.getTipoRepuesto());
            consulta.setString(4, det.getMarcaRepuesto());
            consulta.setString(5, det.getCantidadRepuesto());
            consulta.setString(6, det.getPrecioRepuesto());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
     public boolean actualizarInventario(String codigo, int stockFinal) {
        try {
            consulta = conexion.prepareStatement("UPDATE repuestos SET rep_cantidad='" + stockFinal + "' WHERE rep_codigo = '" + codigo + "'");            
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
