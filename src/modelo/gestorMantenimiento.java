package modelo;

import java.util.ArrayList;

/* @author Grupo - MECAUT */
public class gestorMantenimiento {
    public boolean agregarMantenimiento(Mantenimiento man){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.agregarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Auto> consultarAutos(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Auto> autos = conexion.consultarAutos();
        conexion.cerrarConexion();
        return autos;
    }
    
    public ArrayList<Mecanico> consultarMecanicos(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Mecanico> mecanicos = conexion.consultarMecanicos();
        conexion.cerrarConexion();
        return mecanicos;
    }
    
    public ArrayList<Mantenimiento> verMantenimientos(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Mantenimiento> mantenimientos = conexion.verMantenimientos();
        conexion.cerrarConexion();
        return mantenimientos;
    } 
    
    public boolean eliminarMantenimiento(Mantenimiento man){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        boolean respuesta = conexion.eliminarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Mantenimiento> consultarManteniminetos(){
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        ArrayList<Mantenimiento> mantnimientos = conexion.consultarMantenimientos();
        conexion.cerrarConexion();
        return mantnimientos;
    }

    public boolean actualizarMantenimiento(Mantenimiento man) {
        Conexion c = new Conexion();
        c.crearConexion();
        boolean r = c.actualizarMantenimiento(man);
        c.cerrarConexion();
        return r;
    }
}
