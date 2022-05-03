/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Vistas;

import Controladores.CMenu;

public class VSolicitud extends javax.swing.JFrame {

    public VSolicitud() {
        initComponents();
        txtCodigo.setEditable(false);
        //boxFundacion.setEnabled(false);
        boxPrioridad.setEnabled(false);
        txtResponsable.setEditable(false);
        btnGuardar.setEnabled(false);
        txtCedula.setText("");
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        scrollServicio = new javax.swing.JScrollPane();
        tablaServicio = new javax.swing.JTable();
        lbCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbFundacion = new javax.swing.JLabel();
        boxFundacion = new javax.swing.JComboBox<>();
        lbPrioridad = new javax.swing.JLabel();
        boxPrioridad = new javax.swing.JComboBox<>();
        txtResponsable = new javax.swing.JTextField();
        lbResponsable = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setMinimumSize(new java.awt.Dimension(400, 300));
        base.setPreferredSize(new java.awt.Dimension(800, 383));
        base.setLayout(null);

        tablaServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Consulta", null},
                {"Psicologo", null},
                {"The", null},
                {"Rata", null},
                {"Alada", null},
                {"Nada", null},
                {"Nada", null}
            },
            new String [] {
                "SERVICIO", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaServicio.setFocusable(false);
        tablaServicio.setGridColor(new java.awt.Color(63, 81, 181));
        tablaServicio.setRowHeight(24);
        scrollServicio.setViewportView(tablaServicio);
        if (tablaServicio.getColumnModel().getColumnCount() > 0) {
            tablaServicio.getColumnModel().getColumn(1).setMinWidth(30);
            tablaServicio.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        base.add(scrollServicio);
        scrollServicio.setBounds(36, 114, 330, 149);

        lbCedula.setBackground(new java.awt.Color(255, 255, 255));
        lbCedula.setText("Cedula");
        base.add(lbCedula);
        lbCedula.setBounds(36, 42, 70, 24);

        txtCedula.setBackground(new java.awt.Color(232, 234, 246));
        txtCedula.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        base.add(txtCedula);
        txtCedula.setBounds(112, 42, 168, 24);

        btnConsultar.setBackground(new java.awt.Color(63, 81, 181));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 1, 4, 1));
        btnConsultar.setBorderPainted(false);
        btnConsultar.setFocusPainted(false);
        btnConsultar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnConsultar.setMinimumSize(new java.awt.Dimension(77, 24));
        base.add(btnConsultar);
        btnConsultar.setBounds(286, 42, 80, 24);

        btnCancelar.setBackground(new java.awt.Color(63, 81, 181));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnCancelar.setMinimumSize(new java.awt.Dimension(77, 24));
        base.add(btnCancelar);
        btnCancelar.setBounds(200, 353, 80, 24);

        btnRegresar.setBackground(new java.awt.Color(63, 81, 181));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnRegresar.setBorderPainted(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnRegresar.setMinimumSize(new java.awt.Dimension(77, 24));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        base.add(btnRegresar);
        btnRegresar.setBounds(286, 353, 80, 24);

        lbCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("Código");
        base.add(lbCodigo);
        lbCodigo.setBounds(36, 6, 70, 24);

        txtCodigo.setBackground(new java.awt.Color(232, 234, 246));
        txtCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        base.add(txtCodigo);
        txtCodigo.setBounds(112, 6, 254, 24);

        lbFundacion.setBackground(new java.awt.Color(255, 255, 255));
        lbFundacion.setText("Fundación");
        base.add(lbFundacion);
        lbFundacion.setBounds(36, 78, 70, 24);

        boxFundacion.setBackground(new java.awt.Color(232, 234, 246));
        boxFundacion.setFocusable(false);
        boxFundacion.setLightWeightPopupEnabled(false);
        base.add(boxFundacion);
        boxFundacion.setBounds(112, 79, 254, 22);

        lbPrioridad.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridad.setText("Prioridad");
        base.add(lbPrioridad);
        lbPrioridad.setBounds(36, 275, 70, 24);

        boxPrioridad.setBackground(new java.awt.Color(232, 234, 246));
        boxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));
        boxPrioridad.setFocusable(false);
        boxPrioridad.setLightWeightPopupEnabled(false);
        base.add(boxPrioridad);
        boxPrioridad.setBounds(112, 276, 254, 22);

        txtResponsable.setBackground(new java.awt.Color(232, 234, 246));
        txtResponsable.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        base.add(txtResponsable);
        txtResponsable.setBounds(112, 311, 254, 24);

        lbResponsable.setBackground(new java.awt.Color(255, 255, 255));
        lbResponsable.setText("Responsable");
        base.add(lbResponsable);
        lbResponsable.setBounds(36, 311, 70, 24);

        btnGuardar.setBackground(new java.awt.Color(63, 81, 181));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnGuardar.setBorderPainted(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnGuardar.setMinimumSize(new java.awt.Dimension(77, 24));
        base.add(btnGuardar);
        btnGuardar.setBounds(114, 353, 80, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        CMenu cmenu = new CMenu();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    public javax.swing.JComboBox<String> boxFundacion;
    public javax.swing.JComboBox<String> boxPrioridad;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbFundacion;
    private javax.swing.JLabel lbPrioridad;
    private javax.swing.JLabel lbResponsable;
    public javax.swing.JScrollPane scrollServicio;
    public javax.swing.JTable tablaServicio;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
