package controlador;

import vista.Clientes.jifUpdateContraseñaCli;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import modelo.Gestor;
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
import vista.Clientes.jifActualizarCliente;
import vista.Clientes.jifGrupoClientes;
import vista.Clientes.jifListaAutos;
import vista.Clientes.jifListaClientes;
import vista.Clientes.jifRegistrarAuto;
import vista.Clientes.jifRegistrarCliente;
import vista.Personal.jifActualizarEmpleado;
import vista.Personal.jifListaEmpleados;
import vista.Personal.jifRegistrarEmpleado;
import vista.Ventas.jifFactura;
import vista.FormulariosPrincipales.frmAdmin;
import vista.FormulariosPrincipales.frmCliente;
import vista.FormulariosPrincipales.frmEmpleado;
import vista.FormulariosPrincipales.frmLoggin;
import vista.Servicios.jifActualizarMantenimiento;
import vista.Servicios.jifListaMantenimientos;
import vista.Servicios.jifRegistrarMantenimiento;
import vista.Servicios.jifHistMantenimiento;
import vista.Proveedores.jifActualizarProveedor;
import vista.Proveedores.jifListaProveedores;
import vista.Proveedores.jifRegistrarProveedor;
import vista.Inventario.jifActualizarRepuesto;
import vista.Inventario.jifListaRepuestos;
import vista.Inventario.jifRegistrarRepuesto;
import vista.Servicios.jifReservas;
import vista.Inventario.jifOrdenDePedido;
import vista.Clientes.jifCuentas;
import vista.Ventas.jifListaFacturas;
import vista.Servicios.jifCotizacion;
import vista.Servicios.jifPromociones;
import vista.Servicios.jifCotizar;
import vista.Servicios.jifFichaAuto;
import vista.Servicios.jifHistorialAuto;
import vista.Servicios.jifRegistroAuto;
import vista.Servicios.jifSolicitarMantenimiento;
import vista.Servicios.jifSolicitarReserva;
import vista.Servicios.jifVerFichaAuto;
import vista.Servicios.jifVerPromociones;
import vista.FormulariosPrincipales.jifConfiguracionAdmin;
import vista.Servicios.jifListaMantenimientosPendientes;

public class Controlador {

    private final jifListaMantenimientosPendientes jifListaMantenimientosPendientes;
    private final jifVerFichaAuto jifVerFichaAuto;
    private final jifCotizar jifCotizar;
    private final jifHistorialAuto jifHistorialAuto;
    private final jifRegistroAuto jifRegistroAuto;
    private final jifSolicitarMantenimiento jifSolicitarMantenimiento;
    private final jifSolicitarReserva jifSolicitarReserva;
    private final jifVerPromociones jifVerPromociones;
    private Calendar c;
    private JPopupMenu MenuDesplegable;
    private JMenuItem jmiModificar;
    private JMenuItem jmiEliminar;
    private JMenuItem jmiCambiarEstado;
    private final Gestor Gestor;
    private final frmAdmin form;
    private final jifRegistrarCliente jifCliente;
    private final jifActualizarCliente jifActualizarCliente;
    private final jifRegistrarMantenimiento jifMantenimiento;
    private final jifListaClientes jifListaClientes;
    private final jifListaAutos jifListaAutos;
    private final jifListaRepuestos jifListaRepuestos;
    private final jifListaEmpleados jifListaEmpleados;
    private final jifListaProveedores jifListaProveedores;
    private final jifActualizarProveedor jifActualizarProveedor;
    private final jifRegistrarAuto jifAuto;
    private final jifRegistrarProveedor jifProveedor;
    private final jifRegistrarEmpleado jifEmpleado;
    private final jifActualizarEmpleado jifActualizarEmpleado;
    private final jifRegistrarRepuesto jifRepuesto;
    private final jifActualizarRepuesto jifActualizarRepuesto;
    private final jifListaMantenimientos jifListaMantenimientos;
    private final jifActualizarMantenimiento jifActualizarMantenimiento;
    private final jifFactura jifFactura;
    private final frmLoggin Login;
    private final frmCliente frmCliente;
    private final frmEmpleado frmEmpleado;
    private final jifGrupoClientes jifGrupoClientes;
    private final jifHistMantenimiento jifHistMantenimiento;
    private final jifReservas jifReservas;
    private final jifOrdenDePedido jifOrdenDePedido;
    private final jifCuentas jifCuentas;
    private final jifListaFacturas jifListaFacturas;
    private final jifCotizacion jifCotizacion;
    private final jifFichaAuto jifFichaAuto;
    private final jifPromociones jifPromociones;
    private final jifConfiguracionAdmin jifConfiguracionAdmin;
    private final jifUpdateContraseñaCli jifUpdateContraseñaCli;
    
    /* CONSTRUCTOR */

