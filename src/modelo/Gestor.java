package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Logica.Auto;
import modelo.Logica.Cliente;
import modelo.Logica.Cuenta;
import modelo.Logica.DetalleFactura;
import modelo.Logica.Empleados;
import modelo.Logica.Factura;
import modelo.Logica.GrupoClientes;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;

/* @author grupo - MECAUT */
public class Gestor{
    private final Conexion conexion = new Conexion();
    private ResultSet r;
    private boolean respuesta;
    private String res;
    private ArrayList<Cliente> clientes;
    private ArrayList<GrupoClientes> grupo;
    private ArrayList<Auto> autos;
    private ArrayList<Mantenimiento> mantenimientos;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Empleados> empleados;
    private ArrayList<Repuesto> repuestos;
    
    // Cuentas
    public boolean registrarUsuario(Cuenta c){
        conexion.crearConexion();
        respuesta = conexion.registrarCuenta(c);
        conexion.cerrarConexion();
        return respuesta;
    }
    public String validarUsuario(Cuenta c){
        conexion.crearConexion();
        res = conexion.validarCuentas(c);
        conexion.cerrarConexion();
        return res;
    }
    // 1. Modulo Clientes
    // *Clientes
    public boolean agregarCliente(Cliente cli){
        conexion.crearConexion();
        respuesta = conexion.agregarCliente(cli);
        conexion.cerrarConexion();
        return respuesta;
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
        clientes = conexion.consultarClientes();
        conexion.cerrarConexion();
        return clientes;
    }
    public ArrayList<Cliente> verClientePorDato(String dato){
        conexion.crearConexion();
        ArrayList<Cliente> cli = conexion.verClientesPorDato(dato);
        conexion.cerrarConexion();
        return cli;
    }  
    public ResultSet TraerDatosCliente(String id) {
        conexion.crearConexion();
        r = conexion.TraerDatosClientes(id);
        return r;
    }
    public ResultSet IdsClientes() {
        conexion.crearConexion();
        r = conexion.IdsClientes();
        return r;
    }
    // *Grupo Clientes
    public boolean agregarGrupoCliente(String id, String cod, String nom, String est) {
        conexion.crearConexion();
        respuesta = conexion.agregarGrupoCliente(id,cod,nom,est);
        conexion.cerrarConexion();
        return respuesta;
    }
    public boolean actualizarGrupoCliente(String id, String cod, String nom, String est) {
        conexion.crearConexion();
        respuesta = conexion.modificarGrupoCliente(id,cod,nom,est);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<GrupoClientes> verGrupoClientes(String dato) {
        conexion.crearConexion();
        grupo = conexion.verGrupoClientes(dato);
        conexion.cerrarConexion();
        return grupo;
    }
    // *Autos
    public boolean agregarAuto(Auto aut){
        conexion.crearConexion();
        respuesta = conexion.agregarAuto(aut);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Auto> verAutos(){
        conexion.crearConexion();
        autos = conexion.consultarAutos();
        conexion.cerrarConexion();
        return autos;
    }
    public ArrayList<Auto> consultarAutos(){
        conexion.crearConexion();
        autos = conexion.consultarAutos();
        conexion.cerrarConexion();
        return autos;
    }
    public ResultSet ConsultarAutosClientes(String id) {
        conexion.crearConexion();
        r = conexion.ConsultarAutosClientes(id);
        return r;
    }
    public ResultSet consultarDatosAuto(String id) {
        conexion.crearConexion();
        r = conexion.consultarDatosAuto(id);
        return r;
    } 
    public ResultSet consultarDatosRepuestos(String codigo) {
        conexion.crearConexion();
        r = conexion.consultarDatosRepuestos(codigo);
        return r;
    } 
    public ResultSet placasAutos(){
        conexion.crearConexion();
        r = conexion.placasAutos();
        return r;
    }
    public ResultSet datosMantenimiento(String placa){
        conexion.crearConexion();
        r = conexion.datosMantenimiento(placa);
        return r;
    }
    // 2. Servicios
    public boolean agregarMantenimiento(Mantenimiento man){
        conexion.crearConexion();
        respuesta = conexion.agregarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    public boolean actualizarMantenimiento(Mantenimiento man) {
        conexion.crearConexion();
        respuesta = conexion.actualizarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    public boolean eliminarMantenimiento(Mantenimiento man){
        conexion.crearConexion();
        respuesta = conexion.eliminarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Mantenimiento> verMantenimientos(){
        conexion.crearConexion();
        mantenimientos = conexion.consultarMantenimientos();
        conexion.cerrarConexion();
        return mantenimientos;
    }
    public ArrayList<Mantenimiento> consultarManteniminetos(){
        conexion.crearConexion();
        mantenimientos = conexion.consultarMantenimientos();
        conexion.cerrarConexion();
        return mantenimientos;
    }
    // 3. Suministros
    public boolean agregarProveedor(Proveedor prov){
        conexion.crearConexion();
        respuesta = conexion.agregarProveedor(prov);
        conexion.cerrarConexion();
        return respuesta;
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
    public ArrayList<Proveedor> consultarProveedor(){
        conexion.crearConexion();
        proveedores = conexion.consultarProveedores();
        conexion.cerrarConexion();
        return proveedores;
    }
    // 4. Personal
    public boolean agregarEmpleado(Empleados mec){
        conexion.crearConexion();
        respuesta = conexion.agregarEmpleado(mec);
        conexion.cerrarConexion();
        return respuesta;
    }  
    public boolean modificarEmpleado(Empleados mec){
        conexion.crearConexion();
        respuesta = conexion.modificarEmpleado(mec);
        conexion.crearConexion();
        return respuesta;
    }  
    public boolean eliminarEmpleado(String id){
        conexion.crearConexion();
        respuesta = conexion.eliminarEmpleado(id);
        conexion.crearConexion();
        return respuesta;
    }
    public ArrayList<Empleados> verEmpleadosPorDato(String dato){
        conexion.crearConexion();
        empleados = conexion.verEmpleadosPorDato(dato);
        conexion.cerrarConexion();
        return empleados;
    }   
    public ArrayList<Empleados> consultarEmpleados(){
        conexion.crearConexion();
        empleados = conexion.consultarEmpleados();
        conexion.cerrarConexion();
        return empleados;
    }
    public ArrayList<Empleados> consultarMecanico(){
        conexion.crearConexion();
        empleados = conexion.consultarEmpleados();
        conexion.cerrarConexion();
        return empleados;
    }    
    public ResultSet traerDatosEmpleado(String id){
        conexion.crearConexion();
        r = conexion.TraerDatosEmpleado(id);
        return r;
    }  
    public ResultSet idsMecanicos(){
        conexion.crearConexion();
        r = conexion.idsMecanicos();
        return r;
    }
    // 5. Inventario
    public boolean agregarRepuesto(Repuesto rep){
        conexion.crearConexion();
        respuesta = conexion.agregarRepuesto(rep);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<Repuesto> verRepuestos(){
        conexion.crearConexion();
        repuestos = conexion.verRepuestos();
        conexion.cerrarConexion();
        return repuestos;
    } 
    public ResultSet TraerDatosRepuesto(String codigo) {
        conexion.crearConexion();
        r = conexion.TraerDatosRepuesto(codigo);
        return r;
    }
    public ResultSet codRepuestos(){
        conexion.crearConexion();
        r = conexion.codRepuestos();
        return r;
    }
    public ResultSet datosRepuesto(String cod){
        conexion.crearConexion();
        r = conexion.datosRepuesto(cod);
        return r;
    }
    // 6. Ventas

    public boolean detallesMantenimiento(String codMan, String tipoMan, String descripcion, String fecha, String placa, String cli_nombre, String id_mec, String nom_mec, String cod_rep, String tip_rep, String can_rep) {
        conexion.crearConexion();
        respuesta = conexion.detallesMantenimiento(codMan,tipoMan,descripcion,fecha,placa,cli_nombre,id_mec,nom_mec, cod_rep,tip_rep,can_rep);
        return true;
    }

    public boolean registrarMantenimiento(String codigoMantenimiento, String fechaInicio, String observaciones, String costo, String estado) {
        conexion.crearConexion();
        respuesta = conexion.registrarMantenimiento(codigoMantenimiento,fechaInicio,observaciones,costo,estado);
        return respuesta;
    }
    
    public boolean registrarFactura(Factura fac){
        conexion.crearConexion();
        respuesta = conexion.registrarFactura(fac);
        return respuesta;
    }
    
    public boolean registrarDetalleFactura(DetalleFactura det){
        conexion.crearConexion();
        respuesta = conexion.registrarDealleFactura(det);
        return respuesta;
    }
    
    public boolean actualizarInventario(String codigo, int stockFinal){
        conexion.crearConexion();
        respuesta = conexion.actualizarInventario(codigo, stockFinal);
        conexion.crearConexion();
        return respuesta;
    }
}