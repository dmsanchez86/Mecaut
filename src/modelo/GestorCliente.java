/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author sena
 */
public class GestorCliente {
    public boolean agregarCliente(Cliente cli){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.agregarCliente(cli);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Cliente> verClientesPorDato(String dato){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Cliente> clientes = conexion.verClientesPorDato(dato);
        conexion.cerrarConexion();
        return clientes;
    } 
    
    public boolean modificarCliente(Cliente cli){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.modificarCliente(cli);
        conexion.crearConexion();
        return respuesta;
    }
    
    public boolean eliminarCliente(String id){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.eliminarCliente(id);
        conexion.crearConexion();
        return respuesta;
    }  
    
    public ArrayList<Cliente> consultarClientes(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Cliente> clientes = conexion.consultarClientes();
        conexion.cerrarConexion();
        return clientes;
    }
    
    public boolean registrarUsuario(Cuenta c){
        Conexion con = new Conexion();
        con.crearConexion();
        boolean r = con.registrarCuenta(c);
        con.cerrarConexion();
        return r;
    }
    public boolean validarUsuario(Cuenta c){
        Conexion co = new Conexion();
        co.crearConexion();
        boolean r = co.validarCuentas(c);
        co.cerrarConexion();
        return r;
    }
}
