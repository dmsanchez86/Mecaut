package modelo;

import java.awt.HeadlessException;
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
import modelo.Logica.HistorialMantenimiento;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;
import modelo.Logica.Reserva;

public class Conexion {

    private final String driver = "com.mysql.jdbc.Driver"; //Clase del driver de jConnector 
    private final String url = "jdbc:mysql://localhost:3306/db_mecaut"; //Cadena de conexion
    private final String usuario = "root"; //Usuario con permisos a la base de datos
    private final String contraseña = "";
    
    protected Connection conexion;
    protected PreparedStatement consulta;
    protected ResultSet r;
    
    private ArrayList<Cliente> clientes;
    private ArrayList<GrupoClientes> grupo;
    private ArrayList<Auto> autos;
    private ArrayList<Mantenimiento> mantenimientos;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Empleados> empleados;
    private ArrayList<Repuesto> repuestos;
    private ArrayList<HistorialMantenimiento> hisMantenimientos;

    //metodo para crear la conexion 
    public boolean crearConexion() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Connected!");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos\n Referencia: "+e.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    //Metodo para cerrar la conexion
    public void cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Conection Close!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public String estadoConexion(){
        String estado;
        try {
            if (conexion == null)
                estado = "DESCONECTADO";
            else
                estado = "CONECTADO";
            return estado;
        } catch (Exception e) {
            return "DESCONECTADO";
        }
    }
    
    public Connection getConexion(){
        return this.conexion;
    }

    //metodo para validar cuenta
    public String[] validarCuentas(String usuario,String clave) {
        try {
            String[] datos = new String[3];
            consulta = conexion.prepareStatement("SELECT * FROM cuentas WHERE cue_usuario = ? AND cue_contrasena = MD5(?)");
            consulta.setString(1, usuario);
            consulta.setString(2, clave);
            
            r = consulta.executeQuery();
            
            while (r.next()) {
                datos[0] = r.getString("cue_tipoUsuario");
                datos[1] = r.getString("usu_id");
                datos[2] = r.getString("cue_estado");
            }
            return datos;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    //metodo para registrar una cuenta
    public boolean registrarCuenta(Cuenta c) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO cuentas VALUES(?,?,MD5(?),?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, c.getUsuario());
            consulta.setString(3, c.getContrasena());
            consulta.setString(4, c.getTipo());
            consulta.setString(5, "Activa");
            consulta.setString(6, c.getCli_id());
            consulta.executeUpdate();
            conexion.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
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
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
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
            consulta = conexion.prepareStatement("SELECT * FROM clientes WHERE cli_id = ?");
            consulta.setString(1, id);
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
            consulta = conexion.prepareStatement("UPDATE grupoclientes set gru_nombre = ?, gru_codigo = ?, cli_estado = ? WHERE cli_id = ?");
            consulta.setString(1, nom);
            consulta.setString(2, cod);
            consulta.setString(3, est);
            consulta.setString(4, id);
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
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
            System.out.println(e.getMessage());
            return false;
        }
    }

