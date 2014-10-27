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
import modelo.Logica.Empleados;
import modelo.Logica.GrupoClientes;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;

public class Conexion {

    //--------------------------CONEXION CON MYSQL------------------------------
    private final String driver = "com.mysql.jdbc.Driver"; //Clase del driver de jConnector 
    private final String url = "jdbc:mysql://localhost:3306/db_mecaut"; //Cadena de conexion
    private final String usuario = "root"; //Usuario con permisos a la base de datos
    private final String contraseña = "";
    private Connection conexion;
    private PreparedStatement consulta;

    public Conexion() {
    }

    //metodo para crear la conexion
    public boolean crearConexion() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos","MECAUT",JOptionPane.ERROR_MESSAGE);
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
            consulta = conexion.prepareStatement("SELECT * FROM cuentas WHERE cue_usuario = ? AND cue_contrasena = ?");
            consulta.setString(1, c.getUsuario());
            consulta.setString(2, c.getContrasena());
            consulta.executeQuery();
            ResultSet r = consulta.getResultSet();
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
            consulta = conexion.prepareStatement("INSERT INTO cuentas VALUES(?,?,?,?)");
            consulta.setString(1, null);
            consulta.setString(2, c.getUsuario());
            consulta.setString(3, c.getContrasena());
            consulta.setString(4, c.getTipo());
            consulta.executeUpdate();
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para consultar la placa del auto al que se realizara el mantenimeinto
    public ArrayList<Auto> consultarAutos() {
        ArrayList<Auto> autos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM autos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                autos.add(new Auto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9)));
            }
        } catch (SQLException e) {
            return null;
        }
        return autos;
    }
    //metodo para ver la lista de los autos
    public ArrayList<Auto> verAutos() {
        ArrayList<Auto> Autos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM autos");

            rs = consulta.executeQuery();
            while (rs.next()) {
                Autos.add(new Auto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9)));
            }
        } catch (SQLException e) {
            return null;
        }
        return Autos;
    }
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //Metodo para eliminar un cliente
    public boolean eliminarCliente(String id) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM clientes WHERE cli_id = ?");
            consulta.setString(1, id);
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //Metodo para modificar los datos de un cliente
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //Metodo para consultar los datos del cliente al que se le registrara el auto
    public ArrayList<Cliente> consultarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM clientes ORDER BY cli_nombre");
            rs = consulta.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return clientes;
    }
    
    //metodo para consultar un clientes ingresanto un dato
    public ArrayList<Cliente> verClientesPorDato(String dato) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM clientes WHERE cli_id LIKE '" + dato + "%' OR cli_nombre LIKE '" + dato + "%' OR cli_apellidos LIKE '" + dato + "%' OR  cli_direccion LIKE '" + dato + "%' ORDER BY cli_nombre");
            rs = consulta.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return clientes;
    }
    
    public ResultSet TraerDatosClientes(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM clientes WHERE cli_id = "+id+"");
            ResultSet r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public ResultSet TraerDatosEmpleado(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM empleados WHERE emp_id = "+id+"");
            ResultSet r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;}
    }
       
    //metodo para agregar un repuesto
    public boolean agregarRepuesto(Repuesto rep) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO repuestos VALUES (?,?,?,?,?,?,?)");
            consulta.setString(1, rep.getCodigo());
            consulta.setString(2, rep.getTipo());
            consulta.setString(3, rep.getMarca());
            consulta.setString(4, rep.getCantidad());
            consulta.setString(5, rep.getPrecio());
            consulta.setString(6, rep.getNitProv());
            consulta.setString(7, rep.getNomProv());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
   
    public ResultSet TraerDatosRepuesto(String codigo) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM repuestos WHERE rep_codigo = "+codigo+"");
            ResultSet r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }
    
    //Metodo para ver la lista de los repuestos
    public ArrayList<Repuesto> verRepuestos() {
        ArrayList<Repuesto> Repuestos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM repuestos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                Repuestos.add(new Repuesto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return Repuestos;
    }
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para eliminar un proveedor
    public boolean eliminarProveedor(int nit) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM proveedores WHERE prov_nit = ?");
            consulta.setInt(1, nit);
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para modificar un proveedor
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para ver la la lista de los proveedores
    public ArrayList<Proveedor> verProveedores() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM proveedores");
            rs = consulta.executeQuery();
            while (rs.next()) {
                proveedores.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            return null;
        }
        return proveedores;
    }
    //Metodo para consultar el nit del proveedor del repuesto
    public ArrayList<Proveedor> consultarProveedores() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM proveedores");
            rs = consulta.executeQuery();
            while (rs.next()) {
                proveedores.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            return null;
        }
        return proveedores;
    }
    
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para eliminar un mantenimiento
    public boolean eliminarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("Delete From mantenimientos Where man_codigo = ?");
            consulta.setInt(1, man.getCodigo());
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para modificar un mantenimiento
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para consultar los datos del mantenimiento para modificarlos o eliminarlos
    public ArrayList<Mantenimiento> consultarMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("SELECT * FROM mantenimientos");
            rs = consulta.executeQuery();

            while (rs.next()) {
                mantenimientos.add(new Mantenimiento(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return mantenimientos;
    }
    //metodo para ver la lista de los mantenimientos
    public ArrayList<Mantenimiento> verMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM mantenimientos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                mantenimientos.add(new Mantenimiento(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            return null;
        }
        return mantenimientos;
    }
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //Metodo para eliminar un mecanico 
    public boolean eliminarEmpleado(String id) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM empleados WHERE emp_id = ?");
            consulta.setString(1, id);
            consulta.executeUpdate();
            consulta.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para modificar un mecanico
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
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    //metodo para consultar la identificacion del mecanico que realizo el mantenimiento
    public ArrayList<Empleados> consultarEmpleados() {
        ArrayList<Empleados> empleados = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM empleados ORDER BY emp_nombre");
            rs = consulta.executeQuery();
            while (rs.next()) {
                empleados.add(new Empleados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
        } catch (SQLException e) {
            return null;
        }
        return empleados;
    }
    
    //metodo para consultar un empleado ingresando un dato
    public ArrayList<Empleados> verEmpleadosPorDato(String dato) {
        ArrayList<Empleados> empleados = new ArrayList<>();
        ResultSet rs;
        try {
            consulta = conexion.prepareStatement("Select * FROM empleados WHERE emp_id LIKE '" + dato + "%' OR emp_nombre LIKE '" + dato + "%' OR emp_apellidos LIKE '" + dato + "%' OR  emp_direccion LIKE '" + dato + "%' ORDER BY emp_nombre");
            rs = consulta.executeQuery();
            while (rs.next()) {
                empleados.add(new Empleados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
        } catch (SQLException e) {
            return null;
        }
        return empleados;
    }

    public ArrayList<GrupoClientes> verGrupoClientes(String dato) {
        ArrayList<GrupoClientes> grupo = new ArrayList<>();
        ResultSet rs;
        try {
            switch(dato){
                case "Habitual":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '"+dato+"' OR gru_nombre = '"+dato+"'");
                    break;
                case "Ocasional":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '"+dato+"' OR gru_nombre = '"+dato+"'");
                    break;
                case "Potencial":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '"+dato+"' OR gru_nombre = '"+dato+"'");
                    break;
                case "Activo":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '"+dato+"' OR gru_nombre = '"+dato+"'");
                    break;
                case "Inactivo":
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = '"+dato+"' OR gru_nombre = '"+dato+"'");
                    break;
                default:
                    consulta = conexion.prepareStatement("SELECT * FROM grupoclientes WHERE cli_estado = 'Activo'");
            }
            rs = consulta.executeQuery();
            while(rs.next()){
                grupo.add(new GrupoClientes(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)));
            }
        } catch (SQLException e) {
            return null;
        }
        return grupo;      
    }

    public ResultSet ConsultarAutosClientes(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM autos WHERE cli_id = '"+id+"'");
            ResultSet r = consulta.executeQuery();
            return r;
        } catch (SQLException e) {
            return null;
        }
    }

    ResultSet consultarDatosAuto(String id) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM clientes WHERE cli_id = "+id+"");
            ResultSet r = consulta.executeQuery();
            return r;            
        } catch (SQLException e) {
            return null;
        }
    }
}
