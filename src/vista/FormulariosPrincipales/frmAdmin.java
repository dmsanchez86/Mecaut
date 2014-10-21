package vista.FormulariosPrincipales;

import controlador.Controlador;
import java.awt.*;

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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmiCliente = new javax.swing.JMenu();
        jmiRegistrarCliente = new javax.swing.JMenuItem();
        jmiActualizarCliente = new javax.swing.JMenuItem();
        jmiCuentas = new javax.swing.JMenu();
        jmiRegistrarCuenta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiRegistrarAuto = new javax.swing.JMenuItem();
        jmiGrupoClientes = new javax.swing.JMenuItem();
        jmServicios = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmiRegistrarMantenimiento = new javax.swing.JMenuItem();
        jmiActualizarMantenimiento = new javax.swing.JMenuItem();
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
        jmiBuscarProveedor = new javax.swing.JMenuItem();
        jmPersonal = new javax.swing.JMenu();
        jmiEmpleados = new javax.swing.JMenu();
        jmiRegistrarMecanico = new javax.swing.JMenuItem();
        jmiActualizarMecanico = new javax.swing.JMenuItem();
        jmInventario = new javax.swing.JMenu();
        jmiOrdenPedido = new javax.swing.JMenuItem();
        jmiRepuestos = new javax.swing.JMenu();
        jmiRegistrarRepuestos = new javax.swing.JMenuItem();
        jmiActualizarRepuesto = new javax.swing.JMenuItem();
        jmiBuscarRepuesto = new javax.swing.JMenuItem();
        jmiCuentasPagar = new javax.swing.JMenuItem();
        jmiInventarioDisponible = new javax.swing.JMenuItem();
        jmVentas = new javax.swing.JMenu();
        jmiFactura = new javax.swing.JMenu();
        jmiRegistrarFactura = new javax.swing.JMenuItem();
        jmiActualizarFactura = new javax.swing.JMenuItem();
        jmiBuscarFactura = new javax.swing.JMenuItem();
        jmiOrdenesServicio = new javax.swing.JMenuItem();
        jmiObtenerCotizacion = new javax.swing.JMenuItem();
        jmiCreditos = new javax.swing.JMenuItem();
        jmReportes = new javax.swing.JMenu();
        jmiListaCliente = new javax.swing.JMenuItem();
        jmiListaAutos = new javax.swing.JMenuItem();
        jmiListaRepuestos = new javax.swing.JMenuItem();
        jmiListaMecanicos = new javax.swing.JMenuItem();
        jmiListaProveedores = new javax.swing.JMenuItem();
        jmiListaMantenimientos = new javax.swing.JMenuItem();
        jmiListaCreditos = new javax.swing.JMenuItem();
        jmiListaFacturas = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();
        jmiConfiguracion = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú - Administrador - MECAUT");
        setFocusable(false);
        setIconImage(getIconImage());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mecuat.JPG"))); // NOI18N
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(400, 80, 510, 350);

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 2, 12)); // NOI18N
        jLabel1.setText("Usuario:   ");

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 30, 0, 30));
        jMenuBar1.setName(""); // NOI18N

        jmClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente-icono-8749-48.png"))); // NOI18N
        jmClientes.setText("Clientes");
        jmClientes.setToolTipText("Modulo Clientes");
        jmClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmClientes.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jmClientes.setName(""); // NOI18N

        jmiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553282_group.png"))); // NOI18N
        jmiCliente.setText("Clientes");
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

        jmClientes.add(jmiCliente);

        jmiCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552722_stock_contact.png"))); // NOI18N
        jmiCuentas.setText("Cuentas");
        jmiCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCuentas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarCuenta.setText("Nueva");
        jmiRegistrarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCuentas.add(jmiRegistrarCuenta);

        jmClientes.add(jmiCuentas);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412572886_CabrioletRed.png"))); // NOI18N
        jMenu1.setText("Auto");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarAuto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarAuto.setText("Nuevo");
        jmiRegistrarAuto.setToolTipText("Registrar un Auto a un Cliente");
        jmiRegistrarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(jmiRegistrarAuto);

        jmClientes.add(jMenu1);

        jmiGrupoClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiGrupoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553320_testimonials.png"))); // NOI18N
        jmiGrupoClientes.setText("Grupo de Clientes");
        jmiGrupoClientes.setToolTipText("Grupos de Clientes");
        jmiGrupoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmClientes.add(jmiGrupoClientes);

        jMenuBar1.add(jmClientes);

        jmServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gerente-de-servicio-icono-4188-64.png"))); // NOI18N
        jmServicios.setText("Servicios");
        jmServicios.setToolTipText("Modulo Servicios");
        jmServicios.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmServicios.setMargin(new java.awt.Insets(10, 10, 10, 10));

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
        jmiHistMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiHistMantenimiento);

        jmiPromociones.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553504_internt_web_technology-09-16.png"))); // NOI18N
        jmiPromociones.setText("Promociones y Combos");
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
        jmiCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiCotizacion);

        jmiFichaRecepcion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiFichaRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553931_kwrite.png"))); // NOI18N
        jmiFichaRecepcion.setText("Ficha Recepción Auto");
        jmiFichaRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiFichaRecepcion);

        jMenuBar1.add(jmServicios);

        jmProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camion-lorrygreen-icono-9499-64.png"))); // NOI18N
        jmProveedores.setText("Suministros");
        jmProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmProveedores.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554623_emblem-new.png"))); // NOI18N
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

        jmiBuscarProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiBuscarProveedor.setText("Buscar");
        jmiBuscarProveedor.setToolTipText("Buscar Proveedores");
        jmiBuscarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiProveedor.add(jmiBuscarProveedor);

        jmProveedores.add(jmiProveedor);

        jMenuBar1.add(jmProveedores);

        jmPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario-administrador-personal-icono-9746-64.png"))); // NOI18N
        jmPersonal.setText("Personal");
        jmPersonal.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmPersonal.setMargin(new java.awt.Insets(10, 10, 10, 10));

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
        jmiActualizarMecanico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiEmpleados.add(jmiActualizarMecanico);

        jmPersonal.add(jmiEmpleados);

        jMenuBar1.add(jmPersonal);

        jmInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-los-archivos-a-los-archivos-icono-9712-64.png"))); // NOI18N
        jmInventario.setText("Inventario");
        jmInventario.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmInventario.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiOrdenPedido.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiOrdenPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554134_Delivery.png"))); // NOI18N
        jmiOrdenPedido.setText("Orden de Pedido");
        jmiOrdenPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmInventario.add(jmiOrdenPedido);

        jmiRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574673_Options.png"))); // NOI18N
        jmiRepuestos.setText("Repuestos");
        jmiRepuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarRepuestos.setText("Nuevo");
        jmiRegistrarRepuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRepuestos.add(jmiRegistrarRepuestos);

        jmiActualizarRepuesto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarRepuesto.setText("Modificar");
        jmiActualizarRepuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRepuestos.add(jmiActualizarRepuesto);

        jmiBuscarRepuesto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiBuscarRepuesto.setText("Buscar");
        jmiBuscarRepuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRepuestos.add(jmiBuscarRepuesto);

        jmInventario.add(jmiRepuestos);

        jmiCuentasPagar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCuentasPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554244_Bank_account.png"))); // NOI18N
        jmiCuentasPagar.setText("Cuentas por Pagar");
        jmiCuentasPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmInventario.add(jmiCuentasPagar);

        jmiInventarioDisponible.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiInventarioDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554429_Warehouse_icon_3D_rev-16.png"))); // NOI18N
        jmiInventarioDisponible.setText("Inventario Disponible");
        jmiInventarioDisponible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmInventario.add(jmiInventarioDisponible);

        jMenuBar1.add(jmInventario);

        jmVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574800_money.png"))); // NOI18N
        jmVentas.setText("Ventas  ");
        jmVentas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N

        jmiFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554496_invoice.png"))); // NOI18N
        jmiFactura.setText("Factura");
        jmiFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        jmiRegistrarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRegistrarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552707_gnome-app-install.png"))); // NOI18N
        jmiRegistrarFactura.setText("Nueva");
        jmiRegistrarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.add(jmiRegistrarFactura);

        jmiActualizarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarFactura.setText("Actualizar");
        jmiActualizarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.add(jmiActualizarFactura);

        jmiBuscarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554636_file-manager.png"))); // NOI18N
        jmiBuscarFactura.setText("Buscar");
        jmiBuscarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiFactura.add(jmiBuscarFactura);

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
        jmReportes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmReportes.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiListaCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaCliente.setText("Lista de clientes");
        jmiListaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaCliente);

        jmiListaAutos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaAutos.setText("Lista de autos");
        jmiListaAutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaAutos);

        jmiListaRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaRepuestos.setText("Lista de repuestos");
        jmiListaRepuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaRepuestos);

        jmiListaMecanicos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaMecanicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaMecanicos.setText("Lista de personal");
        jmiListaMecanicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaMecanicos);

        jmiListaProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaProveedores.setText("Lista de proveedores");
        jmiListaProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaProveedores);

        jmiListaMantenimientos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaMantenimientos.setText("Lista de mantenimientos");
        jmiListaMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaMantenimientos);

        jmiListaCreditos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaCreditos.setText("Lista de creditos");
        jmiListaCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaCreditos);

        jmiListaFacturas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaFacturas.setText("Lista de facturas");
        jmiListaFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmReportes.add(jmiListaFacturas);

        jMenuBar1.add(jmReportes);

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412575142_help_forum-lb.png"))); // NOI18N
        jmAyuda.setText("Ayuda   ");
        jmAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAyuda.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenuBar1.add(jmAyuda);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir-de-gnome-icono-7637-48.png"))); // NOI18N
        jmSalir.setText("Salir   ");
        jmSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N

        jmiConfiguracion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412573336_gear_16.png"))); // NOI18N
        jmiConfiguracion.setText("Configuración");
        jmSalir.add(jmiConfiguracion);

        jmiSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552697_exit.png"))); // NOI18N
        jmiSalir.setText("Cerrar sesión");
        jmiSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.add(jmiSalir);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Controlador().lanzarLogin();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAyuda;
    public javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmInventario;
    private javax.swing.JMenu jmPersonal;
    private javax.swing.JMenu jmProveedores;
    private javax.swing.JMenu jmReportes;
    public javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmServicios;
    private javax.swing.JMenu jmVentas;
    public javax.swing.JMenuItem jmiActualizarCliente;
    public javax.swing.JMenuItem jmiActualizarFactura;
    public javax.swing.JMenuItem jmiActualizarMantenimiento;
    public javax.swing.JMenuItem jmiActualizarMecanico;
    public javax.swing.JMenuItem jmiActualizarProveedor;
    public javax.swing.JMenuItem jmiActualizarRepuesto;
    public javax.swing.JMenuItem jmiBuscarFactura;
    public javax.swing.JMenuItem jmiBuscarProveedor;
    public javax.swing.JMenuItem jmiBuscarRepuesto;
    private javax.swing.JMenu jmiCliente;
    private javax.swing.JMenuItem jmiConfiguracion;
    public javax.swing.JMenuItem jmiCotizacion;
    public javax.swing.JMenuItem jmiCreditos;
    private javax.swing.JMenu jmiCuentas;
    public javax.swing.JMenuItem jmiCuentasPagar;
    private javax.swing.JMenu jmiEmpleados;
    private javax.swing.JMenu jmiFactura;
    public javax.swing.JMenuItem jmiFichaRecepcion;
    public javax.swing.JMenuItem jmiGrupoClientes;
    public javax.swing.JMenuItem jmiHistMantenimiento;
    public javax.swing.JMenuItem jmiInventarioDisponible;
    public javax.swing.JMenuItem jmiListaAutos;
    public javax.swing.JMenuItem jmiListaCliente;
    public javax.swing.JMenuItem jmiListaCreditos;
    public javax.swing.JMenuItem jmiListaFacturas;
    public javax.swing.JMenuItem jmiListaMantenimientos;
    public javax.swing.JMenuItem jmiListaMecanicos;
    public javax.swing.JMenuItem jmiListaProveedores;
    public javax.swing.JMenuItem jmiListaRepuestos;
    public javax.swing.JMenuItem jmiManuales;
    public javax.swing.JMenuItem jmiObtenerCotizacion;
    public javax.swing.JMenuItem jmiOrdenPedido;
    public javax.swing.JMenuItem jmiOrdenesServicio;
    public javax.swing.JMenuItem jmiPromociones;
    private javax.swing.JMenu jmiProveedor;
    public javax.swing.JMenuItem jmiRegistrarAuto;
    public javax.swing.JMenuItem jmiRegistrarCliente;
    private javax.swing.JMenuItem jmiRegistrarCuenta;
    public javax.swing.JMenuItem jmiRegistrarFactura;
    public javax.swing.JMenuItem jmiRegistrarMantenimiento;
    public javax.swing.JMenuItem jmiRegistrarMecanico;
    public javax.swing.JMenuItem jmiRegistrarRepuestos;
    public javax.swing.JMenuItem jmiRegitrarProveedor;
    private javax.swing.JMenu jmiRepuestos;
    public javax.swing.JMenuItem jmiReservas;
    public javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
