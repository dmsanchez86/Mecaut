/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Sergio Alejandro
 */
public class GestorMecanico {
    public boolean agregarMecanico(Mecanico mec){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.agregarMecanico(mec);
        conexion.cerrarConexion();
        return respuesta;
    }
    
     public ArrayList<Mecanico> verMecanicosPorDato(String dato){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Mecanico> mecanicos = conexion.verMecanicosPorDato(dato);
        conexion.cerrarConexion();
        return mecanicos;
    }  
     
      public ArrayList<Mecanico> consultarMecanicos(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Mecanico> mecanicos = conexion.consultarMecanicos();
        conexion.cerrarConexion();
        return mecanicos;
    }
     
      public boolean modificarMecanico(Mecanico mec){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.modificarMecanico(mec);
        conexion.crearConexion();
        return respuesta;
    }
    
    public boolean eliminarMecanico(int id){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.eliminarMecanico(id);
        conexion.crearConexion();
        return respuesta;
    }
}
