package vista.Clientes;

import modelo.Gestor;

public class jifGrupoClientes extends javax.swing.JInternalFrame {
    Gestor ges = new Gestor();
    char c;
    int ope = 0;
    public jifGrupoClientes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtGrupoClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox();
        jbtModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jbtCancelar = new javax.swing.JButton();
        jbtRegistrar = new javax.swing.JButton();
        nRegistros = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Grupo de Clientes");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jLabel1.setText("Búsqueda Clientes: ");

        jcbTipo.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------", "Activo", "Inactivo", "Habitual", "Ocasional", "Potencial" }));
        jcbTipo.setSelectedIndex(1);
        jcbTipo.setToolTipText("Seleccione el Nombre o el Estado de un Grupo de Cliente");

        jtGrupoClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jtGrupoClientes.setCellSelectionEnabled(true);
        jtGrupoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtGrupoClientes.setFocusable(false);
        jtGrupoClientes.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jtGrupoClientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtGrupoClientes.setUpdateSelectionOnSort(false);
        jtGrupoClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGrupoClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtGrupoClientes);

        jPanel1.setToolTipText("Grupo Clientes - Actualizar");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jLabel3.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jLabel5.setText("Ident. Cliente");

        jtfId.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        jtfId.setToolTipText("Identificacion del Cliente");
        jtfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdKeyTyped(evt);
            }
        });

        jtfCodigo.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        jtfCodigo.setToolTipText("Codigo del Grupo de Cliente");

        jcbEstado.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---------", "Activo", "Inactivo" }));
        jcbEstado.setToolTipText("Estado del Grupo de Cliente");

        jbtModificar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jbtModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574555_tick_16.png"))); // NOI18N
        jbtModificar.setText("Modificar");
        jbtModificar.setToolTipText("Actualizar Grupo Cliente");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412671721_Groups_Black.png"))); // NOI18N

        jtfNombre.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        jtfNombre.setToolTipText("Codigo del Grupo de Cliente");

        jbtCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jbtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553884_mail-delete.png"))); // NOI18N
        jbtCancelar.setToolTipText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtRegistrar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jbtRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553931_kwrite.png"))); // NOI18N
        jbtRegistrar.setText("Registrar");
        jbtRegistrar.setToolTipText("Registrar Grupo Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jbtCancelar)
                .addGap(18, 18, 18)
                .addComponent(jbtModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfId, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtCancelar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtModificar)
                        .addComponent(jbtRegistrar)))
                .addContainerGap())
        );

        nRegistros.setFont(new java.awt.Font("Lucida Sans", 3, 15)); // NOI18N
        nRegistros.setText("0");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 2, 16)); // NOI18N
        jLabel7.setText("N° Reg.");
        jLabel7.setToolTipText("Número de Registros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(nRegistros))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jtGrupoClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGrupoClientesMouseClicked
        int i = jtGrupoClientes.getSelectedRow();
        String cod = (String)jtGrupoClientes.getValueAt(i, 0);
        String nom = (String)jtGrupoClientes.getValueAt(i, 1);
        String id = (String)jtGrupoClientes.getValueAt(i, 2);
        String est = (String)jtGrupoClientes.getValueAt(i, 3);
        jtfId.setText(id);
        jtfNombre.setText(nom);
        jtfCodigo.setText(cod);
        int op = "Activo".equals(est)?1:2;
        jcbEstado.setSelectedIndex(op);
        jtfId.setEditable(false);
        jtfCodigo.setEditable(false);
        jbtRegistrar.setEnabled(false);
        jbtModificar.setEnabled(true);
    }//GEN-LAST:event_jtGrupoClientesMouseClicked
    private void jtfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdKeyTyped
        c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfIdKeyTyped

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtCancelar;
    public javax.swing.JButton jbtModificar;
    public javax.swing.JButton jbtRegistrar;
    public javax.swing.JComboBox jcbEstado;
    public javax.swing.JComboBox jcbTipo;
    public javax.swing.JTable jtGrupoClientes;
    public javax.swing.JTextField jtfCodigo;
    public javax.swing.JTextField jtfId;
    public javax.swing.JTextField jtfNombre;
    public javax.swing.JLabel nRegistros;
    // End of variables declaration//GEN-END:variables
}
