package vista.FormulariosPrincipales;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* @author Grupo - MECAUT */

public class frmCliente extends javax.swing.JFrame {

    public frmCliente() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../iconos/icono.png"));
        setIconImage(icon);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        conection = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiConfiguracion = new javax.swing.JMenuItem();
        jmServicios = new javax.swing.JMenu();
        jmiSolicitarMantenimiento = new javax.swing.JMenuItem();
        jmiSolicitarReserva = new javax.swing.JMenuItem();
        jmiRegistrarAuto = new javax.swing.JMenuItem();
        jmiVerFichaAuto = new javax.swing.JMenuItem();
        jmiHistorialAuto = new javax.swing.JMenuItem();
        jmiPromocionesCombos = new javax.swing.JMenuItem();
        jmiCotizar = new javax.swing.JMenuItem();
        jmServicios1 = new javax.swing.JMenu();
        jmiComprarRepuesto = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmiSolicitarRepuesto = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MECAUT - Cliente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/D79.jpg"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        user.setFont(new java.awt.Font("Purisa", 3, 13)); // NOI18N
        user.setText(" ");

        jLabel3.setFont(new java.awt.Font("Purisa", 2, 15)); // NOI18N
        jLabel3.setText("Estado:");

        conection.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        conection.setForeground(new java.awt.Color(255, 142, 41));
        conection.setToolTipText("Estado de la Conexión");

        jMenuBar1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 300, 0, 280));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario-administrador-personal-icono-9746-64.png"))); // NOI18N
        jMenu1.setText("Cuenta");
        jMenu1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        jmiConfiguracion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412573336_gear_16.png"))); // NOI18N
        jmiConfiguracion.setText("Configuración");
        jmiConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(jmiConfiguracion);

        jMenuBar1.add(jMenu1);

        jmServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gerente-de-servicio-icono-4188-64.png"))); // NOI18N
        jmServicios.setText("Servicios");
        jmServicios.setToolTipText("Modulo Servicios");
        jmServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmServicios.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiSolicitarMantenimiento.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiSolicitarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574673_Options.png"))); // NOI18N
        jmiSolicitarMantenimiento.setText("Solicitar Mantenimiento");
        jmiSolicitarMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiSolicitarMantenimiento);

        jmiSolicitarReserva.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiSolicitarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553092_note_edit.png"))); // NOI18N
        jmiSolicitarReserva.setText("Solicitar Reserva");
        jmServicios.add(jmiSolicitarReserva);

        jmiRegistrarAuto.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiRegistrarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412572886_CabrioletRed.png"))); // NOI18N
        jmiRegistrarAuto.setText("Registrar Auto");
        jmiRegistrarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiRegistrarAuto);

        jmiVerFichaAuto.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiVerFichaAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/historial.png"))); // NOI18N
        jmiVerFichaAuto.setText("Ver Ficha Técnica del Auto");
        jmServicios.add(jmiVerFichaAuto);

        jmiHistorialAuto.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiHistorialAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574455_search_16.png"))); // NOI18N
        jmiHistorialAuto.setText("Consultar Historial del Auto");
        jmiHistorialAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiHistorialAuto);

        jmiPromocionesCombos.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiPromocionesCombos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554934_23.png"))); // NOI18N
        jmiPromocionesCombos.setText("Ver Promociones o Combos");
        jmiPromocionesCombos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiPromocionesCombos);

        jmiCotizar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jmiCotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554872_money.png"))); // NOI18N
        jmiCotizar.setText("Cotizar");
        jmiCotizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.add(jmiCotizar);

        jMenuBar1.add(jmServicios);

        jmServicios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camion-lorrygreen-icono-9499-64.png"))); // NOI18N
        jmServicios1.setText("Productos");
        jmServicios1.setToolTipText("Modulo Servicios");
        jmServicios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmServicios1.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jmiComprarRepuesto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiComprarRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554312_shopping_cart.png"))); // NOI18N
        jmiComprarRepuesto.setText("Comprar Repuesto");
        jmiComprarRepuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios1.add(jmiComprarRepuesto);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554939_coins.png"))); // NOI18N
        jMenuItem3.setText("Devolver Repuesto");
        jmServicios1.add(jMenuItem3);

        jmiSolicitarRepuesto.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiSolicitarRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554134_Delivery.png"))); // NOI18N
        jmiSolicitarRepuesto.setText("Solicitar Repuesto");
        jmiSolicitarRepuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios1.add(jmiSolicitarRepuesto);

        jMenuBar1.add(jmServicios1);

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412575142_help_forum-lb.png"))); // NOI18N
        jmAyuda.setText("Ayuda   ");
        jmAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAyuda.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAyudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAyuda);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir-de-gnome-icono-7637-48.png"))); // NOI18N
        jmSalir.setText("Salir   ");
        jmSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N

        jmiCerrarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jmiCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412552697_exit.png"))); // NOI18N
        jmiCerrarSesion.setText("Cerrar sesión");
        jmiCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.add(jmiCerrarSesion);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(conection, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(user))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(conection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel conection;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jmAyuda;
    public javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmServicios;
    private javax.swing.JMenu jmServicios1;
    public javax.swing.JMenuItem jmiCerrarSesion;
    public javax.swing.JMenuItem jmiComprarRepuesto;
    public javax.swing.JMenuItem jmiConfiguracion;
    public javax.swing.JMenuItem jmiCotizar;
    public javax.swing.JMenuItem jmiHistorialAuto;
    public javax.swing.JMenuItem jmiPromocionesCombos;
    public javax.swing.JMenuItem jmiRegistrarAuto;
    public javax.swing.JMenuItem jmiSolicitarMantenimiento;
    public javax.swing.JMenuItem jmiSolicitarRepuesto;
    public javax.swing.JMenuItem jmiSolicitarReserva;
    public javax.swing.JMenuItem jmiVerFichaAuto;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
