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
        jMenu1 = new javax.swing.JMenu();
        jmiCliente = new javax.swing.JMenuItem();
        jmiAuto = new javax.swing.JMenuItem();
        jmiActualizarCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiMantenimiento = new javax.swing.JMenuItem();
        jmiActualizarMantenimiento = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiProveedor = new javax.swing.JMenuItem();
        jmiActualizarProveedor = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jmiMecanico = new javax.swing.JMenuItem();
        jmiActualizarMecanico = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jmiRepuestos = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiListaCliente = new javax.swing.JMenuItem();
        jmiListaAutos = new javax.swing.JMenuItem();
        jmiListaRepuestos = new javax.swing.JMenuItem();
        jmiListaMecanicos = new javax.swing.JMenuItem();
        jmiListaProveedores = new javax.swing.JMenuItem();
        jmiListaMantenimientos = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mecuat.JPG"))); // NOI18N
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(320, 110, 510, 350);

        jMenuBar1.setToolTipText("Menu");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 100, 0, 100));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente-icono-8749-48.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu1.setName(""); // NOI18N

        jmiCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiCliente.setText("Cliente");
        jMenu1.add(jmiCliente);

        jmiAuto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiAuto.setText("Auto");
        jMenu1.add(jmiAuto);

        jmiActualizarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar-restaure-agt-icono-7628-16.png"))); // NOI18N
        jmiActualizarCliente.setText("Cliente");
        jMenu1.add(jmiActualizarCliente);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jMenuItem1.setText("Buscar Cliente");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Grupo de Clientes");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gerente-de-servicio-icono-4188-64.png"))); // NOI18N
        jMenu3.setText("Servicios");
        jMenu3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiMantenimiento.setText("Mantenimiento");
        jMenu3.add(jmiMantenimiento);

        jmiActualizarMantenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar-restaure-agt-icono-7628-16.png"))); // NOI18N
        jmiActualizarMantenimiento.setText("Mantenimiento");
        jMenu3.add(jmiActualizarMantenimiento);

        jMenuItem3.setText("Reservas");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Historial Mantenimiento/Auto");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Promociones y Combos");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Manuales de Asistencia Técnica");
        jMenu3.add(jMenuItem6);

        jMenuItem14.setText("Cotización");
        jMenu3.add(jMenuItem14);

        jMenuItem22.setText("Ficha Recepción Auto");
        jMenu3.add(jMenuItem22);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camion-lorrygreen-icono-9499-64.png"))); // NOI18N
        jMenu4.setText("Proveedores");
        jMenu4.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiProveedor.setText("Proveedor");
        jMenu4.add(jmiProveedor);

        jmiActualizarProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar-restaure-agt-icono-7628-16.png"))); // NOI18N
        jmiActualizarProveedor.setText("Proveedor");
        jMenu4.add(jmiActualizarProveedor);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jMenuItem7.setText("Buscar Proveedor");
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario-administrador-personal-icono-9746-64.png"))); // NOI18N
        jMenu9.setText("Personal");
        jMenu9.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenu9.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiMecanico.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiMecanico.setText("Empleado");
        jMenu9.add(jmiMecanico);

        jmiActualizarMecanico.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiActualizarMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar-restaure-agt-icono-7628-16.png"))); // NOI18N
        jmiActualizarMecanico.setText("Empleado");
        jMenu9.add(jmiActualizarMecanico);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jMenuItem9.setText("Buscar Empleado");
        jMenu9.add(jMenuItem9);

        jMenuBar1.add(jMenu9);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-los-archivos-a-los-archivos-icono-9712-64.png"))); // NOI18N
        jMenu6.setText("Inventario");
        jMenu6.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem8.setText("Orden de Pedido");
        jMenu6.add(jMenuItem8);

        jmiRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir-mas-icono-5518-16.png"))); // NOI18N
        jmiRepuestos.setText("Agregar Repuesto");
        jMenu6.add(jmiRepuestos);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jMenuItem10.setText("Buscar Repuesto");
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Cuentas por Pagar");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Inventario Disponible");
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ventas");

        jMenuItem13.setText("Odenes se Servicio");
        jMenu7.add(jMenuItem13);

        jMenuItem15.setText("Obtener Cotización");
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Factura");
        jMenu7.add(jMenuItem16);

        jMenuItem17.setText("Actualizar Factura");
        jMenu7.add(jMenuItem17);

        jMenuItem19.setText("Buscar Factura");
        jMenu7.add(jMenuItem19);

        jMenuItem18.setText("Creditos");
        jMenu7.add(jMenuItem18);

        jMenuBar1.add(jMenu7);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/centrejust-icono-5615-64.png"))); // NOI18N
        jMenu2.setText("Reportes");
        jMenu2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiListaCliente.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaCliente.setText("Lista de clientes");
        jMenu2.add(jmiListaCliente);

        jmiListaAutos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaAutos.setText("Lista de autos");
        jMenu2.add(jmiListaAutos);

        jmiListaRepuestos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaRepuestos.setText("Lista de repuestos");
        jMenu2.add(jmiListaRepuestos);

        jmiListaMecanicos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaMecanicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaMecanicos.setText("Lista de personal");
        jMenu2.add(jmiListaMecanicos);

        jmiListaProveedores.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaProveedores.setText("Lista de proveedores");
        jMenu2.add(jmiListaProveedores);

        jmiListaMantenimientos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiListaMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N
        jmiListaMantenimientos.setText("Lista de mantenimientos");
        jMenu2.add(jmiListaMantenimientos);

        jMenuItem20.setText("Lista de creditos");
        jMenu2.add(jMenuItem20);

        jMenuItem21.setText("Lista de facturas");
        jMenu2.add(jMenuItem21);

        jMenuBar1.add(jMenu2);

        jMenu8.setText("Ayuda");
        jMenuBar1.add(jMenu8);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir-de-gnome-icono-7637-48.png"))); // NOI18N
        jMenu5.setText("Salir");

        jmiSalir.setText("Cerrar sesión");
        jMenu5.add(jmiSalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
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
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    public javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JButton jbtAceptar;
    public javax.swing.JButton jbtSalir;
    public javax.swing.JMenuItem jmiActualizarCliente;
    public javax.swing.JMenuItem jmiActualizarMantenimiento;
    public javax.swing.JMenuItem jmiActualizarMecanico;
    public javax.swing.JMenuItem jmiActualizarProveedor;
    public javax.swing.JMenuItem jmiAuto;
    public javax.swing.JMenuItem jmiCliente;
    public javax.swing.JMenuItem jmiListaAutos;
    public javax.swing.JMenuItem jmiListaCliente;
    public javax.swing.JMenuItem jmiListaMantenimientos;
    public javax.swing.JMenuItem jmiListaMecanicos;
    public javax.swing.JMenuItem jmiListaProveedores;
    public javax.swing.JMenuItem jmiListaRepuestos;
    public javax.swing.JMenuItem jmiMantenimiento;
    public javax.swing.JMenuItem jmiMecanico;
    public javax.swing.JMenuItem jmiProveedor;
    public javax.swing.JMenuItem jmiRepuestos;
    public javax.swing.JMenuItem jmiSalir;
    public javax.swing.JPasswordField jtfContraseña;
    public javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
