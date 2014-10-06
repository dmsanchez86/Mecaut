package vista.FormulariosPrincipales;

import java.awt.Image;
import java.awt.Toolkit;


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
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmServicios = new javax.swing.JMenu();
        jmServicios1 = new javax.swing.JMenu();
        jmAyuda = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú - Cliente - MECAUT");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mecuat.JPG"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 80, 0, 80));

        jmClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente-icono-8749-48.png"))); // NOI18N
        jmClientes.setText("Cuenta");
        jmClientes.setToolTipText("Modulo Clientes");
        jmClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmClientes.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jmClientes.setName(""); // NOI18N
        jMenuBar1.add(jmClientes);

        jmServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gerente-de-servicio-icono-4188-64.png"))); // NOI18N
        jmServicios.setText("Servicios");
        jmServicios.setToolTipText("Modulo Servicios");
        jmServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmServicios.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuBar1.add(jmServicios);

        jmServicios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camion-lorrygreen-icono-9499-64.png"))); // NOI18N
        jmServicios1.setText("Productos");
        jmServicios1.setToolTipText("Modulo Servicios");
        jmServicios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmServicios1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jmServicios1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuBar1.add(jmServicios1);

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412575142_help_forum-lb.png"))); // NOI18N
        jmAyuda.setText("Ayuda   ");
        jmAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAyuda.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenuBar1.add(jmAyuda);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir-de-gnome-icono-7637-48.png"))); // NOI18N
        jmSalir.setText("Salir   ");
        jmSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N

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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAyuda;
    public javax.swing.JMenu jmClientes;
    public javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmServicios;
    private javax.swing.JMenu jmServicios1;
    public javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
