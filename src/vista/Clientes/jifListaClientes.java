package vista.Clientes;

public class jifListaClientes extends javax.swing.JInternalFrame {
    public jifListaClientes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jmiRegistrarAuto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiNuevoCliente = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiReporte = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtListaClientes = new javax.swing.JTable();
        jtfDato = new javax.swing.JTextField();
        jbtBuscar = new javax.swing.JLabel();
        nRegistros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jmiModificar.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jmiModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553931_kwrite.png"))); // NOI18N
        jmiModificar.setText("jMenuItem1");
        jmiModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmiModificar);

        jmiEliminar.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jmiEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412553884_mail-delete.png"))); // NOI18N
        jmiEliminar.setText("jMenuItem2");
        jmiEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupMenu1.add(jmiEliminar);

        jmiRegistrarAuto.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jmiRegistrarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412572886_CabrioletRed.png"))); // NOI18N
        jmiRegistrarAuto.setText("jMenuItem4");
        jmiRegistrarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupMenu1.add(jmiRegistrarAuto);
        jPopupMenu1.add(jSeparator1);

        jmiNuevoCliente.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jmiNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554623_emblem-new.png"))); // NOI18N
        jmiNuevoCliente.setText("jMenuItem3");
        jmiNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupMenu1.add(jmiNuevoCliente);
        jPopupMenu1.add(jSeparator2);

        jmiReporte.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jmiReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1412554340_area_chart.png"))); // NOI18N
        jmiReporte.setText("jMenuItem1");
        jmiReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupMenu1.add(jmiReporte);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("MECAUT - Lista clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa-lector-icono-7654-16.png"))); // NOI18N

        jtListaClientes.setBorder(new javax.swing.border.MatteBorder(null));
        jtListaClientes.setFont(new java.awt.Font("Lucida Sans", 2, 13)); // NOI18N
        jtListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jtListaClientes.setToolTipText("");
        jtListaClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtListaClientes.setComponentPopupMenu(jPopupMenu1);
        jtListaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtListaClientes.setRowHeight(20);
        jtListaClientes.setRowMargin(0);
        jtListaClientes.setSelectionBackground(new java.awt.Color(2, 160, 160));
        jtListaClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtListaClientes.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(jtListaClientes);

        jtfDato.setToolTipText("Ingrese Identificación, Nombre, Apellido o Dirección");

        jbtBuscar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jbtBuscar.setText("Buscar");

        nRegistros.setFont(new java.awt.Font("Lucida Sans", 3, 15)); // NOI18N
        nRegistros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nRegistros.setText("0");

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 2, 16)); // NOI18N
        jLabel1.setText("N° Registros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDato, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar)
                    .addComponent(jLabel1)
                    .addComponent(nRegistros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JLabel jbtBuscar;
    public javax.swing.JMenuItem jmiEliminar;
    public javax.swing.JMenuItem jmiModificar;
    public javax.swing.JMenuItem jmiNuevoCliente;
    public javax.swing.JMenuItem jmiRegistrarAuto;
    public javax.swing.JMenuItem jmiReporte;
    public javax.swing.JTable jtListaClientes;
    public javax.swing.JTextField jtfDato;
    public javax.swing.JLabel nRegistros;
    // End of variables declaration//GEN-END:variables
}