    public ArrayList<Auto> consultarAutos() {
        autos = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("Select * FROM autos ORDER BY aut_ciudad");
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
            consulta = conexion.prepareStatement("SELECT * FROM autos WHERE cli_id = ?");
            consulta.setString(1, id);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet consultarDatosAuto(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM clientes WHERE cli_id = ?");
            consulta.setString(1, id);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public ResultSet consultarDatosRepuestos(String codigo) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM repuestos WHERE rep_codigo = ?");
            consulta.setString(1, codigo);
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
    
    public ResultSet placasAutosClientes(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT aut_placa FROM autos WHERE cli_id = ?");
            consulta.setString(1,id);
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

    public boolean detallesMantenimiento(String codMan, String tipoMan, String descripcion, String fecha, String placa, String cli_nombre, String id_mec, String nom_mec, String cod_rep, String tip_rep, String can_rep) {
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
    
    public ResultSet traerDetallesMantenimiento(String placa){
        try {
            consulta = conexion.prepareStatement("SELECT * FROM detallesmantenimientos WHERE aut_placa = ?");
            consulta.setString(1, placa);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public boolean registrarMantenimiento(String codigoMantenimiento, String fechaInicio, String observaciones, String costo, String estado, String cli_id) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO mantenimientos VALUES(?,?,?,?,?,?)");
            consulta.setString(1, null);
            consulta.setString(2, fechaInicio);
            consulta.setString(3, estado);
            consulta.setString(4, costo);
            consulta.setString(5, observaciones);
            consulta.setString(6, cli_id);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean actualizarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("UPDATE mantenimientos SET man_tipo = ?, man_fecha = ?, man_descripcion = ?, man_costo = ? WHERE man_codigo = ?");
            
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean eliminarMantenimiento(String cod) {
        try {
            consulta = conexion.prepareStatement("Delete From mantenimientos Where man_codigo = ?");
            consulta.setString(1, cod);
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarDetMantenimiento(String cod) {
        try {
            consulta = conexion.prepareStatement("Delete From detallesmantenimientos Where man_codigo = ?");
            consulta.setString(1, cod);
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    
    }
    
    public boolean eliminarHisMantenimiento(String cod) {
        try {
            consulta = conexion.prepareStatement("Delete From historialmantenimientos Where man_codigo = ?");
            consulta.setString(1, cod);
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }

    public ArrayList<Mantenimiento> consultarMantenimientos() {
        mantenimientos = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("SELECT * FROM mantenimientos ORDER BY man_codigo DESC");
            r = consulta.executeQuery();
            while (r.next()) {
                mantenimientos.add(new Mantenimiento(r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6)));
            }
            return mantenimientos;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public ResultSet traerDatosMantenimiento(String cod){
        try {
            consulta = conexion.prepareStatement("SELECT * FROM mantenimientos m, detallesmantenimientos d WHERE m.man_codigo = ? AND d.man_codigo = ? LIMIT 1");
            consulta.setString(1, cod);
            consulta.setString(2, cod);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException | HeadlessException e) {
            return null;}
    }
    
    public ResultSet traerDatosDetallesMantenimiento(String cod){
        try {
            consulta = conexion.prepareStatement("SELECT * FROM detallesmantenimientos WHERE man_codigo = ?");
            consulta.setString(1, cod);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }
    
    public ResultSet codigoMantenimiento() {
        try{
            consulta = conexion.prepareStatement("SELECT MAX(man_codigo) FROM mantenimientos");
            r = consulta.executeQuery();
            return r;
        }
        catch(SQLException ex){return null;}
    }
    
    public ResultSet codigosMantenimientos(){
        try {
            consulta = conexion.prepareStatement("SELECT man_codigo FROM mantenimientos");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }
    
    public ArrayList<HistorialMantenimiento> listaHisMantenimientos(String dato,String campo) {
        hisMantenimientos = new ArrayList<>();
        try {
            if ("".equals(dato)) {
                consulta = conexion.prepareStatement("SELECT * FROM historialmantenimientos");
            }
            else if ("Placa".equals(dato)) {
                consulta = conexion.prepareStatement("SELECT * FROM historialmantenimientos WHERE aut_placa = ?");
                consulta.setString(1, campo);
            }
            else if ("Id".equals(dato)) {
                consulta = conexion.prepareStatement("SELECT * FROM historialmantenimientos WHERE cli_id = ?");
                consulta.setString(1, campo);
            }
            else if ("Fecha".equals(dato)) {
                consulta = conexion.prepareStatement("SELECT * FROM historialmantenimientos WHERE his_fecha = ?");
                consulta.setString(1, campo);
            }
            r = consulta.executeQuery();
            while(r.next())
                hisMantenimientos.add(new HistorialMantenimiento(r.getString("aut_placa"), r.getString("man_codigo"), r.getString("cli_id"), r.getString("his_fecha")));
            return hisMantenimientos;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean registrarHistorialMantenimiento(String placa, String codigoMantenimiento, String cli_id, String fecha) {
        try{
            consulta = conexion.prepareStatement("INSERT INTO historialmantenimientos VALUES(?,?,?,?)");
            consulta.setString(1, placa);
            consulta.setString(2, codigoMantenimiento);
            consulta.setString(3, cli_id);
            consulta.setString(4, fecha);
            consulta.executeUpdate();
            return true;
        }
        catch(SQLException exc){return false;}
    }
    
    public ResultSet nRegistrosHisMantenimientos() {
        try {
            consulta = conexion.prepareStatement("SELECT count(*) FROM historialmantenimientos");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet codigoReserva() {
        try {
            consulta =conexion.prepareStatement("SELECT MAX(res_codigo) FROM reservas");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet datosReserva(String id) {
        try {
            consulta = conexion.prepareStatement(
                    "SELECT c.cli_nombre, c.cli_telefono, c.cli_correo, a.aut_placa, a.aut_modelo, a.aut_marca"
                    + " FROM clientes c, autos a"
                    + " WHERE c.cli_id = ? AND a.cli_id = ? LIMIT 1");
            consulta.setString(1, id);
            consulta.setString(2, id);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException | HeadlessException e) {
            return null;
        }
    }

    public boolean registrarReserva(Reserva res) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO reservas VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, res.getFecha());
            consulta.setString(3, "Pendiente");
            consulta.setString(4, res.getCli_id());
            consulta.setString(5, res.getCli_nombre());
            consulta.setString(6, res.getCli_telefono());
            consulta.setString(7, res.getCli_correo());
            consulta.setString(8, res.getAut_placa());
            consulta.setString(9, res.getAut_modelo());
            consulta.setString(10, res.getAut_marca());
            consulta.setString(11, res.getEmp_id());
            consulta.setString(12, res.getEmp_nombre());
            consulta.setString(13, res.getObservaciones());
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
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

    public boolean eliminarProveedor(String nit) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM proveedores WHERE prov_nit = ?");
            consulta.setString(1, nit);
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
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
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }

    public boolean modificarEmpleado(Empleados mec) {
        try {
            if(mec.getSexo() == null){
                consulta = conexion.prepareStatement("UPDATE empleados SET emp_nombre = ?, emp_apellidos = ?, emp_telefono = ?, emp_direccion = ?, emp_correo = ? WHERE emp_id = ?");
                consulta.setString(1, mec.getNombre());
                consulta.setString(2, mec.getApellidos());
                consulta.setString(3, mec.getTelefono());
                consulta.setString(4, mec.getDireccion());
                consulta.setString(5, mec.getCorreo());
                consulta.setString(6, mec.getIdentificacion());
                consulta.executeUpdate();
                consulta.close();
            }else{
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
            }
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
            consulta = conexion.prepareStatement("SELECT * FROM empleados WHERE emp_id = ?");
            consulta.setString(1, id);
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
    
    public ResultSet idsEmpleados() {
        try {
            consulta = conexion.prepareStatement("SELECT emp_id FROM empleados");
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
    
    public boolean modificarRepuesto(String cod, String marca, String cant, String precio) {
        try {
            consulta = conexion.prepareStatement("UPDATE repuestos SET rep_marca = ?,rep_cantidad = ?, rep_precio = ? WHERE rep_codigo = ?");
            consulta.setString(1, marca);
            consulta.setString(2, cant);
            consulta.setString(3, precio);
            consulta.setString(4, cod);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }

    public boolean eliminarRepuesto(String cod) {
        try {
            consulta = conexion.prepareStatement("DELETE repuestos WHERE rep_codigo = ?");
            consulta.setString(1, cod);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }
    
    public boolean actualizarRepuesto(String codigo, String stockFinal) {
//        int total, antes = 0,despues;
//        try {
//            consulta = conexion.prepareStatement("SELECT rep_cantidad FROM repuestos WHERE rep_codigo = ?");
//            consulta.setString(1,codigo);
//            r = consulta.executeQuery();
//            while(r.next()){
//                antes = Integer.parseInt(r.getString("rep_cantidad"));
//            }
//        } catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, ""+e.getMessage());}
//        despues = Integer.parseInt(stockFinal);
//        total = antes + despues;
        try {
            consulta = conexion.prepareStatement("UPDATE repuestos SET rep_cantidad= ? WHERE rep_codigo = ?"); 
            consulta.setString(1, String.valueOf(stockFinal));
            consulta.setString(2, codigo);
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
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
            consulta = conexion.prepareStatement("SELECT * FROM repuestos WHERE rep_codigo = ?");
            consulta.setString(1, codigo);
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
            consulta = conexion.prepareStatement("SELECT * FROM repuestos WHERE rep_codigo = ?");
            consulta.setString(1, c);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }
    /* 6. Modulo Ventas */
    public boolean registrarFactura(Factura fac) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO factura VALUES(?,?,?,?,?)");
            consulta.setInt(1, fac.getNumero());
            consulta.setDate(2, fac.getFecha());
            consulta.setString(3, fac.getIdCliente());
            consulta.setString(4, fac.getNombreCliente());
            consulta.setString(5, fac.getTotal());
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            System.out.println();
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

    public ResultSet datosProveedor(String nit) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM proveedores WHERE prov_nit = ?");
            consulta.setString(1, nit);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet codigoOrdenPedido() {
        try {
            consulta = conexion.prepareStatement("SELECT MAX(ord_numero) FROM ordenpedido");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet NitsProveedores() {
        try {
            consulta = conexion.prepareStatement("SELECT prov_nit FROM proveedores");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet DatosOrden(String nit) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM proveedores WHERE prov_nit = ?");
            consulta.setString(1, nit);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet nomRepuestos() {
        try {
            consulta = conexion.prepareStatement("SELECT rep_tipo FROM repuestos");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet datosRepuestoNombre(String nombre) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM repuestos WHERE rep_tipo = ? LIMIT 1");
            consulta.setString(1, nombre);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public boolean registrarOrdenPedido(String fecha, String nitPro, String nomPro, String telPro, String dirPro, String total) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO ordenpedido VALUES(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, fecha);
            consulta.setString(3, nitPro);
            consulta.setString(4, nomPro);
            consulta.setString(5, telPro);
            consulta.setString(6, dirPro);
            consulta.setString(7, "Pendiente");
            consulta.setString(8, total);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }

    public boolean registrarDetallesOrden(String num,String codRep, String tipRep, String marRep, String canRep, String preRep) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO detalles_ordenpedido VALUES(?,?,?,?,?,?)");
            consulta.setString(1, num);
            consulta.setString(2, codRep);
            consulta.setString(3, tipRep);
            consulta.setString(4, marRep);
            consulta.setString(5, canRep);
            consulta.setString(6, preRep);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }

    public ArrayList<Factura> consultarFacturas() {
        try {
            ArrayList<Factura> fac = new ArrayList<>();
            consulta = conexion.prepareStatement("SELECT * FROM factura");
            r = consulta.executeQuery();
            while(r.next())
                fac.add(new Factura(r.getInt(1), r.getDate(2), r.getString(3), r.getString(4), r.getString(5)));
            return fac;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return null;
        }
    }

    public ResultSet codigosCotizacion() {
        try {
            consulta = conexion.prepareStatement("SELECT MAX(cot_numero) FROM cotizacion");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ArrayList<Mantenimiento> datosCotizacion(String id) {
        try {
            mantenimientos = new ArrayList<>();
            consulta = conexion.prepareStatement("SELECT m.man_codigo, m.man_fechaInicio, m.man_costo, c.cli_nombre FROM mantenimientos m, clientes c WHERE m.cli_id = ? AND c.cli_id = ? ");
            consulta.setString(1, id);
            consulta.setString(2, id);
            r = consulta.executeQuery();
            while(r.next())
                mantenimientos.add(new Mantenimiento(r.getInt(1), r.getString(2), r.getString(3), r.getString(4)));
            return mantenimientos;
        } catch (SQLException | HeadlessException e) {return null;}
    }

    public boolean registrarCotizacion(String fecha, String idCliente, String nombreCliente, String codMante, String valorMantenimiento, String totalMantenimiento, String valorCotizacion, String observaciones) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO cotizacion VALUES(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, fecha);
            consulta.setString(3, idCliente);
            consulta.setString(4, nombreCliente);
            consulta.setString(5, codMante);
            consulta.setString(6, valorMantenimiento);
            consulta.setString(7, totalMantenimiento);
            consulta.setString(8, valorCotizacion);
            consulta.setString(9, observaciones);
            consulta.setString(10, "Pendiente");
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }
    
    public boolean actualizarMantenimiento(String codMante, String totalMantenimiento) {
        try {
            consulta = conexion.prepareStatement("UPDATE mantenimientos SET man_costo = ? WHERE man_codigo = ?");
            consulta.setString(1, totalMantenimiento);
            consulta.setString(2, codMante);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }

    public ResultSet validarFicha(String placa) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM ficha_recepcion_auto WHERE aut_placa = ?");
            consulta.setString(1, placa);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return null;
        }
    }

    public boolean registrarFichaTecnica(String fecha,String idCli, String Placa, String cil, String fre, String peso, String col, String mot, String pot, String tran, String lar, String anc, String alt, String cojineria, String puertas, String luces) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO ficha_recepcion_auto VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setString(1, fecha);
            consulta.setString(2, null);
            consulta.setString(3, idCli);
            consulta.setString(4, Placa);
            consulta.setString(5, cil);
            consulta.setString(6, fre);
            consulta.setString(7, peso);
            consulta.setString(8, col);
            consulta.setString(9, mot);
            consulta.setString(10, pot);
            consulta.setString(11, tran);
            consulta.setString(12, lar);
            consulta.setString(13, anc);
            consulta.setString(14, alt);
            consulta.setString(15, cojineria);
            consulta.setString(16, puertas);
            consulta.setString(17, luces);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }
    
    public boolean modificarFichaAuto(String fechaActualizacion,String idCli, String Placa, String cil, String fre, String peso, String col, String mot, String pot, String tran, String lar, String anc, String alt, String cojineria, String puertas, String luces){
        try {
            consulta = conexion.prepareStatement("UPDATE ficha_recepcion_auto SET "
                    + "fic_fechaActualizacion = ?,"
                    + "aut_cilindraje = ?, "
                    + "aut_frenos = ?,"
                    + "aut_peso = ?,"
                    + "aut_color = ?,"
                    + "aut_motor = ?,"
                    + "aut_potencia = ?, "
                    + "aut_transmision = ?, "
                    + "aut_largo = ?, "
                    + "aut_ancho = ?, "
                    + "aut_alto = ?, "
                    + "aut_cojineria = ?, "
                    + "aut_puertas = ?, "
                    + "aut_farolas = ? WHERE cli_id = ? AND aut_placa = ?");
            consulta.setString(1, fechaActualizacion);
            consulta.setString(2, cil);
            consulta.setString(3, fre);
            consulta.setString(4, peso);
            consulta.setString(5, col);
            consulta.setString(6, mot);
            consulta.setString(7, pot);
            consulta.setString(8, tran);
            consulta.setString(9, lar);
            consulta.setString(10, anc);
            consulta.setString(11, alt);
            consulta.setString(12, cojineria);
            consulta.setString(13, puertas);
            consulta.setString(14, luces);
            consulta.setString(15, idCli);
            consulta.setString(16, Placa);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }

    public ResultSet codigoFactura() {
        try {
            consulta = conexion.prepareStatement("SELECT MAX(fac_numero) FROM factura");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet codigoPromocion() {
        try {
            consulta = conexion.prepareStatement("SELECT MAX(pro_codigo) FROM promociones");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public boolean registrarPromocion(String fecha, String tipo, String estado, String desc) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO promociones VALUES(?,?,?,?,?)");
            consulta.setInt(1,0);
            consulta.setString(2,fecha);
            consulta.setString(3,tipo);
            consulta.setString(4, desc);
            consulta.setString(5, estado);
            consulta.executeUpdate();
            return true;
        } catch (SQLException ex) {return false;}
    }
    
    public boolean modificarPromocion(String cod,String fecha, String tipo, String estado, String desc){
        try {
            consulta = conexion.prepareStatement("UPDATE promociones SET pro_fecha = ?, pro_tipo = ?, pro_descripcion = ?, pro_estado = ? WHERE pro_codigo = ?");
            consulta.setString(1,fecha);
            consulta.setString(2,tipo);
            consulta.setString(3,desc);
            consulta.setString(4, estado);
            consulta.setInt(5, Integer.parseInt(cod));
            consulta.executeUpdate();
            return true;
        } catch (SQLException ex) {return false;}
    }
    
    public boolean eliminarPromocion(String codigo){
        try {
            consulta = conexion.prepareStatement("DELETE FROM promociones WHERE pro_codigo = ?");
            consulta.setInt(1, Integer.parseInt(codigo));
            consulta.executeUpdate();
            return true;
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            return false;
        }
    }
    
    public ResultSet listaPromociones(){
        try {
            consulta = conexion.prepareStatement("SELECT * FROM promociones ORDER BY pro_codigo DESC");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }
    
    public ResultSet datosPromocion(String codigo){
        try {
            consulta = conexion.prepareStatement("SELECT * FROM promociones WHERE pro_codigo = ?");
            consulta.setString(1,codigo);
            r = consulta.executeQuery();
            return r;
        } catch (SQLException | NumberFormatException e) {return null;}
    }

    public boolean desactivarCuenta(String id, String contraseña) {
        try {
            consulta = conexion.prepareStatement("UPDATE cuentas SET cue_estado = 'Inactiva' WHERE cue_usuario = ? AND cue_contrasena = MD5(?)");
        consulta.setString(1, id);
        consulta.setString(2, contraseña);
        consulta.executeUpdate();
        return true;
        } catch (Exception e) {return false;}
    }

    public boolean activarCuenta(String usuario, String con) {
        try {
            consulta = conexion.prepareStatement("UPDATE cuentas SET cue_estado = 'Activa' WHERE cue_usuario = ? AND cue_contrasena = MD5(?)");
            consulta.setString(1, usuario);
            consulta.setString(2, con);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }

    public boolean cambiarContrasena(String usu_id, String conVieja, String contrasenaNueva) {
        try {
            consulta = conexion.prepareStatement("UPDATE cuentas SET cue_contrasena = MD5(?) WHERE usu_id = ? AND cue_contrasena = MD5(?)");
            consulta.setString(1, contrasenaNueva);
            consulta.setString(2, usu_id);
            consulta.setString(3, conVieja);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }

    public boolean registrarMantenimientoCliente(String placa, String id, String nombre, String estado, String fecha) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO mantenimientos_pendientes VALUES(?,?,?,?,?)");
            consulta.setString(1, placa);
            consulta.setString(2, id);
            consulta.setString(3, nombre);
            consulta.setString(4, estado);
            consulta.setString(5, fecha);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }
    
    public boolean registrarDetallesMantenimientoCliente(String placa,String nombre, String tipoMantenimiento, String fecha,String descripcion) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO detalles_mantenimientos_pendientes VALUES(?,?,?,?,?)");
            consulta.setString(1,placa);
            consulta.setString(2, nombre);
            consulta.setString(3, tipoMantenimiento);
            consulta.setString(4, fecha);
            consulta.setString(5, descripcion);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }
    
    public ResultSet numeroMantenimientosPendientes(){
        try {
            consulta = conexion.prepareStatement("SELECT COUNT(*) FROM mantenimientos_pendientes WHERE manp_estado = 'Pendiente'");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet consultarManteniminetosPendientes(String dato) {
        try {
            if (dato==null) {
                consulta = conexion.prepareStatement("SELECT * FROM mantenimientos_pendientes");
                r = consulta.executeQuery();
            }else{
                consulta = conexion.prepareStatement("SELECT * FROM mantenimientos_pendientes WHERE manp_estado = ?");
                consulta.setString(1, dato);
                r = consulta.executeQuery();
            }
            return r;
        } catch (Exception e) {return r;}
    }

    public ResultSet DatosMantenimientoPendiente(String placa, String nombre) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM detalles_mantenimientos_pendientes WHERE aut_placa = ? AND cli_nombre = ?");
            consulta.setString(1, placa);
            consulta.setString(2, nombre);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {
            return null;}
    }

    public boolean modificarEstadoMantenimiento(String placa, String nombre) {
        try {
            consulta = conexion.prepareStatement("UPDATE mantenimientos_pendientes SET manp_estado = 'Rechazada' WHERE aut_placa = ? AND cli_nombre = ?");
            consulta.setString(1, placa);
            consulta.setString(2, nombre);
            consulta.executeUpdate();
            System.out.println(consulta);
            return true;
        } catch (Exception e) {
            return false;}
    }

    public boolean actualizarEstadoMantenimiento(String placa, String id) {
        try {
            consulta = conexion.prepareStatement("UPDATE mantenimientos_pendientes SET manp_estado = 'Aceptada' WHERE aut_placa = ? AND cli_id = ?");
            consulta.setString(1, placa);
            consulta.setString(2, id);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }
    
    public boolean UpdateContraseñaCliente(String contra, String usu) {
        try {
            consulta = conexion.prepareStatement("UPDATE cuentas SET cue_contrasena = MD5(?) WHERE cue_usuario = ?");
            consulta.setString(1, contra);
            consulta.setString(2, usu);
            consulta.executeUpdate();
            consulta.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ResultSet consultarPromociones(String dato) {
        try {
            if ("".equals(dato)) {
                consulta = conexion.prepareStatement("SELECT * FROM promociones");
            }else{
                consulta = conexion.prepareStatement("SELECT * FROM promociones WHERE pro_tipo = ?");
                consulta.setString(1,dato);
            }
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet verDescripcionPromocion(String codigo) {
        try {
            consulta = conexion.prepareStatement("SELECT pro_descripcion FROM promociones WHERE pro_codigo = ?");
            consulta.setString(1, codigo);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet numeroDeOrdenes() {
        try {
            consulta = conexion.prepareStatement("SELECT ord_numero FROM ordenpedido");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }

    public ResultSet datosOrdenPedido(String numero) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM ordenpedido o, detalles_ordenpedido d WHERE o.ord_numero = ? AND d.ord_numero = ?");
            consulta.setString(1, numero);
            consulta.setString(2, numero);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {System.out.println(e.getMessage());return null;}
    }

    public boolean registrarDevolucion(String fecha, String ord_numero, int numeroRepuestos, String descripcion) {
        try{
            consulta = conexion.prepareStatement("INSERT INTO devoluciones VALUES(?,?,?,?,?,?)");
            consulta.setInt(1,0);
            consulta.setString(2,fecha);
            consulta.setString(3,ord_numero);
            consulta.setString(4,String.valueOf(numeroRepuestos));
            consulta.setString(5,descripcion);
            consulta.setString(6,"Aceptada");
            consulta.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    boolean registrarDetallesDevolucion(String ord_numero,String codigo,String nombre,String cantidad,String precio,String nit) {
        try{
            consulta = conexion.prepareStatement("INSERT INTO detalles_devolucion VALUES(?,?,?,?,?,?)");
            consulta.setString(1,ord_numero);
            consulta.setString(2,codigo);
            consulta.setString(3,nombre);
            consulta.setString(4,cantidad);
            consulta.setString(5,precio);
            consulta.setString(6,nit);
            consulta.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public ResultSet fondo(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM fondos WHERE usu_id = ?");
            consulta.setString(1,id);
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {return null;}
    }
    
    public boolean fondoActualizado(String id,String fondo) {
        try {
            consulta = conexion.prepareStatement("UPDATE fondos set imagen = ? WHERE usu_id = ?");
            consulta.setString(1,fondo);
            consulta.setString(2, id);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }

    public boolean insertarFondo(String id) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO fondos VALUES (?,?)");
            consulta.setString(1,id);
            consulta.setString(2,"Wallpaper-auto-concept-neon-tuning-desktop1.jpg");
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {System.out.println(e.getMessage());return false;}
    }
    
    public ResultSet cargarTiposMantenimientos(){
        try {
            consulta = conexion.prepareStatement("SELECT * FROM tiposmantenimientos");
            r = consulta.executeQuery();
            return r;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    boolean eliminarMantenimientoPendiente(String placa,String id){
        try {
            consulta = conexion.prepareStatement("DELETE FROM mantenimientos_pendientes WHERE aut_placa = ? AND cli_id = ?");
            consulta.setString(1,placa);
            consulta.setString(2,id);
            consulta.executeUpdate();
            return true;
        } catch (Exception e) {return false;}
    }
    
    public ArrayList<Factura> verFacturaPorDato(String id){
        ArrayList<Factura> lista = new ArrayList<>();
        try {
            consulta = conexion.prepareStatement("SELECT * FROM factura WHERE cli_id LIKE ?");
            consulta.setString(1, "%"+id+"%");
            r = consulta.executeQuery();
            while(r.next()){
                lista.add(new Factura(r.getInt(1), r.getDate(2), r.getString(3),r.getString(4),r.getString(5)));
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
}