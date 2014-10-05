package vista;

import controlador.Controlador;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/* @author Grupo - MECAUT */
public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JDialog();
        jbtAceptar = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();
        jtfContraseña = new javax.swing.JPasswordField();
        jbtSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmiCliente = new javax.swing.JMenuItem();
        jmiAuto = new javax.swing.JMenuItem();
        jmiActualizarCliente = new javax.swing.JMenuItem();
        jmiBuscarCliente = new javax.swing.JMenuItem();
        jmiGrupoClientes = new javax.swing.JMenuItem();
        jmServicios = new javax.swing.JMenu();
        jmiMantenimiento = new javax.swing.JMenuItem();
        jmiActualizarMantenimiento = new javax.swing.JMenuItem();
        jmiReservas = new javax.swing.JMenuItem();
        jmiHistMantenimiento = new javax.swing.JMenuItem();
        jmiPromociones = new javax.swing.JMenuItem();
        jmiManuales = new javax.swing.JMenuItem();
        jmiCotizacion = new javax.swing.JMenuItem();
        jmiFichaRecepcion = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenu();
        jmiProveedor = new javax.swing.JMenuItem();
        jmiActualizarProveedor = new javax.swing.JMenuItem();
        jmiBuscarProveedor = new javax.swing.JMenuItem();
        jmPersonal = new javax.swing.JMenu();
        jmiMecanico = new javax.swing.JMenuItem();
        jmiActualizarMecanico = new javax.swing.JMenuItem();
        jmiBuscarEmpleado = new javax.swing.JMenuItem();
        jmInventario = new javax.swing.JMenu();
        jmiOrdenPedido = new javax.swing.JMenuItem();
        jmiRepuestos = new javax.swing.JMenuItem();
        jmiActualizarRepuesto = new javax.swing.JMenuItem();
        jmiBuscarRepuesto = new javax.swing.JMenuItem();
        jmiCuentasPagar = new javax.swing.JMenuItem();
        jmiInventarioDisponible = new javax.swing.JMenuItem();
        jmVentas = new javax.swing.JMenu();
        jmiOrdenesServicio = new javax.swing.JMenuItem();
        jmiObtenerCotizacion = new javax.swing.JMenuItem();
        jmiFactura = new javax.swing.JMenuItem();
        jmiActualizarFactura = new javax.swing.JMenuItem();
        jmiBuscarFactura = new javax.swing.JMenuItem();
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
        jmiSalir = new javax.swing.JMenuItem();

        Login.setTitle("MECAUT - Loggin");
        Login.setBackground(new java.awt.Color(157, 157, 157));
        Login.setResizable(false);

        jbtAceptar.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jbtAceptar.setText("Ingresar");
        jbtAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtfUsuario.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jtfUsuario.setText("Usuario");
        jtfUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfUsuarioFocusLost(evt);
            }
        });

        jtfContraseña.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jtfContraseña.setText("Contraseña");
        jtfContraseña.setToolTipText("Contraseña");
        jtfContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfContraseñaFocusLost(evt);
            }
        });

        jbtSalir.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jbtSalir.setText("Salir");
        jbtSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Obtener una cuenta?");
        jLabel5.setToolTipText("Registrase en mecaut.com");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbtSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtSalir)
                .addGap(27, 27, 27))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mecuat.JPG"))); // NOI18N
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(400, 170, 510, 350);

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

        jmiCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiCliente.setText("Cliente");
        jmiCliente.setToolTipText("Registrar un Nuevo Cliente");
        jmClientes.add(jmiCliente);

        jmiAuto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiAuto.setText("Auto");
        jmiAuto.setToolTipText("Registrar un Auto a un Cliente");
        jmClientes.add(jmiAuto);

        jmiActualizarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarCliente.setText("Cliente");
        jmiActualizarCliente.setToolTipText("Modificar o Eliminar un Cliente");
        jmClientes.add(jmiActualizarCliente);

        jmiBuscarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiBuscarCliente.setText("Buscar Cliente");
        jmiBuscarCliente.setToolTipText("Busqueda de Clientes");
        jmClientes.add(jmiBuscarCliente);

        jmiGrupoClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiGrupoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553320_testimonials.png"))); // NOI18N
        jmiGrupoClientes.setText("Grupo de Clientes");
        jmiGrupoClientes.setToolTipText("Grupos de Clientes");
        jmClientes.add(jmiGrupoClientes);

        jMenuBar1.add(jmClientes);

        jmServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gerente-de-servicio-icono-4188-64.png"))); // NOI18N
        jmServicios.setText("Servicios");
        jmServicios.setToolTipText("Modulo Servicios");
        jmServicios.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmServicios.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiMantenimiento.setText("Mantenimiento");
        jmiMantenimiento.setToolTipText("Registrar un Mantenimiento");
        jmServicios.add(jmiMantenimiento);

        jmiActualizarMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarMantenimiento.setText("Mantenimiento");
        jmiActualizarMantenimiento.setToolTipText("Modificar o Eliminar un Mantenimiento");
        jmServicios.add(jmiActualizarMantenimiento);

        jmiReservas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553092_note_edit.png"))); // NOI18N
        jmiReservas.setText("Reservas");
        jmiReservas.setToolTipText("Registrar una Reserva");
        jmServicios.add(jmiReservas);

        jmiHistMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiHistMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/historial.png"))); // NOI18N
        jmiHistMantenimiento.setText("Historial Mantenimiento/Auto");
        jmServicios.add(jmiHistMantenimiento);

        jmiPromociones.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553504_internt_web_technology-09-16.png"))); // NOI18N
        jmiPromociones.setText("Promociones y Combos");
        jmServicios.add(jmiPromociones);

        jmiManuales.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiManuales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553656_folder-close-16.png"))); // NOI18N
        jmiManuales.setText("Manuales de Asistencia Técnica");
        jmServicios.add(jmiManuales);

        jmiCotizacion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553787_Money.png"))); // NOI18N
        jmiCotizacion.setText("Cotización");
        jmServicios.add(jmiCotizacion);

        jmiFichaRecepcion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiFichaRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553931_kwrite.png"))); // NOI18N
        jmiFichaRecepcion.setText("Ficha Recepción Auto");
        jmServicios.add(jmiFichaRecepcion);

        jMenuBar1.add(jmServicios);

        jmProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camion-lorrygreen-icono-9499-64.png"))); // NOI18N
        jmProveedores.setText("Proveedores");
        jmProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmProveedores.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiProveedor.setText("Proveedor");
        jmiProveedor.setToolTipText("Registrar un Proveedor");
        jmProveedores.add(jmiProveedor);

        jmiActualizarProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarProveedor.setText("Proveedor");
        jmiActualizarProveedor.setToolTipText("Modificar o Eliminar un Proveedor");
        jmProveedores.add(jmiActualizarProveedor);

        jmiBuscarProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiBuscarProveedor.setText("Buscar Proveedor");
        jmiBuscarProveedor.setToolTipText("Buscar Proveedores");
        jmProveedores.add(jmiBuscarProveedor);

        jMenuBar1.add(jmProveedores);

        jmPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario-administrador-personal-icono-9746-64.png"))); // NOI18N
        jmPersonal.setText("Personal");
        jmPersonal.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmPersonal.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiMecanico.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiMecanico.setText("Empleado");
        jmiMecanico.setToolTipText("Registrar un Nuevo Empleado");
        jmPersonal.add(jmiMecanico);

        jmiActualizarMecanico.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarMecanico.setText("Empleado");
        jmPersonal.add(jmiActualizarMecanico);

        jmiBuscarEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiBuscarEmpleado.setText("Buscar Empleado");
        jmPersonal.add(jmiBuscarEmpleado);

        jMenuBar1.add(jmPersonal);

        jmInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-los-archivos-a-los-archivos-icono-9712-64.png"))); // NOI18N
        jmInventario.setText("Inventario");
        jmInventario.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmInventario.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiOrdenPedido.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiOrdenPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554134_Delivery.png"))); // NOI18N
        jmiOrdenPedido.setText("Orden de Pedido");
        jmInventario.add(jmiOrdenPedido);

        jmiRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiRepuestos.setText("Repuesto");
        jmInventario.add(jmiRepuestos);

        jmiActualizarRepuesto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarRepuesto.setText("Repuesto");
        jmInventario.add(jmiActualizarRepuesto);

        jmiBuscarRepuesto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiBuscarRepuesto.setText("Buscar Repuesto");
        jmInventario.add(jmiBuscarRepuesto);

        jmiCuentasPagar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCuentasPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554244_Bank_account.png"))); // NOI18N
        jmiCuentasPagar.setText("Cuentas por Pagar");
        jmInventario.add(jmiCuentasPagar);

        jmiInventarioDisponible.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiInventarioDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554429_Warehouse_icon_3D_rev-16.png"))); // NOI18N
        jmiInventarioDisponible.setText("Inventario Disponible");
        jmInventario.add(jmiInventarioDisponible);

        jMenuBar1.add(jmInventario);

        jmVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas.PNG"))); // NOI18N
        jmVentas.setText("Ventas  ");
        jmVentas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N

        jmiOrdenesServicio.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiOrdenesServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554312_shopping_cart.png"))); // NOI18N
        jmiOrdenesServicio.setText("Odenes de Servicio");
        jmVentas.add(jmiOrdenesServicio);

        jmiObtenerCotizacion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiObtenerCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554304_credit_cards.png"))); // NOI18N
        jmiObtenerCotizacion.setText("Obtener Cotización");
        jmVentas.add(jmiObtenerCotizacion);

        jmiFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554496_invoice.png"))); // NOI18N
        jmiFactura.setText("Factura");
        jmVentas.add(jmiFactura);

        jmiActualizarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552741_gtk-refresh.png"))); // NOI18N
        jmiActualizarFactura.setText("Actualizar Factura");
        jmVentas.add(jmiActualizarFactura);

        jmiBuscarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554636_file-manager.png"))); // NOI18N
        jmiBuscarFactura.setText("Buscar Factura");
        jmVentas.add(jmiBuscarFactura);

        jmiCreditos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554292_deposit.png"))); // NOI18N
        jmiCreditos.setText("Creditos");
        jmVentas.add(jmiCreditos);

        jMenuBar1.add(jmVentas);

        jmReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/centrejust-icono-5615-64.png"))); // NOI18N
        jmReportes.setText("Reportes");
        jmReportes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmReportes.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiListaCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaCliente.setText("Lista de clientes");
        jmReportes.add(jmiListaCliente);

        jmiListaAutos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaAutos.setText("Lista de autos");
        jmReportes.add(jmiListaAutos);

        jmiListaRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaRepuestos.setText("Lista de repuestos");
        jmReportes.add(jmiListaRepuestos);

        jmiListaMecanicos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaMecanicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaMecanicos.setText("Lista de personal");
        jmReportes.add(jmiListaMecanicos);

        jmiListaProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaProveedores.setText("Lista de proveedores");
        jmReportes.add(jmiListaProveedores);

        jmiListaMantenimientos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaMantenimientos.setText("Lista de mantenimientos");
        jmReportes.add(jmiListaMantenimientos);

        jmiListaCreditos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaCreditos.setText("Lista de creditos");
        jmReportes.add(jmiListaCreditos);

        jmiListaFacturas.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaFacturas.setText("Lista de facturas");
        jmReportes.add(jmiListaFacturas);

        jMenuBar1.add(jmReportes);

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda.png"))); // NOI18N
        jmAyuda.setText("Ayuda   ");
        jmAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAyuda.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenuBar1.add(jmAyuda);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir-de-gnome-icono-7637-48.png"))); // NOI18N
        jmSalir.setText("Salir   ");
        jmSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N

        jmiSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552697_exit.png"))); // NOI18N
        jmiSalir.setText("Cerrar sesión");
        jmSalir.add(jmiSalir);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jtfUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfUsuarioFocusGained
        if (jtfUsuario.getText().equals("Usuario")) {
            jtfUsuario.setText("");
        }
    }//GEN-LAST:event_jtfUsuarioFocusGained
    private void jtfContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfContraseñaFocusGained
        if (jtfContraseña.getText().equals("Contraseña")) {
            jtfContraseña.setText("");
        }
    }//GEN-LAST:event_jtfContraseñaFocusGained
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/mecaut/registro/"));
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el sitio Web..!\n\n"+ex.getMessage(),"MECAUT",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel5MouseClicked
    private void jtfUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfUsuarioFocusLost
        if (jtfUsuario.getText().isEmpty()) {
            jtfUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_jtfUsuarioFocusLost
    private void jtfContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfContraseñaFocusLost
        if (jtfContraseña.getText().isEmpty()) {
            jtfContraseña.setText("Contraseña");
        }
    }//GEN-LAST:event_jtfContraseñaFocusLost

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    public javax.swing.JDialog Login;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JButton jbtAceptar;
    public javax.swing.JButton jbtSalir;
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
    public javax.swing.JMenuItem jmiAuto;
    public javax.swing.JMenuItem jmiBuscarCliente;
    public javax.swing.JMenuItem jmiBuscarEmpleado;
    public javax.swing.JMenuItem jmiBuscarFactura;
    public javax.swing.JMenuItem jmiBuscarProveedor;
    public javax.swing.JMenuItem jmiBuscarRepuesto;
    public javax.swing.JMenuItem jmiCliente;
    public javax.swing.JMenuItem jmiCotizacion;
    public javax.swing.JMenuItem jmiCreditos;
    public javax.swing.JMenuItem jmiCuentasPagar;
    public javax.swing.JMenuItem jmiFactura;
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
    public javax.swing.JMenuItem jmiMantenimiento;
    public javax.swing.JMenuItem jmiManuales;
    public javax.swing.JMenuItem jmiMecanico;
    public javax.swing.JMenuItem jmiObtenerCotizacion;
    public javax.swing.JMenuItem jmiOrdenPedido;
    public javax.swing.JMenuItem jmiOrdenesServicio;
    public javax.swing.JMenuItem jmiPromociones;
    public javax.swing.JMenuItem jmiProveedor;
    public javax.swing.JMenuItem jmiRepuestos;
    public javax.swing.JMenuItem jmiReservas;
    public javax.swing.JMenuItem jmiSalir;
    public javax.swing.JPasswordField jtfContraseña;
    public javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
