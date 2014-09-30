package modelo;

import java.util.ArrayList;

/* @author Grupo - MECAUT */
public class GestorRepuesto {
    public boolean agregarRepuesto(Repuesto rep){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.agregarRepuesto(rep);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Proveedor> consultarProveedores(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = conexion.consultarProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    public ArrayList<Repuesto> verRepuestos(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Repuesto> repuestos = conexion.verRepuestos();
        conexion.cerrarConexion();
        return repuestos;
    }  
}
