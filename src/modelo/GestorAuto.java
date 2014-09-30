package modelo;

import java.util.ArrayList;

/* @author Grupo - MECAUT */
public class GestorAuto {
    public boolean agregarAuto(Auto aut){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.agregarAuto(aut);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Cliente> consultarClientes(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Cliente> clientes = conexion.consultarClientes();
        conexion.cerrarConexion();
        return clientes;
    }
    public ArrayList<Auto> verAutos(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Auto> autos = conexion.verAutos();
        conexion.cerrarConexion();
        return autos;
    }
}
