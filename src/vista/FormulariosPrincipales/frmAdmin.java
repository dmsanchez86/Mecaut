package vista.FormulariosPrincipales;

import controlador.Controlador;
import controlador.ControladorLogin;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* @author Grupo - MECAUT */
public class frmAdmin extends javax.swing.JFrame {

    public frmAdmin() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../iconos/icono2.png"));
        setIconImage(icon);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        conection = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmiCliente = new javax.swing.JMenu();
        jmiRegistrarCliente = new javax.swing.JMenuItem();
        jmiActualizarCliente = new javax.swing.JMenuItem();
        jmiListaCliente = new javax.swing.JMenuItem();
        jmiCuentas = new javax.swing.JMenu();
        jmiRegistrarCuenta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiRegistrarAuto = new javax.swing.JMenuItem();
        jmiListaAutos = new javax.swing.JMenuItem();
        jmiGrupoClientes = new javax.swing.JMenuItem();
        jmServicios = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmiRegistrarMantenimiento = new javax.swing.JMenuItem();
        jmiActualizarMantenimiento = new javax.swing.JMenuItem();
        jmiMantenimientosPendientes = new javax.swing.JMenuItem();
        jmiListaMantenimientos = new javax.swing.JMenuItem();
        jmiReservas = new javax.swing.JMenuItem();
        jmiHistMantenimiento = new javax.swing.JMenuItem();
        jmiPromociones = new javax.swing.JMenuItem();
        jmiManuales = new javax.swing.JMenuItem();
        jmiCotizacion = new javax.swing.JMenuItem();
        jmiFichaRecepcion = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenu();
        jmiProveedor = new javax.swing.JMenu();
        jmiRegitrarProveedor = new javax.swing.JMenuItem();
        jmiActualizarProveedor = new javax.swing.JMenuItem();
        jmiListaProveedores = new javax.swing.JMenuItem();
        jmiDevoluciones = new javax.swing.JMenuItem();
        jmPersonal = new javax.swing.JMenu();
        jmiEmpleados = new javax.swing.JMenu();
        jmiRegistrarMecanico = new javax.swing.JMenuItem();
        jmiActualizarMecanico = new javax.swing.JMenuItem();
        jmiListaEmpleados = new javax.swing.JMenuItem();
        jmInventario = new javax.swing.JMenu();
        jmiOrdenPedido = new javax.swing.JMenuItem();
        jmiRepuestos = new javax.swing.JMenu();
        jmiRegistrarRepuestos = new javax.swing.JMenuItem();
        jmiActualizarRepuesto = new javax.swing.JMenuItem();
        jmiCuentasPagar = new javax.swing.JMenuItem();
        jmiInventarioDisponible = new javax.swing.JMenuItem();
        jmVentas = new javax.swing.JMenu();
        jmiFactura = new javax.swing.JMenu();
        jmiRegistrarFactura = new javax.swing.JMenuItem();
        jmiActualizarFactura = new javax.swing.JMenuItem();
        jmiListaFacturas = new javax.swing.JMenuItem();
        jmiOrdenesServicio = new javax.swing.JMenuItem();
        jmiObtenerCotizacion = new javax.swing.JMenuItem();
        jmiCreditos = new javax.swing.JMenuItem();
        jmReportes = new javax.swing.JMenu();
        jmiReporteClientes = new javax.swing.JMenuItem();
        jmiReporteEmpleados = new javax.swing.JMenuItem();
        jmiReporteAutos = new javax.swing.JMenuItem();
        jmiReporteProveedores = new javax.swing.JMenuItem();
        jmiReporteMantenimientos = new javax.swing.JMenuItem();
        jmiReporteInventario = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();
        jmiConfiguracion = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();

