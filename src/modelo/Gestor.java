package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Datos.AutoOp;
import modelo.Datos.ClienteOp;
import modelo.Datos.CuentaOp;
import modelo.Datos.EmpleadosOp;
import modelo.Datos.MantenimientosOp;
import modelo.Datos.ProveedorOp;
import modelo.Datos.RepuestosOp;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;
import modelo.Logica.Cuenta;
import modelo.Logica.Empleados;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;

/* @author grupo - MECAUT */
public class Gestor {
    private final Conexion conexion = new Conexion();
    private boolean respuesta;
    private final ClienteOp cliOp = new ClienteOp();
    private final EmpleadosOp empOp = new EmpleadosOp();
    private final AutoOp autOp = new AutoOp();
    private final CuentaOp cueOp = new CuentaOp();
    private final MantenimientosOp manOp = new MantenimientosOp();
    private final ProveedorOp proOp = new ProveedorOp();
    private final RepuestosOp repOp = new RepuestosOp();
    // Clientes
    public boolean agregarCliente(Cliente cli){
        conexion.crearConexion();
        respuesta = cliOp.agregarCliente(cli);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Cliente> verClientePorDato(String dato){
        conexion.crearConexion();
        ArrayList<Cliente> clientes = cliOp.verClientesPorDato(dato);
        conexion.cerrarConexion();
        return clientes;
    }    
    public boolean modificarCliente(Cliente cli){
        conexion.crearConexion();
        respuesta = cliOp.modificarCliente(cli);
        conexion.crearConexion();
        return respuesta;
    }   
    public boolean eliminarCliente(String id){
        conexion.crearConexion();
        respuesta = cliOp.eliminarCliente(id);
        conexion.crearConexion();
        return respuesta;
    }    
    public ArrayList<Cliente> consultarClientes(){
        conexion.crearConexion();
        ArrayList<Cliente> clientes = cliOp.consultarClientes();
        conexion.cerrarConexion();
        return clientes;
    }  
    public boolean registrarUsuario(Cuenta c){
        conexion.crearConexion();
        boolean r = cueOp.registrarCuenta(c);
        conexion.cerrarConexion();
        return r;
    }
    public String validarUsuario(Cuenta c){
        conexion.crearConexion();
        String r = cueOp.validarCuentas(c);
        conexion.cerrarConexion();
        return r;
    }
    // Auto
    public boolean agregarAuto(Auto aut){
        conexion.crearConexion();
        respuesta = autOp.agregarAuto(aut);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Cliente> consultarCli(){
        conexion.crearConexion();
        ArrayList<Cliente> clientes = cliOp.consultarClientes();
        conexion.cerrarConexion();
        return clientes;
    }
    public ArrayList<Auto> verAutos(){
        conexion.crearConexion();
        ArrayList<Auto> autos = autOp.verAutos();
        conexion.cerrarConexion();
        return autos;
    }
    // Mecánico
    public boolean agregarEmpleado(Empleados mec){
        conexion.crearConexion();
        respuesta = empOp.agregarEmpleado(mec);
        conexion.cerrarConexion();
        return respuesta;
    }   
     public ArrayList<Empleados> verEmpleadosPorDato(String dato){
        conexion.crearConexion();
        ArrayList<Empleados> empleados = empOp.verEmpleadosPorDato(dato);
        conexion.cerrarConexion();
        return empleados;
    }   
      public ArrayList<Empleados> consultarEmpleados(){
        conexion.crearConexion();
        ArrayList<Empleados> empleados = empOp.consultarEmpleados();
        conexion.cerrarConexion();
        return empleados;
    }    
      public boolean modificarEmpleado(Empleados mec){
        conexion.crearConexion();
        respuesta = empOp.modificarEmpleado(mec);
        conexion.crearConexion();
        return respuesta;
    }  
    public boolean eliminarEmpleado(int id){
        conexion.crearConexion();
        respuesta = empOp.eliminarEmpleado(id);
        conexion.crearConexion();
        return respuesta;
    }
    // Proveedor
    public boolean agregarProveedor(Proveedor prov){
        conexion.crearConexion();
        respuesta = proOp.agregarProveedor(prov);
        conexion.cerrarConexion();
        return respuesta;
    }  
    public ArrayList<Proveedor> verProveedor(){
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = proOp.verProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    public ArrayList<Proveedor> consultarProveedores(){
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = proOp.consultarProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    public boolean modificarProveedor(Proveedor prov){
        conexion.crearConexion();
        respuesta = proOp.modificarProveedor(prov);
        conexion.crearConexion();
        return respuesta;
    }
    public boolean eliminarProveedor(int nit){
        conexion.crearConexion();
        respuesta = proOp.eliminarProveedor(nit);
        conexion.crearConexion();
        return respuesta;
    }
    // Repuesto
    public boolean agregarRepuesto(Repuesto rep){
        conexion.crearConexion();
        respuesta = repOp.agregarRepuesto(rep);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Proveedor> consultarProveedor(){
        conexion.crearConexion();
        ArrayList<Proveedor> proveedores = proOp.consultarProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    public ArrayList<Repuesto> verRepuestos(){
        conexion.crearConexion();
        ArrayList<Repuesto> repuestos = repOp.verRepuestos();
        conexion.cerrarConexion();
        return repuestos;
    } 
    // Mantenimiento
    public boolean agregarMantenimiento(Mantenimiento man){
        conexion.crearConexion();
        respuesta = manOp.agregarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Auto> consultarAutos(){
        conexion.crearConexion();
        ArrayList<Auto> autos = autOp.consultarAutos();
        conexion.cerrarConexion();
        return autos;
    }
    
    public ArrayList<Empleados> consultarMecanico(){
        conexion.crearConexion();
        ArrayList<Empleados> empleados = empOp.consultarEmpleados();
        conexion.cerrarConexion();
        return empleados;
    }
    
    public ArrayList<Mantenimiento> verMantenimientos(){
        conexion.crearConexion();
        ArrayList<Mantenimiento> mantenimientos = manOp.verMantenimientos();
        conexion.cerrarConexion();
        return mantenimientos;
    } 
    
    public boolean eliminarMantenimiento(Mantenimiento man){
        conexion.crearConexion();
        respuesta = manOp.eliminarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    
    public ArrayList<Mantenimiento> consultarManteniminetos(){
        conexion.crearConexion();
        ArrayList<Mantenimiento> mantnimientos = manOp.consultarMantenimientos();
        conexion.cerrarConexion();
        return mantnimientos;
    }

    public boolean actualizarMantenimiento(Mantenimiento man) {
        conexion.crearConexion();
        respuesta = manOp.actualizarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }

    public ResultSet TraerDatosCliente(String id) {
        conexion.crearConexion();
        ResultSet r = cliOp.TraerDatosClientes(id);
        return r;
    }
}