    public Controlador() {
        // Inicializamos todos los objetos de los jInternalFrame
        MenuDesplegable = new JPopupMenu();
        jmiModificar = new JMenuItem();
        jmiEliminar = new JMenuItem();
        jmiCambiarEstado = new JMenuItem();
        jifHistorialAuto = new jifHistorialAuto();
        jifVerFichaAuto = new jifVerFichaAuto();
        jifCotizar = new jifCotizar();
        jifRegistroAuto = new jifRegistroAuto();
        jifSolicitarMantenimiento = new jifSolicitarMantenimiento();
        jifSolicitarReserva = new jifSolicitarReserva();
        jifVerPromociones = new jifVerPromociones();
        jifListaMantenimientosPendientes = new jifListaMantenimientosPendientes();
        Gestor = new Gestor();
        Login = new frmLoggin();
        form = new frmAdmin();
        frmCliente = new frmCliente();
        frmEmpleado = new frmEmpleado();
        jifCliente = new jifRegistrarCliente();
        jifActualizarCliente = new jifActualizarCliente();
        jifMantenimiento = new jifRegistrarMantenimiento();
        jifListaClientes = new jifListaClientes();
        jifListaAutos = new jifListaAutos();
        jifListaRepuestos = new jifListaRepuestos();
        jifListaEmpleados = new jifListaEmpleados();
        jifActualizarEmpleado = new jifActualizarEmpleado();
        jifListaProveedores = new jifListaProveedores();
        jifActualizarProveedor = new jifActualizarProveedor();
        jifListaMantenimientos = new jifListaMantenimientos();
        jifActualizarMantenimiento = new jifActualizarMantenimiento();
        jifAuto = new jifRegistrarAuto();
        jifProveedor = new jifRegistrarProveedor();
        jifEmpleado = new jifRegistrarEmpleado();
        jifRepuesto = new jifRegistrarRepuesto();
        jifActualizarRepuesto = new jifActualizarRepuesto();
        jifGrupoClientes = new jifGrupoClientes();
        jifFactura = new jifFactura();
        jifHistMantenimiento = new jifHistMantenimiento();
        jifReservas = new jifReservas();
        jifOrdenDePedido = new jifOrdenDePedido();
        jifCuentas = new jifCuentas();
        jifListaFacturas = new jifListaFacturas();
        jifCotizacion = new jifCotizacion();
        jifFichaAuto = new jifFichaAuto();
        jifPromociones = new jifPromociones();
        jifConfiguracionAdmin = new jifConfiguracionAdmin();
        jifUpdateContraseñaCli = new jifUpdateContraseñaCli();
        // Se añaden los jInternalFrame al jDesktopPanel
        form.jDesktopPane1.add(jifMantenimiento);
        form.jDesktopPane1.add(jifCliente);
        form.jDesktopPane1.add(jifActualizarCliente);
        form.jDesktopPane1.add(jifListaClientes);
        form.jDesktopPane1.add(jifListaAutos);
        form.jDesktopPane1.add(jifListaRepuestos);
        form.jDesktopPane1.add(jifListaEmpleados);
        form.jDesktopPane1.add(jifListaProveedores);
        form.jDesktopPane1.add(jifAuto);
        form.jDesktopPane1.add(jifProveedor);
        form.jDesktopPane1.add(jifEmpleado);
        form.jDesktopPane1.add(jifActualizarEmpleado);
        form.jDesktopPane1.add(jifRepuesto);
        form.jDesktopPane1.add(jifActualizarRepuesto);
        form.jDesktopPane1.add(jifListaMantenimientos);
        form.jDesktopPane1.add(jifActualizarMantenimiento);
        form.jDesktopPane1.add(jifActualizarProveedor);
        form.jDesktopPane1.add(jifGrupoClientes);
        form.jDesktopPane1.add(jifFactura);
        form.jDesktopPane1.add(jifHistMantenimiento);
        form.jDesktopPane1.add(jifReservas);
        form.jDesktopPane1.add(jifOrdenDePedido);
        form.jDesktopPane1.add(jifCuentas);
        form.jDesktopPane1.add(jifListaFacturas);
        form.jDesktopPane1.add(jifCotizacion);
        form.jDesktopPane1.add(jifFichaAuto);
        form.jDesktopPane1.add(jifPromociones);
        form.jDesktopPane1.add(jifListaMantenimientosPendientes);
        form.jDesktopPane1.add(jifConfiguracionAdmin);
        frmCliente.jDesktopPane1.add(jifVerFichaAuto);
        frmCliente.jDesktopPane1.add(jifCotizar);
        frmCliente.jDesktopPane1.add(jifHistorialAuto);
        frmCliente.jDesktopPane1.add(jifRegistroAuto);
        frmCliente.jDesktopPane1.add(jifSolicitarMantenimiento);
        frmCliente.jDesktopPane1.add(jifSolicitarReserva);
        frmCliente.jDesktopPane1.add(jifVerPromociones);
        frmCliente.jDesktopPane1.add(jifUpdateContraseñaCli);
    }
    /* INICIO LOGGIN */
    public void lanzarLogin() {
        Login.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        Login.jtfUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        Login.jtfContraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtIniciarSesion();
            }
        });
        Login.jbtSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        Login.jtfUsuario.requestFocus();
        Login.setVisible(true);
    }
    
    /* Formulario Administrador */

    private void lanzarFormularioAdministrador(String id) {
        limpiarInicio();
        /* MENU - CLIENTES */
        // 1. Modulo Clientes
        form.jmiRegistrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarCliente(); 
            }
        });
        form.jmiActualizarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmActualizarCliente();
            }
        });
        form.jmiListaCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaClientes();
            }
        });
        form.jmiGrupoClientes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmGrupoClientes();
            }
        });
        form.jmiRegistrarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarAuto();
            }
        });
        form.jmiListaAutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaAutos();
            }
        });
        form.jmiRegistrarCuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmCuentas();
            }
        });
        // 2. Modulo Servicios
        form.jmiRegistrarMantenimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarMantenimientos();
            }
        });
        form.jmiActualizarMantenimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmActualizarMantenimiento();
            }
        });
        form.jmiMantenimientosPendientes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmListaMantenimientosPendientes();
            }
        });
        form.jmiListaMantenimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaMantenimientos();
            }
        });
        form.jmiHistMantenimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmHistorialMantenimiento();
            }
        });
        form.jmiReservas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmReservas();
            }
        });
        form.jmiPromociones.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmPromocionesCombos();
            }
        });
        form.jmiCotizacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmCotizacion();
            }
        });
        form.jmiFichaRecepcion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmFichaRecepcionAuto();
            }
        });
        // 3. Modulo Suministros
        form.jmiRegitrarProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarProveedor();
            }
        });
        form.jmiActualizarProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmActualizarProveedor();
            }
        });
        form.jmiListaProveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaProveedores();
            }
        });
        // 4. Modulo Personal
        form.jmiRegistrarMecanico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarEmpleado();
            }
        });
        form.jmiActualizarMecanico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmActualizarEmpleado();
            }
        });
        form.jmiListaEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaEmpleados();
            }
        });
        // 5. Modulo Inventario
        form.jmiRegistrarRepuestos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmRegistrarRepuestos();
            }
        });
        form.jmiActualizarRepuesto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmActualizarRepuesto();
            }
        });
        form.jmiListaRepuestos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmListaRepuestos();
            }
        });
        form.jmiOrdenPedido.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmOrdenDePedido();
            }
        });
        // 6. Modulo Ventas
        form.jmiRegistrarFactura.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                frmFactura();
            }
        });
        // 7. Modulo Reportes
        form.jmiListaFacturas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmListaFacturas();
            }
        });
        // 8. Modulo ayuda
        
        // 9. Modulo salir
        form.jmiConfiguracion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] d = form.user.getToolTipText().split(" ");
                frmConfiguracionAdministrador(d[1]);
            }
        });
        form.jmiSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setVisible(false);
                Login.jtfContraseña.setText("");
                Login.setVisible(true);
            }
        });evtNumeroMantenimientosPendientes();
        evtNumeroMantenimientosPendientes();
        String user = Login.jtfUsuario.getText();
        form.setVisible(true);
        form.user.setText(user.toUpperCase());
        form.user.setToolTipText("Identificación: "+id+" \nUsuario: "+user);
        form.conection.setText(Gestor.estadoConexion());
    }
    /* Formulario Cliente */

    private void lanzarFormularioCliente(String id) {
        frmCliente.jmiConfiguracion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               frmConfiguracion();
            }
        });
        
        frmCliente.jmiSolicitarMantenimiento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmSolicitarMantenimiento();
            }
        });
        frmCliente.jmiSolicitarReserva.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifSolicitarReserva.setVisible(true);
            }
        });
        frmCliente.jmiRegistrarAuto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmRegistrarAutoCliente();
            }
        });
        frmCliente.jmiVerFichaAuto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmVerFichaAuto();
            }
        });
        frmCliente.jmiHistorialAuto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifHistorialAuto.setVisible(true);
            }
        });
        frmCliente.jmiPromocionesCombos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmVerPromociones();
            }
        });
        frmCliente.jmiCotizar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifCotizar.setVisible(true);
            }
        });
        frmCliente.jmiCerrarSesion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmCliente.setVisible(false);
                Login.setVisible(true);
                Login.jtfContraseña.setText(null);
            }
        });
        
        String user = Login.jtfUsuario.getText().toUpperCase();
        frmCliente.user.setText(user.toUpperCase());
        frmCliente.user.setToolTipText("Identificación: "+id+" Usuario: "+user);
        frmCliente.conection.setText(Gestor.estadoConexion());
        frmCliente.setVisible(true);
    }
    
    public void frmSolicitarMantenimiento(){
        limpiar();
        limpiarTablas(jifSolicitarMantenimiento.Detalles);
        jifSolicitarMantenimiento.ListaAutos.setEnabled(true);
        String[] d = frmCliente.user.getToolTipText().split(" ");
        ResultSet datos = Gestor.ConsultarAutosClientes(d[1]);
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Placa");
            modelo.addColumn("Ciudad");
            modelo.addColumn("Modelo");
            modelo.addColumn("Marca");
            while(datos.next()){
                Object[] fila = new Object[4];
                fila[0] = datos.getString("aut_placa");
                fila[1] = datos.getString("aut_ciudad");
                fila[2] = datos.getString("aut_modelo");
                fila[3] = datos.getString("aut_marca");
                modelo.addRow(fila);
            }
            jifSolicitarMantenimiento.ListaAutos.setModel(modelo);
        } catch (Exception e) {
        }
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Cliente");
        modelo.addColumn("Tipo Mantenimiento");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripción");
        jifSolicitarMantenimiento.jbtAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] fila =  new Object[5];
                String[] d = frmCliente.user.getToolTipText().split(" ");
                ResultSet nom = Gestor.TraerDatosCliente(d[1]);
                try {
                    while(nom.next())
                        fila[1] = nom.getString("cli_nombre");
                    fila[0] = jifSolicitarMantenimiento.jtfPlaca.getText();
                    fila[2] = "";
                    fila[3] = "";
                    fila[4] = "";
                modelo.addRow(fila);
                } catch (Exception exc) {}
                jifSolicitarMantenimiento.Detalles.setModel(modelo);  
                jifSolicitarMantenimiento.jFrame1.setBounds(290, 250, 270, 295);
                jifSolicitarMantenimiento.jFrame1.setVisible(true);
                jifSolicitarMantenimiento.jcbTipoMantenimiento.setSelectedIndex(0);
                jifSolicitarMantenimiento.jdcFechaMantenimiento.setDate(null);
                jifSolicitarMantenimiento.jtfDescripcion.setText(null);
                jifSolicitarMantenimiento.ListaAutos.setEnabled(false);
            }
        });
        jifSolicitarMantenimiento.jbtEliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int fs =jifSolicitarMantenimiento.Detalles.getSelectedRow();
                if (fs < 0) 
                    JOptionPane.showMessageDialog(null,"Selecciones una columna","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    DefaultTableModel m = (DefaultTableModel) jifSolicitarMantenimiento.Detalles.getModel();
                    m.removeRow(fs);
                }
            }
        });
        jifSolicitarMantenimiento.jbtVolver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifSolicitarMantenimiento.jFrame1.hide();
            }
        });
        jifSolicitarMantenimiento.jbtSumar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jifSolicitarMantenimiento.jcbTipoMantenimiento.getSelectedIndex() == 0) 
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de mantenimiento para el auto","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifSolicitarMantenimiento.jdcFechaMantenimiento.getDate() == null)
                    JOptionPane.showMessageDialog(null, "Seleccione una fecha para el tipo de mantenimiento","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifSolicitarMantenimiento.jtfDescripcion.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Ingrese una descripcion para el tipo de mantenimiento","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    java.util.Date f  = jifSolicitarMantenimiento.jdcFechaMantenimiento.getDate();
                    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
                    String fecha = sf.format(f);
                    int fila = jifSolicitarMantenimiento.Detalles.getRowCount()-1;
                    jifSolicitarMantenimiento.Detalles.setValueAt(jifSolicitarMantenimiento.jcbTipoMantenimiento.getSelectedItem().toString(), fila, 2);
                    jifSolicitarMantenimiento.Detalles.setValueAt(fecha, fila, 3);
                    jifSolicitarMantenimiento.Detalles.setValueAt(jifSolicitarMantenimiento.jtfDescripcion.getText(), fila, 4);
                    jifSolicitarMantenimiento.jFrame1.hide();
                    jifSolicitarMantenimiento.jbtSolicitar.setEnabled(true);
                }
            }
        });
        jifSolicitarMantenimiento.jbtSolicitar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(jifSolicitarMantenimiento.Detalles.getRowCount()<=0)
                    JOptionPane.showMessageDialog(null,"Ingrese por lo menos un tipo de mantenimiento","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    c = new GregorianCalendar();
                    SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd");
                    String fecha = sd.format(c.getTime());
                    String placa = jifSolicitarMantenimiento.jtfPlaca.getText();
                    String[] d = frmCliente.user.getToolTipText().split(" ");
                    String id = d[1];
                    String nombre ="";
                    ResultSet n = Gestor.TraerDatosCliente(id);
                    try {
                        while(n.next())
                            nombre = n.getString("cli_nombre");
                    } catch (Exception ex) {}
                    if (Gestor.registrarMantenimientoCliente(placa,id,nombre,"Pendiente",fecha)) {
                        String [][] datos = new String[jifSolicitarMantenimiento.Detalles.getRowCount()][5];
                        for (int i = 0; i < jifSolicitarMantenimiento.Detalles.getRowCount(); i++) {
                            for (int j = 0; j < 5; j++) {
                                datos[i][j] = (String)jifSolicitarMantenimiento.Detalles.getValueAt(i, j);
                            }
                        }
                        for (int i = 0; i < jifSolicitarMantenimiento.Detalles.getRowCount(); i++) {
                            if (Gestor.registrarDetallesMantenimientoCliente(datos[i][0], datos[i][1], datos[i][2], datos[i][3], datos[i][4])) {
                                JOptionPane.showMessageDialog(null, "Se Registro correctamente la solicitud de mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);                                
                            }
                        }
                    }
                    limpiar();
                    limpiarTablas(jifSolicitarMantenimiento.Detalles);
                    jifSolicitarMantenimiento.jbtSolicitar.setEnabled(false);
                }
            }
        });
        jifSolicitarMantenimiento.setVisible(true);
        locacionfrm(jifSolicitarMantenimiento);
    }
    
    public void frmRegistrarAutoCliente(){
        
        jifRegistroAuto.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] datos = frmCliente.user.getToolTipText().split(" ");
                String cli_nombre = "";
                ResultSet r = Gestor.TraerDatosCliente(datos[1]);
                try {
                    while(r.next())
                        cli_nombre = r.getString("cli_nombre");
                } catch (Exception ex) {}
                String placa = jifRegistroAuto.jtfPlaca.getText();
                String ciudad = jifRegistroAuto.jcbCiudad.getSelectedItem().toString();
                String tipo = jifRegistroAuto.jcbTipo.getSelectedItem().toString();
                String modelo = jifRegistroAuto.jcbModelo.getSelectedItem().toString();
                String marca = jifRegistroAuto.jcbMarca.getSelectedItem().toString();
                String kilometraje = jifRegistroAuto.jtfKilometraje.getText();
                String combustible = jifRegistroAuto.jtfCombustible.getText();
                
                Auto auto = new Auto(placa, ciudad, tipo, modelo, marca, kilometraje, combustible, datos[1], cli_nombre);
                if (Gestor.agregarAuto(auto)) {
                    JOptionPane.showMessageDialog(null, "Se registro el auto correctamente","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                }
                else
                    JOptionPane.showMessageDialog(null, "No se pudo registrar el auto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        jifRegistroAuto.jbtRegistrar1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
            }
        });
        
        jifRegistroAuto.setVisible(true);
    }
    /* Formulario Empleado */

    private void lanzarFormularioEmpleado(String id) {
        frmEmpleado.setVisible(true);
        frmEmpleado.jmSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmEmpleado.hide();
                Login.setVisible(true);
                Login.jtfContraseña.setText(null);
            }
        });
    }
    /* 1. Modulo Clientes */

    private void frmRegistrarCliente() {
        limpiar();
        limpiarComboBox();

        jifCliente.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifCliente.jtfIdentificacion.getText();
                    String nombre = jifCliente.jtfNombre.getText();
                    String apellidos = jifCliente.jtfApellidos.getText();
                    String sexo = jifCliente.jcbSexo.getSelectedItem().toString();
                    String telefono = jifCliente.jtfTelefono.getText();
                    String direccion = jifCliente.jtfDireccion.getText();
                    String correo = jifCliente.jtfCorreo.getText();
                    if(identificacion.length() < 10){
                        JOptionPane.showMessageDialog(null, "Ingrese una identificación valida","MECAUT",JOptionPane.WARNING_MESSAGE);
                        jifCliente.jtfIdentificacion.requestFocus();
                    }
                    else if (identificacion.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || direccion.isEmpty()) {
                        /* Esta Condición es para que no salga error cuando se abre el formulario por 2da vez */
                    } else {
                        Cliente cli = new Cliente(identificacion, nombre, apellidos, sexo, telefono, direccion, correo);
                        Cuenta cuenta = new Cuenta(identificacion, identificacion, "cliente", identificacion);
                        if (Gestor.agregarCliente(cli) && Gestor.registrarUsuario(cuenta) && Gestor.agregarGrupoCliente(identificacion, "GRO002", "Ocasional", "Activo")) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " almacenados!", "MECAUT - Registro Cliente", JOptionPane.INFORMATION_MESSAGE);
                            limpiarComboBox();
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos del cliente " + nombre + "", "MECAUT - Registro Cliente", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros en los campos...", "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        jifCliente.jbtCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
            }
        });
        jifCliente.setVisible(true);
        jifCliente.show();
        locacionfrm(jifCliente);
    }

    private void frmActualizarCliente() {
        limpiar();
        limpiarComboBox();
        
        jifActualizarCliente.jtfIdentificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtConsultarClienteporId();
            }
        });
        
        jifActualizarCliente.jtfIdentificacion.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                evtConsultarClienteporId();
            }
        });
        
        jifActualizarCliente.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String identificacion = jifActualizarCliente.jtfIdentificacion.getText();
                    String nombre = jifActualizarCliente.jtfNombre.getText();
                    String apellidos = jifActualizarCliente.jtfApellidos.getText();
                    String sexo = jifActualizarCliente.jcbSexo.getSelectedItem().toString();
                    String telefono = jifActualizarCliente.jtfTelefono.getText();
                    String direccion = jifActualizarCliente.jtfDireccion.getText();
                    String correo = jifActualizarCliente.jtfCorreo.getText();
                    Cliente cli = new Cliente(identificacion, nombre, apellidos, sexo, telefono, direccion, correo);
                    if (Gestor.modificarCliente(cli)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " modificados!", "Mecaut - Cliente", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarComboBox();
                        jifActualizarCliente.jbtEliminar.setEnabled(false);
                        jifActualizarCliente.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los del cliente " + nombre + "!", "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException re) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + re.getMessage(), "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifActualizarCliente.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = jifActualizarCliente.jtfNombre.getText();
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar el cliente " + nombre.toUpperCase() + "?", "Eliminar CLIENTE", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String identificacion = jifActualizarCliente.jtfIdentificacion.getText();
                        if (Gestor.eliminarCliente(identificacion)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del cliente " + nombre.toUpperCase() + " eliminados!", "Mecaut - Cliente", JOptionPane.INFORMATION_MESSAGE);
                            jifActualizarCliente.jcbSexo.setSelectedItem(0);
                            limpiar();
                            limpiarComboBox();
                            jifActualizarCliente.jbtEliminar.setEnabled(true);
                            jifActualizarCliente.jbtModificar.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos del cliente " + nombre.toUpperCase() + "", "Mecaut - Cliente", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException se) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + se.getMessage(), "Error -- MECAUT", 1);
                }
            }
        });
        
        TextAutoCompleter t = new TextAutoCompleter(jifActualizarCliente.jtfIdentificacion);
        ResultSet ids = Gestor.IdsClientes();
        try {
            while (ids.next())
                t.addItem(ids.getString("cli_id"));
        } catch (Exception e) {}
        jifActualizarCliente.setVisible(true);
        locacionfrm(jifActualizarCliente);
    }

    private void frmListaClientes() {
        evtMostrarClientes();
        jifListaClientes.jtfDato.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                evtMostrarClientes();
            }
        });
        jifListaClientes.setVisible(true);
    }

    private void evtMostrarClientes() {
        String dato = jifListaClientes.jtfDato.getText();
        ArrayList<Cliente> clientes = Gestor.verClientePorDato(dato);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo Eléctronico");
        for (Cliente cliente : clientes) {
            Object[] fila = new Object[7];
            fila[0] = cliente.getIdentificacion();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getApellidos();
            fila[3] = cliente.getSexo();
            fila[4] = cliente.getTelefono();
            fila[5] = cliente.getDireccion();
            fila[6] = cliente.getCorreo();
            modelo.addRow(fila);
        }
        jifListaClientes.jtListaClientes.setModel(modelo);
        int nRegistros = modelo.getRowCount();
        jifListaClientes.nRegistros.setText("" + nRegistros);
    }
    
    private void frmCuentas(){
        limpiar();
        limpiarComboBox();
        
        jifCuentas.jbtCrearCuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = jifCuentas.jtfUsuario.getText();
                String contrasena = jifCuentas.jtfcontrasena.getText();
                String cContrasena = jifCuentas.jtfconfContrasena.getText();
                String tipo = jifCuentas.jcbTipoCuenta.getSelectedItem().toString();
                if(usuario.isEmpty() || usuario.length() < 5)
                    JOptionPane.showMessageDialog(null, "Ingrese un usuario valido","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if (contrasena.equals(cContrasena)) {
                    if (jifCuentas.jTabbedPane1.getSelectedIndex() == 0) {
                        String id = jifCuentas.jtfIdentificacionCli.getText();
                        String nom = jifCuentas.jtfNombrec.getText();
                        String apel = jifCuentas.jtfApellidosc.getText();
                        String sex = jifCuentas.jcbSexoc.getSelectedItem().toString();
                        String tel = jifCuentas.jtfTelefonoc.getText();
                        String dir = jifCuentas.jtfDireccionc.getText();
                        String cor = jifCuentas.jtfCorreoc.getText();
                        
                        Cliente cli = new Cliente(id, nom, apel, sex, tel, dir, cor);
                        Cuenta count = new Cuenta(usuario, contrasena, tipo, id);
                        if (Gestor.agregarCliente(cli) && Gestor.registrarUsuario(count)) {
                            JOptionPane.showMessageDialog(null, "Se registro correctamente la cuenta "+usuario.toUpperCase()+"\nAl Cliente "+nom.toUpperCase(),"MECAUT",JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            limpiarComboBox();
                        }
                    }else{
                        String id = jifCuentas.jtfIdentificacion1.getText();
                        String nom = jifCuentas.jtfNombre1.getText();
                        String apel = jifCuentas.jtfApellidos1.getText();
                        String sex = jifCuentas.jcbSexo1.getSelectedItem().toString();
                        String tipEmpl = jifCuentas.jcbTipo.getSelectedItem().toString();
                        String tel = jifCuentas.jtfTelefono1.getText();
                        String dir = jifCuentas.jtfDireccion1.getText();
                        String cor = jifCuentas.jtfCorreo1.getText();
                        String sal = jifCuentas.jtfSalario.getText();
                        
                        Empleados emp = new Empleados(id, nom, apel, sex, tipEmpl, tel, dir, cor, sal);
                        Cuenta count = new Cuenta(usuario, contrasena, tipo, id);
                        if (Gestor.agregarEmpleado(emp) && Gestor.registrarUsuario(count)) {
                            JOptionPane.showMessageDialog(null, "Se registro correctamente la cuenta "+usuario.toUpperCase()+"\nAl Empleado "+nom.toUpperCase());
                            limpiar();
                            limpiarComboBox();
                        }
                    }                        
                }
                else if(contrasena.length() < 6)
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener una longitud mayor a 6 caracteres","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifCuentas.jcbTipoCuenta.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null, "Ingrese el tipo de cuenta","MECAUT",JOptionPane.WARNING_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden...", "MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifCuentas.jcbTipoCuenta.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = (jifCuentas.jcbTipoCuenta.getSelectedItem() != null)?jifCuentas.jcbTipoCuenta.getSelectedItem().toString():"";
                switch(dato){
                    case "administrador":
                        jifCuentas.jTabbedPane1.setSelectedIndex(1);
                        jifCuentas.jcbTipo.setSelectedIndex(2);
                        break;
                    case "empleado":
                        jifCuentas.jTabbedPane1.setSelectedIndex(1);
                        jifCuentas.jcbTipo.setSelectedIndex(1);
                        break;
                        default:
                            jifCuentas.jTabbedPane1.setSelectedIndex(0);
                            break;
                }   
            }
        });
        
        jifCuentas.setVisible(true);
    }

    private void frmGrupoClientes() {
        limpiar();
        limpiarComboBox();
        evtVerGrupoClientes("Activo");
        int n2 = jifGrupoClientes.jtGrupoClientes.getRowCount();
        jifGrupoClientes.nRegistros.setText("" + n2);
        
        jifGrupoClientes.jcbTipo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = jifGrupoClientes.jcbTipo.getSelectedItem().toString();
                evtVerGrupoClientes(dato);
            }
        });
        jifGrupoClientes.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jifGrupoClientes.jtfId.getText();
                String cod = jifGrupoClientes.jcbcodigoGrupo.getSelectedItem().toString();
                String nom = jifGrupoClientes.jcbNombregrupo.getSelectedItem().toString();
                String est = jifGrupoClientes.jcbEstado.getSelectedItem().toString();
                if (Gestor.actualizarGrupoCliente(id, cod, nom, est)) {
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente el estado del cliente", "MECAUT", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    evtVerGrupoClientes(nom);
                    jifGrupoClientes.jbtModificar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el estado del cliente", "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifGrupoClientes.jbtCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
                jifGrupoClientes.jbtModificar.setEnabled(false);
            }
        });
        
        jifGrupoClientes.setVisible(true);
        locacionfrm(jifGrupoClientes);
    }

    private void evtVerGrupoClientes(String tipo) {
        ArrayList<GrupoClientes> grupo;
        switch (tipo) {
            case "Habitual":
                grupo = Gestor.verGrupoClientes("Habitual");
                break;
            case "Ocasional":
                grupo = Gestor.verGrupoClientes("Ocasional");
                break;
            case "Potencial":
                grupo = Gestor.verGrupoClientes("Potencial");
                break;
            case "Activo":
                grupo = Gestor.verGrupoClientes("Activo");
                break;
            case "Inactivo":
                grupo = Gestor.verGrupoClientes("Inactivo");
                break;
            default:
                grupo = Gestor.verGrupoClientes("Activo");
                break;
        }
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Grupo");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Estado");
        for (GrupoClientes grupos : grupo) {
            Object[] fila = new Object[4];
            fila[0] = grupos.getCodigo();
            fila[1] = grupos.getNombre();
            fila[2] = grupos.getCli_Id();
            fila[3] = grupos.getEstado();
            modelo.addRow(fila);
        }
        int n = jifGrupoClientes.jtGrupoClientes.getRowCount();
        jifGrupoClientes.nRegistros.setText("" + n);
        jifGrupoClientes.jtGrupoClientes.setModel(modelo);
    }

    private void frmRegistrarAuto() {
        limpiar();
        ArrayList<Cliente> clientes = Gestor.consultarClientes();
        jifAuto.jcbIdCliente.removeAllItems();
        jifAuto.jcbIdCliente.addItem("-----");
        for (Cliente cliente : clientes)
            jifAuto.jcbIdCliente.addItem(cliente.getIdentificacion());
        limpiarComboBox();
        jifAuto.jcbIdCliente.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    String id = jifAuto.jcbIdCliente.getSelectedItem().toString();
                    ResultSet r = Gestor.consultarDatosAuto(id);
                    while (r.next()) {
                        jifAuto.jtfNombreCliente.setText(r.getString(2));
                    }
                    jifAuto.jbtRegistrar.setEnabled(true);
                } catch (Exception ex) {}
            }
        });
        jifAuto.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String placa = jifAuto.jtfPlaca.getText();
                String ciudad = jifAuto.jcbCiudad.getSelectedItem().toString();
                String tipo = jifAuto.jcbTipo.getSelectedItem().toString();
                String modelo = (jifAuto.jcbModelo.getSelectedItem().toString());
                String marca = jifAuto.jcbMarca.getSelectedItem().toString();
                String kilometraje = jifAuto.jtfKilometraje.getText();
                String combustible = jifAuto.jtfCombustible.getText();
                String idCliente = jifAuto.jcbIdCliente.getSelectedItem().toString();
                String nombreCliente = jifAuto.jtfNombreCliente.getText();
                try {
                    Auto aut = new Auto(placa, ciudad, tipo, modelo, marca, kilometraje, combustible, idCliente, nombreCliente);
                    if (Gestor.agregarAuto(aut)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del auto almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarComboBox();
                        jifAuto.jbtRegistrar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos del auto!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifAuto.setVisible(true);
        locacionfrm(jifAuto);
    }

    private void evtConsultarClienteporId() {
        try {
            ResultSet r;
            String id = jifActualizarCliente.jtfIdentificacion.getText();
            r = Gestor.TraerDatosCliente(id);
            while (r.next()) {
                int op = ("Masculino".equals(r.getString(4)) ? 2 : 1);
                jifActualizarCliente.jtfNombre.setText(r.getString(2));
                jifActualizarCliente.jtfApellidos.setText(r.getString(3));
                jifActualizarCliente.jcbSexo.setSelectedIndex(op);
                jifActualizarCliente.jtfTelefono.setText(r.getString(5));
                jifActualizarCliente.jtfDireccion.setText(r.getString(6));
                jifActualizarCliente.jtfCorreo.setText(r.getString(7));
            }
            jifActualizarCliente.jbtEliminar.setEnabled(true);
            jifActualizarCliente.jbtModificar.setEnabled(true);
        } catch (HeadlessException | SQLException e) {}
    }

    private void frmListaAutos() {
        ArrayList<Auto> autos = Gestor.verAutos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("Kilometraje");
        modelo.addColumn("Combustible");
        modelo.addColumn("Id cliente");
        modelo.addColumn("Nombre cliente");
        for (Auto auto : autos) {
            Object[] fila = new Object[9];
            fila[0] = auto.getPlaca();
            fila[1] = auto.getCiudad();
            fila[2] = auto.getTipo();
            fila[3] = auto.getModelo();
            fila[4] = auto.getMarca();
            fila[5] = auto.getKilometraje();
            fila[6] = auto.getCombustible();
            fila[7] = auto.getIdCliente();
            fila[8] = auto.getNombreCliente();
            modelo.addRow(fila);
        }
        jifListaAutos.jtListaAutos.setModel(modelo);
        jifListaAutos.setVisible(true);
        jifListaAutos.lbRegistros.setText(""+(jifListaAutos.jtListaAutos.getRowCount()));
        locacionfrm(jifListaAutos);
    }
    /* 2. Modulo Servicios */

    private void frmRegistrarMantenimientos(String placa, String nombre) {
        limpiar();
        limpiarFechas();
        limpiarTablas(jifMantenimiento.Detalles);
        limpiarComboBox();
        jifMantenimiento.jbtAgregar.setEnabled(false);
        jifMantenimiento.jbtRegistrar.setEnabled(true);
        
        c = new GregorianCalendar();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
        jifMantenimiento.jdcFechaInicio.setDate(c.getTime());
    
        jifMantenimiento.jcbIdMecanico1.removeAllItems();
        jifMantenimiento.jcbIdMecanico1.addItem("----");
        jifMantenimiento.jcbcodRepuesto.removeAllItems();
        jifMantenimiento.jcbcodRepuesto.addItem("----");
        ResultSet ids = Gestor.idsMecanicos();
        try {
            while (ids.next())
                jifMantenimiento.jcbIdMecanico1.addItem(ids.getString("emp_id"));
        } catch (Exception e) {        }
        ResultSet cods = Gestor.codRepuestos();
        try {
            while (cods.next())
                jifMantenimiento.jcbcodRepuesto.addItem(cods.getString("rep_codigo"));
        } catch (Exception e) {        }
        
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo Mantenimiento");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Placa Auto");
        modelo.addColumn("Cliente");
        modelo.addColumn("Id Mécanico");
        modelo.addColumn("Nombre");
        modelo.addColumn("Repuesto Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        codigoMantenimiento();
        jifMantenimiento.jtfPlaca.setText(placa);
        ResultSet datos = Gestor.DatosMantenimientoPendiente(placa,nombre);
        try {
            while(datos.next()){
                Object[] f = new Object[11];
                f[0] = datos.getString("man_tipo");
                f[1] = "";
                f[2] = "";
                f[3] = datos.getString("aut_placa");
                f[4] = datos.getString("cli_nombre");
                f[5] = "";
                f[6] = "";
                f[7] = "";
                f[8] = "";
                f[9] = "";
                f[10] = "";
                modelo.addRow(f);
            }
            jifMantenimiento.Detalles.setModel(modelo);
        } catch (Exception e) {System.out.println(e.getMessage());}
        evtConsultarDatosAuto(placa);
        jifMantenimiento.jcbIdMecanico1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String id = jifMantenimiento.jcbIdMecanico1.getSelectedItem()!=null?jifMantenimiento.jcbIdMecanico1.getSelectedItem().toString():"";
                ResultSet re = Gestor.traerDatosEmpleado(id);
                try {
                    while (re.next()) 
                        jifMantenimiento.jtfNombreMecanico1.setText(re.getString("emp_nombre")+" "+re.getString("emp_apellidos"));
                } catch (Exception ex) {}
            }
        });
        
        jifMantenimiento.jcbcodRepuesto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String cod = jifMantenimiento.jcbcodRepuesto.getSelectedItem() != null ?jifMantenimiento.jcbcodRepuesto.getSelectedItem().toString():"";
                ResultSet r = Gestor.datosRepuesto(cod);
                try {
                    while (r.next()) {
                        jifMantenimiento.jtfnombreRepuesto.setText(r.getString("rep_tipo"));
                        jifMantenimiento.disp.setText(r.getString("rep_cantidad"));
                        jifMantenimiento.jtfPrecioRepuesto.setText(r.getString("rep_precio"));
                        if(Integer.parseInt(r.getString("rep_cantidad")) == 0){
                            jifMantenimiento.jscantidadRepuesto.setEnabled(false);
                            int rs = JOptionPane.showConfirmDialog(null, "El repuesto no tiene mas articulos que vender\n\nDesea Hacer una nueva orden de pedido","MECAUT",JOptionPane.YES_NO_OPTION);
                            if (rs == JOptionPane.YES_OPTION) {
                                jifMantenimiento.jFrame1.hide();
                                frmOrdenDePedido();
                            }
                        }
                        else{
                            jifMantenimiento.jscantidadRepuesto.setEnabled(true);
                            jifMantenimiento.jscantidadRepuesto.setValue(0);
                        }
                    }
                } catch (SQLException | NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ""+ex.getMessage());}
            }
        });
        //jifMantenimiento.Detalles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jifMantenimiento.Detalles.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = jifMantenimiento.Detalles.getSelectedRow();
                String desc = (String)jifMantenimiento.Detalles.getValueAt(i,1);
                String placa = (String)jifMantenimiento.Detalles.getValueAt(i, 3);
                String cli_nombre = (String)jifMantenimiento.Detalles.getValueAt(i, 4);
                String rep_cantidad = (String)jifMantenimiento.Detalles.getValueAt(i, 9);
                jifMantenimiento.jcbIdMecanico1.setSelectedIndex(0);
                jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
                jifMantenimiento.jtfdescripcion.setText(desc);
                jifMantenimiento.jdcFecha.setDate(null);
                jifMantenimiento.jtfplaca.setText(placa);
                jifMantenimiento.jtfCliNombre.setText(cli_nombre);
                jifMantenimiento.jtfPrecioRepuesto.setText("");
                jifMantenimiento.jtfNombreMecanico1.setText("");
                jifMantenimiento.jtfnombreRepuesto.setText("");
                //jifMantenimiento.jscantidadRepuesto.setValue(Integer.parseInt(rep_cantidad));
                jifMantenimiento.jFrame1.setVisible(true);
                jifMantenimiento.jFrame1.setBounds(300, 150, 793, 490);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        
        jifMantenimiento.jbtModificarDetalles.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo_mantenimiento = jifMantenimiento.jcbTipoMantenimiento1.getSelectedItem().toString();
                String des = jifMantenimiento.jtfdescripcion.getText();
                String id_mec = jifMantenimiento.jcbIdMecanico1.getSelectedItem().toString();
                String nom_emp = jifMantenimiento.jtfNombreMecanico1.getText();
                String cod_rep = jifMantenimiento.jcbcodRepuesto.getSelectedItem().toString();
                String nom_rep = jifMantenimiento.jtfnombreRepuesto.getText();
                String can_rep = jifMantenimiento.jscantidadRepuesto.getValue().toString();
                String pre_rep = jifMantenimiento.jtfPrecioRepuesto.getText();
                if(jifMantenimiento.jdcFecha.getDate() == null)
                    JOptionPane.showMessageDialog(null, "Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifMantenimiento.jcbTipoMantenimiento1.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de mantenimiento","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifMantenimiento.jcbIdMecanico1.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null, "Selecciones la identificación del mécanico","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifMantenimiento.jcbcodRepuesto.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null, "Selecciones un codigo para el repuesto","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(des.isEmpty() || id_mec.isEmpty() || nom_emp.isEmpty() || cod_rep.isEmpty() || nom_rep.isEmpty() || can_rep.isEmpty() || pre_rep.isEmpty())
                    JOptionPane.showMessageDialog(null, "Complete todos los campos","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(Integer.parseInt(jifMantenimiento.disp.getText()) == 0)
                    JOptionPane.showMessageDialog(null, "El repuesto no tiene mas articulos que vender\n\nContacte a su proveedor mas cercano para recargar el inventario","MECAUT",JOptionPane.ERROR_MESSAGE);
                else{
                    java.util.Date fecha= jifMantenimiento.jdcFecha.getDate();
                    SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
                    String fec=""+formatofecha.format(fecha);
                    jifMantenimiento.jFrame1.hide();
                    int i = jifMantenimiento.Detalles.getSelectedRow();
                    jifMantenimiento.Detalles.setValueAt(tipo_mantenimiento, i, 0);
                    jifMantenimiento.Detalles.setValueAt(des, i, 1);
                    jifMantenimiento.Detalles.setValueAt(fec, i, 2);
                    jifMantenimiento.Detalles.setValueAt(id_mec, i, 5);
                    jifMantenimiento.Detalles.setValueAt(nom_emp, i, 6);
                    jifMantenimiento.Detalles.setValueAt(cod_rep, i, 7);
                    jifMantenimiento.Detalles.setValueAt(nom_rep, i, 8);
                    jifMantenimiento.Detalles.setValueAt(can_rep, i, 9);
                    jifMantenimiento.Detalles.setValueAt(pre_rep, i, 10);
                    int columnas = jifMantenimiento.Detalles.getRowCount();
                    int total = 0;
                    for (int j = 0; j < columnas; j++) {
                        String can = ((jifMantenimiento.Detalles.getValueAt(j, 9).toString()=="")?"0":(String)jifMantenimiento.Detalles.getValueAt(j, 9));
                        String pre = ((jifMantenimiento.Detalles.getValueAt(j, 10).toString()=="")?"0":(String) jifMantenimiento.Detalles.getValueAt(j, 10));
                        total += Integer.parseInt(can)*Integer.parseInt(pre); 
                    }
                    jifMantenimiento.jtfCosto.setText("$"+total);
                    jifMantenimiento.jbtRegistrar.setEnabled(true);
                }
            }
        });
        
        jifMantenimiento.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String codigoMantenimiento = jifMantenimiento.jtfCodigo.getText();
                    String observaciones = jifMantenimiento.jtfObservaciones.getText();
                    String costo = jifMantenimiento.jtfCosto.getText();
                    String estado = "Pendiente";
                    String cli_id = jifMantenimiento.jtfIdCliente.getText();
                    String placa = jifMantenimiento.jtfPlaca.getText();
                    if(jifMantenimiento.jdcFechaInicio == null)
                        JOptionPane.showMessageDialog(null, "Ingrese una fecha para el Mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                    else if(observaciones.isEmpty() || placa.isEmpty())
                        JOptionPane.showMessageDialog(null, "Debe llenar todos los datos","MECAUT",JOptionPane.ERROR_MESSAGE);
                    else if(jifMantenimiento.Detalles.getRowCount() <= 0)
                        JOptionPane.showMessageDialog(null, "Debe ingresar al menos un mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                    else{
                        java.util.Date fechaInicio = jifMantenimiento.jdcFechaInicio.getDate();
                        SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
                        String fec=""+formatofecha.format(fechaInicio);
                        if (Gestor.registrarMantenimiento(codigoMantenimiento, fec, observaciones, costo, estado,cli_id) && Gestor.registrarHistorialMantenimiento(placa,codigoMantenimiento,cli_id,fec)&&Gestor.actualizarEstadoMantenimiento(placa,cli_id)) {
                            int nColumnas = jifMantenimiento.Detalles.getRowCount();
                            String[][] datosdetalles = new String[nColumnas][11];
                            for (int i = 0; i < nColumnas; i++) {
                                for (int j = 0; j < 11; j++) {
                                    datosdetalles[i][j] = (String) jifMantenimiento.Detalles.getValueAt(i, j);
                                }
                            }
                            for (int i = 0; i < datosdetalles.length; i++) {
                                if (Gestor.detallesMantenimiento(
                                        codigoMantenimiento,
                                        datosdetalles[i][0],
                                        datosdetalles[i][1],
                                        datosdetalles[i][2],
                                        datosdetalles[i][3],
                                        datosdetalles[i][4],
                                        datosdetalles[i][5],
                                        datosdetalles[i][6],
                                        datosdetalles[i][7],
                                        datosdetalles[i][8],
                                        datosdetalles[i][9])) {
                                    int co = 0;
                                    if(co == 0){
                                        JOptionPane.showMessageDialog(null, "Se registro el Mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                                        co++;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Algo salio mal :c");
                                }
                            }
                            evtNumeroMantenimientosPendientes();
                            limpiarTablas(jifMantenimiento.Detalles);
                            jifMantenimiento.jcbIdMecanico1.setSelectedIndex(0);
                            jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
                            jifMantenimiento.jdcFecha.setDate(null);
                            jifMantenimiento.jdcFechaInicio.setDate(null);
                            jifMantenimiento.Detalles.setModel(modelo);
                            limpiar();
                            codigoMantenimiento();
                            limpiarComboBox();
                            jifMantenimiento.jbtRegistrar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "no se pudo registrar el mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "no se pudo registrar el mantenimiento\nVerifique si lleno todos los campos correcamente","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        TextAutoCompleter t = new TextAutoCompleter(jifMantenimiento.jtfPlaca);
        ResultSet res = Gestor.placasAutos();
        try {
            while (res.next()) 
                t.addItem(res.getString("aut_placa"));
        } catch (Exception e) { }
        jifMantenimiento.setVisible(true);
        locacionfrm(jifMantenimiento);
    }
    
    private void frmRegistrarMantenimientos() {
        limpiar();
        limpiarFechas();
        limpiarTablas(jifMantenimiento.Detalles);
        limpiarComboBox();
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo Mantenimiento");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Placa Auto");
        modelo.addColumn("Cliente");
        modelo.addColumn("Id Mécanico");
        modelo.addColumn("Nombre");
        modelo.addColumn("Repuesto Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        codigoMantenimiento();
        jifMantenimiento.jcbIdMecanico1.removeAllItems();
        jifMantenimiento.jcbIdMecanico1.addItem("----");
        jifMantenimiento.jcbcodRepuesto.removeAllItems();
        jifMantenimiento.jcbcodRepuesto.addItem("----");
        ResultSet ids = Gestor.idsMecanicos();
        try {
            while (ids.next())
                jifMantenimiento.jcbIdMecanico1.addItem(ids.getString("emp_id"));
        } catch (Exception e) {        }
        ResultSet cods = Gestor.codRepuestos();
        try {
            while (cods.next())
                jifMantenimiento.jcbcodRepuesto.addItem(cods.getString("rep_codigo"));
        } catch (Exception e) {        }
        jifMantenimiento.jtfPlaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = jifMantenimiento.jtfPlaca.getText();
                evtConsultarDatosAuto(placa);
            }
        });
        jifMantenimiento.jtfPlaca.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                String placa = jifMantenimiento.jtfPlaca.getText();
                evtConsultarDatosAuto(placa);
            }
        });
        jifMantenimiento.jcbIdMecanico1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String id = (jifMantenimiento.jcbIdMecanico1.getSelectedItem() != null)?jifMantenimiento.jcbIdMecanico1.getSelectedItem().toString():"";
                ResultSet re = Gestor.traerDatosEmpleado(id);
                try {
                    while (re.next()) 
                        jifMantenimiento.jtfNombreMecanico1.setText(re.getString("emp_nombre")+" "+re.getString("emp_apellidos"));
                } catch (Exception ex) {}
            }
        });
        jifMantenimiento.jbtAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = jifMantenimiento.jtfPlaca.getText();
                String nombreCliente = jifMantenimiento.jtfNombreCliente.getText();
                if(!placa.isEmpty() || !nombreCliente.isEmpty()){
                    Object[] fila = new Object[11];
                    fila[0] = "";
                    fila[1] = "";
                    fila[2] = "";
                    fila[3] = placa;
                    fila[4] = nombreCliente;
                    fila[5] = "";
                    fila[6] = "";
                    fila[7] = "";
                    fila[8] = "";
                    fila[9] = "";
                    fila[10] = "";
                    modelo.addRow(fila);
                    jifMantenimiento.Detalles.setModel(modelo);
                    jifMantenimiento.jcbTipoMantenimiento1.setSelectedIndex(0);
                    jifMantenimiento.jtfplaca.setText(placa);
                    jifMantenimiento.jtfCliNombre.setText(nombreCliente);
                    jifMantenimiento.jscantidadRepuesto.setValue(0);
                    jifMantenimiento.jdcFecha.setDate(null);
                    jifMantenimiento.jtfdescripcion.setText("");
                    jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
                    jifMantenimiento.jtfnombreRepuesto.setText("");
                    jifMantenimiento.jtfPrecioRepuesto.setText("");
                    jifMantenimiento.jFrame1.setVisible(true);
                    jifMantenimiento.jFrame1.setBounds(300, 150, 793, 490);
                }else
                    JOptionPane.showMessageDialog(null, "Ingrese los Datos del Auto","MECAUT",JOptionPane.WARNING_MESSAGE);
            }
        });
        jifMantenimiento.jbtCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jifMantenimiento.Detalles.getRowCount() <= 0) {
                    jifMantenimiento.jbtRegistrar.setEnabled(false);
                }
                limpiar();
                limpiarFechas();
                limpiarTablas(jifMantenimiento.Detalles);
                limpiarComboBox();
            }
        });
        jifMantenimiento.jcbcodRepuesto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String cod = (jifMantenimiento.jcbcodRepuesto.getSelectedItem() != null)?jifMantenimiento.jcbcodRepuesto.getSelectedItem().toString():"";
                ResultSet r = Gestor.datosRepuesto(cod);
                try {
                    while (r.next()) {
                        jifMantenimiento.jtfnombreRepuesto.setText(r.getString("rep_tipo"));
                        jifMantenimiento.disp.setText(r.getString("rep_cantidad"));
                        jifMantenimiento.jtfPrecioRepuesto.setText(r.getString("rep_precio"));
                        if(Integer.parseInt(r.getString("rep_cantidad")) == 0){
                            jifMantenimiento.jscantidadRepuesto.setEnabled(false);
                            int rs = JOptionPane.showConfirmDialog(null, "El repuesto no tiene mas articulos que vender\n\nDesea Hacer una nueva orden de pedido","MECAUT",JOptionPane.YES_NO_OPTION);
                            if (rs == JOptionPane.YES_OPTION) {
                                jifMantenimiento.jFrame1.hide();
                                frmOrdenDePedido();
                            }
                        }
                        else{
                            jifMantenimiento.jscantidadRepuesto.setEnabled(true);
                            jifMantenimiento.jscantidadRepuesto.setValue(0);
                        }
                    }
                } catch (SQLException | NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ""+ex.getMessage());}
            }
        });
        jifMantenimiento.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String codigoMantenimiento = jifMantenimiento.jtfCodigo.getText();
                    String observaciones = jifMantenimiento.jtfObservaciones.getText();
                    String costo = jifMantenimiento.jtfCosto.getText();
                    String estado = "Pendiente";
                    String cli_id = jifMantenimiento.jtfIdCliente.getText();
                    String placa = jifMantenimiento.jtfPlaca.getText();
                    if(jifMantenimiento.jdcFechaInicio == null)
                        JOptionPane.showMessageDialog(null, "Ingrese una fecha para el Mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                    else if(observaciones.isEmpty() || placa.isEmpty())
                        JOptionPane.showMessageDialog(null, "Debe llenar todos los datos","MECAUT",JOptionPane.ERROR_MESSAGE);
                    else if(jifMantenimiento.Detalles.getRowCount() <= 0)
                        JOptionPane.showMessageDialog(null, "Debe ingresar al menos un mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                    else{
                        java.util.Date fechaInicio = jifMantenimiento.jdcFechaInicio.getDate();
                        SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
                        String fec=""+formatofecha.format(fechaInicio);
                        if (Gestor.registrarMantenimiento(codigoMantenimiento, fec, observaciones, costo, estado,cli_id) && Gestor.registrarHistorialMantenimiento(placa,codigoMantenimiento,cli_id,fec)) {
                            int nColumnas = jifMantenimiento.Detalles.getRowCount();
                            String[][] datosdetalles = new String[nColumnas][11];
                            for (int i = 0; i < nColumnas; i++) {
                                for (int j = 0; j < 11; j++) {
                                    datosdetalles[i][j] = (String) jifMantenimiento.Detalles.getValueAt(i, j);
                                }
                            }
                            for (int i = 0; i < datosdetalles.length; i++) {
                                if (Gestor.detallesMantenimiento(
                                        codigoMantenimiento,
                                        datosdetalles[i][0],
                                        datosdetalles[i][1],
                                        datosdetalles[i][2],
                                        datosdetalles[i][3],
                                        datosdetalles[i][4],
                                        datosdetalles[i][5],
                                        datosdetalles[i][6],
                                        datosdetalles[i][7],
                                        datosdetalles[i][8],
                                        datosdetalles[i][9])) {
                                    int co = 0;
                                    if(co == 0){
                                        JOptionPane.showMessageDialog(null, "Se registro el Mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                                        co++;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Algo salio mal :c");
                                }
                            }
                            limpiarTablas(jifMantenimiento.Detalles);
                            jifMantenimiento.jcbIdMecanico1.setSelectedIndex(0);
                            jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
                            jifMantenimiento.jdcFecha.setDate(null);
                            jifMantenimiento.jdcFechaInicio.setDate(null);
                            jifMantenimiento.Detalles.setModel(modelo);
                            limpiar();
                            codigoMantenimiento();
                            limpiarComboBox();
                            jifMantenimiento.jbtRegistrar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "no se pudo registrar el mantenimiento","MECAUT",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "no se pudo registrar el mantenimiento\nVerifique si lleno todos los campos correcamente","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        TextAutoCompleter t = new TextAutoCompleter(jifMantenimiento.jtfPlaca);
        ResultSet res = Gestor.placasAutos();
        try {
            while (res.next()) 
                t.addItem(res.getString("aut_placa"));
        } catch (Exception e) { }
        jifMantenimiento.setVisible(true);
        locacionfrm(jifMantenimiento);
    }

    private void evtConsultarDatosAuto(String dato){
        if(dato.isEmpty()){
            jifMantenimiento.jtfIdCliente.setText(null);
            jifMantenimiento.jtfNombreCliente.setText(null);
        }
        ResultSet r = Gestor.datosMantenimiento(dato);
        try {
            while (r.next()) {
                jifMantenimiento.jtfIdCliente.setText(r.getString("cli_id"));
                jifMantenimiento.jtfNombreCliente.setText(r.getString("cli_nombre"));
            }
        } catch (Exception ex) {}
    }
    
    private void frmActualizarMantenimiento() {
        limpiar();
        limpiarTablas(jifActualizarMantenimiento.Detalles);
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo de Mantenimiento");
        modelo.addColumn("Descripcion del Mantenimiento");
        modelo.addColumn("Fecha del Mantenimiento");
        modelo.addColumn("Cod Repuesto");
        modelo.addColumn("Nombre Repuesto");
        modelo.addColumn("Cantidad Repuesto");
        
        jifActualizarMantenimiento.jcbCodigoMantenimiento.removeAllItems();
        jifActualizarMantenimiento.jcbCodigoMantenimiento.addItem("---");
        limpiarComboBox();
        ResultSet codigos = Gestor.codigosMantenimientos();
        try {
            while(codigos.next())
                jifActualizarMantenimiento.jcbCodigoMantenimiento.addItem(codigos.getString("man_codigo"));
        } catch (Exception e) {}
        jifActualizarMantenimiento.jcbCodigoMantenimiento.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String cod = (jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem() != null)?jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem().toString():"";
                ResultSet datos;
                datos = Gestor.traerDatosMantenimiento(cod);
                try {
                    while(datos.next()){
                        jifActualizarMantenimiento.jtfFecha.setText(datos.getString(2));
                        jifActualizarMantenimiento.jtfEstado.setText(datos.getString(3));
                        jifActualizarMantenimiento.jtfObsevaciones.setText(datos.getString(5));
                        jifActualizarMantenimiento.jtfCosto.setText(datos.getString(4));
                        jifActualizarMantenimiento.jtfIdCliente.setText(datos.getString(6));
                        jifActualizarMantenimiento.jtfNombreCliente.setText(datos.getString(12));
                        jifActualizarMantenimiento.jtfPlaca.setText(datos.getString(11));
                        jifActualizarMantenimiento.jtfIdEmpleado.setText(datos.getString(13));
                        jifActualizarMantenimiento.jtfNombreEmpleado.setText(datos.getString(14));
                    }
                } catch (Exception exc) {}
                datos = Gestor.traerDatosDetallesMantenimiento(cod);
                try {
                    while(datos.next()){
                        Object[] fila = new Object[6];
                        fila[0] = datos.getString(2);
                        fila[1] = datos.getString(3);
                        fila[2] = datos.getString(4);
                        fila[3] = datos.getString(9);
                        fila[4] = datos.getString(10);
                        fila[5] = datos.getString(11);
                        modelo.addRow(fila);
                    }
                    jifActualizarMantenimiento.Detalles.setModel(modelo);
                } catch (Exception ex) {}
            }
        });
        jifActualizarMantenimiento.jbtModificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Se modifico corretamente el mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                limpiarComboBox();
                limpiarTablas(jifActualizarMantenimiento.Detalles);
            }
        });    
        jifActualizarMantenimiento.jbtEliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifActualizarMantenimiento.jcbCodigoMantenimiento.getSelectedItem().toString();
                int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este mantenimiento","MECAUT",JOptionPane.YES_NO_OPTION);
                if(rs == JOptionPane.YES_OPTION){
                if (Gestor.eliminarMantenimiento(cod) && Gestor.eliminarDetMantenimiento(cod) && Gestor.eliminarHisMantenimiento(cod)) {
                    JOptionPane.showMessageDialog(null, "Se elimino corretamente el mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    limpiarTablas(jifActualizarMantenimiento.Detalles);
                }
                else
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el mantenimiento","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        jifActualizarMantenimiento.setVisible(true);
    }

    private void frmListaMantenimientos() {
        ArrayList<Mantenimiento> mantenimientos = Gestor.verMantenimientos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado");
        modelo.addColumn("Costo");
        modelo.addColumn("Cliente");
        modelo.addColumn("Descripción");
        for (Mantenimiento mantenimiento : mantenimientos) {
            Object[] fila = new Object[6];
            fila[0] = mantenimiento.getCodigo();
            fila[1] = mantenimiento.getFecha();
            fila[2] = mantenimiento.getEstado();
            fila[3] = mantenimiento.getCosto();
            fila[4] = mantenimiento.getCli_id();
            fila[5] = mantenimiento.getDescripcion();
            modelo.addRow(fila);
        }
        jifListaMantenimientos.jtListaMantenimientos.setModel(modelo);
        jifListaMantenimientos.registros.setText(""+jifListaMantenimientos.jtListaMantenimientos.getRowCount());
        jifListaMantenimientos.setVisible(true);
        locacionfrm(jifListaMantenimientos);
    }
    
    private void frmListaMantenimientosPendientes(){
        evtMantenimientosPendientes("");
        
        jifListaMantenimientosPendientes.jcbBusqueda.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String dato = jifListaMantenimientosPendientes.jcbBusqueda.getSelectedItem().toString();
                evtMantenimientosPendientes(dato);
            }
        });
        
        jmiCambiarEstado = jifListaMantenimientosPendientes.jmiCambiarEstado;
        jmiModificar = jifListaMantenimientosPendientes.jmiModificarDatos;
        jmiEliminar = jifListaMantenimientosPendientes.jmiEliminar;
        JPopupMenu.Separator s;
        s = jifListaMantenimientosPendientes.jSeparator1;
        MenuDesplegable = jifListaMantenimientosPendientes.jPopupMenu1;
        MenuDesplegable.add(jmiModificar);
        MenuDesplegable.add(jmiCambiarEstado);
        MenuDesplegable.add(s);
        MenuDesplegable.add(jmiEliminar);
        
        jmiCambiarEstado.setText("Cambiar Estado");
        jmiModificar.setText("Modificar Información");
        jmiEliminar.setText("Eliminar");
        
        MenuDesplegable.setBounds(350, 50, 400, 300);
        
        jifListaMantenimientosPendientes.jTable1.setComponentPopupMenu(MenuDesplegable);
        
        jmiCambiarEstado.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int i = jifListaMantenimientosPendientes.jTable1.getSelectedRow();
                String placa = jifListaMantenimientosPendientes.jTable1.getValueAt(i, 0).toString();
                String nombre = jifListaMantenimientosPendientes.jTable1.getValueAt(i, 2).toString();
                if (Gestor.modificarEstadoMantenimiento(placa,nombre)) {
                    evtMantenimientosPendientes("");
                }
                else
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el estado","MECAUT",JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        });
        jmiModificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String placa,nombre;
                int i = jifListaMantenimientosPendientes.jTable1.getSelectedRow();
                placa = (String) jifListaMantenimientosPendientes.jTable1.getValueAt(i, 0);
                nombre = (String) jifListaMantenimientosPendientes.jTable1.getValueAt(i, 2);
                frmRegistrarMantenimientos(placa,nombre);
                jifListaMantenimientosPendientes.hide();
            }
        });
        
        locacionfrm(jifListaMantenimientosPendientes);
        jifListaMantenimientosPendientes.setVisible(true);
    }
    
    public void evtMantenimientosPendientes(String dato){
        ResultSet datos;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Nombre Cliente");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha");
        switch(dato){
            case "Pendientes":
                datos = Gestor.consultarManteniminetosPendientes("Pendiente");
                break;
            case "Rechazadas":
                datos = Gestor.consultarManteniminetosPendientes("Rechazada");
                break;
            case "Aceptadas":
                datos = Gestor.consultarManteniminetosPendientes("Aceptada");
                break;
                default:
                    datos = Gestor.consultarManteniminetosPendientes(null);
                    break;
        }
        try {
            while(datos.next()){
                Object[] f = new Object[5];
                f[0] = datos.getString("aut_placa");
                f[1] = datos.getString("cli_id");
                f[2] = datos.getString("cli_nombre");
                f[3] = datos.getString("manp_estado");
                f[4] = datos.getString("manp_fecha");
                modelo.addRow(f);
            }
            jifListaMantenimientosPendientes.jTable1.setModel(modelo);
            jifListaMantenimientosPendientes.registros.setText(""+jifListaMantenimientosPendientes.jTable1.getRowCount());
        } catch (Exception e) {}
    }
    
    public void evtNumeroMantenimientosPendientes(){
        ResultSet d = Gestor.numeroMantenimientosPendientes();
        try {
            while(d.next()){
                form.jmiMantenimientosPendientes.setText("Pendientes "+d.getString(1));
            }
        } catch (Exception e) {}
    }
    
    private void frmHistorialMantenimiento(){
        limpiar();
        limpiarFechas();
        jifHistMantenimiento.jbtConsultar.setVisible(false);
        jifHistMantenimiento.buttonGroup1.clearSelection();
        ArrayList<HistorialMantenimiento> lista = Gestor.listaHistorialMantenimientos("", null);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo Mantenimiento");
        model.addColumn("Placa del Auto");
        model.addColumn("Id Cliente");
        model.addColumn("Fecha");
        for (HistorialMantenimiento his : lista) {
            Object[] fila = new Object[4];
            fila[0] = his.getCodigo_mantenimiento();
            fila[1] = his.getPlaca();
            fila[2] = his.getId_cliente();
            fila[3] = his.getFecha();
            model.addRow(fila);
        }
        ResultSet n = Gestor.nRegistrosHisMantenimientos();
        String registros = "";
        try{
        while(n.next())
            registros = n.getString(1);
        }catch(Exception exc){}
        jifHistMantenimiento.jTable1.setModel(model);
        jifHistMantenimiento.lblRegistros.setText(registros);
        jifHistMantenimiento.rbRangoFecha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtHistorialMantenimientos();
            }
        });
        jifHistMantenimiento.jtfIdCliente.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                evtHistorialMantenimientos();
            }
        });
        jifHistMantenimiento.jtfPlaca.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                evtHistorialMantenimientos();
            }
        });
        jifHistMantenimiento.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evtHistorialMantenimientos();
            }
        });
        
        TextAutoCompleter idCliente = new TextAutoCompleter(jifHistMantenimiento.jtfIdCliente);
        TextAutoCompleter placa = new TextAutoCompleter(jifHistMantenimiento.jtfPlaca);
        try {
            ResultSet datos = Gestor.IdsClientes();
            while(datos.next())
                idCliente.addItem(datos.getString(1));
            datos = Gestor.placasAutos();
            while(datos.next())
                placa.addItem(datos.getString(1));
        } catch (Exception e) {}
        
        jifHistMantenimiento.setVisible(true);
        locacionfrm(jifHistMantenimiento);
    }
    
    private void evtHistorialMantenimientos(){
        String dato ;
        ArrayList<HistorialMantenimiento> lista;
        if (jifHistMantenimiento.rbPlaca.isSelected()) {
            dato = jifHistMantenimiento.jtfPlaca.getText();
            lista = Gestor.listaHistorialMantenimientos("Placa",dato);
        }else if (jifHistMantenimiento.rbIdCliente.isSelected()) {
            dato = jifHistMantenimiento.jtfIdCliente.getText();
            lista = Gestor.listaHistorialMantenimientos("Id",dato);
        }
        else if (jifHistMantenimiento.rbFecha.isSelected()) {
            java.util.Date fechaInicio = jifHistMantenimiento.jdcFecha.getDate();
            SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
            dato=""+formatofecha.format(fechaInicio);
            lista = Gestor.listaHistorialMantenimientos("Fecha",dato);
        }else{
            lista = Gestor.listaHistorialMantenimientos("",null);
        }
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo Mantenimiento");
        model.addColumn("Placa del Auto");
        model.addColumn("Id Cliente");
        model.addColumn("Fecha");
        for (HistorialMantenimiento his : lista) {
            Object[] fila = new Object[4];
            fila[0] = his.getCodigo_mantenimiento();
            fila[1] = his.getPlaca();
            fila[2] = his.getId_cliente();
            fila[3] = his.getFecha();
            model.addRow(fila);
        }
        jifHistMantenimiento.jTable1.setModel(model);
        int registros = jifHistMantenimiento.jTable1.getRowCount();                
        jifHistMantenimiento.lblRegistros.setText(""+registros);
    }
    
    private void codigoMantenimiento() {
        ResultSet r = Gestor.codigoMantenimiento();
        String cod = "";
        try{
        while(r.next())
            cod = r.getString(1);
        int codig = Integer.parseInt(cod);
        jifMantenimiento.jtfCodigo.setText(""+(++codig));
        }catch(SQLException | NumberFormatException e){}
    }
    
    private void frmReservas(){
        limpiar();
        codigoReserva();
        limpiarFechas();
        ResultSet ids = Gestor.IdsClientes();
        TextAutoCompleter t = new TextAutoCompleter(jifReservas.jtfIdentificacion);
        try {
            while(ids.next())
                t.addItem(ids.getString("cli_id"));
        } catch (Exception e) {}
        ids = Gestor.idsMecanicos();
        jifReservas.jcbIdMecanico.removeAllItems();
        jifReservas.jcbIdMecanico.addItem("-----");
        try {
            while(ids.next())
                jifReservas.jcbIdMecanico.addItem(ids.getString("emp_id"));
        } catch (Exception e) {}
        limpiarComboBox();
        
        jifReservas.jtfIdentificacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtDatosReserva();
            }
        });
        jifReservas.jtfIdentificacion.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                evtDatosReserva();
            }
        });
        jifReservas.jcbIdMecanico.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String id = (jifReservas.jcbIdMecanico.getSelectedItem()!= null)?jifReservas.jcbIdMecanico.getSelectedItem().toString():"";
                ResultSet datos = Gestor.traerDatosEmpleado(id);
                try {
                    while(datos.next())
                        jifReservas.jtfNombreEmpleado.setText(datos.getString("emp_nombre"));
                } catch (Exception exc) {}
            }
        });
        jifReservas.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idCliente = jifReservas.jtfIdentificacion.getText();
                String placa = jifReservas.jtfPlaca.getText();
                String idEmpleado = jifReservas.jcbIdMecanico.getSelectedItem().toString();
                String observaciones = jifReservas.jtfObservaciones.getText();
                if(jifReservas.jdcFecha.getDate() == null)
                    JOptionPane.showMessageDialog(null, "Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(idCliente.isEmpty() || placa.isEmpty() || idEmpleado.isEmpty() || observaciones.isEmpty())
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los datos","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    java.util.Date f = jifReservas.jdcFecha.getDate();
                    SimpleDateFormat ffecha= new SimpleDateFormat("YYYY-MM-dd");
                    String fecha = ""+ffecha.format(f);
                    String nombreCliente = jifReservas.jtfNombre.getText();
                    String telefono = jifReservas.jtfTelefono.getText();
                    String correo = jifReservas.jtfCorreo.getText();
                    String modelo = jifReservas.jtfModelo.getText();
                    String marca = jifReservas.jtfMarca.getText();
                    String nombreEmpleado = jifReservas.jtfNombreEmpleado.getText();
                    Reserva res = new Reserva(fecha,idCliente,nombreCliente,telefono,correo,placa,modelo,marca,idEmpleado,nombreEmpleado,observaciones);
                    if (Gestor.registrarReserva(res)) {
                        JOptionPane.showMessageDialog(null, "Se registro la reserva al cliente "+nombreCliente.toUpperCase(),"MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarFechas();
                        limpiarComboBox();
                        codigoReserva();
                        jifReservas.jbtRegistrar.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"No se pudo registrar la Reserva", "MECAUT",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        jifReservas.jbtCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarFechas();
                limpiarComboBox();
                jifReservas.jbtRegistrar.setEnabled(false);
            }
        });
        jifReservas.setVisible(true);
        locacionfrm(jifReservas);
    }
    
    private void evtDatosReserva(){
        String id = jifReservas.jtfIdentificacion.getText();
        ResultSet datos = Gestor.datosReserva(id);
        try{
            while(datos.next()){
                jifReservas.jtfNombre.setText(datos.getString(1));
                jifReservas.jtfTelefono.setText(datos.getString(2));
                jifReservas.jtfCorreo.setText(datos.getString(3));
                jifReservas.jtfPlaca.setText(datos.getString(4));
                jifReservas.jtfModelo.setText(datos.getString(5));
                jifReservas.jtfMarca.setText(datos.getString(6));
                jifReservas.jbtRegistrar.setEnabled(true);
            }
        }catch(Exception ex){}
    }
    
    private void codigoReserva(){
        ResultSet cod = Gestor.codigoReserva();
        String num= "";
        try{
        while(cod.next())
            num = cod.getString(1);
        int codigo = Integer.parseInt(num);
        jifReservas.jtfCodigo.setText(""+(++codigo));
        }catch(SQLException | NumberFormatException exc){}
    }
    
    private void frmCotizacion(){
        limpiar();
        limpiarTablas(jifCotizacion.Datosmantenimientos);
        limpiarFechas();
        codigoCotizacion();
        ResultSet ids = Gestor.IdsClientes();
        jifCotizacion.jcbIdCliente.removeAllItems();
        jifCotizacion.jcbIdCliente.addItem("-----");
        try {
            while(ids.next())
                jifCotizacion.jcbIdCliente.addItem(ids.getString("cli_id"));
        } catch (Exception e) {}
        final DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Fecha");
        model.addColumn("Costo");
        limpiarComboBox();
        jifCotizacion.jcbIdCliente.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String id = (jifCotizacion.jcbIdCliente.getSelectedItem() != null)?jifCotizacion.jcbIdCliente.getSelectedItem().toString():"";
                ResultSet nombre = Gestor.TraerDatosCliente(id);
                try {
                    while(nombre.next())
                        jifCotizacion.jtfNombreCliente.setText(nombre.getString("cli_nombre"));
                } catch (Exception ex) {}
                limpiarTablas(jifCotizacion.Datosmantenimientos);
                ArrayList<Mantenimiento> lista = Gestor.datosCotizacion(id);
                try {
                    Object[] fila = new Object[3];
                    for( Mantenimiento man : lista){
                        fila[0] = man.getCodigo();
                        fila[1] = man.getFecha();
                        fila[2] = man.getCosto();
                        model.addRow(fila);
                        jifCotizacion.jbtRegistrar.setEnabled(true);
                    }
                    jifCotizacion.Datosmantenimientos.setModel(model);
                } catch (Exception ex) {JOptionPane.showMessageDialog(null, "er:\n"+ex.getMessage());}
            }
        });
        jifCotizacion.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idCliente = jifCotizacion.jcbIdCliente.getSelectedItem().toString();
                String valorMantenimiento = jifCotizacion.jtfValorMantenimiento.getText();
                String valorCotizacion = jifCotizacion.jtfValorCotizacion.getText();
                String observaciones = jifCotizacion.jtfObservaciones.getText();
                if(jifCotizacion.jdcFecha.getDate() == null)
                    JOptionPane.showMessageDialog(null, "Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(idCliente.isEmpty() || valorMantenimiento.isEmpty() || valorCotizacion.isEmpty() || observaciones.isEmpty())
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    java.util.Date f = jifCotizacion.jdcFecha.getDate();
                    SimpleDateFormat sf = new SimpleDateFormat("YY-MM-dd");
                    String fecha = sf.format(f);
                    String nombreCliente = jifCotizacion.jtfNombreCliente.getText();
                    String codMante = jifCotizacion.jtfCodigo.getText();
                    int t = Integer.parseInt(valorMantenimiento)-Integer.parseInt(valorCotizacion);
                    String totalMantenimiento = String.valueOf(t);

                    if (Gestor.registrarCotizacion(fecha,idCliente,nombreCliente,codMante,valorMantenimiento,totalMantenimiento,valorCotizacion,observaciones) 
                            && Gestor.actualizarMantenimiento(codMante,totalMantenimiento)) {
                        JOptionPane.showMessageDialog(null, "Se Registro la cotización correctamente...","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarFechas();
                        limpiarComboBox();
                        limpiarTablas(jifCotizacion.Datosmantenimientos);
                        codigoCotizacion();
                        jifCotizacion.jbtRegistrar.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No se pudo registrar la cotización","MECAUT",JOptionPane.INFORMATION_MESSAGE); 
                    }
                }
            }
        });
        jifCotizacion.jbtCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarTablas(jifCotizacion.Datosmantenimientos);
                limpiarFechas();
                limpiarComboBox();
                jifCotizacion.jbtRegistrar.setEnabled(false);
            }
        });
        jifCotizacion.setVisible(true);
        locacionfrm(jifCotizacion);
    }
    
    private void codigoCotizacion(){
        ResultSet numero = Gestor.codigosCotizacion();
        String cod ="";
        try {
            while(numero.next())
                cod = numero.getString(1);
            int num = Integer.parseInt(cod);
            jifCotizacion.jtfNumeroCotizacion.setText(""+(++num));
        } catch (SQLException | NumberFormatException e) {JOptionPane.showMessageDialog(null, ""+e.getMessage());}
    }
    
    private void frmVerFichaAuto(){
        limpiar();
        limpiarComboBox();
        evtDesactivarPanelesFichaAuto();
        evtFichaAuto();
        jifVerFichaAuto.jbtNuevaFicha.setEnabled(false);
        jifVerFichaAuto.jbtRegistrar.setEnabled(false);
        jifVerFichaAuto.jbtModificar.setEnabled(false);
        jifVerFichaAuto.jcbPlacas.removeAllItems();
        jifVerFichaAuto.jcbPlacas.addItem("----");
        String[] datos = frmCliente.user.getToolTipText().split(" ");
        ResultSet placas = Gestor.placasAutosClientes(datos[1]);
        try {
            while(placas.next())
                jifVerFichaAuto.jcbPlacas.addItem(placas.getString("aut_placa"));
        } catch (Exception e) {}
        
        jifVerFichaAuto.jcbPlacas.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String placa = (jifVerFichaAuto.jcbPlacas.getSelectedItem() != null)?jifVerFichaAuto.jcbPlacas.getSelectedItem().toString():"";
                ResultSet num = Gestor.validarFicha(placa);
                try{
                    if(!num.next()){                        
                        try {
                            ResultSet datos = Gestor.datosMantenimiento(placa);
                            while(datos.next()){
                                evtDesactivarPanelesFichaAuto();
                                limpiar();
                                jifVerFichaAuto.jcbTransmision.setSelectedIndex(0);
                                evtFichaAuto();
                                jifVerFichaAuto.jbtNuevaFicha.setEnabled(true);
                                jifVerFichaAuto.jbtRegistrar.setEnabled(false);
                                jifVerFichaAuto.jbtModificar.setEnabled(false);
                            }
                        } catch (Exception ex) {}
                    }
                    else {
                        placa = (jifVerFichaAuto.jcbPlacas.getSelectedItem() != null)?jifVerFichaAuto.jcbPlacas.getSelectedItem().toString():"";
                        num = Gestor.validarFicha(placa);
                        while(num.next()){
                            evtActivarPanelesFichaAuto();
                            jifVerFichaAuto.fRegistro.setText(num.getString("fic_fechaRegistro"));
                            jifVerFichaAuto.fActualizacion.setText(num.getString("fic_fechaActualizacion")==null?"00/00/0000":num.getString("fic_fechaActualizacion"));
                            jifVerFichaAuto.jtfCilindraje.setText(num.getString("aut_cilindraje"));
                            jifVerFichaAuto.jtfFrenos.setText(num.getString("aut_frenos"));
                            jifVerFichaAuto.jtfMotor.setText(num.getString("aut_motor"));
                            jifVerFichaAuto.jtfPotencia.setText(num.getString("aut_potencia"));
                            jifVerFichaAuto.jtfColor.setText(num.getString("aut_color"));
                            jifVerFichaAuto.jsAlto.setValue(Integer.parseInt(num.getString("aut_alto")));
                            jifVerFichaAuto.jsAncho.setValue(Integer.parseInt(num.getString("aut_ancho")));
                            jifVerFichaAuto.jsLargo.setValue(Integer.parseInt(num.getString("aut_largo")));
                            jifVerFichaAuto.jsPeso.setValue(Integer.parseInt(num.getString("aut_peso")));
                            int op = ("Automatica".equals(num.getString("aut_transmision")))?1:2;
                            jifVerFichaAuto.jcbTransmision.setSelectedIndex(op);
                            if (null != num.getString("aut_cojineria"))
                                switch (num.getString("aut_cojineria")) {
                                case "Buena":
                                    jifVerFichaAuto.jcbBuenaC.setSelected(true);
                                    break;
                                case "Regular":
                                    jifVerFichaAuto.jcbRegularC.setSelected(true);
                                    break;
                                case "Mala":
                                    jifVerFichaAuto.jcbMalaC.setSelected(true);
                                    break;
                            }
                            if (null != num.getString("aut_puertas"))
                                switch (num.getString("aut_puertas")) {
                                case "Buena":
                                    jifVerFichaAuto.jcbBuenaP.setSelected(true);
                                    break;
                                case "Regular":
                                    jifVerFichaAuto.jcbRegularP.setSelected(true);
                                    break;
                                case "Mala":
                                    jifVerFichaAuto.jcbMalaP.setSelected(true);
                                    break;
                            }
                            if (null != num.getString("aut_farolas"))
                                switch (num.getString("aut_farolas")) {
                                case "Buena":
                                    jifVerFichaAuto.jcbBuenaL.setSelected(true);
                                    break;
                                case "Regular":
                                    jifVerFichaAuto.jcbRegularL.setSelected(true);
                                    break;
                                case "Mala":
                                    jifVerFichaAuto.jcbMalaL.setSelected(true);
                                    break;
                            }
                        }
                        jifVerFichaAuto.jbtNuevaFicha.setEnabled(false);
                        jifVerFichaAuto.jbtRegistrar.setEnabled(false);
                        jifVerFichaAuto.jbtModificar.setEnabled(true);
                    }
                }catch(SQLException | HeadlessException ec){ JOptionPane.showMessageDialog(null, ""+ec.getMessage());}
            }
        });
        
        jifVerFichaAuto.jbtNuevaFicha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    jifVerFichaAuto.jbtRegistrar.setEnabled(true);
                    evtActivarPanelesFichaAuto();
            }
        });
        
        jifVerFichaAuto.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] d= frmCliente.user.getToolTipText().split(" ");
                c = new GregorianCalendar();
                SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
                String fecha = sd.format(c.getTime());
                String Placa = jifVerFichaAuto.jcbPlacas.getSelectedItem().toString();
                String idCli = d[1];
                String cil = jifVerFichaAuto.jtfCilindraje.getText();
                String fre = jifVerFichaAuto.jtfFrenos.getText();
                String mot = jifVerFichaAuto.jtfMotor.getText();
                String pot = jifVerFichaAuto.jtfMotor.getText();
                String tran = jifVerFichaAuto.jcbTransmision.getSelectedItem().toString();
                String alt = jifVerFichaAuto.jsAlto.getValue().toString();
                String lar = jifVerFichaAuto.jsAlto.getValue().toString();
                String anc = jifVerFichaAuto.jsAncho.getValue().toString();
                String col = jifVerFichaAuto.jtfColor.getText();
                String peso = jifVerFichaAuto.jsPeso.getValue().toString();
                String luces,cojineria,puertas;
                if(jifVerFichaAuto.jcbBuenaL.isSelected())
                    luces = jifVerFichaAuto.jcbBuenaL.getText();
                else if(jifVerFichaAuto.jcbRegularL.isSelected())
                    luces = jifVerFichaAuto.jcbRegularL.getText();
                else
                    luces = jifVerFichaAuto.jcbMalaL.getText();
                if(jifVerFichaAuto.jcbBuenaC.isSelected())
                    cojineria = jifVerFichaAuto.jcbBuenaC.getText();
                else if(jifVerFichaAuto.jcbRegularC.isSelected())
                    cojineria = jifVerFichaAuto.jcbRegularC.getText();
                else
                    cojineria = jifVerFichaAuto.jcbMalaC.getText();
                if(jifVerFichaAuto.jcbBuenaP.isSelected())
                    puertas = jifVerFichaAuto.jcbBuenaP.getText();
                else if(jifVerFichaAuto.jcbRegularP.isSelected())
                    puertas = jifVerFichaAuto.jcbRegularP.getText();
                else
                    puertas = jifVerFichaAuto.jcbMalaP.getText();
                if (Gestor.registrarFichaTecnica(fecha, idCli,Placa,cil,fre,peso,col,mot,pot,tran,lar,anc,alt,cojineria,puertas,luces)) {
                    JOptionPane.showMessageDialog(null, "Se registro la ficha del auto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    evtFichaAuto();
                    evtDesactivarPanelesFichaAuto();
                    jifVerFichaAuto.jbtNuevaFicha.setEnabled(false);
                    jifVerFichaAuto.jbtModificar.setEnabled(false);
                    jifVerFichaAuto.jbtRegistrar.setEnabled(false);
                }else
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la ficha del auto","MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifVerFichaAuto.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] d= frmCliente.user.getToolTipText().split(" ");
                c = new GregorianCalendar();
                c.getTime();
                SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
                String fechaActualizacion = sd.format(c.getTime());
                String Placa = jifVerFichaAuto.jcbPlacas.getSelectedItem().toString();
                String idCli = d[1];
                String cil = jifVerFichaAuto.jtfCilindraje.getText();
                String fre = jifVerFichaAuto.jtfFrenos.getText();
                String mot = jifVerFichaAuto.jtfMotor.getText();
                String pot = jifVerFichaAuto.jtfMotor.getText();
                String tran = jifVerFichaAuto.jcbTransmision.getSelectedItem().toString();
                String alt = jifVerFichaAuto.jsAlto.getValue().toString();
                String lar = jifVerFichaAuto.jsAlto.getValue().toString();
                String anc = jifVerFichaAuto.jsAncho.getValue().toString();
                String col = jifVerFichaAuto.jtfColor.getText();
                String peso = jifVerFichaAuto.jsPeso.getValue().toString();
                String luces,cojineria,puertas;
                if(jifVerFichaAuto.jcbBuenaL.isSelected())
                    luces = jifVerFichaAuto.jcbBuenaL.getText();
                else if(jifVerFichaAuto.jcbRegularL.isSelected())
                    luces = jifVerFichaAuto.jcbRegularL.getText();
                else
                    luces = jifVerFichaAuto.jcbMalaL.getText();
                if(jifVerFichaAuto.jcbBuenaC.isSelected())
                    cojineria = jifVerFichaAuto.jcbBuenaC.getText();
                else if(jifVerFichaAuto.jcbRegularC.isSelected())
                    cojineria = jifVerFichaAuto.jcbRegularC.getText();
                else
                    cojineria = jifVerFichaAuto.jcbMalaC.getText();
                if(jifVerFichaAuto.jcbBuenaP.isSelected())
                    puertas = jifVerFichaAuto.jcbBuenaP.getText();
                else if(jifVerFichaAuto.jcbRegularP.isSelected())
                    puertas = jifVerFichaAuto.jcbRegularP.getText();
                else
                    puertas = jifVerFichaAuto.jcbMalaP.getText();
                if(Gestor.modificarFichaAuto(fechaActualizacion, idCli, Placa, cil, fre, peso, col, mot, pot, tran, lar, anc, alt, cojineria, puertas, luces)){
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente la ficah del auto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    evtFichaAuto();
                    evtDesactivarPanelesFichaAuto();
                    jifVerFichaAuto.jbtNuevaFicha.setEnabled(false);
                    jifVerFichaAuto.jbtModificar.setEnabled(false);
                    jifVerFichaAuto.jbtRegistrar.setEnabled(false);
                }else
                    JOptionPane.showMessageDialog(null, "No se pudo modificar la ficha del auto","MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifVerFichaAuto.jbtancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
                evtFichaAuto();
                evtDesactivarPanelesFichaAuto();
                jifVerFichaAuto.jbtNuevaFicha.setEnabled(false);
                jifVerFichaAuto.jbtModificar.setEnabled(false);
                jifVerFichaAuto.jbtRegistrar.setEnabled(false);
            }
        });
        
        jifVerFichaAuto.setVisible(true);
    }
    
    private void frmFichaRecepcionAuto(){
        limpiar();
        limpiarComboBox();
        evtDesactivarPanelesFichaAuto();
        evtFichaAuto();
        jifFichaAuto.jbtNuevaFicha.setEnabled(false);
        jifFichaAuto.jbtRegistrar.setEnabled(false);
        jifFichaAuto.jbtModificar.setEnabled(false);
        jifFichaAuto.jcbPlaca.removeAllItems();
        jifFichaAuto.jcbPlaca.addItem("----");
        ResultSet placas = Gestor.placasAutos();
        try {
            while(placas.next())
                jifFichaAuto.jcbPlaca.addItem(placas.getString("aut_placa"));
        } catch (Exception e) {}
        
        jifFichaAuto.jcbPlaca.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String placa = (jifFichaAuto.jcbPlaca.getSelectedItem() != null)?jifFichaAuto.jcbPlaca.getSelectedItem().toString():"";
                ResultSet num = Gestor.validarFicha(placa);
                try{
                    if(!num.next()){                        
                        try {
                            ResultSet datos = Gestor.datosMantenimiento(placa);
                            while(datos.next()){
                                evtDesactivarPanelesFichaAuto();
                                limpiar();
                                jifFichaAuto.jcbTransmision.setSelectedIndex(0);
                                evtFichaAuto();
                                jifFichaAuto.jtfIdCliente.setText(datos.getString("cli_id"));
                                jifFichaAuto.jtfNombreCliente.setText(datos.getString("cli_nombre"));
                                jifFichaAuto.jbtNuevaFicha.setEnabled(true);
                                jifFichaAuto.jbtRegistrar.setEnabled(false);
                                jifFichaAuto.jbtModificar.setEnabled(false);
                            }
                        } catch (Exception ex) {}
                    }
                    else {
                        ResultSet datos = Gestor.datosMantenimiento(placa);
                        while(datos.next()){
                            jifFichaAuto.jtfIdCliente.setText(datos.getString("cli_id"));
                            jifFichaAuto.jtfNombreCliente.setText(datos.getString("cli_nombre"));
                        }
                        placa = (jifFichaAuto.jcbPlaca.getSelectedItem() != null)?jifFichaAuto.jcbPlaca.getSelectedItem().toString():"";
                        num = Gestor.validarFicha(placa);
                        while(num.next()){
                            evtActivarPanelesFichaAuto();
                            jifFichaAuto.jtfCilindraje.setText(num.getString("aut_cilindraje"));
                            jifFichaAuto.jtfFrenos.setText(num.getString("aut_frenos"));
                            jifFichaAuto.jtfMotor.setText(num.getString("aut_motor"));
                            jifFichaAuto.jtfPotencia.setText(num.getString("aut_potencia"));
                            jifFichaAuto.jtfColor.setText(num.getString("aut_color"));
                            jifFichaAuto.jsAlto.setValue(Integer.parseInt(num.getString("aut_alto")));
                            jifFichaAuto.jsAncho.setValue(Integer.parseInt(num.getString("aut_ancho")));
                            jifFichaAuto.jsLargo.setValue(Integer.parseInt(num.getString("aut_largo")));
                            jifFichaAuto.jsPeso.setValue(Integer.parseInt(num.getString("aut_peso")));
                            int op = ("Automatica".equals(num.getString("aut_transmision")))?1:2;
                            jifFichaAuto.jcbTransmision.setSelectedIndex(op);
                            if (null != num.getString("aut_cojineria"))
                                switch (num.getString("aut_cojineria")) {
                                case "Buena":
                                    jifFichaAuto.jcbBuenaC.setSelected(true);
                                    break;
                                case "Regular":
                                    jifFichaAuto.jcbRegularC.setSelected(true);
                                    break;
                                case "Mala":
                                    jifFichaAuto.jcbMalaC.setSelected(true);
                                    break;
                            }
                            if (null != num.getString("aut_puertas"))
                                switch (num.getString("aut_puertas")) {
                                case "Buena":
                                    jifFichaAuto.jcbBuenaP.setSelected(true);
                                    break;
                                case "Regular":
                                    jifFichaAuto.jcbRegularP.setSelected(true);
                                    break;
                                case "Mala":
                                    jifFichaAuto.jcbMalaP.setSelected(true);
                                    break;
                            }
                            if (null != num.getString("aut_farolas"))
                                switch (num.getString("aut_farolas")) {
                                case "Buena":
                                    jifFichaAuto.jcbBuenaL.setSelected(true);
                                    break;
                                case "Regular":
                                    jifFichaAuto.jcbRegularL.setSelected(true);
                                    break;
                                case "Mala":
                                    jifFichaAuto.jcbMalaL.setSelected(true);
                                    break;
                            }
                        }
                        jifFichaAuto.jbtNuevaFicha.setEnabled(false);
                        jifFichaAuto.jbtRegistrar.setEnabled(false);
                        jifFichaAuto.jbtModificar.setEnabled(true);
                    }
                }catch(SQLException | HeadlessException ec){ JOptionPane.showMessageDialog(null, ""+ec.getMessage());}
            }
        });
        
        jifFichaAuto.jbtNuevaFicha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    jifFichaAuto.jbtRegistrar.setEnabled(true);
                    evtActivarPanelesFichaAuto();
            }
        });
        
        jifFichaAuto.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                c = new GregorianCalendar();
                SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
                String fecha = sd.format(c.getTime());
                String Placa = jifFichaAuto.jcbPlaca.getSelectedItem().toString();
                String idCli = jifFichaAuto.jtfIdCliente.getText();
                String cil = jifFichaAuto.jtfCilindraje.getText();
                String fre = jifFichaAuto.jtfFrenos.getText();
                String mot = jifFichaAuto.jtfMotor.getText();
                String pot = jifFichaAuto.jtfMotor.getText();
                String tran = jifFichaAuto.jcbTransmision.getSelectedItem().toString();
                String alt = jifFichaAuto.jsAlto.getValue().toString();
                String lar = jifFichaAuto.jsAlto.getValue().toString();
                String anc = jifFichaAuto.jsAncho.getValue().toString();
                String col = jifFichaAuto.jtfColor.getText();
                String peso = jifFichaAuto.jsPeso.getValue().toString();
                String luces,cojineria,puertas;
                if(jifFichaAuto.jcbBuenaL.isSelected())
                    luces = jifFichaAuto.jcbBuenaL.getText();
                else if(jifFichaAuto.jcbRegularL.isSelected())
                    luces = jifFichaAuto.jcbRegularL.getText();
                else
                    luces = jifFichaAuto.jcbMalaL.getText();
                if(jifFichaAuto.jcbBuenaC.isSelected())
                    cojineria = jifFichaAuto.jcbBuenaC.getText();
                else if(jifFichaAuto.jcbRegularC.isSelected())
                    cojineria = jifFichaAuto.jcbRegularC.getText();
                else
                    cojineria = jifFichaAuto.jcbMalaC.getText();
                if(jifFichaAuto.jcbBuenaP.isSelected())
                    puertas = jifFichaAuto.jcbBuenaP.getText();
                else if(jifFichaAuto.jcbRegularP.isSelected())
                    puertas = jifFichaAuto.jcbRegularP.getText();
                else
                    puertas = jifFichaAuto.jcbMalaP.getText();
                if (Gestor.registrarFichaTecnica(fecha, idCli,Placa,cil,fre,peso,col,mot,pot,tran,lar,anc,alt,cojineria,puertas,luces)) {
                    JOptionPane.showMessageDialog(null, "Se registro la ficha del auto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    evtFichaAuto();
                    evtDesactivarPanelesFichaAuto();
                    jifFichaAuto.jbtNuevaFicha.setEnabled(false);
                    jifFichaAuto.jbtModificar.setEnabled(false);
                    jifFichaAuto.jbtRegistrar.setEnabled(false);
                }else
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la ficha del auto","MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifFichaAuto.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = new GregorianCalendar();
                c.getTime();
                SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
                String fechaActualizacion = sd.format(c.getTime());
                String Placa = jifFichaAuto.jcbPlaca.getSelectedItem().toString();
                String idCli = jifFichaAuto.jtfIdCliente.getText();
                String cil = jifFichaAuto.jtfCilindraje.getText();
                String fre = jifFichaAuto.jtfFrenos.getText();
                String mot = jifFichaAuto.jtfMotor.getText();
                String pot = jifFichaAuto.jtfMotor.getText();
                String tran = jifFichaAuto.jcbTransmision.getSelectedItem().toString();
                String alt = jifFichaAuto.jsAlto.getValue().toString();
                String lar = jifFichaAuto.jsAlto.getValue().toString();
                String anc = jifFichaAuto.jsAncho.getValue().toString();
                String col = jifFichaAuto.jtfColor.getText();
                String peso = jifFichaAuto.jsPeso.getValue().toString();
                String luces,cojineria,puertas;
                if(jifFichaAuto.jcbBuenaL.isSelected())
                    luces = jifFichaAuto.jcbBuenaL.getText();
                else if(jifFichaAuto.jcbRegularL.isSelected())
                    luces = jifFichaAuto.jcbRegularL.getText();
                else
                    luces = jifFichaAuto.jcbMalaL.getText();
                if(jifFichaAuto.jcbBuenaC.isSelected())
                    cojineria = jifFichaAuto.jcbBuenaC.getText();
                else if(jifFichaAuto.jcbRegularC.isSelected())
                    cojineria = jifFichaAuto.jcbRegularC.getText();
                else
                    cojineria = jifFichaAuto.jcbMalaC.getText();
                if(jifFichaAuto.jcbBuenaP.isSelected())
                    puertas = jifFichaAuto.jcbBuenaP.getText();
                else if(jifFichaAuto.jcbRegularP.isSelected())
                    puertas = jifFichaAuto.jcbRegularP.getText();
                else
                    puertas = jifFichaAuto.jcbMalaP.getText();
                if(Gestor.modificarFichaAuto(fechaActualizacion, idCli, Placa, cil, fre, peso, col, mot, pot, tran, lar, anc, alt, cojineria, puertas, luces)){
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente la ficah del auto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    limpiarComboBox();
                    evtFichaAuto();
                    evtDesactivarPanelesFichaAuto();
                    jifFichaAuto.jbtNuevaFicha.setEnabled(false);
                    jifFichaAuto.jbtModificar.setEnabled(false);
                    jifFichaAuto.jbtRegistrar.setEnabled(false);
                }else
                    JOptionPane.showMessageDialog(null, "No se pudo modificar la ficha del auto","MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifFichaAuto.jbtancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
                jifFichaAuto.jsAlto.setValue(0);
                jifFichaAuto.jsAncho.setValue(0);
                jifFichaAuto.jsLargo.setValue(0);
                jifFichaAuto.jsPeso.setValue(0);
                jifFichaAuto.bgCojineria.clearSelection();
                jifFichaAuto.bgLuces.clearSelection();
                jifFichaAuto.bgPuertas.clearSelection();
                evtDesactivarPanelesFichaAuto();
                jifFichaAuto.jbtNuevaFicha.setEnabled(false);
                jifFichaAuto.jbtModificar.setEnabled(false);
                jifFichaAuto.jbtRegistrar.setEnabled(false);
            }
        });
        
        jifFichaAuto.setVisible(true);
        locacionfrm(jifFichaAuto);
    }
    
    public void evtFichaAuto(){
        jifFichaAuto.jsAlto.setValue(0);
        jifFichaAuto.jsAncho.setValue(0);
        jifFichaAuto.jsLargo.setValue(0);
        jifFichaAuto.jsPeso.setValue(0);
        jifFichaAuto.bgCojineria.clearSelection();
        jifFichaAuto.bgLuces.clearSelection();
        jifFichaAuto.bgPuertas.clearSelection();
        jifVerFichaAuto.jsAlto.setValue(0);
        jifVerFichaAuto.jsAncho.setValue(0);
        jifVerFichaAuto.jsLargo.setValue(0);
        jifVerFichaAuto.jsPeso.setValue(0);
        jifVerFichaAuto.bgCojineria.clearSelection();
        jifVerFichaAuto.bgLuces.clearSelection();
        jifVerFichaAuto.bgPuertas.clearSelection();
    }
    
    private void evtDesactivarPanelesFichaAuto(){
        jifFichaAuto.jtfCilindraje.setEnabled(false);
        jifFichaAuto.jtfFrenos.setEnabled(false);
        jifFichaAuto.jtfMotor.setEnabled(false);
        jifFichaAuto.jtfPotencia.setEnabled(false);
        jifFichaAuto.jcbTransmision.setEnabled(false);
        jifFichaAuto.jsAlto.setEnabled(false);
        jifFichaAuto.jsAncho.setEnabled(false);
        jifFichaAuto.jsLargo.setEnabled(false);
        jifFichaAuto.jsPeso.setEnabled(false);
        jifFichaAuto.jtfColor.setEnabled(false);
        jifFichaAuto.jcbBuenaC.setEnabled(false);
        jifFichaAuto.jcbRegularC.setEnabled(false);
        jifFichaAuto.jcbMalaC.setEnabled(false);
        jifFichaAuto.jcbBuenaL.setEnabled(false);
        jifFichaAuto.jcbRegularL.setEnabled(false);
        jifFichaAuto.jcbMalaL.setEnabled(false);
        jifFichaAuto.jcbBuenaP.setEnabled(false);
        jifFichaAuto.jcbRegularP.setEnabled(false);
        jifFichaAuto.jcbMalaP.setEnabled(false);
        jifVerFichaAuto.jtfCilindraje.setEnabled(false);
        jifVerFichaAuto.jtfFrenos.setEnabled(false);
        jifVerFichaAuto.jtfMotor.setEnabled(false);
        jifVerFichaAuto.jtfPotencia.setEnabled(false);
        jifVerFichaAuto.jcbTransmision.setEnabled(false);
        jifVerFichaAuto.jsAlto.setEnabled(false);
        jifVerFichaAuto.jsAncho.setEnabled(false);
        jifVerFichaAuto.jsLargo.setEnabled(false);
        jifVerFichaAuto.jsPeso.setEnabled(false);
        jifVerFichaAuto.jtfColor.setEnabled(false);
        jifVerFichaAuto.jcbBuenaC.setEnabled(false);
        jifVerFichaAuto.jcbRegularC.setEnabled(false);
        jifVerFichaAuto.jcbMalaC.setEnabled(false);
        jifVerFichaAuto.jcbBuenaL.setEnabled(false);
        jifVerFichaAuto.jcbRegularL.setEnabled(false);
        jifVerFichaAuto.jcbMalaL.setEnabled(false);
        jifVerFichaAuto.jcbBuenaP.setEnabled(false);
        jifVerFichaAuto.jcbRegularP.setEnabled(false);
        jifVerFichaAuto.jcbMalaP.setEnabled(false);
    }
    
    private void evtActivarPanelesFichaAuto(){
        jifFichaAuto.jtfCilindraje.setEnabled(true);
        jifFichaAuto.jtfFrenos.setEnabled(true);
        jifFichaAuto.jtfMotor.setEnabled(true);
        jifFichaAuto.jtfPotencia.setEnabled(true);
        jifFichaAuto.jcbTransmision.setEnabled(true);
        jifFichaAuto.jsAlto.setEnabled(true);
        jifFichaAuto.jsAncho.setEnabled(true);
        jifFichaAuto.jsLargo.setEnabled(true);
        jifFichaAuto.jsPeso.setEnabled(true);
        jifFichaAuto.jtfColor.setEnabled(true);
        jifFichaAuto.jcbBuenaC.setEnabled(true);
        jifFichaAuto.jcbRegularC.setEnabled(true);
        jifFichaAuto.jcbMalaC.setEnabled(true);
        jifFichaAuto.jcbBuenaL.setEnabled(true);
        jifFichaAuto.jcbRegularL.setEnabled(true);
        jifFichaAuto.jcbMalaL.setEnabled(true);
        jifFichaAuto.jcbBuenaP.setEnabled(true);
        jifFichaAuto.jcbRegularP.setEnabled(true);
        jifFichaAuto.jcbMalaP.setEnabled(true);
        jifVerFichaAuto.jtfCilindraje.setEnabled(true);
        jifVerFichaAuto.jtfFrenos.setEnabled(true);
        jifVerFichaAuto.jtfMotor.setEnabled(true);
        jifVerFichaAuto.jtfPotencia.setEnabled(true);
        jifVerFichaAuto.jcbTransmision.setEnabled(true);
        jifVerFichaAuto.jsAlto.setEnabled(true);
        jifVerFichaAuto.jsAncho.setEnabled(true);
        jifVerFichaAuto.jsLargo.setEnabled(true);
        jifVerFichaAuto.jsPeso.setEnabled(true);
        jifVerFichaAuto.jtfColor.setEnabled(true);
        jifVerFichaAuto.jcbBuenaC.setEnabled(true);
        jifVerFichaAuto.jcbRegularC.setEnabled(true);
        jifVerFichaAuto.jcbMalaC.setEnabled(true);
        jifVerFichaAuto.jcbBuenaL.setEnabled(true);
        jifVerFichaAuto.jcbRegularL.setEnabled(true);
        jifVerFichaAuto.jcbMalaL.setEnabled(true);
        jifVerFichaAuto.jcbBuenaP.setEnabled(true);
        jifVerFichaAuto.jcbRegularP.setEnabled(true);
        jifVerFichaAuto.jcbMalaP.setEnabled(true);
    }
    
    private void frmPromocionesCombos(){
        limpiar();
        limpiarComboBox();
        limpiarFechas();
        codigoPromocion();
        jifPromociones.jbtActualizar.setEnabled(false);
        jifPromociones.jbtEliminar.setEnabled(false);
        
        jifPromociones.jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if(jifPromociones.jTabbedPane1.getSelectedIndex() == 2){
                    evtListaDePromociones();
                }
            }
        });
        
        jifPromociones.jbtConsultar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(jifPromociones.jtfCodigoA.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Ingrese un codigo","MECAUT",JOptionPane.ERROR_MESSAGE);
                else{
                    ResultSet dato = Gestor.datosPromocion(jifPromociones.jtfCodigoA.getText());
                    try {
                        while (dato.next()) {
                            if ("Repuesto".equals(dato.getString("pro_tipo"))) 
                                jifPromociones.jcbTipoA.setSelectedIndex(1);
                            else
                                jifPromociones.jcbTipoA.setSelectedIndex(2);
                            if ("Activa".equals(dato.getString("pro_estado"))) 
                                jifPromociones.jcbEstadoA.setSelectedIndex(1);
                            else
                                jifPromociones.jcbEstadoA.setSelectedIndex(2);                            
                            jifPromociones.jtfDescripcionA.setText(dato.getString("pro_descripcion"));
                            jifPromociones.jdcFechaA.setDate(Date.valueOf(dato.getString("pro_fecha")));
                            jifPromociones.jbtActualizar.setEnabled(true);
                            jifPromociones.jbtEliminar.setEnabled(true);
                        }
                    } catch (Exception e) {}
                }
            }
        });
        
        jifPromociones.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String desc = jifPromociones.jtfDescripcionN.getText();
                if (jifPromociones.jdcFechaN.getDate() == null)
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha para la promoción","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifPromociones.jcbEstadoN.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null,"Selecciones el estado de la promoción","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifPromociones.jcbTipoN.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null,"Selecciones el tipo de la promoción","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(desc.isEmpty())
                    JOptionPane.showMessageDialog(null,"Llene todos los campos","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    java.util.Date f = jifPromociones.jdcFechaN.getDate();
                    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
                    String fecha = sf.format(f);
                    String tipo = jifPromociones.jcbTipoN.getSelectedItem().toString();
                    String estado = jifPromociones.jcbEstadoN.getSelectedItem().toString();
                    if (Gestor.registrarPromocion(fecha,tipo,estado,desc)) {
                        JOptionPane.showMessageDialog(null,"Se registro correctamente la promocion","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarFechas();
                        limpiarComboBox();
                        codigoPromocion();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"No se pudo registrar la promoción","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifPromociones.jbtCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                limpiar();
                limpiarComboBox();
                limpiarFechas();
            }
        });
        
        jifPromociones.jbtActualizar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(jifPromociones.jtfCodigoA.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Ingrese un número","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifPromociones.jdcFechaA.getDate() == null)
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifPromociones.jcbEstadoA.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null,"Ingrese un estado","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifPromociones.jcbTipoA.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null,"Ingrese un tipo","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifPromociones.jtfDescripcionA.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Ingrese una descripcion","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    String codigo = jifPromociones.jtfCodigoA.getText();
                    java.util.Date f = jifPromociones.jdcFechaA.getDate();
                    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
                    String fecha = sf.format(f);
                    String tipo = jifPromociones.jcbTipoA.getSelectedItem().toString();
                    String estado = jifPromociones.jcbEstadoA.getSelectedItem().toString();
                    String desc = jifPromociones.jtfDescripcionA.getText();
                    if (Gestor.modificarPromocion(codigo, fecha, tipo, estado, desc)) {
                        JOptionPane.showMessageDialog(null,"Se modifico la promoción correctamente","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarComboBox();
                        limpiarFechas();
                        jifPromociones.jbtActualizar.setEnabled(false);
                        jifPromociones.jbtEliminar.setEnabled(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"No se pudo modificar la promción","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifPromociones.jbtEliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jifPromociones.jtfCodigoA.getText().isEmpty())
                   JOptionPane.showMessageDialog(null,"Ingrese el codigo de la Promocion","MECAUT",JOptionPane.WARNING_MESSAGE);
                else
                    if (Gestor.eliminarPromocion(jifPromociones.jtfCodigoA.getText())) {
                        JOptionPane.showMessageDialog(null,"Se elimino correctamente la promoción","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarComboBox();
                        limpiarFechas();
                        jifPromociones.jbtActualizar.setEnabled(false);
                        jifPromociones.jbtEliminar.setEnabled(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"No se pudo eliminar la  Promocion","MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifPromociones.setVisible(true);
        locacionfrm(jifPromociones);
    }
    
    public void evtListaDePromociones(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tipo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Estado");
        ResultSet datos = Gestor.listaDePromociones();
        try {
            while(datos.next()){
                Object[] fila = new Object[5];
                fila[0] = datos.getString(1);
                fila[1] = datos.getString(2);
                fila[2] = datos.getString(3);
                fila[3] = datos.getString(4);
                fila[4] = datos.getString(5);
                modelo.addRow(fila);
            }
            jifPromociones.jTable1.setModel(modelo);
        } catch (Exception e) {  }
    }
    
    private void codigoPromocion(){
        ResultSet cod = Gestor.codigoPromocion();
        String code = "";
        try {
            while(cod.next())
                code = cod.getString(1);
            int codigo = Integer.parseInt(code);
            jifPromociones.jtfCodigoN.setText(""+(++codigo));
        } catch (SQLException | NumberFormatException e) {}
    }
    
    private void frmVerPromociones(){
        limpiar();
        limpiarComboBox();
        evtListaPromociones("");
        
        
        jifVerPromociones.jcbTipoPromociones.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                String dato = jifVerPromociones.jcbTipoPromociones.getSelectedItem().toString();
                evtListaPromociones(dato);
            }
        });
        
        jifVerPromociones.ListaPromociones.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
                int i = jifVerPromociones.ListaPromociones.getSelectedRow();
                String codigo = jifVerPromociones.ListaPromociones.getValueAt(i, 0).toString();
                String fecha = jifVerPromociones.ListaPromociones.getValueAt(i, 1).toString();
                ResultSet des = Gestor.verDescripcionPromocion(codigo);
                try {
                    while(des.next())
                        jifVerPromociones.jtfDescripcion.setText(des.getString("pro_descripcion"));
                } catch (Exception e) {}
                jifVerPromociones.lbCodigo.setText("Código "+codigo);
                jifVerPromociones.lbFecha.setText("Fecha"+fecha);
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        
        jifVerPromociones.setVisible(true);
    }
    
    private void evtListaPromociones(String dato){
        ResultSet datos = Gestor.consultarPromociones(dato);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tipo");
        try {
            while(datos.next()){
                Object[] f = new Object[3];
                f[0] = datos.getString("pro_codigo");
                f[1] = datos.getString("pro_fecha");
                f[2] = datos.getString("pro_tipo");
                modelo.addRow(f);
            }
            jifVerPromociones.ListaPromociones.setModel(modelo);
        } catch (Exception e) {
        }
    }
    /* 3. Modulo Suministros */
 
    private void frmRegistrarProveedor() {
        limpiar();
        jifProveedor.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nit = (jifProveedor.jtfNit.getText());
                    String nombre = jifProveedor.jtfNombre.getText();
                    String direccion = jifProveedor.jtfDireccion.getText();
                    String telefono = (jifProveedor.jtfTelefono.getText());
                    String descripcion = jifProveedor.jtaDescripcion.getText();
                    Proveedor prov = new Proveedor(nit, nombre, direccion, telefono, descripcion);
                    if (Gestor.agregarProveedor(prov)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del proveedor almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifProveedor.jbtRegistrar1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        jifProveedor.setVisible(true);
        locacionfrm(jifProveedor);
    }

    private void frmActualizarProveedor() {
        limpiar();
        jifActualizarProveedor.jbtEliminar.setEnabled(false);
        jifActualizarProveedor.jbtModificar.setEnabled(false);
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedor();
        jifActualizarProveedor.jcbNit.removeAllItems();
        jifActualizarProveedor.jcbNit.addItem("Seleccione Nit");
        for (Proveedor proveedor : proveedores) {
            jifActualizarProveedor.jcbNit.addItem(proveedor);
        }
        jifActualizarProveedor.jcbNit.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                String nit = (jifActualizarProveedor.jcbNit.getSelectedItem() !=  null)?jifActualizarProveedor.jcbNit.getSelectedItem().toString():"";
                ResultSet datos = Gestor.datosProveedor(nit);
                try{
                while(datos.next()){
                    jifActualizarProveedor.jtfNombre.setText(datos.getString(2));
                    jifActualizarProveedor.jtfDireccion.setText(datos.getString(3));
                    jifActualizarProveedor.jtfTelefono.setText(datos.getString(4));
                    jifActualizarProveedor.jtaDescripcion.setText(datos.getString(5));
                    jifActualizarProveedor.jbtEliminar.setEnabled(true);
                    jifActualizarProveedor.jbtModificar.setEnabled(true);
                }
                }catch(Exception exc){}
            }
        });
        jifActualizarProveedor.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nit = (jifActualizarProveedor.jcbNit.getSelectedItem().toString());
                    String nombre = jifActualizarProveedor.jtfNombre.getText();
                    String direccion = jifActualizarProveedor.jtfDireccion.getText();
                    String telefono = (jifActualizarProveedor.jtfTelefono.getText());
                    String descripcion = jifActualizarProveedor.jtaDescripcion.getText();
                    Proveedor pro = new Proveedor(nit, nombre, direccion, telefono, descripcion);
                    if (Gestor.modificarProveedor(pro)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del proveedor modificados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        jifActualizarProveedor.jcbNit.setSelectedIndex(0);
                        limpiar();
                        jifActualizarProveedor.jbtEliminar.setEnabled(false);
                        jifActualizarProveedor.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException errr) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + errr.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarProveedor.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este proveedor?", "Eliminar PROVEEDOR", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String nit = jifActualizarProveedor.jcbNit.getSelectedItem().toString();
                        if (Gestor.eliminarProveedor(nit)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del proveedor eliminados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                            jifActualizarProveedor.jcbNit.setSelectedIndex(0);
                            limpiar();
                            jifActualizarProveedor.jbtEliminar.setEnabled(false);
                            jifActualizarProveedor.jbtModificar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException err) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + err.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifActualizarProveedor.setVisible(true);
        locacionfrm(jifActualizarProveedor);
    }

    private void frmListaProveedores() {
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedor();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nit");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");
        modelo.addColumn("Descripción");
        for (Proveedor proveedor : proveedores) {
            Object[] fila = new Object[5];
            fila[0] = proveedor.getNit();
            fila[1] = proveedor.getNombre();
            fila[2] = proveedor.getDireccion();
            fila[3] = proveedor.getTelefono();
            fila[4] = proveedor.getDescripcion();
            modelo.addRow(fila);
        }
        jifListaProveedores.jtListaMecanicos.setModel(modelo);
        jifListaProveedores.setVisible(true);
        locacionfrm(jifListaProveedores);
    }
    /* 4. Modulo Personal */

    private void frmRegistrarEmpleado() {
        limpiar();
        limpiarComboBox();
        
        jifEmpleado.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifEmpleado.jtfIdentificacion.getText();
                    String nombre = jifEmpleado.jtfNombre.getText();
                    String apellidos = jifEmpleado.jtfApellidos.getText();
                    String sexo = jifEmpleado.jcbSexo.getSelectedItem().toString();
                    String tipo = jifEmpleado.jcbTipo.getSelectedItem().toString();
                    String telefono = jifEmpleado.jtfTelefono.getText();
                    String direccion = jifEmpleado.jtfDireccion.getText();
                    String salario = jifEmpleado.jtfSalario.getText();
                    String correo = jifEmpleado.jtfCorreo.getText();
                    if(identificacion.length() < 10)
                        JOptionPane.showMessageDialog(null,"Ingrese una identificación correcta","MECAUT",JOptionPane.WARNING_MESSAGE);
                    else if(nombre.isEmpty() || nombre.length() < 3){
                        JOptionPane.showMessageDialog(null,"Ingrese Nombre","MECAUT",JOptionPane.WARNING_MESSAGE);
                        jifEmpleado.jtfNombre.requestFocus();
                    }
                    else if(jifEmpleado.jcbSexo.getSelectedIndex() == 0)
                         JOptionPane.showMessageDialog(null,"Ingrese el sexo del empleado","MECAUT",JOptionPane.WARNING_MESSAGE);
                    else if(jifEmpleado.jcbTipo.getSelectedIndex() == 0)
                         JOptionPane.showMessageDialog(null,"Ingrese el tipo de empleado","MECAUT",JOptionPane.WARNING_MESSAGE);
                    else{
                        Empleados emp = new Empleados(identificacion, nombre, apellidos, sexo, tipo, telefono, direccion, correo, salario);
                        Cuenta count = new Cuenta(identificacion, identificacion, "empleado", identificacion);
                        if (Gestor.agregarEmpleado(emp) && Gestor.registrarUsuario(count)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del mecánico " + nombre.toUpperCase() + " almacenados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                            limpiarComboBox();
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifEmpleado.jbtCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                limpiarComboBox();
            }
        });
        
        jifEmpleado.setVisible(true);
        locacionfrm(jifEmpleado);
    }

    private void frmActualizarEmpleado() {
        limpiar();
        limpiarComboBox();
        
        jifActualizarEmpleado.jtfId.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                evtConsultarEmpleado();
            }
        });
        
        jifActualizarEmpleado.jtfId.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                evtConsultarEmpleado();
            }
        });
        
        jifActualizarEmpleado.jbtEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int rs = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este empleado?", "MECAUT", JOptionPane.YES_NO_OPTION);
                    if (rs == JOptionPane.YES_OPTION) {
                        String id = (jifActualizarEmpleado.jtfId.getText());
                        if (Gestor.eliminarEmpleado(id)) {
                            JOptionPane.showMessageDialog(null, "¡Datos del mecanico eliminados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            limpiarComboBox();
                            jifActualizarEmpleado.jbtEliminar.setEnabled(false);
                            jifActualizarEmpleado.jbtModificar.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "¡No se pudieron eliminar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifActualizarEmpleado.jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String identificacion = jifActualizarEmpleado.jtfId.getText();
                    String nombre = jifActualizarEmpleado.jtfNombre.getText();
                    String apellidos = jifActualizarEmpleado.jtfApellidos.getText();
                    String sexo = jifActualizarEmpleado.jcbSexo.getSelectedItem().toString();
                    String tipo = jifActualizarEmpleado.jtfTipo1.getText();
                    String telefono = jifActualizarEmpleado.jtfTelefono.getText();
                    String direccion = jifActualizarEmpleado.jtfDireccion.getText();
                    String correo = jifActualizarEmpleado.jtfCorreo.getText();
                    String salario = jifActualizarEmpleado.jtfSalario.getText();
                    Empleados emp = new Empleados(identificacion, nombre, apellidos, sexo, tipo, telefono, direccion, correo, salario);
                    if (Gestor.modificarEmpleado(emp)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del mecánico " + nombre.toUpperCase() + " modificados!", "Mecaut", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                        limpiarComboBox();
                        jifActualizarEmpleado.jbtEliminar.setEnabled(false);
                        jifActualizarEmpleado.jbtModificar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron modificar los datos del mecánico " + nombre.toUpperCase() + "!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        TextAutoCompleter t = new TextAutoCompleter(jifActualizarEmpleado.jtfId);
        ResultSet ids = Gestor.idsEmpleados();
        try {
            while(ids.next())
                t.addItem(ids.getString(1));
        } catch (Exception e) {}
        
        jifActualizarEmpleado.setVisible(true);
        locacionfrm(jifActualizarEmpleado);
    }
    
    private void evtConsultarEmpleado(){
        try {
            ResultSet r;
            String id = jifActualizarEmpleado.jtfId.getText();
            r = Gestor.traerDatosEmpleado(id);
            while (r.next()) {
                int op = ("Masculino".equals(r.getString(4)) ? 2 : 1);
                jifActualizarEmpleado.jtfNombre.setText(r.getString(2));
                jifActualizarEmpleado.jtfApellidos.setText(r.getString(3));
                jifActualizarEmpleado.jcbSexo.setSelectedIndex(op);
                jifActualizarEmpleado.jtfTipo1.setText(r.getString(5));
                jifActualizarEmpleado.jtfTelefono.setText(r.getString(6));
                jifActualizarEmpleado.jtfDireccion.setText(r.getString(7));
                jifActualizarEmpleado.jtfSalario.setText(r.getString(8));
                jifActualizarEmpleado.jtfCorreo.setText(r.getString(9));
            }
            jifActualizarEmpleado.jbtEliminar.setEnabled(true);
            jifActualizarEmpleado.jbtModificar.setEnabled(true);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void frmListaEmpleados() {
        evtMostrarEmpleadosporId();
        jifListaEmpleados.jtfDato.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                evtMostrarEmpleadosporId();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        jifListaEmpleados.setVisible(true);
        locacionfrm(jifListaEmpleados);
    }

    private void evtMostrarEmpleadosporId() {
        String dato = jifListaEmpleados.jtfDato.getText();
        ArrayList<Empleados> empleados = Gestor.verEmpleadosPorDato(dato);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Salario");
        modelo.addColumn("Correo");
        for (Empleados empleado : empleados) {
            Object[] fila = new Object[9];
            fila[0] = empleado.getIdentificacion();
            fila[1] = empleado.getNombre();
            fila[2] = empleado.getApellidos();
            fila[3] = empleado.getSexo();
            fila[4] = empleado.getTipo();
            fila[5] = empleado.getTelefono();
            fila[6] = empleado.getDireccion();
            fila[7] = empleado.getSalario();
            fila[8] = empleado.getCorreo();
            modelo.addRow(fila);
        }
        jifListaEmpleados.jtListaMecanicos.setModel(modelo);
    }
    /* 5. Modulo Inventario */

    private void frmRegistrarRepuestos() {
        limpiar();
        jifRepuesto.jcbTipo.setSelectedIndex(0);
        ArrayList<Proveedor> proveedores = Gestor.consultarProveedor();
        jifRepuesto.jcbNitProveedor.removeAllItems();
        jifRepuesto.jcbNitProveedor.addItem("Seleccione Nit");
        for (Proveedor proveedor : proveedores) {
            jifRepuesto.jcbNitProveedor.addItem(proveedor);
        }

        jifRepuesto.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String codigo = jifRepuesto.jtfCodigo.getText();
                    String tipo = jifRepuesto.jcbTipo.getSelectedItem().toString();
                    String marca = jifRepuesto.jtfMarca.getText();
                    String cantidad = (jifRepuesto.jtfCantidad.getText());
                    String precio = jifRepuesto.jtfPrecio.getText();
                    String nit = (jifRepuesto.jcbNitProveedor.getSelectedItem().toString());
                    Repuesto rep = new Repuesto(codigo, tipo, marca, cantidad, precio, nit);
                    if (Gestor.agregarRepuesto(rep)) {
                        JOptionPane.showMessageDialog(null, "¡Datos del repuesto almacenados!", "Mecaut", JOptionPane.QUESTION_MESSAGE);
                        jifRepuesto.jcbTipo.setSelectedIndex(0);
                        limpiar();
                        jifRepuesto.jcbTipo.setSelectedIndex(0);
                        jifRepuesto.jcbNitProveedor.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos!", "Mecaut", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos...\n" + e.getMessage(), "Mecaut", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jifRepuesto.setVisible(true);
        locacionfrm(jifRepuesto);
    }

    private void frmActualizarRepuesto() {
        limpiar();
        jifActualizarRepuesto.jbtModificar.setEnabled(false);
        jifActualizarRepuesto.jbtEliminar.setEnabled(false);
        
        jifActualizarRepuesto.jbtConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ResultSet r;
                    String codigo = jifActualizarRepuesto.jtfCodigo.getText();
                    if (codigo.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese un codigo", "MECAUT", JOptionPane.ERROR_MESSAGE);
                    } else {
                        r = Gestor.TraerDatosRepuesto(codigo);
                        while (r.next()) {
                            jifActualizarRepuesto.jtfTipo.setText(r.getString(2));
                            jifActualizarRepuesto.jtfMarca.setText(r.getString(3));
                            jifActualizarRepuesto.jtfCantidad.setText(r.getString(4));
                            jifActualizarRepuesto.jtfPrecio.setText(r.getString(5));
                            jifActualizarRepuesto.jtfNitProveedor.setText(r.getString(6));
                        }
                        jifActualizarRepuesto.jbtEliminar.setEnabled(true);
                        jifActualizarRepuesto.jbtModificar.setEnabled(true);
                    }
                } catch (HeadlessException | SQLException ee) {
                    JOptionPane.showMessageDialog(null, "" + ee.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifActualizarRepuesto.jbtModificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifActualizarRepuesto.jtfCodigo.getText();
                String marca = jifActualizarRepuesto.jtfMarca.getText();
                String cant = jifActualizarRepuesto.jtfCantidad.getText();
                String precio = jifActualizarRepuesto.jtfPrecio.getText();
                if (Gestor.modificarRepuesto(cod,marca,cant,precio)) {
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente el repuesto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                }else
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el repuesto","MECAUT",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jifActualizarRepuesto.jbtEliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jifActualizarRepuesto.jtfCodigo.getText();
                int r = JOptionPane.showConfirmDialog(null, "Desea eliminar este repuesto?","MECAUT",JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION) {
                    if (Gestor.eliminarRepuesto(cod)) {
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente el repuesto","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    }else
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el repuesto","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        jifActualizarRepuesto.setVisible(true);
        locacionfrm(jifActualizarRepuesto);
    }
    
    private void evtActualizarRespuesto(){
        String codigo;
        int cantidad;
        int stockInicial;
        int stockFinal;
        for (int i = 0; i < jifFactura.jTable1.getRowCount(); i++) {
            codigo = jifFactura.jTable1.getValueAt(i, 0).toString();
            cantidad = Integer.parseInt(jifFactura.jTable1.getValueAt(i, 4).toString());
            stockInicial = Integer.parseInt(jifFactura.jTable1.getValueAt(i, 3).toString());
            stockFinal = stockInicial - cantidad; 
            String sf = ""+stockFinal;
            if(Gestor.actualizarRepuesto(codigo, sf)){ }
            else{}
        }        
    }

    private void frmListaRepuestos() {
        ArrayList<Repuesto> repuestos = Gestor.verRepuestos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Marca");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Nit proveedor");
        for (Repuesto repuesto : repuestos) {
            Object[] fila = new Object[6];
            fila[0] = repuesto.getCodigo();
            fila[1] = repuesto.getTipo();
            fila[2] = repuesto.getMarca();
            fila[3] = repuesto.getCantidad();
            fila[4] = repuesto.getPrecio();
            fila[5] = repuesto.getNitProv();
            modelo.addRow(fila);
        }
        jifListaRepuestos.jtListaRepuestos.setModel(modelo);
        jifListaRepuestos.setVisible(true);
        locacionfrm(jifListaRepuestos);
    }
    
    private void frmOrdenDePedido(){
        limpiar();
        limpiarComboBox();
        limpiarFechas();
        codigoOrdenPedido();
        limpiarTablas(jifOrdenDePedido.jTable1);
        final DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Tipo de Repuesto");
        model.addColumn("Marca");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        ResultSet nit = Gestor.NitsProveedores();
        jifOrdenDePedido.jcbNIT.removeAllItems();
        jifOrdenDePedido.jcbNIT.addItem("------");
        try {
            while(nit.next())
                jifOrdenDePedido.jcbNIT.addItem(nit.getString(1));
        } catch (Exception e) {}
        
        jifOrdenDePedido.jcbNIT.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String nit = (jifOrdenDePedido.jcbNIT.getSelectedItem() != null)?jifOrdenDePedido.jcbNIT.getSelectedItem().toString():"";
                ResultSet datos = Gestor.DatosOrden(nit);
                try {
                    while (datos.next()){
                        jifOrdenDePedido.jtfNombreProve.setText(datos.getString("prov_nombre"));
                        jifOrdenDePedido.jtfTelefono.setText(datos.getString("prov_telefono"));
                        jifOrdenDePedido.jtfDireccion.setText(datos.getString("prov_direccion"));
                    }
                } catch (Exception ex) {}
            }
        });
        
        jifOrdenDePedido.jbtAgregarRepuesto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifOrdenDePedido.jFrame1.setVisible(true);
                jifOrdenDePedido.jFrame1.setBounds(460, 270, 410, 310);
                jifOrdenDePedido.jcbTipoRep.setSelectedIndex(0);
                jifOrdenDePedido.jsCantidad.setValue(0);
                jifOrdenDePedido.jtfCodRep.setText("");
                jifOrdenDePedido.jtfMarcaRep.setText("");
                jifOrdenDePedido.jtfPrecioRep.setText("");
                ResultSet nombreRepuestos = Gestor.nomRepuestos();
                jifOrdenDePedido.jcbTipoRep.removeAllItems();
                jifOrdenDePedido.jcbTipoRep.addItem("----");
                try {
                    while(nombreRepuestos.next())
                        jifOrdenDePedido.jcbTipoRep.addItem(nombreRepuestos.getString(1));
                } catch (Exception exc) {
                }
            }
        });
        
        jifOrdenDePedido.jcbTipoRep.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String nombre = (jifOrdenDePedido.jcbTipoRep.getSelectedItem() != null)?jifOrdenDePedido.jcbTipoRep.getSelectedItem().toString():"";
                ResultSet datos = Gestor.datosRepuestoNombre(nombre);
                try {
                    while (datos.next()) {
                        jifOrdenDePedido.jtfCodRep.setText(datos.getString("rep_codigo"));
                        jifOrdenDePedido.jtfMarcaRep.setText(datos.getString("rep_marca"));
                        jifOrdenDePedido.jtfPrecioRep.setText(datos.getString("rep_precio"));
                    }
                } catch (Exception excc) {}
            }
        });
        
        jifOrdenDePedido.jbtAceptar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoRep = jifOrdenDePedido.jcbTipoRep.getSelectedItem().toString();
                String cod = jifOrdenDePedido.jtfCodRep.getText();
                String marca = jifOrdenDePedido.jtfMarcaRep.getText();
                String prec = jifOrdenDePedido.jtfPrecioRep.getText();
                String cant = String.valueOf(jifOrdenDePedido.jsCantidad.getValue());
                if ("".equals(tipoRep)||"".equals(cod)||"".equals(marca)||"".equals(prec)||"".equals(cant)) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","MECAUT",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Object[] fila = new Object[5];
                    fila[0] = cod;
                    fila[1] = tipoRep;
                    fila[2] = marca;
                    fila[3] = cant;
                    fila[4] = prec;
                    model.addRow(fila);
                    jifOrdenDePedido.jTable1.setModel(model);
                }
                jifOrdenDePedido.jFrame1.hide();
                int columnas = jifOrdenDePedido.jTable1.getRowCount();
                int total = 0,Precio,Cantidad;
                for (int i = 0; i < columnas; i++) {
                    String can = (String)jifOrdenDePedido.jTable1.getValueAt(i, 3);
                    String pre = (String) jifOrdenDePedido.jTable1.getValueAt(i, 4);
                    Cantidad = Integer.parseInt(can);
                    Precio = Integer.parseInt(pre);
                    total += Cantidad*Precio; 
                }
                jifOrdenDePedido.jtfTotal.setText(""+total);
            }
        });
        
        jifOrdenDePedido.jButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifOrdenDePedido.jFrame1.hide();
            }
        });
        
        jifOrdenDePedido.jbtRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jifOrdenDePedido.jdcFecha.getDate() == null)
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifOrdenDePedido.jcbNIT.getSelectedIndex() == 0)
                    JOptionPane.showMessageDialog(null,"Ingrese el NIT del proveedor","MECAUT",JOptionPane.WARNING_MESSAGE);
                else if(jifOrdenDePedido.jTable1.getRowCount() <= 0)
                    JOptionPane.showMessageDialog(null,"Registre al menos un repuesto","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    String cod = jifOrdenDePedido.jtfNumero.getText();
                    java.util.Date f = jifOrdenDePedido.jdcFecha.getDate();
                    SimpleDateFormat sf = new SimpleDateFormat("YY-MM-dd");
                    String fecha = sf.format(f);
                    String nitPro = jifOrdenDePedido.jcbNIT.getSelectedItem().toString();
                    String nomPro = jifOrdenDePedido.jtfNombreProve.getText();
                    String telPro = jifOrdenDePedido.jtfTelefono.getText();
                    String dirPro = jifOrdenDePedido.jtfDireccion.getText();
                    String total = jifOrdenDePedido.jtfTotal.getText();


                    if (Gestor.registrarOrdenPedido(fecha,nitPro,nomPro,telPro,dirPro,total)){
                        String[][] datos = new String[jifOrdenDePedido.jTable1.getRowCount()][5];
                        for (int k = 0; k < datos.length; k++) {
                            for (int j = 0; j < 5; j++) {
                                datos[k][j] = (String)jifOrdenDePedido.jTable1.getValueAt(k, j);
                                System.out.print(datos[k][j]+ " - ");
                            }
                            if(Gestor.actualizarRepuesto(datos[k][0], datos[k][3]))
                                    JOptionPane.showMessageDialog(null, "Se registro la orden Correctamente.","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("");
                        }

                        for (int l = 0; l < jifOrdenDePedido.jTable1.getRowCount(); l++) {
                            if (Gestor.registrarDetallesOrden(cod,datos[l][0],datos[l][1],datos[l][2],datos[l][3],datos[l][4])) {
                                System.out.println(":)");
                            }
                        }
                        limpiar();
                        jifOrdenDePedido.jcbNIT.setSelectedIndex(0);
                        jifOrdenDePedido.jdcFecha.setDate(null);
                        limpiarTablas(jifOrdenDePedido.jTable1);
                        codigoOrdenPedido();
                    }
                }
            }
        });
        
        jifOrdenDePedido.setVisible(true);
        locacionfrm(jifOrdenDePedido);
    }
    
    private void codigoOrdenPedido(){
        ResultSet cod = Gestor.codigoOrdenPedido();
        String code = "";
        try {
            while(cod.next())
                    code = cod.getString(1);
            int codigo = Integer.parseInt(code);
            jifOrdenDePedido.jtfNumero.setText(""+(++codigo));
        } catch (SQLException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null,""+e.getMessage());}
    }
    /* 6. Modulo Ventas */
    
    private void frmFactura(){
        limpiar();
        limpiarFechas();
        codigoFactura();
        jifFactura.jcbCantidad.removeAllItems();
        jifFactura.jcbCantidad.addItem("---");
        limpiarComboBox();
        limpiarTablas(jifFactura.jTable1);
        
        jifFactura.jbtConsultar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    ResultSet r;
                    String id = jifFactura.jtfIdCli.getText();
                    if (id.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese una Identificación", "MECAUT", JOptionPane.ERROR_MESSAGE);
                    } else {
                        r = Gestor.TraerDatosCliente(id);
                        while (r.next()) {
                            jifFactura.jtfNombreCli.setText(r.getString(2)+" "+r.getString(3));
                            jifFactura.jtfTelefonoCli.setText(r.getString(5));
                            jifFactura.jtfDireccionCli.setText(r.getString(6));
                            jifFactura.jtfCorreoCli.setText(r.getString(7));
                        }
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "" + e.getMessage(), "MECAUT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        TextAutoCompleter t = new TextAutoCompleter(jifFactura.jtfIdCli);
        ResultSet ids = Gestor.IdsClientes();
        try {
            while(ids.next())
                t.addItem(ids.getString("cli_id"));
        } catch (Exception e) {}
        
        ArrayList<Repuesto> repuestos = Gestor.verRepuestos();
        jifFactura.jcbCodRep.removeAllItems();
        jifFactura.jcbCodRep.addItem("Seleccione codigo");
        for (Repuesto repuesto : repuestos) {
            jifFactura.jcbCodRep.addItem(repuesto);
        }
        limpiarComboBox();
        jifFactura.jcbCodRep.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                jifFactura.jcbCantidad.removeAllItems();
                String codigo = (jifFactura.jcbCodRep.getSelectedItem() != null)?jifFactura.jcbCodRep.getSelectedItem().toString():"";
                ResultSet r = Gestor.TraerDatosRepuesto(codigo);
                try{
                    while (r.next()) {
                        jifFactura.jtfTipoRep.setText(r.getString(2));
                        jifFactura.jtfMarcaRep.setText(r.getString(3));
                        jifFactura.jtfCantidadRep.setText(r.getString(4));
                        jifFactura.jtfPrecioRep.setText(r.getString(5));
                    }
                }catch(Exception exc){}
                
                if("".equals(jifFactura.jtfCantidadRep.getText()))
                    jifFactura.jcbCantidad.addItem("0");
                else
                    for (int i = 1; i <= Integer.parseInt(jifFactura.jtfCantidadRep.getText()); i++) 
                        jifFactura.jcbCantidad.addItem(i);
            }
        });
        final DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Marca");
        modelo.addColumn("Stock");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        jifFactura.jbtAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String codgoRepuesto = jifFactura.jcbCodRep.getSelectedItem().toString();
                String tipoRepuesto = jifFactura.jtfTipoRep.getText();
                String marcaRepusto = jifFactura.jtfMarcaRep.getText();
                String stockRepuesto = jifFactura.jtfCantidadRep.getText();
                String cantidadRepuesto = jifFactura.jcbCantidad.getSelectedItem().toString();
                String precioRepueto = jifFactura.jtfPrecioRep.getText();
                Object[] fila = new Object[6];
                fila[0] = codgoRepuesto;
                fila[1] = tipoRepuesto;
                fila[2] = marcaRepusto;
                fila[3] = stockRepuesto;
                fila[4] = cantidadRepuesto;
                fila[5] = precioRepueto;
                modelo.addRow(fila);
                jifFactura.jTable1.setModel(modelo);
                evtCalcularFactura();
            }

        });
        jifFactura.jbtRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String idCliente = jifFactura.jtfIdCli.getText();
                    if(jifFactura.jdcFecha.getDate() == null)
                        JOptionPane.showMessageDialog(null, "Ingrese una fecha","MECAUT",JOptionPane.WARNING_MESSAGE);
                    else if(idCliente.isEmpty())
                        JOptionPane.showMessageDialog(null, "Ingrese la identificaciój del cliente","MECAUT",JOptionPane.WARNING_MESSAGE);
                    else if(jifFactura.jcbCodRep.getSelectedIndex() == 0)
                        JOptionPane.showMessageDialog(null, "Ingrese un repuesto","MECAUT",JOptionPane.WARNING_MESSAGE);
                    else if(jifFactura.jTable1.getRowCount() == 0)
                        JOptionPane.showMessageDialog(null, "Ingresa al menos un producto","MECAUT",JOptionPane.WARNING_MESSAGE);
                    else{
                        String numero = jifFactura.jtfNumFactura.getText();
                        java.util.Date fecha = jifFactura.jdcFecha.getDate();
                        java.sql.Date fechaa = new java.sql.Date(fecha.getTime());
                        
                        String nombreCliente = jifFactura.jtfNombreCli.getText();
                        String total = jifFactura.lblTotal.getText();
                        if (numero.isEmpty() || idCliente.isEmpty() || nombreCliente.isEmpty()) {
                            /* Esta Condición es para que no salga error cuando se abre el formulario por 2da vez */
                        } else {
                            Factura fac = new Factura(Integer.parseInt(numero), fechaa, idCliente, nombreCliente, total);
                            if (Gestor.registrarFactura(fac)) {
                                evtRegistrarDetalleFactura();
                                evtActualizarRespuesto();
                                JOptionPane.showMessageDialog(null, "Se registro la factura correctamente","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                                limpiar();
                                codigoFactura();
                                limpiarTablas(jifFactura.jTable1);
                                limpiarComboBox();
                                limpiarFechas();
                            } else {
                                JOptionPane.showMessageDialog(null, "¡No se pudieron almacenar los datos","MECAUT",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                } catch (HeadlessException e) {

                }
            }
        });
        jifFactura.setVisible(true);
    }
    
    private void codigoFactura(){
        ResultSet code;
        code = Gestor.codigoFactura();
        String n = "";
        try {
            while(code.next())
                n = code.getString(1);
            int codigo = Integer.parseInt(n);
            jifFactura.jtfNumFactura.setText(""+(++codigo));
        } catch (SQLException | NumberFormatException e) {}
    }
    
    private void evtRegistrarDetalleFactura() {
        for (int i = 0; i < jifFactura.jTable1.getRowCount(); i++) {
            String numero = jifFactura.jtfNumFactura.getText();
            String repCodigo = jifFactura.jTable1.getValueAt(i, 0).toString();
            String repTipo = jifFactura.jTable1.getValueAt(i, 1).toString();
            String repMarca = jifFactura.jTable1.getValueAt(i, 2).toString();
            String repCantidad = jifFactura.jTable1.getValueAt(i, 4).toString();
            String repPrecio = jifFactura.jTable1.getValueAt(i, 5).toString();
            DetalleFactura det = new DetalleFactura(numero, repCodigo, repTipo, repMarca, repCantidad, repPrecio);
            boolean registrarDetalleFactura;
            registrarDetalleFactura = Gestor.registrarDetalleFactura(det);
        }
    }
    
    private void evtCalcularFactura() {
        String pre;
        String can;
        double total = 0;

        for (int i = 0; i < jifFactura.jTable1.getRowCount(); i++) {
            pre = jifFactura.jTable1.getValueAt(i, 5).toString();
            can = jifFactura.jTable1.getValueAt(i, 4).toString();
            total += Double.parseDouble(pre) * Integer.parseInt(can);
        }
        jifFactura.lblTotal.setText(Double.toString(total));
    }
    
    private void frmListaFacturas(){
        ArrayList<Factura> lista = Gestor.consultarFacturas();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Nombre Cliente");
        modelo.addColumn("Total Factura");
        for(Factura fac : lista){
            Object[] fila = new Object[5];
            fila[0] = fac.getNumero();
            fila[1] = fac.getFecha();
            fila[2] = fac.getIdCliente();
            fila[3] = fac.getNombreCliente();
            fila[4] = fac.getTotal();
            modelo.addRow(fila);
        }
        jifListaFacturas.tablaFacturas.setModel(modelo);
        jifListaFacturas.registros.setText(""+jifListaFacturas.tablaFacturas.getRowCount());
        jifListaFacturas.setVisible(true);
        locacionfrm(jifListaFacturas);
    }
    
    private void evtIniciarSesion() {
        try {
            String usuario = Login.jtfUsuario.getText();
            String contrasena = Login.jtfContraseña.getText();
            String[] r = Gestor.validarUsuario(usuario,contrasena);
            if("Inactiva".equals(r[2])){
                int res = JOptionPane.showConfirmDialog(null, "La cuenta a la que esta intentando ingresar esta desactivada...\n\n¿Quieres Activar tu Cuenta de Nuevo?","MECAUT",JOptionPane.YES_NO_OPTION);
                if(res == JOptionPane.YES_OPTION){
                    String clave = JOptionPane.showInputDialog(null, "Ingrese su Contraseña", "MECAUT - Activar Tu Cuenta",JOptionPane.QUESTION_MESSAGE);
                    if (Gestor.activarCuenta(usuario,clave)) {
                        r = Gestor.validarUsuario(usuario,clave);
                        lanzarFormularioAdministrador(r[1]);
                        Login.setVisible(false);
                    }
                }
            }else{
                switch (r[0]) {
                case "administrador":
                    lanzarFormularioAdministrador(r[1]);
                    break;
                case "cliente":
                    lanzarFormularioCliente(r[1]);
                    break;
                case "empleado":
                    lanzarFormularioEmpleado(r[1]);
                }
                Login.setVisible(false);
            }
        } catch (HeadlessException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "¡¡¡ Los Datos Ingresados Son Incorrectos !!!\n\n\tVerifiquelos Nuevamente....", "MECAUT - Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void frmConfiguracionAdministrador(String id){
        
        ResultSet datos;
        datos = Gestor.traerDatosEmpleado(id);
        try {
            while(datos.next()){
                jifConfiguracionAdmin.jtfNombre.setText(datos.getString("emp_nombre"));
                jifConfiguracionAdmin.jtfApellidos.setText(datos.getString("emp_apellidos"));
                jifConfiguracionAdmin.jtfTelefono.setText(datos.getString("emp_telefono"));
                jifConfiguracionAdmin.jtfDireccion.setText(datos.getString("emp_direccion"));
                jifConfiguracionAdmin.jtfCorreo.setText(datos.getString("emp_correo"));
            }
        } catch (Exception e) {}
        
        jifConfiguracionAdmin.lblDesactivarCuenta.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] d = form.user.getToolTipText().split(" ");
                String contraseña = JOptionPane.showInternalInputDialog(jifConfiguracionAdmin, "Ingrese su Contraseña", "MECAUT - Desactivar Tu Cuenta", JOptionPane.QUESTION_MESSAGE);
                if (contraseña.isEmpty())
                    JOptionPane.showMessageDialog(null, "No ingreso ninguna contraseña","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    if(Gestor.desactivarCuenta(d[3],contraseña)){
                        limpiarInicio();
                        form.setVisible(false);
                        Login.setVisible(true);
                        Login.jtfUsuario.setText("");
                        Login.jtfContraseña.setText("");
                        Login.jtfUsuario.requestFocus();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"No se pudo desactivar la cuenta","MECAUT",JOptionPane.ERROR_MESSAGE);
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                jifConfiguracionAdmin.lblDesactivarCuenta.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jifConfiguracionAdmin.lblDesactivarCuenta.setForeground(Color.black);
            }
        });
        
        jifConfiguracionAdmin.jbtActualizarContraseña.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] d = form.user.getToolTipText().split(" ");
                String contrasenaVieja = jifConfiguracionAdmin.jtfContrasenaActual.getText();
                String contrasenaNueva = jifConfiguracionAdmin.jtfNuevaContrasena.getText();
                String confContrasena = jifConfiguracionAdmin.jtfConfirmarContrasena.getText();
                if(contrasenaNueva == null ? confContrasena != null : !contrasenaNueva.equals(confContrasena))
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden","MECAUT",JOptionPane.WARNING_MESSAGE);
                else{
                    String[] v = Gestor.validarUsuario(d[3], contrasenaVieja);
                    if (v == null) {
                        JOptionPane.showMessageDialog(null, "La contraseña es incorrecta","MECAUT",JOptionPane.ERROR_MESSAGE);
                        jifConfiguracionAdmin.jtfContrasenaActual.requestFocus();
                    }
                    else{
                        if (Gestor.cambiarContrasena(v[1],contrasenaVieja,contrasenaNueva)) {
                            JOptionPane.showMessageDialog(null, "Se cambio la contraseña correctamente","MECAUT",JOptionPane.INFORMATION_MESSAGE);
                            jifConfiguracionAdmin.jtfConfirmarContrasena.setText(null);
                            jifConfiguracionAdmin.jtfContrasenaActual.setText(null);
                            jifConfiguracionAdmin.jtfNuevaContrasena.setText(null);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "No se pudo cambiar la contraseña","MECAUT",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        
        jifConfiguracionAdmin.jbtActualizarDatos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String apellidos = jifConfiguracionAdmin.jtfApellidos.getText();
                String telefono = jifConfiguracionAdmin.jtfTelefono.getText();
                String direccion = jifConfiguracionAdmin.jtfDireccion.getText();
                String correo = jifConfiguracionAdmin.jtfCorreo.getText();
                if(apellidos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese un apellido","MECAUT",JOptionPane.WARNING_MESSAGE);
                    jifConfiguracionAdmin.jtfApellidos.requestFocus();
                }else if(telefono.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese un telefono","MECAUT",JOptionPane.WARNING_MESSAGE);
                    jifConfiguracionAdmin.jtfTelefono.requestFocus();
                }else if(direccion.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese una dirección","MECAUT",JOptionPane.WARNING_MESSAGE);
                    jifConfiguracionAdmin.jtfDireccion.requestFocus();
                }else if(correo.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese un correo eléctronico","MECAUT",JOptionPane.WARNING_MESSAGE);
                    jifConfiguracionAdmin.jtfCorreo.requestFocus();
                }else{
                    String[] d = form.user.getToolTipText().split(" ");
                    Empleados emp = new Empleados(d[1], jifConfiguracionAdmin.jtfNombre.getText(), apellidos, null , "Administrador", telefono, direccion, correo, null);
                    if(Gestor.modificarEmpleado(emp)){
                        JOptionPane.showMessageDialog(null, "Se modifico los datos correctamente","MECAUT",JOptionPane.WARNING_MESSAGE);
                        ResultSet datos;
                        datos = Gestor.traerDatosEmpleado(d[1]);
                        try {
                            while(datos.next()){
                                jifConfiguracionAdmin.jtfNombre.setText(datos.getString("emp_nombre"));
                                jifConfiguracionAdmin.jtfApellidos.setText(datos.getString("emp_apellidos"));
                                jifConfiguracionAdmin.jtfTelefono.setText(datos.getString("emp_telefono"));
                                jifConfiguracionAdmin.jtfDireccion.setText(datos.getString("emp_direccion"));
                                jifConfiguracionAdmin.jtfCorreo.setText(datos.getString("emp_correo"));
                            }
                        } catch (Exception ex) {}
                    }
                }
            }
        });
        
        jifConfiguracionAdmin.jTabbedPane1.setVisible(false);
        
        jifConfiguracionAdmin.jmiCambiarContrasena.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifConfiguracionAdmin.jTabbedPane1.setVisible(true);
                jifConfiguracionAdmin.jTabbedPane1.setSelectedIndex(0);
            }
        });
        
        jifConfiguracionAdmin.jmiActualizarDatos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jifConfiguracionAdmin.jTabbedPane1.setVisible(true);
                jifConfiguracionAdmin.jTabbedPane1.setSelectedIndex(1);
            }
        });
        
        jifConfiguracionAdmin.setVisible(true);
        locacionfrm(jifConfiguracionAdmin);
    }
    
    private void frmConfiguracion(){
        String usuario = frmCliente.user.getText();
        jifUpdateContraseñaCli.jtfUsuario.setText(usuario);

        jifUpdateContraseñaCli.jbtModificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String usuario = jifUpdateContraseñaCli.jtfUsuario.getText();
                String contra = jifUpdateContraseñaCli.jpContrasena.getText();
                if (isPasswordCorrect(jifUpdateContraseñaCli.jpContrasena.getPassword(), jifUpdateContraseñaCli.jpContrasena2.getPassword())) {
                    if(Gestor.UpdateContraseñaCliente(contra, usuario)){
                        JOptionPane.showMessageDialog(null, "Contraseña modificada exitosamente");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No se pudo modificar la contraseña");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique que las contraseñas sean iguales");
                }
            }
        });

        jifUpdateContraseñaCli.setVisible(true);
    }
    
    private boolean isPasswordCorrect(char[] j1, char[] j2) {
        boolean valor = false;
        int puntero = 0;
        if (j1.length != j2.length) {
            valor = false;
        } else {
            while ((!valor) && (puntero < j1.length)) {
                if (j1[puntero] != j2[puntero]) {
                    valor = false;
                } else {
                    valor = true;
                }
            }
        }
        return valor;
    }
    
    //Limpia todos los jtextField de los formulario
    private void limpiar(){
        jifSolicitarMantenimiento.jtfPlaca.setText("");
        jifSolicitarMantenimiento.jtfCiudad.setText("");
        jifSolicitarMantenimiento.jtfMarca.setText("");
        jifSolicitarMantenimiento.jtfModelo.setText("");
        jifRegistroAuto.jtfCombustible.setText("");
        jifRegistroAuto.jtfKilometraje.setText("");
        jifRegistroAuto.jtfPlaca.setText("");
        jifPromociones.jtfCodigoA.setText("");
        jifPromociones.jtfDescripcionA.setText("");
        jifPromociones.jtfDescripcionN.setText("");
        jifActualizarEmpleado.jtfTipo1.setText("");
        jifFactura.lblTotal.setText("");
        jifVerFichaAuto.jtfCilindraje.setText("");
        jifVerFichaAuto.jtfColor.setText("");
        jifVerFichaAuto.jtfFrenos.setText("");
        jifVerFichaAuto.jtfMotor.setText("");
        jifVerFichaAuto.fActualizacion.setText("");
        jifVerFichaAuto.fRegistro.setText("");
        jifVerFichaAuto.jtfPotencia.setText("");
        jifFichaAuto.jtfCilindraje.setText("");
        jifFichaAuto.jtfColor.setText("");
        jifFichaAuto.jtfFrenos.setText("");
        jifFichaAuto.jtfIdCliente.setText("");
        jifFichaAuto.jtfMotor.setText("");
        jifFichaAuto.jtfNombreCliente.setText("");
        jifFichaAuto.jtfPotencia.setText("");
        jifCliente.jtfNombre.setText("");
        jifCliente.jtfApellidos.setText("");
        jifCliente.jtfDireccion.setText("");
        jifCliente.jtfCorreo.setText("");
        jifCliente.jtfTelefono.setText("");
        jifCliente.jtfIdentificacion.setText("");
        jifActualizarCliente.jtfIdentificacion.setText("");
        jifActualizarCliente.jtfNombre.setText("");
        jifActualizarCliente.jtfApellidos.setText("");
        jifActualizarCliente.jtfCorreo.setText("");
        jifActualizarCliente.jtfTelefono.setText("");
        jifActualizarCliente.jtfDireccion.setText("");
        jifAuto.jtfPlaca.setText("");
        jifAuto.jtfNombreCliente.setText("");
        jifAuto.jtfCombustible.setText("");
        jifAuto.jtfKilometraje.setText("");
        jifGrupoClientes.jtfId.setText("");
        jifEmpleado.jtfIdentificacion.setText("");
        jifEmpleado.jtfNombre.setText("");
        jifEmpleado.jtfApellidos.setText("");
        jifEmpleado.jtfTelefono.setText("");
        jifEmpleado.jtfDireccion.setText("");
        jifEmpleado.jtfCorreo.setText("");
        jifEmpleado.jtfSalario.setText("");
        jifActualizarEmpleado.jtfId.setText("");
        jifActualizarEmpleado.jtfNombre.setText("");
        jifActualizarEmpleado.jtfApellidos.setText("");
        jifActualizarEmpleado.jtfTelefono.setText("");
        jifActualizarEmpleado.jtfDireccion.setText("");
        jifActualizarEmpleado.jtfSalario.setText("");
        jifActualizarEmpleado.jtfCorreo.setText("");
        jifProveedor.jtfNit.setText("");
        jifProveedor.jtfNombre.setText("");
        jifProveedor.jtfDireccion.setText("");
        jifProveedor.jtfTelefono.setText("");
        jifProveedor.jtaDescripcion.setText("");
        jifActualizarProveedor.jtfNombre.setText("");
        jifActualizarProveedor.jtaDescripcion.setText("");
        jifActualizarProveedor.jtfDireccion.setText("");
        jifActualizarProveedor.jtfTelefono.setText("");
        jifRepuesto.jtfMarca.setText("");
        jifRepuesto.jtfCantidad.setText("");
        jifRepuesto.jtfPrecio.setText("");
        jifRepuesto.jtfCodigo.setText("");
        jifActualizarRepuesto.jtfCodigo.setText("");
        jifActualizarRepuesto.jtfCantidad.setText("");
        jifActualizarRepuesto.jtfMarca.setText("");
        jifActualizarRepuesto.jtfNitProveedor.setText("");
        jifActualizarRepuesto.jtfPrecio.setText("");
        jifActualizarRepuesto.jtfCantidad.setText("");
        jifActualizarRepuesto.jtfTipo.setText("");
        jifMantenimiento.jtfObservaciones.setText("");
        jifMantenimiento.jtfCosto.setText("");
        jifMantenimiento.jtfPlaca.setText("");
        jifMantenimiento.jtfplaca.setText("");
        jifMantenimiento.jtfCliNombre.setText("");
        jifMantenimiento.jtfIdCliente.setText("");
        jifMantenimiento.jtfNombreMecanico1.setText("");
        jifMantenimiento.jtfdescripcion.setText("");
        jifMantenimiento.jtfNombreMecanico1.setText("");
        jifMantenimiento.jtfnombreRepuesto.setText("");
        jifMantenimiento.jtfNombreCliente.setText("");
        jifActualizarMantenimiento.jtfCosto.setText("");
        jifActualizarMantenimiento.jtfObsevaciones.setText("");
        jifActualizarMantenimiento.jtfEstado.setText("");
        jifActualizarMantenimiento.jtfFecha.setText("");
        jifActualizarMantenimiento.jtfIdCliente.setText("");
        jifActualizarMantenimiento.jtfNombreCliente.setText("");
        jifActualizarMantenimiento.jtfPlaca.setText("");
        jifActualizarMantenimiento.jtfIdEmpleado.setText("");
        jifActualizarMantenimiento.jtfNombreEmpleado.setText("");
        jifReservas.jtfIdentificacion.setText("");
        jifReservas.jtfNombre.setText("");
        jifReservas.jtfTelefono.setText("");
        jifReservas.jtfCorreo.setText("");
        jifReservas.jtfPlaca.setText("");
        jifReservas.jtfMarca.setText("");
        jifReservas.jtfModelo.setText("");
        jifReservas.jtfNombreEmpleado.setText("");
        jifReservas.jtfObservaciones.setText("");
        jifCuentas.jtfUsuario.setText("");
        jifCuentas.jtfcontrasena.setText("");
        jifCuentas.jtfconfContrasena.setText("");
        jifCuentas.jtfIdentificacionCli.setText("");
        jifCuentas.jtfNombrec.setText("");
        jifCuentas.jtfApellidosc.setText("");
        jifCuentas.jtfTelefonoc.setText("");
        jifCuentas.jtfDireccionc.setText("");
        jifCuentas.jtfCorreoc.setText("");
        jifCuentas.jtfIdentificacion1.setText("");
        jifCuentas.jtfNombre1.setText("");
        jifCuentas.jtfApellidos1.setText("");
        jifCuentas.jtfTelefono1.setText("");
        jifCuentas.jtfDireccion1.setText("");
        jifCuentas.jtfCorreo1.setText("");
        jifCuentas.jtfSalario.setText("");
        jifOrdenDePedido.jtfNombreProve.setText("");
        jifOrdenDePedido.jtfTelefono.setText("");
        jifOrdenDePedido.jtfDireccion.setText("");
        jifOrdenDePedido.jtfTotal.setText("");
        jifCotizacion.jtfNombreCliente.setText("");
        jifCotizacion.jtfValorMantenimiento.setText("");
        jifCotizacion.jtfCodigo.setText("");
        jifCotizacion.jtfObservaciones.setText("");
        jifCotizacion.jtfValorCotizacion.setText("");
        jifFactura.jtfIdCli.setText("");
        jifFactura.jtfNombreCli.setText("");
        jifFactura.jtfTelefonoCli.setText("");
        jifFactura.jtfDireccionCli.setText("");
        jifFactura.jtfCorreoCli.setText("");
        jifFactura.jtfTipoRep.setText("");
        jifFactura.jtfMarcaRep.setText("");
        jifFactura.jtfCantidadRep.setText("");
        jifFactura.jtfPrecioRep.setText("");
        jifHistMantenimiento.jtfIdCliente.setText("");
        jifHistMantenimiento.jtfPlaca.setText("");
    }

    private void locacionfrm(JInternalFrame j) {
        j.setLocation(350, 20);
    }
    
    private void limpiarTablas(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int a =tabla.getRowCount()-1;
        for(int i=a;i>=0;i--)
            modelo.removeRow(i);
    }
    
    private void limpiarComboBox(){
        jifRegistroAuto.jcbCiudad.setSelectedIndex(0);
        jifRegistroAuto.jcbMarca.setSelectedIndex(0);
        jifRegistroAuto.jcbModelo.setSelectedIndex(0);
        jifRegistroAuto.jcbTipo.setSelectedIndex(0);
        jifPromociones.jcbEstadoA.setSelectedIndex(0);
        jifPromociones.jcbEstadoN.setSelectedIndex(0);
        jifPromociones.jcbTipoA.setSelectedIndex(0);
        jifPromociones.jcbTipoN.setSelectedIndex(0);
        jifReservas.jcbIdMecanico.setSelectedIndex(0);
        jifAuto.jcbIdCliente.setSelectedIndex(0);
        jifActualizarCliente.jcbSexo.setSelectedIndex(0);
        jifActualizarEmpleado.jcbSexo.setSelectedIndex(0);
        jifCliente.jcbSexo.setSelectedIndex(0);
        jifFactura.jcbCodRep.setSelectedIndex(0);
        jifFactura.jcbCantidad.setSelectedIndex(0);
        jifOrdenDePedido.jcbNIT.setSelectedIndex(0);
        jifCuentas.jcbTipoCuenta.setSelectedIndex(0);
        jifCuentas.jcbSexo1.setSelectedIndex(0);
        jifCuentas.jcbSexoc.setSelectedIndex(0);
        jifCuentas.jcbTipo.setSelectedIndex(0);
        jifCuentas.jcbTipoCuenta.setSelectedIndex(0);
        jifGrupoClientes.jcbcodigoGrupo.setSelectedIndex(0);
        jifGrupoClientes.jcbNombregrupo.setSelectedIndex(0);
        jifGrupoClientes.jcbEstado.setSelectedItem(0);
        jifGrupoClientes.jcbEstado.setSelectedIndex(0);
        jifAuto.jcbCiudad.setSelectedIndex(0);
        jifAuto.jcbMarca.setSelectedIndex(0);
        jifAuto.jcbModelo.setSelectedIndex(0);
        jifAuto.jcbTipo.setSelectedIndex(0);
        jifMantenimiento.jcbIdMecanico1.setSelectedIndex(0);
        jifMantenimiento.jcbcodRepuesto.setSelectedIndex(0);
        jifCotizacion.jcbIdCliente.setSelectedIndex(0);
        jifFichaAuto.jcbPlaca.setSelectedIndex(0);
        jifFichaAuto.jcbTransmision.setSelectedIndex(0);
        jifFichaAuto.jcbTransmision.setSelectedIndex(0);
        jifVerFichaAuto.jcbPlacas.setSelectedIndex(0);
        jifVerFichaAuto.jcbTransmision.setSelectedIndex(0);
        jifVerFichaAuto.jcbTransmision.setSelectedIndex(0);
        jifEmpleado.jcbSexo.setSelectedIndex(0);
        jifEmpleado.jcbTipo.setSelectedIndex(0);
    }
    
    private void limpiarFechas(){
        jifPromociones.jdcFechaA.setDate(null);
        jifPromociones.jdcFechaN.setDate(null);
        jifOrdenDePedido.jdcFecha.setDate(null);
        jifMantenimiento.jdcFecha.setDate(null);
        jifMantenimiento.jdcFechaInicio.setDate(null);
        jifHistMantenimiento.jdcFecha.setDate(null);
        jifReservas.jdcFecha.setDate(null);
        jifCotizacion.jdcFecha.setDate(null);
        jifFactura.jdcFecha.setDate(null);
    }
    
    private void limpiarInicio(){
        jifActualizarCliente.setVisible(false);
        jifActualizarEmpleado.setVisible(false);
        jifActualizarMantenimiento.setVisible(false);
        jifActualizarProveedor.setVisible(false);
        jifActualizarRepuesto.setVisible(false);
        jifAuto.setVisible(false);
        jifCliente.setVisible(false);
        jifCotizacion.setVisible(false);
        jifCuentas.setVisible(false);
        jifEmpleado.setVisible(false);
        jifFactura.setVisible(false);
        jifFichaAuto.setVisible(false);
        jifGrupoClientes.setVisible(false);
        jifHistMantenimiento.setVisible(false);
        jifListaAutos.setVisible(false);
        jifListaClientes.setVisible(false);
        jifListaEmpleados.setVisible(false);
        jifListaMantenimientos.setVisible(false);
        jifListaProveedores.setVisible(false);
        jifListaFacturas.setVisible(false);
        jifListaRepuestos.setVisible(false);
        jifMantenimiento.setVisible(false);
        jifOrdenDePedido.setVisible(false);
        jifProveedor.setVisible(false);
        jifRepuesto.setVisible(false);
        jifReservas.setVisible(false);
        jifConfiguracionAdmin.setVisible(false);
    }
}
