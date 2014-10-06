package vista.FormulariosPrincipales;

import controlador.Controlador;
import java.awt.Image;
import java.awt.Toolkit;

/* @author Grupo - MECAUT */
public class frmLoggin extends javax.swing.JFrame {

    public frmLoggin() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../iconos/icono.png"));
        setIconImage(icon);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jbtAceptar = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();
        jtfContraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jbtSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión en MECAUT");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553904_preferences-desktop-cryptography.png"))); // NOI18N

        jbtAceptar.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jbtAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412584043_04_In_alt-48.png"))); // NOI18N
        jbtAceptar.setToolTipText("Iniciar Sesión");
        jbtAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtfUsuario.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jtfUsuario.setText("Usuario");
        jtfUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                foco(evt);
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

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Obtener una cuenta?");
        jLabel5.setToolTipText("Registrase en mecaut.com");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbtSalir.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jbtSalir.setText("Salir");
        jbtSalir.setToolTipText("Salir de MECAUT");
        jbtSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfUsuario)
                            .addComponent(jtfContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtSalir)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtAceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void foco(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_foco
        if ("Usuario".equals(jtfUsuario.getText())) {
            jtfUsuario.setText(null);
        }
    }//GEN-LAST:event_foco
    private void jtfContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfContraseñaFocusGained
        if ("Contraseña".equals(jtfContraseña.getText())) {
            jtfContraseña.setText(null);
        }
    }//GEN-LAST:event_jtfContraseñaFocusGained
    private void jtfUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfUsuarioFocusLost
        if ("".equals(jtfUsuario.getText())) {
            jtfUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_jtfUsuarioFocusLost
    private void jtfContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfContraseñaFocusLost
        if ("".equals(jtfContraseña.getText())) {
            jtfContraseña.setText("Contraseña");
        }
    }//GEN-LAST:event_jtfContraseñaFocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Controlador().lanzarLogin();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JButton jbtAceptar;
    public javax.swing.JButton jbtSalir;
    public javax.swing.JPasswordField jtfContraseña;
    public javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
