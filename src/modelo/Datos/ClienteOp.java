package modelo.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;

/* @author Grupo - MECAUT */
public class ClienteOp extends Conexion{
    
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
            consulta = conexion.prepareStatement("Select * FROM clientes");
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
            consulta = conexion.prepareStatement("Select * FROM clientes WHERE cli_id LIKE '" + dato + "%' OR cli_nombre LIKE '" + dato + "%' OR cli_apellidos LIKE '" + dato + "%' OR  cli_direccion LIKE '" + dato + "%'");
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
    
}
