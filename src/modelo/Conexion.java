package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {

    //--------------------------CONEXION CON MYSQL------------------------------
    private String driver = "com.mysql.jdbc.Driver"; //Clase del driver de jConnector 
    private String url = "jdbc:mysql://localhost:3306/db_mecaut"; //Cadena de conexion
    private String usuario = "root"; //Usuario con permisos a la base de datos
    private String contraseña = "";

    private Connection conexion;
    private PreparedStatement consulta;
    private ResultSet rs;

    //metodo para crear la conexion
    public boolean crearConexion() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
        }
        return true;
    }

    //Metodo para cerrar la conexion
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
        }
    }

    //---------------------------CONEXION CON POSTGRES--------------------------
    /*private String driver = "org.postgresql.Driver";
     private String url = "jdbc:postgresql://localhost:5432/DB_MECAUT";
     private String usuario = "postgres";
     private String contraseña = "sena";

     private Connection conexion;
     private PreparedStatement consulta;
     private ResultSet rs;

     public boolean crearConexion() {
     try {
     Class.forName(driver);
     conexion = DriverManager.getConnection(url, usuario, contraseña);
     } catch (Exception e) {
     return false;
     }
     return true;
     }*/
    //-------------------------METODOS MODULO CLIENTES---------------------------
    //Metodo para agregar un cliente
    public boolean agregarCliente(Cliente cli) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO clientes (cli_id, cli_nombre, cli_apellidos, cli_telefono, cli_direccion) VALUES (?,?,?,?,?)");
            consulta.setString(1, cli.getIdentificacion());
            consulta.setString(2, cli.getNombre());
            consulta.setString(3, cli.getApellidos());
            consulta.setString(4, cli.getTelefono());
            consulta.setString(5, cli.getDireccion());
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
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
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //Metodo para modificar los datos de un cliente
    public boolean modificarCliente(Cliente cli) {
        try {

            consulta = conexion.prepareStatement("UPDATE clientes SET cli_nombre = ?, cli_apellidos = ?, cli_telefono = ?, cli_direccion = ? WHERE cli_id = ?");
            consulta.setString(1, cli.getNombre());
            consulta.setString(2, cli.getApellidos());
            consulta.setString(3, cli.getTelefono());
            consulta.setString(4, cli.getDireccion());
            consulta.setString(5, cli.getIdentificacion());

            consulta.executeUpdate();
            consulta.close();
            //System.out.println(consulta.executeUpdate());
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    //Metodo para agregar un auto
    public boolean agregarAuto(Auto aut) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO autos (aut_placa, aut_ciudad, aut_modelo, aut_marca, cli_id, cli_nombre, cli_apellidos) VALUES (?,?,?,?,?,?,?)");
            consulta.setString(1, aut.getPlaca());
            consulta.setString(2, aut.getCiudad());
            consulta.setString(3, aut.getModelo());
            consulta.setString(4, aut.getMarca());
            consulta.setString(5, aut.getIdCliente());
            consulta.setString(6, aut.getNombreCliente());
            consulta.setString(7, aut.getApellidosCliente());
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //Metodo para consultar los datos del cliente al que se le registrara el auto
    public ArrayList<Cliente> consultarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM clientes");
            rs = consulta.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
            return null;
        }
        return clientes;
    }

    //---------------------------METODOS MODULO PERSONAL------------------------
    //metodo para agregar un mecanico
    public boolean agregarMecanico(Mecanico mec) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO mecanicos (mec_id, mec_nombre, mec_apellidos, mec_telefono, mec_direccion, mec_salario) VALUES (?,?,?,?,?,?)");
            consulta.setString(1, mec.getIdentificacion());
            consulta.setString(2, mec.getNombre());
            consulta.setString(3, mec.getApellidos());
            consulta.setString(4, mec.getTelefono());
            consulta.setString(5, mec.getDireccion());
            consulta.setString(6, mec.getSalario());
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //Metodo para eliminar un mecanico 
    public boolean eliminarMecanico(int id) {
        try {
            consulta = conexion.prepareStatement("DELETE FROM mecanicos WHERE mec_id = ?");
            consulta.setInt(1, id);
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //metodo para modificar un mecanico
    public boolean modificarMecanico(Mecanico mec) {
        try {
            consulta = conexion.prepareStatement("UPDATE mecanicos SET mec_nombre = ?, mec_apellidos = ?, mec_telefono = ?, mec_direccion = ?, mec_salario = ? WHERE mec_id = ?");
            consulta.setString(1, mec.getNombre());
            consulta.setString(2, mec.getApellidos());
            consulta.setString(3, mec.getTelefono());
            consulta.setString(4, mec.getDireccion());
            consulta.setString(5, mec.getSalario());
            consulta.setString(6, mec.getIdentificacion());
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    //------------------------------METODOS MODULO PROVEEDORES---------------------------
    //metodo para agregar un proveedor
    public boolean agregarProveedor(Proveedor prov) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO proveedores (prov_nit, prov_nombre, prov_direccion, prov_telefono, prov_descripcion) VALUES (?,?,?,?,?)");
            consulta.setString(1, prov.getNit());
            consulta.setString(2, prov.getNombre());
            consulta.setString(3, prov.getDireccion());
            consulta.setString(4, prov.getTelefono());
            consulta.setString(5, prov.getDescripcion());
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
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
        } catch (Exception e) {
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
            //System.out.println(consulta.executeUpdate());
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    //-------------------------METODOS MODULO SERVICIOS-------------------------
    //metodo para agregar un mantenimiento
    public boolean agregarMantenimiento(Mantenimiento man) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO mantenimientos (man_tipo, man_fecha, man_descripcion, man_costo, aut_placa, mec_id) VALUES (?,?,?,?,?,?)");
            consulta.setString(1, man.getTipo());
            consulta.setDate(2, man.getFecha());
            consulta.setString(3, man.getDescripcion());
            consulta.setString(4, man.getCosto());
            consulta.setString(5, man.getPlacaAuto());
            consulta.setString(6, man.getIdMecanico());
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
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
        } catch (Exception e) {
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
            //System.out.println(consulta.executeUpdate());
        } catch (Exception e) {
            //System.out.println(e);
            return false;
        }
        return true;
    }
    //metodo para consultar los datos del mantenimiento para modificarlos o eliminarlos
    public ArrayList<Mantenimiento> consultarMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = new ArrayList<Mantenimiento>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("SELECT * FROM mantenimientos");
            rs = consulta.executeQuery();

            while (rs.next()) {
                mantenimientos.add(new Mantenimiento(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }

        } catch (Exception e) {
            return null;
        }
        return mantenimientos;
    }

    //metodo para consultar la placa del auto al que se realizara el mantenimeinto
    public ArrayList<Auto> consultarAutos() {
        ArrayList<Auto> autos = new ArrayList<Auto>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM autos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                autos.add(new Auto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }

        } catch (Exception e) {
            return null;
        }
        return autos;
    }

    //metodo para consultar la identificacion del mecanico que realizo el mantenimiento
    public ArrayList<Mecanico> consultarMecanicos() {
        ArrayList<Mecanico> mecanicos = new ArrayList<Mecanico>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM mecanicos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                mecanicos.add(new Mecanico(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }

        } catch (Exception e) {
            return null;
        }
        return mecanicos;
    }

    //-----------------------METODOS MODULO REPORTES----------------------------
    //metodo para consultar un clientes ingresanto un dato
    public ArrayList<Cliente> verClientesPorDato(String dato) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM clientes WHERE cli_id LIKE '" + dato + "%' OR cli_nombre LIKE '" + dato + "%' OR cli_apellidos LIKE '" + dato + "%' OR  cli_direccion LIKE '" + dato + "%'");
            rs = consulta.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
            return null;
        }
        return clientes;
    }

    //metodo para consultar un mecanico ingresando un dato
    public ArrayList<Mecanico> verMecanicosPorDato(String dato) {
        ArrayList<Mecanico> mecanicos = new ArrayList<Mecanico>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM mecanicos WHERE mec_id LIKE '" + dato + "%' OR mec_nombre LIKE '" + dato + "%' OR mec_apellidos LIKE '" + dato + "%' OR  mec_direccion LIKE '" + dato + "%'");
            rs = consulta.executeQuery();
            while (rs.next()) {
                mecanicos.add(new Mecanico(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }

        } catch (Exception e) {
            return null;
        }
        return mecanicos;
    }

    //metodo para ver la la lista de los proveedores
    public ArrayList<Proveedor> verProveedores() {
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM proveedores");
            rs = consulta.executeQuery();
            while (rs.next()) {
                proveedores.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }

        } catch (Exception e) {
            return null;
        }
        return proveedores;
    }

    //metodo para ver la lista de los mantenimientos
    public ArrayList<Mantenimiento> verMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = new ArrayList<Mantenimiento>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM mantenimientos");
            rs = consulta.executeQuery();
            while (rs.next()) {
                mantenimientos.add(new Mantenimiento(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
            return null;
        }
        return mantenimientos;
    }

    //metodo para ver la lista de los autos
    public ArrayList<Auto> verAutos() {
        ArrayList<Auto> Autos = new ArrayList<Auto>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM autos");

            rs = consulta.executeQuery();
            while (rs.next()) {
                Autos.add(new Auto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }

        } catch (Exception e) {
            return null;
        }
        return Autos;
    }
    
    //Metodo para ver la lista de los repuestos
    public ArrayList<Repuesto> verRepuestos() {
        ArrayList<Repuesto> Repuestos = new ArrayList<Repuesto>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM repuestos");

            rs = consulta.executeQuery();
            while (rs.next()) {
                Repuestos.add(new Repuesto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }

        } catch (Exception e) {
            return null;
        }
        return Repuestos;
    }

    //-----------------------METODOS MODULO INVENTARIO--------------------------
    //metodo para agregar un repuesto
    public boolean agregarRepuesto(Repuesto rep) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO repuestos (rep_codigo, rep_tipo, rep_marca, rep_cantidad, rep_precio, prov_nit, prov_nombre) VALUES (?,?,?,?,?,?,?)");
            consulta.setString(1, rep.getCodigo());
            consulta.setString(2, rep.getTipo());
            consulta.setString(3, rep.getMarca());
            consulta.setString(4, rep.getCantidad());
            consulta.setString(5, rep.getPrecio());
            consulta.setString(6, rep.getNitProv());
            consulta.setString(7, rep.getNomProv());
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //Metodo para consultar el nit del proveedor del repuesto
    public ArrayList<Proveedor> consultarProveedores() {
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        ResultSet rs = null;
        try {
            consulta = conexion.prepareStatement("Select * FROM proveedores");
            rs = consulta.executeQuery();
            while (rs.next()) {
                proveedores.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }

        } catch (Exception e) {
            return null;
        }
        return proveedores;
    }

    //-----------------------METODOS MODULO DE SEGURIDAD------------------------
    //metodo para conultar Cliente
    
    //metodo para validar cuenta
    public boolean validarCuentas(Cuenta c) {
        try {
            consulta = conexion.prepareStatement("SELECT * FROM cuentas WHERE cue_usuario = ? AND cue_contrasena = ?");
            consulta.setString(1, c.getUsuario());
            consulta.setString(2, c.getContrasena());
            consulta.executeQuery();
            ResultSet r = consulta.getResultSet();

            while (r.next()) {
                return true;
            }

            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    //metodo para registrar una cuenta
    public boolean registrarCuenta(Cuenta c) {
        try {
            consulta = conexion.prepareStatement("INSERT INTO cuentas VALUES(?,?)");
            consulta.setString(1, c.getUsuario());
            consulta.setString(2, c.getContrasena());
            consulta.executeUpdate();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
