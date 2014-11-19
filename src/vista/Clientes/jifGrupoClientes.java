package vista.Clientes;

import modelo.Gestor;

public class jifGrupoClientes extends javax.swing.JInternalFrame {
    
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
        jcbEstado = new javax.swing.JComboBox();
        jbtModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbtCancelar = new javax.swing.JButton();
        jcbcodigoGrupo = new javax.swing.JComboBox();
        jcbNombregrupo = new javax.swing.JComboBox();
        nRegistros = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("MECAUT - Grupo de Clientes");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553320_testimonials.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jLabel1.setText("Búsqueda por ");

        jcbTipo.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------", "Activo", "Inactivo", "Habitual", "Ocasional", "Potencial" }));
        jcbTipo.setSelectedIndex(1);
        jcbTipo.setToolTipText("Seleccione el Nombre o el Estado de un Grupo de Cliente");
        jcbTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtGrupoClientes.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        jLabel3.setText("Estado");

        jLabel4.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        jLabel5.setText("Id Cliente");

        jtfId.setEditable(false);
        jtfId.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        jtfId.setToolTipText("Identificacion del Cliente");

        jcbEstado.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------", "Activo", "Inactivo" }));
        jcbEstado.setToolTipText("Estado del Grupo de Cliente");
        jcbEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbtModificar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jbtModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574555_tick_16.png"))); // NOI18N
        jbtModificar.setText("Modificar");
        jbtModificar.setToolTipText("Actualizar Grupo Cliente");
        jbtModificar.setEnabled(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412671721_Groups_Black.png"))); // NOI18N

        jbtCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        jbtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553884_mail-delete.png"))); // NOI18N
        jbtCancelar.setToolTipText("Cancelar");

        jcbcodigoGrupo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbcodigoGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------", "GRH001", "GRO002", "GRP003" }));
        jcbcodigoGrupo.setToolTipText("Codigo del Grupo de Clientes");
        jcbcodigoGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbcodigoGrupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbcodigoGrupoItemStateChanged(evt);
            }
        });

        jcbNombregrupo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbNombregrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Habitual", "Ocasional", "Potencial" }));
        jcbNombregrupo.setToolTipText("Nombre del Grupo de Clientes");
        jcbNombregrupo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbcodigoGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbNombregrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfId)
                            .addComponent(jbtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(62, 62, 62))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbcodigoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbNombregrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtCancelar)
                    .addComponent(jbtModificar))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
        if ("GRH001".equals(cod))
            jcbcodigoGrupo.setSelectedIndex(1);
        else if("GRO002".equals(cod))
            jcbcodigoGrupo.setSelectedIndex(2);
        else if("GRP003".equals(cod))
             jcbcodigoGrupo.setSelectedIndex(3);
        int op = "Activo".equals(est)?1:2;
        jcbEstado.setSelectedIndex(op);
        jbtModificar.setEnabled(true);
    }//GEN-LAST:event_jtGrupoClientesMouseClicked

    private void jcbcodigoGrupoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbcodigoGrupoItemStateChanged
        int op = jcbcodigoGrupo.getSelectedIndex();
        if (op == 1) 
            jcbNombregrupo.setSelectedIndex(1);
        else if(op == 2)
            jcbNombregrupo.setSelectedIndex(2);
        else if(op == 3)
            jcbNombregrupo.setSelectedIndex(3);
    }//GEN-LAST:event_jcbcodigoGrupoItemStateChanged

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
    public javax.swing.JComboBox jcbEstado;
    public javax.swing.JComboBox jcbNombregrupo;
    public javax.swing.JComboBox jcbTipo;
    public javax.swing.JComboBox jcbcodigoGrupo;
    public javax.swing.JTable jtGrupoClientes;
    public javax.swing.JTextField jtfId;
    public javax.swing.JLabel nRegistros;
    // End of variables declaration//GEN-END:variables
}
