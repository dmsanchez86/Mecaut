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
import modelo.Logica.HistorialMantenimiento;
import modelo.Logica.Mantenimiento;
import modelo.Logica.Proveedor;
import modelo.Logica.Repuesto;
import modelo.Logica.Reserva;

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
    private ArrayList<HistorialMantenimiento> histMantenimientos;
    private ArrayList<Factura> factura;
    
    
    public String estadoConexion(){
        conexion.crearConexion();
        String est = conexion.estadoConexion();
        return est;
    }
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
    public boolean detallesMantenimiento(String codMan, String tipoMan, String descripcion, String fecha, String placa, String cli_nombre, String id_mec, String nom_mec, String cod_rep, String tip_rep, String can_rep) {
        conexion.crearConexion();
        respuesta = conexion.detallesMantenimiento(codMan,tipoMan,descripcion,fecha,placa,cli_nombre,id_mec,nom_mec, cod_rep,tip_rep,can_rep);
        return true;
    }

    public boolean registrarMantenimiento(String codigoMantenimiento, String fechaInicio, String observaciones, String costo, String estado,String cli_id) {
        conexion.crearConexion();
        respuesta = conexion.registrarMantenimiento(codigoMantenimiento,fechaInicio,observaciones,costo,estado,cli_id);
        return respuesta;
    }
    public boolean actualizarMantenimiento(Mantenimiento man) {
        conexion.crearConexion();
        respuesta = conexion.actualizarMantenimiento(man);
        conexion.cerrarConexion();
        return respuesta;
    }
    public boolean eliminarMantenimiento(String cod){
        conexion.crearConexion();
        respuesta = conexion.eliminarMantenimiento(cod);
        conexion.cerrarConexion();
        return respuesta;
    }
    public boolean eliminarDetMantenimiento(String cod){
        conexion.crearConexion();
        respuesta = conexion.eliminarDetMantenimiento(cod);
        conexion.cerrarConexion();
        return respuesta;
    }
    public boolean eliminarHisMantenimiento(String cod){
        conexion.crearConexion();
        respuesta = conexion.eliminarHisMantenimiento(cod);
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
    public ResultSet traerDatosMantenimiento(String cod){
        conexion.crearConexion();
        r = conexion.traerDatosMantenimiento(cod);
        return r;
    }
    public ResultSet traerDatosDetallesMantenimiento(String cod){
        conexion.crearConexion();
        r = conexion.traerDatosDetallesMantenimiento(cod);
        return r;
    }
    public ResultSet codigoMantenimiento() {
        conexion.crearConexion();
        r = conexion.codigoMantenimiento();
        return r;
    }
    public ResultSet codigosMantenimientos(){
        conexion.crearConexion();
        r = conexion.codigosMantenimientos();
        return r;
    }
    public boolean registrarHistorialMantenimiento(String placa, String codigoMantenimiento, String cli_id, String fecha) {
        conexion.crearConexion();
        respuesta = conexion.registrarHistorialMantenimiento(placa,codigoMantenimiento,cli_id,fecha);
        conexion.cerrarConexion();
        return respuesta;
    }
    public ArrayList<HistorialMantenimiento> listaHistorialMantenimientos(String dato,String campo) {
        conexion.crearConexion();
        histMantenimientos = conexion.listaHisMantenimientos(dato,campo);
        return histMantenimientos;
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
        return respuesta;
    }
    public boolean eliminarProveedor(String nit){
        conexion.crearConexion();
        respuesta = conexion.eliminarProveedor(nit);
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
    public ResultSet idsEmpleados(){
        conexion.crearConexion();
        r = conexion.idsEmpleados();
        return r;
    }
    // 5. Inventario
    public boolean agregarRepuesto(Repuesto rep){
        conexion.crearConexion();
        respuesta = conexion.agregarRepuesto(rep);
        conexion.cerrarConexion();
        return respuesta;
    }
    public boolean modificarRepuesto(String cod, String marca, String cant, String precio) {
        conexion.crearConexion();
        respuesta = conexion.modificarRepuesto(cod,marca,cant,precio);
        return respuesta;
    }

    public boolean eliminarRepuesto(String cod) {
        conexion.crearConexion();
        respuesta = conexion.eliminarRepuesto(cod);
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
    
    public boolean actualizarRepuesto(String codigo, String stockFinal){
        conexion.crearConexion();
        respuesta = conexion.actualizarRepuesto(codigo, stockFinal);
        return respuesta;
    }

    public ResultSet nRegistrosHisMantenimientos() {
        conexion.crearConexion();
        r = conexion.nRegistrosHisMantenimientos();
        return r;
    }

    public ResultSet codigoReserva() {
        conexion.crearConexion();
        r = conexion.codigoReserva();
        return r;
    }

    public ResultSet datosReserva(String id) {
        conexion.crearConexion();
        r = conexion.datosReserva(id);
        return r;
    }

    public boolean registrarReserva(Reserva res) {
        conexion.crearConexion();
        respuesta = conexion.registrarReserva(res);
        return respuesta;
    }

    public ResultSet datosProveedor(String nit) {
        conexion.crearConexion();
        r = conexion.datosProveedor(nit);
        return r;
    }

    public ResultSet codigoOrdenPedido() {
        conexion.crearConexion();
        r = conexion.codigoOrdenPedido();
        return r;
    }

    public ResultSet NitsProveedores() {
        conexion.crearConexion();
        r = conexion.NitsProveedores();
        return r;
    }

    public ResultSet DatosOrden(String nit) {
        conexion.crearConexion();
        r = conexion.DatosOrden(nit);
        return r;
    }

    public ResultSet nomRepuestos() {
        conexion.crearConexion();
        r = conexion.nomRepuestos();
        return r;
    }

    public ResultSet datosRepuestoNombre(String nombre) {
        conexion.crearConexion();
        r = conexion.datosRepuestoNombre(nombre);
        return r;
    }

    public boolean registrarOrdenPedido(String fecha, String nitPro, String nomPro, String telPro, String dirPro, String total) {
        conexion.crearConexion();
        respuesta = conexion.registrarOrdenPedido(fecha,nitPro,nomPro,telPro,dirPro,total);
        return respuesta;
    }

    public boolean registrarDetallesOrden(String cod,String codRep, String tipRep, String marRep, String canRep, String preRep) {
        conexion.crearConexion();
        respuesta = conexion.registrarDetallesOrden(cod,codRep,tipRep, marRep,canRep,preRep);
        return respuesta;
    }

    public ArrayList<Factura> consultarFacturas() {
        conexion.crearConexion();
        factura = new ArrayList<>();
        factura = conexion.consultarFacturas();
        return factura;
    }

    public ResultSet codigosCotizacion() {
        conexion.crearConexion();
        r = conexion.codigosCotizacion();
        return r;
    }

    public ArrayList<Mantenimiento> datosCotizacion(String id) {
        conexion.crearConexion();
        mantenimientos = conexion.datosCotizacion(id);
        return mantenimientos;
    }

    public boolean registrarCotizacion(String fecha, String idCliente, String nombreCliente, String codMante, String valorMantenimiento,String totalMantenimiento, String valorCotizacion, String observaciones) {
        conexion.crearConexion();
        respuesta = conexion.registrarCotizacion(fecha,idCliente,nombreCliente,codMante,valorMantenimiento,totalMantenimiento,valorCotizacion,observaciones);
        return respuesta;
    }

    public boolean actualizarMantenimiento(String codMante, String totalMantenimiento) {
        conexion.crearConexion();
        respuesta = conexion.actualizarMantenimiento(codMante,totalMantenimiento);
        return respuesta;
    }

    public ResultSet validarFicha(String placa) {
        conexion.crearConexion();
        r = conexion.validarFicha(placa);
        return r;
    }

    public boolean registrarFichaTecnica(String fecha, String idCli, String Placa, String cil, String fre, String peso, String col, String mot, String pot, String tran, String lar, String anc, String alt, String cojineria, String puertas, String luces) {
        conexion.crearConexion();
        respuesta = conexion.registrarFichaTecnica(fecha, idCli,Placa,cil,fre,peso,col,mot,pot,tran,lar,anc,alt,cojineria,puertas,luces);
        return respuesta;
    }
    public boolean modificarFichaAuto(String fechaActualizacion, String idCli, String Placa, String cil, String fre, String peso, String col, String mot, String pot, String tran, String lar, String anc, String alt, String cojineria, String puertas, String luces) {
        conexion.crearConexion();
        respuesta = conexion.modificarFichaAuto(fechaActualizacion, idCli,Placa,cil,fre,peso,col,mot,pot,tran,lar,anc,alt,cojineria,puertas,luces);
        return respuesta;
    }

    public ResultSet codigoFactura() {
        conexion.crearConexion();
        r = conexion.codigoFactura();
        return r;
    }

    public ResultSet codigoPromocion() {
        conexion.crearConexion();
        r = conexion.codigoPromocion();
        return r;
    }

    public boolean registrarPromocion(String fecha, String tipo, String estado, String desc) {
        conexion.crearConexion();
        respuesta = conexion.registrarPromocion(fecha,tipo,estado,desc);
        return respuesta;
    }
    public boolean modificarPromocion(String codigo, String fecha, String tipo, String estado, String desc) {
        conexion.crearConexion();
        respuesta = conexion.modificarPromocion(codigo, fecha,tipo,estado,desc);
        return respuesta;
    }
    
    public boolean eliminarPromocion(String codigo){
        conexion.crearConexion();
        respuesta = conexion.eliminarPromocion(codigo);
        return respuesta;
    }
    
    public ResultSet listaDePromociones(){
        conexion.crearConexion();
        r = conexion.listaPromociones();
        return r;
    }
    
    public ResultSet datosPromocion(String codigo){
        conexion.crearConexion();
        r = conexion.datosPromocion(codigo);
        return r;
    }
    
}