        jPopupMenu1.setInvoker(jDesktopPane1);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412573336_gear_16.png"))); // NOI18N
        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553092_note_edit.png"))); // NOI18N
        jMenu3.setText("jMenu3");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFocusTraversalPolicyProvider(true);
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553282_group.png"))); // NOI18N
        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem2);

        jMenuItem4.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552722_stock_contact.png"))); // NOI18N
        jMenuItem4.setText("jMenuItem3");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem4);

        jMenuItem5.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574606_clock_16.png"))); // NOI18N
        jMenuItem5.setText("jMenuItem3");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem5);

        jMenuItem12.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412572886_CabrioletRed.png"))); // NOI18N
        jMenuItem12.setText("jMenuItem12");
        jMenuItem12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem12);

        jPopupMenu1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jMenu4.setText("jMenu3");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFocusTraversalPolicyProvider(true);
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem6.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553282_group.png"))); // NOI18N
        jMenuItem6.setText("jMenuItem2");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem6);

        jMenuItem7.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552722_stock_contact.png"))); // NOI18N
        jMenuItem7.setText("jMenuItem3");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem7);

        jMenuItem8.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554340_area_chart.png"))); // NOI18N
        jMenuItem8.setText("jMenuItem3");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem8);

        jPopupMenu1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554636_file-manager.png"))); // NOI18N
        jMenu5.setText("jMenu3");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFocusTraversalPolicyProvider(true);
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem9.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jMenuItem9.setText("jMenuItem2");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(jMenuItem9);

        jMenuItem10.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jMenuItem10.setText("jMenuItem3");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(jMenuItem10);

        jMenuItem11.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jMenuItem11.setText("jMenuItem3");
        jMenuItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(jMenuItem11);

        jPopupMenu1.add(jMenu5);
        jPopupMenu1.add(jSeparator1);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574673_Options.png"))); // NOI18N
        jMenu6.setText("jMenu6");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem3);

        jMenuItem13.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem13.setText("jMenuItem13");
        jMenuItem13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem14.setText("jMenuItem14");
        jMenuItem14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem15.setText("jMenuItem3");
        jMenuItem15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem16.setText("jMenuItem3");
        jMenuItem16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem17.setText("jMenuItem3");
        jMenuItem17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem18.setText("jMenuItem3");
        jMenuItem18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem19.setText("jMenuItem3");
        jMenuItem19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem19);

        jPopupMenu1.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MECAUT - Administrador");
        setFocusable(false);
        setIconImage(getIconImage());

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jDesktopPane1.setComponentPopupMenu(jPopupMenu1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Wallpaper-auto-concept-neon-tuning-desktop1.jpg"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1465, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        user.setFont(new java.awt.Font("Purisa", 3, 13)); // NOI18N
        user.setText(" ");

        conection.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        conection.setForeground(new java.awt.Color(255, 142, 41));
        conection.setToolTipText("Estado de la Conexión");

        jLabel2.setFont(new java.awt.Font("Purisa", 2, 15)); // NOI18N
        jLabel2.setText("Estado:");

        jMenuBar1.setToolTipText("");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.setName(""); // NOI18N

        jmClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente-icono-8749-48.png"))); // NOI18N
        jmClientes.setText("Clientes");
        jmClientes.setToolTipText("Modulo Clientes");
        jmClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmClientes.setMargin(new java.awt.Insets(5, 0, 5, 10));
        jmClientes.setName(""); // NOI18N

        jmiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553282_group.png"))); // NOI18N
        jmiCliente.setText("Clientes");
        jmiCliente.setToolTipText("");
        jmiCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarCliente.setText("Nuevo");
        jmiRegistrarCliente.setToolTipText("Registrar un Nuevo Cliente");
        jmiRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCliente.add(jmiRegistrarCliente);

        jmiActualizarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarCliente.setText("Modificar");
        jmiActualizarCliente.setToolTipText("Modificar o Eliminar un Cliente");
        jmiActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCliente.add(jmiActualizarCliente);

        jmiListaCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaCliente.setText("Consultar");
        jmiListaCliente.setToolTipText("Ver Todos los Clientes");
        jmiListaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCliente.add(jmiListaCliente);

        jmClientes.add(jmiCliente);

        jmiCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552722_stock_contact.png"))); // NOI18N
        jmiCuentas.setText("Cuentas");
        jmiCuentas.setToolTipText("");
        jmiCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCuentas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarCuenta.setText("Nueva");
        jmiRegistrarCuenta.setToolTipText("Registrar una nueva cuenta");
        jmiRegistrarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCuentas.add(jmiRegistrarCuenta);

        jmClientes.add(jmiCuentas);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412572886_CabrioletRed.png"))); // NOI18N
        jMenu1.setText("Auto");
        jMenu1.setToolTipText("");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarAuto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarAuto.setText("Nuevo");
        jmiRegistrarAuto.setToolTipText("Registrar un Auto a un Cliente");
        jmiRegistrarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(jmiRegistrarAuto);

        jmiListaAutos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaAutos.setText("Consultar");
        jmiListaAutos.setToolTipText("Ver Todos los Autos Registrados");
        jmiListaAutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(jmiListaAutos);

        jmClientes.add(jMenu1);

        jmiGrupoClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiGrupoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553320_testimonials.png"))); // NOI18N
        jmiGrupoClientes.setText("Grupos de Clientes");
        jmiGrupoClientes.setToolTipText("Grupos de Clientes");
        jmiGrupoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmClientes.add(jmiGrupoClientes);

        jMenuBar1.add(jmClientes);

        jmServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gerente-de-servicio-icono-4188-64.png"))); // NOI18N
        jmServicios.setText("Servicios");
        jmServicios.setToolTipText("Modulo Servicios");
        jmServicios.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmServicios.setMargin(new java.awt.Insets(5, 0, 5, 10));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412573336_gear_16.png"))); // NOI18N
        jMenu2.setText("Mantenimientos");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarMantenimiento.setText("Nuevo");
        jmiRegistrarMantenimiento.setToolTipText("Registrar un Mantenimiento");
        jmiRegistrarMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jmiRegistrarMantenimiento);

        jmiActualizarMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarMantenimiento.setText("Modificar");
        jmiActualizarMantenimiento.setToolTipText("Modificar o Eliminar un Mantenimiento");
        jmiActualizarMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jmiActualizarMantenimiento);

        jmiMantenimientosPendientes.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiMantenimientosPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574586_warning_16.png"))); // NOI18N
        jmiMantenimientosPendientes.setText("Pendientes");
        jmiMantenimientosPendientes.setToolTipText("Ver Mantenimientos Pendientes");
        jmiMantenimientosPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jmiMantenimientosPendientes);

        jmiListaMantenimientos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaMantenimientos.setText("Buscar");
        jmiListaMantenimientos.setToolTipText("Ver todos los mantenimientos realzados");
        jmiListaMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jmiListaMantenimientos);

        jmServicios.add(jMenu2);

        jmiReservas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553092_note_edit.png"))); // NOI18N
        jmiReservas.setText("Reservas");
        jmiReservas.setToolTipText("Registrar una Reserva");
        jmiReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiReservas);

        jmiHistMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiHistMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/historial.png"))); // NOI18N
        jmiHistMantenimiento.setText("Historial Mantenimiento/Auto");
        jmiHistMantenimiento.setToolTipText("Ver los historiales de Mantenimientos");
        jmiHistMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiHistMantenimiento);

        jmiPromociones.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553504_internt_web_technology-09-16.png"))); // NOI18N
        jmiPromociones.setText("Promociones y Combos");
        jmiPromociones.setToolTipText("Registrar una nueva promoción");
        jmiPromociones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiPromociones);

        jmiManuales.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiManuales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553656_folder-close-16.png"))); // NOI18N
        jmiManuales.setText("Manuales de Asistencia Técnica");
        jmiManuales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiManuales);

        jmiCotizacion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553787_Money.png"))); // NOI18N
        jmiCotizacion.setText("Cotización");
        jmiCotizacion.setToolTipText("Registrar una Cotización");
        jmiCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiCotizacion);

        jmiFichaRecepcion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiFichaRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554340_area_chart.png"))); // NOI18N
        jmiFichaRecepcion.setText("Ficha Recepción Auto");
        jmiFichaRecepcion.setToolTipText("Registrar ficha de una auto");
        jmiFichaRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiFichaRecepcion);

        jMenuBar1.add(jmServicios);

        jmProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camion-lorrygreen-icono-9499-64.png"))); // NOI18N
        jmProveedores.setText("Suministros");
        jmProveedores.setToolTipText("Modulo Suministros");
        jmProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmProveedores.setMargin(new java.awt.Insets(5, 0, 5, 10));

        jmiProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554134_Delivery.png"))); // NOI18N
        jmiProveedor.setText("Proveedores");
        jmiProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegitrarProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegitrarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegitrarProveedor.setText("Nuevo");
        jmiRegitrarProveedor.setToolTipText("Registrar un Proveedor");
        jmiRegitrarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiProveedor.add(jmiRegitrarProveedor);

        jmiActualizarProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarProveedor.setText("Modificar");
        jmiActualizarProveedor.setToolTipText("Modificar o Eliminar un Proveedor");
        jmiActualizarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiProveedor.add(jmiActualizarProveedor);

        jmiListaProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaProveedores.setText("Lista");
        jmiListaProveedores.setToolTipText("Lista de Proveedores");
        jmiListaProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiProveedor.add(jmiListaProveedores);

        jmProveedores.add(jmiProveedor);

        jmiDevoluciones.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574572_briefcase_16.png"))); // NOI18N
        jmiDevoluciones.setText("Devoluciones");
        jmiDevoluciones.setToolTipText("Devolver una orden de pedido");
        jmiDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmProveedores.add(jmiDevoluciones);

        jMenuBar1.add(jmProveedores);

        jmPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario-administrador-personal-icono-9746-64.png"))); // NOI18N
        jmPersonal.setText("Personal");
        jmPersonal.setToolTipText("Modulo de Personal");
        jmPersonal.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmPersonal.setMargin(new java.awt.Insets(5, 0, 5, 10));

        jmiEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552762_config-users.png"))); // NOI18N
        jmiEmpleados.setText("Empleados");
        jmiEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiEmpleados.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarMecanico.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarMecanico.setText("Nuevo");
        jmiRegistrarMecanico.setToolTipText("Registrar un Nuevo Empleado");
        jmiRegistrarMecanico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiEmpleados.add(jmiRegistrarMecanico);

        jmiActualizarMecanico.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarMecanico.setText("Modificar");
        jmiActualizarMecanico.setToolTipText("Modifique o Elimine un Empleado");
        jmiActualizarMecanico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiEmpleados.add(jmiActualizarMecanico);

        jmiListaEmpleados.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaEmpleados.setText("Lista");
        jmiListaEmpleados.setToolTipText("Ver todos los empleados");
        jmiListaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiEmpleados.add(jmiListaEmpleados);

        jmPersonal.add(jmiEmpleados);

        jMenuBar1.add(jmPersonal);

        jmInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-los-archivos-a-los-archivos-icono-9712-64.png"))); // NOI18N
        jmInventario.setText("Inventario");
        jmInventario.setToolTipText("Modulo de Inventario");
        jmInventario.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmInventario.setMargin(new java.awt.Insets(5, 0, 5, 10));

        jmiOrdenPedido.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiOrdenPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553931_kwrite.png"))); // NOI18N
        jmiOrdenPedido.setText("Orden de Pedido");
        jmiOrdenPedido.setToolTipText("Realice una nueva orden de pedido a un proveedor");
        jmiOrdenPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmInventario.add(jmiOrdenPedido);

        jmiRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574673_Options.png"))); // NOI18N
        jmiRepuestos.setText("Repuestos");
        jmiRepuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarRepuestos.setText("Nuevo");
        jmiRegistrarRepuestos.setToolTipText("Registre un nuevo repuesto");
        jmiRegistrarRepuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRepuestos.add(jmiRegistrarRepuestos);

        jmiActualizarRepuesto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarRepuesto.setText("Modificar");
        jmiActualizarRepuesto.setToolTipText("Modifique o Elimine un repuesto");
        jmiActualizarRepuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRepuestos.add(jmiActualizarRepuesto);

        jmInventario.add(jmiRepuestos);

        jmiCuentasPagar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCuentasPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554244_Bank_account.png"))); // NOI18N
        jmiCuentasPagar.setText("Cuentas por Pagar");
        jmiCuentasPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmInventario.add(jmiCuentasPagar);

        jmiInventarioDisponible.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiInventarioDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554429_Warehouse_icon_3D_rev-16.png"))); // NOI18N
        jmiInventarioDisponible.setText("Inventario Disponible");
        jmiInventarioDisponible.setToolTipText("Ver Inventario Disponible");
        jmiInventarioDisponible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmInventario.add(jmiInventarioDisponible);

        jMenuBar1.add(jmInventario);

        jmVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574800_money.png"))); // NOI18N
        jmVentas.setText("Ventas  ");
        jmVentas.setToolTipText("Modulo de Ventas");
        jmVentas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmVentas.setMargin(new java.awt.Insets(5, 0, 5, 10));

        jmiFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554496_invoice.png"))); // NOI18N
        jmiFactura.setText("Factura");
        jmiFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarFactura.setText("Nueva");
        jmiRegistrarFactura.setToolTipText("Registrar una nueva Factura");
        jmiRegistrarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.add(jmiRegistrarFactura);

        jmiActualizarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarFactura.setText("Actualizar");
        jmiActualizarFactura.setToolTipText("Modifica o elimina una Factura");
        jmiActualizarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.add(jmiActualizarFactura);

        jmiListaFacturas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaFacturas.setText("Lista");
        jmiListaFacturas.setToolTipText("Ver Todas las Facturas");
        jmiListaFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.add(jmiListaFacturas);

        jmVentas.add(jmiFactura);

        jmiOrdenesServicio.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiOrdenesServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554312_shopping_cart.png"))); // NOI18N
        jmiOrdenesServicio.setText("Odenes de Servicio");
        jmiOrdenesServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.add(jmiOrdenesServicio);

        jmiObtenerCotizacion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiObtenerCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554304_credit_cards.png"))); // NOI18N
        jmiObtenerCotizacion.setText("Obtener Cotización");
        jmiObtenerCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.add(jmiObtenerCotizacion);

        jmiCreditos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554292_deposit.png"))); // NOI18N
        jmiCreditos.setText("Creditos");
        jmiCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.add(jmiCreditos);

        jMenuBar1.add(jmVentas);

        jmReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/centrejust-icono-5615-64.png"))); // NOI18N
        jmReportes.setText("Reportes");
        jmReportes.setToolTipText("Modulo de Reportes");
        jmReportes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmReportes.setMargin(new java.awt.Insets(5, 0, 5, 10));

        jmiReporteClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553320_testimonials.png"))); // NOI18N
        jmiReporteClientes.setText("Clientes");
        jmiReporteClientes.setToolTipText("Generar Reporte de Todos los Clientes");
        jmiReporteClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiReporteClientes);

        jmiReporteEmpleados.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReporteEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552762_config-users.png"))); // NOI18N
        jmiReporteEmpleados.setText("Empleados");
        jmiReporteEmpleados.setToolTipText("Generar Reporte de Todoslos Empleados");
        jmiReporteEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiReporteEmpleados);

        jmiReporteAutos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReporteAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412572886_CabrioletRed.png"))); // NOI18N
        jmiReporteAutos.setText("Autos");
        jmiReporteAutos.setToolTipText("Generar Reporte de Todos los Autos");
        jmiReporteAutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiReporteAutos);

        jmiReporteProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReporteProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554134_Delivery.png"))); // NOI18N
        jmiReporteProveedores.setText("Proveedores");
        jmiReporteProveedores.setToolTipText("Generar Reporte de Todos los Proveedores");
        jmiReporteProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiReporteProveedores);

        jmiReporteMantenimientos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReporteMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412573336_gear_16.png"))); // NOI18N
        jmiReporteMantenimientos.setText("Mantenimientos");
        jmiReporteMantenimientos.setToolTipText("Generar Reporte de Todos los Mantenimientos");
        jmiReporteMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiReporteMantenimientos);

        jmiReporteInventario.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReporteInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574572_briefcase_16.png"))); // NOI18N
        jmiReporteInventario.setText("Inventario");
        jmiReporteInventario.setToolTipText("Generar Reporte del Inventario Actual");
        jmiReporteInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiReporteInventario);

        jMenuBar1.add(jmReportes);

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412575142_help_forum-lb.png"))); // NOI18N
        jmAyuda.setText("Ayuda   ");
        jmAyuda.setToolTipText("Ir a mecaut.com/ayuda");
        jmAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAyuda.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmAyuda.setMargin(new java.awt.Insets(5, 0, 5, 10));
        jmAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAyudaMouseClicked(evt);
            }
        });
        jmAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAyudaActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmAyuda);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir-de-gnome-icono-7637-48.png"))); // NOI18N
        jmSalir.setText("Salir");
        jmSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmSalir.setMargin(new java.awt.Insets(5, 0, 5, 10));

        jmiConfiguracion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412573336_gear_16.png"))); // NOI18N
        jmiConfiguracion.setText("Configuración");
        jmiConfiguracion.setToolTipText("Configuración de la Cuenta");
        jmiConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.add(jmiConfiguracion);

        jmiSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552697_exit.png"))); // NOI18N
        jmiSalir.setText("Cerrar sesión");
        jmiSalir.setToolTipText("Cerrar la Sesión");
        jmiSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.add(jmiSalir);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conection, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user)
                    .addComponent(jLabel2)
                    .addComponent(conection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAyudaActionPerformed

    }//GEN-LAST:event_jmAyudaActionPerformed

    private void jmAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAyudaMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/mecaut/?op=ayuda"));
        } catch (URISyntaxException | IOException ex) {
        }
    }//GEN-LAST:event_jmAyudaMouseClicked
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ControladorLogin().launchLogin();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel conection;
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenu jMenu4;
    public javax.swing.JMenu jMenu5;
    public javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenuItem jMenuItem10;
    public javax.swing.JMenuItem jMenuItem11;
    public javax.swing.JMenuItem jMenuItem12;
    public javax.swing.JMenuItem jMenuItem13;
    public javax.swing.JMenuItem jMenuItem14;
    public javax.swing.JMenuItem jMenuItem15;
    public javax.swing.JMenuItem jMenuItem16;
    public javax.swing.JMenuItem jMenuItem17;
    public javax.swing.JMenuItem jMenuItem18;
    public javax.swing.JMenuItem jMenuItem19;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JMenuItem jMenuItem4;
    public javax.swing.JMenuItem jMenuItem5;
    public javax.swing.JMenuItem jMenuItem6;
    public javax.swing.JMenuItem jMenuItem7;
    public javax.swing.JMenuItem jMenuItem8;
    public javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JMenu jmAyuda;
    public javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmInventario;
    private javax.swing.JMenu jmPersonal;
    private javax.swing.JMenu jmProveedores;
    public javax.swing.JMenu jmReportes;
    public javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmServicios;
    private javax.swing.JMenu jmVentas;
    public javax.swing.JMenuItem jmiActualizarCliente;
    public javax.swing.JMenuItem jmiActualizarFactura;
    public javax.swing.JMenuItem jmiActualizarMantenimiento;
    public javax.swing.JMenuItem jmiActualizarMecanico;
    public javax.swing.JMenuItem jmiActualizarProveedor;
    public javax.swing.JMenuItem jmiActualizarRepuesto;
    private javax.swing.JMenu jmiCliente;
    public javax.swing.JMenuItem jmiConfiguracion;
    public javax.swing.JMenuItem jmiCotizacion;
    public javax.swing.JMenuItem jmiCreditos;
    private javax.swing.JMenu jmiCuentas;
    public javax.swing.JMenuItem jmiCuentasPagar;
    public javax.swing.JMenuItem jmiDevoluciones;
    private javax.swing.JMenu jmiEmpleados;
    private javax.swing.JMenu jmiFactura;
    public javax.swing.JMenuItem jmiFichaRecepcion;
    public javax.swing.JMenuItem jmiGrupoClientes;
    public javax.swing.JMenuItem jmiHistMantenimiento;
    public javax.swing.JMenuItem jmiInventarioDisponible;
    public javax.swing.JMenuItem jmiListaAutos;
    public javax.swing.JMenuItem jmiListaCliente;
    public javax.swing.JMenuItem jmiListaEmpleados;
    public javax.swing.JMenuItem jmiListaFacturas;
    public javax.swing.JMenuItem jmiListaMantenimientos;
    public javax.swing.JMenuItem jmiListaProveedores;
    public javax.swing.JMenuItem jmiMantenimientosPendientes;
    public javax.swing.JMenuItem jmiManuales;
    public javax.swing.JMenuItem jmiObtenerCotizacion;
    public javax.swing.JMenuItem jmiOrdenPedido;
    public javax.swing.JMenuItem jmiOrdenesServicio;
    public javax.swing.JMenuItem jmiPromociones;
    private javax.swing.JMenu jmiProveedor;
    public javax.swing.JMenuItem jmiRegistrarAuto;
    public javax.swing.JMenuItem jmiRegistrarCliente;
    public javax.swing.JMenuItem jmiRegistrarCuenta;
    public javax.swing.JMenuItem jmiRegistrarFactura;
    public javax.swing.JMenuItem jmiRegistrarMantenimiento;
    public javax.swing.JMenuItem jmiRegistrarMecanico;
    public javax.swing.JMenuItem jmiRegistrarRepuestos;
    public javax.swing.JMenuItem jmiRegitrarProveedor;
    public javax.swing.JMenuItem jmiReporteAutos;
    public javax.swing.JMenuItem jmiReporteClientes;
    public javax.swing.JMenuItem jmiReporteEmpleados;
    public javax.swing.JMenuItem jmiReporteInventario;
    public javax.swing.JMenuItem jmiReporteMantenimientos;
    public javax.swing.JMenuItem jmiReporteProveedores;
    private javax.swing.JMenu jmiRepuestos;
    public javax.swing.JMenuItem jmiReservas;
    public javax.swing.JMenuItem jmiSalir;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
