package vista.FormulariosPrincipales;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* @author Grupo - MECAUT */
public class frmLoggin extends javax.swing.JFrame {

    public frmLoggin() {
        initComponents();
        
        // icon desktop
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../iconos/icono.png"));
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JPasswordField();
        lbl_getAccount = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MECAUT");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(254, 254, 254));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(240, 316));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553904_preferences-desktop-cryptography.png"))); // NOI18N

        jtfUser.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jtfUser.setText("Usuario");
        jtfUser.setToolTipText("Ingrese el nombre de Usuario");
        jtfUser.setNextFocusableComponent(jtfPassword);
        jtfUser.setSelectionEnd(1);
        jtfUser.setSelectionStart(1);
        jtfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                foco(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfUserFocusLost(evt);
            }
        });

        jtfPassword.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jtfPassword.setText("Contraseña");
        jtfPassword.setToolTipText("Ingrese la Contraseña");
        jtfPassword.setNextFocusableComponent(btnEnter);
        jtfPassword.setSelectionEnd(2);
        jtfPassword.setSelectionStart(2);
        jtfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPasswordFocusLost(evt);
            }
        });

        lbl_getAccount.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_getAccount.setForeground(new java.awt.Color(213, 13, 13));
        lbl_getAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_getAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412805919_sign-up.png"))); // NOI18N
        lbl_getAccount.setText("Obtener una cuenta?");
        lbl_getAccount.setToolTipText("Registrese en mecaut.com");
        lbl_getAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_getAccount.setNextFocusableComponent(btnExit);
        lbl_getAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_getAccountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_getAccountMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_getAccountMouseEntered(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btnExit.setText("Salir");
        btnExit.setToolTipText("Salir de MECAUT");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setNextFocusableComponent(jtfUser);

        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412806304_ok-sign-64.png"))); // NOI18N
        btnEnter.setToolTipText("Iniciar Sesión");
        btnEnter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEnter.setBorderPainted(false);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setNextFocusableComponent(lbl_getAccount);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfPassword)
                            .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_getAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnter))
                .addGap(18, 18, 18)
                .addComponent(lbl_getAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_getAccount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEnter, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_getAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_getAccountMouseEntered
        lbl_getAccount.setForeground(Color.ORANGE);
    }//GEN-LAST:event_lbl_getAccountMouseEntered

    private void lbl_getAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_getAccountMouseExited
        lbl_getAccount.setForeground(Color.red);
    }//GEN-LAST:event_lbl_getAccountMouseExited

    private void lbl_getAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_getAccountMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/mecaut/index.php/registro"));
        } catch (URISyntaxException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_lbl_getAccountMouseClicked

    private void jtfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPasswordFocusLost
        if ("".equals(jtfPassword.getText()))
            jtfPassword.setText("Contraseña");
    }//GEN-LAST:event_jtfPasswordFocusLost

    private void jtfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPasswordFocusGained
        if ("Contraseña".equals(jtfPassword.getText()))
            jtfPassword.setText(null);
    }//GEN-LAST:event_jtfPasswordFocusGained

    private void jtfUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfUserFocusLost
        if ("".equals(jtfUser.getText()))
            jtfUser.setText("Usuario");
    }//GEN-LAST:event_jtfUserFocusLost

    private void foco(java.awt.event.FocusEvent evt) {                      
        if ("Usuario".equals(jtfUser.getText()))
            jtfUser.setText(null);
    }//GEN-LAST:event_foco
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEnter;
    public javax.swing.JButton btnExit;
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField jtfPassword;
    public javax.swing.JTextField jtfUser;
    public javax.swing.JLabel lbl_getAccount;
    // End of variables declaration//GEN-END:variables
}
