package modelo;

import java.util.ArrayList;

/* @author grupo - MECAUT */
public class Gestor {
    Conexion conexion = new Conexion();
    boolean respuesta;
    // Clientes
    public boolean agregarCliente(Cliente cli){
        conexion.crearConexion();
        respuesta = conexion.agregarCliente(cli);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Cliente> verClientePorDato(String dato){
        conexion.crearConexion();
        ArrayList<Cliente> clientes = conexion.verClientesPorDato(dato);
        conexion.cerrarConexion();
        return clientes;
    }    
    public boolean modificarCliente(Cliente cli){
        conexion.crearConexion();
        respuesta = conexion.modificarCliente(cli);
        conexion.crearConexion();
        return respuesta;
    }   
    public boolean eliminarCliente(String id){
        conexion.crearConexion();
        respuesta = conexion.eliminarCliente(id);
        conexion.crearConexion();
        return respuesta;
    }    
    public ArrayList<Cliente> consultarClientes(){
        conexion.crearConexion();
        ArrayList<Cliente> clientes = conexion.consultarClientes();
        conexion.cerrarConexion();
        return clientes;
    }  
    public boolean registrarUsuario(Cuenta c){
        conexion.crearConexion();
        boolean r = conexion.registrarCuenta(c);
        conexion.cerrarConexion();
        return r;
    }
    public boolean validarUsuario(Cuenta c){
        conexion.crearConexion();
        respuesta = conexion.validarCuentas(c);
        conexion.cerrarConexion();
        return respuesta;
    }
    // Auto
    public boolean agregarAuto(Auto aut){
        conexion.crearConexion();
        respuesta = conexion.agregarAuto(aut);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Cliente> consultarCli(){
        conexion.crearConexion();
        ArrayList<Cliente> clientes = conexion.consultarClientes();
        conexion.cerrarConexion();
        return clientes;
    }
    public ArrayList<Auto> verAutos(){
        conexion.crearConexion();
        ArrayList<Auto> autos = conexion.verAutos();
        conexion.cerrarConexion();
        return autos;
    }
    // Mecánico
    public boolean agregarMecanico(Empleados mec){
        conexion.crearConexion();
        respuesta = conexion.agregarMecanico(mec);
        conexion.cerrarConexion();
        return respuesta;
    }   
     public ArrayList<Empleados> verEmpleadosPorDato(String dato){
        conexion.crearConexion();
        ArrayList<Empleados> empleados = conexion.verEmpleadosPorDato(dato);
        conexion.cerrarConexion();
        return empleados;
    }   
      public ArrayList<Empleados> consultarEmpleados(){
        conexion.crearConexion();
        ArrayList<Empleados> empleados = conexion.consultarEmpleados();
        conexion.cerrarConexion();
        return empleados;
    }    
      public boolean modificarMecanico(Empleados mec){
        conexion.crearConexion();
        respuesta = conexion.modificarMecanico(mec);
        conexion.crearConexion();
        return respuesta;
    }  
    public boolean eliminarMecanico(int id){
        conexion.crearConexion();
        respuesta = conexion.eliminarMecanico(id);
        conexion.crearConexion();
        return respuesta;
    }
    // Proveedor
    public boolean agregarProveedor(Proveedor prov){
        conexion.crearConexion();
        respuesta = conexion.agregarProveedor(prov);
        conexion.cerrarConexion();
        return respuesta;
    }  
    public ArrayList<Proveedor> verProveedor(){
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = conexion.verProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    public ArrayList<Proveedor> consultarProveedores(){
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = conexion.consultarProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    public boolean modificarProveedor(Proveedor prov){
        conexion.crearConexion();
        respuesta = conexion.modificarProveedor(prov);
        conexion.crearConexion();
        return respuesta;
    }
    public boolean eliminarProveedor(int nit){
        conexion.crearConexion();
        respuesta = conexion.eliminarProveedor(nit);
        conexion.crearConexion();
        return respuesta;
    }
    // Repuesto
    public boolean agregarRepuesto(Repuesto rep){
        conexion.crearConexion();
        respuesta = conexion.agregarRepuesto(rep);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Proveedor> consultarProveedor(){
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = conexion.consultarProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    public ArrayList<Repuesto> verRepuestos(){
        conexion.crearConexion();
        ArrayList<Repuesto> repuestos = conexion.verRepuestos();
        conexion.cerrarConexion();
        return repuestos;
    } 
    // Mantenimiento
    public boolean agregarMantenimiento(Mantenimiento man){
        conexion.crearConexion();
        respuesta = conexion.agregarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Auto> consultarAutos(){
        conexion.crearConexion();
        ArrayList<Auto> autos = conexion.consultarAutos();
        conexion.cerrarConexion();
        return autos;
    }
    
    public ArrayList<Empleados> consultarMecanico(){
        conexion.crearConexion();
        ArrayList<Empleados> empleados = conexion.consultarEmpleados();
        conexion.cerrarConexion();
        return empleados;
    }
    
    public ArrayList<Mantenimiento> verMantenimientos(){
        conexion.crearConexion();
        ArrayList<Mantenimiento> mantenimientos = conexion.verMantenimientos();
        conexion.cerrarConexion();
        return mantenimientos;
    } 
    
    public boolean eliminarMantenimiento(Mantenimiento man){
        conexion.crearConexion();
        respuesta = conexion.eliminarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Mantenimiento> consultarManteniminetos(){
        conexion.crearConexion();
        ArrayList<Mantenimiento> mantnimientos = conexion.consultarMantenimientos();
        conexion.cerrarConexion();
        return mantnimientos;
    }

    public boolean actualizarMantenimiento(Mantenimiento man) {
        conexion.crearConexion();
        respuesta = conexion.actualizarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
}
