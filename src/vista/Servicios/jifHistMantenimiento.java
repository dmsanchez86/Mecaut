package vista.Servicios;

public class jifHistMantenimiento extends javax.swing.JInternalFrame {

    public jifHistMantenimiento() {
        initComponents();
        jtfIdCliente.setEnabled(false);
        jtfPlaca.setEnabled(false);
        jdcFecha.setEnabled(false);
        jbtConsultar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbPlaca = new javax.swing.JRadioButton();
        rbIdCliente = new javax.swing.JRadioButton();
        rbFecha = new javax.swing.JRadioButton();
        jtfPlaca = new javax.swing.JTextField();
        jtfIdCliente = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        rbRangoFecha = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblRegistros = new javax.swing.JLabel();
        jbtConsultar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("MECAUT - Historial de Mantenimientos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/historial.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Mantenimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        jLabel1.setText("Busqueda por: ");

        buttonGroup1.add(rbPlaca);
        rbPlaca.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        rbPlaca.setText("Placa");
        rbPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlacaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbIdCliente);
        rbIdCliente.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        rbIdCliente.setText("Id Cliente");
        rbIdCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIdClienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFecha);
        rbFecha.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        rbFecha.setText("Fecha");
        rbFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFechaActionPerformed(evt);
            }
        });

        jtfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlacaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbRangoFecha);
        rbRangoFecha.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        rbRangoFecha.setText("Todos los Registros");
        rbRangoFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbRangoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRangoFechaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("NanumGothic", 2, 15)); // NOI18N
        jLabel3.setText("N° Registros: ");

        lblRegistros.setFont(new java.awt.Font("NanumGothic", 3, 15)); // NOI18N
        lblRegistros.setText("0");

        jbtConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412574455_search_16.png"))); // NOI18N
        jbtConsultar.setToolTipText("Consultar Fecha");
        jbtConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbRangoFecha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbIdCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFecha)
                            .addComponent(rbPlaca))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jtfPlaca))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbRangoFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbIdCliente)
                            .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPlaca)
                            .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rbFecha)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRegistros))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlacaActionPerformed
        if(rbPlaca.isSelected()){
            jtfIdCliente.setText(null);
            jdcFecha.setDate(null);
            jtfIdCliente.setEnabled(false);
            jdcFecha.setEnabled(false);
            jtfPlaca.setEnabled(true);
            jtfPlaca.requestFocus();
            jbtConsultar.setVisible(false);
        }
    }//GEN-LAST:event_rbPlacaActionPerformed

    private void rbIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIdClienteActionPerformed
        if(rbIdCliente.isSelected()){
            jtfPlaca.setText(null);
            jdcFecha.setDate(null);
            jtfPlaca.setEnabled(false);
            jdcFecha.setEnabled(false);
            jtfIdCliente.setEnabled(true);
            jtfIdCliente.requestFocus();
            jbtConsultar.setVisible(false);
        }
    }//GEN-LAST:event_rbIdClienteActionPerformed

    private void rbFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFechaActionPerformed
        if(rbFecha.isSelected()){
            jtfPlaca.setText(null);
            jtfIdCliente.setText(null);
            jtfIdCliente.setEnabled(false);
            jtfPlaca.setEnabled(false);
            jdcFecha.setEnabled(true);
            jdcFecha.requestFocus();
            jbtConsultar.setVisible(true);
        }
    }//GEN-LAST:event_rbFechaActionPerformed

    private void rbRangoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRangoFechaActionPerformed
        if (rbRangoFecha.isSelected()) {
            jtfPlaca.setText("");
            jtfIdCliente.setText("");
            jdcFecha.setDate(null);
            jtfPlaca.setEnabled(false);
            jtfIdCliente.setEnabled(false);
            jdcFecha.setEnabled(false);
            jbtConsultar.setVisible(false);
        }
    }//GEN-LAST:event_rbRangoFechaActionPerformed

    private void jtfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlacaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JButton jbtConsultar;
    public com.toedter.calendar.JDateChooser jdcFecha;
    public javax.swing.JTextField jtfIdCliente;
    public javax.swing.JTextField jtfPlaca;
    public javax.swing.JLabel lblRegistros;
    public javax.swing.JRadioButton rbFecha;
    public javax.swing.JRadioButton rbIdCliente;
    public javax.swing.JRadioButton rbPlaca;
    public javax.swing.JRadioButton rbRangoFecha;
    // End of variables declaration//GEN-END:variables
}
