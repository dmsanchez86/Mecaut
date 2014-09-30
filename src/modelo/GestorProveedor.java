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
public class GestorProveedor {
    public boolean agregarProveedor(Proveedor prov){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.agregarProveedor(prov);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Proveedor> verProveedor(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = conexion.verProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    
    public ArrayList<Proveedor> consultarProveedores(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = conexion.consultarProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    
    public boolean modificarProveedor(Proveedor prov){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.modificarProveedor(prov);
        conexion.crearConexion();
        return respuesta;
    }
    
    public boolean eliminarProveedor(int nit){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.eliminarProveedor(nit);
        conexion.crearConexion();
        return respuesta;
    }
}
