/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package vistas;

import javax.swing.table.DefaultTableModel;

public class ListadoVista extends javax.swing.JFrame {

    public ListadoVista() {
        com.formdev.flatlaf.FlatLightLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void listarBeneficiarioFundacion() {
        String[] encabezados = new String[5];
        encabezados[0] = "Fundación";
        encabezados[1] = "Cedula";
        encabezados[2] = "Nombre";
        encabezados[3] = "Apellido";
        encabezados[4] = "Teléfono";
                
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(encabezados);
        tablaListado.setModel(tableModel);
    }
    
    public void listarPresupuestoEstatus() {
        String[] encabezados = new String[2];
        encabezados[0] = "Estatus";
        encabezados[1] = "Presupuesto";
                
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(encabezados);
        tablaListado.setModel(tableModel);
    }

    public void listarSolicitudResponsable() {
        String[] encabezados = new String[2];
        encabezados[0] = "Responsable";
        encabezados[1] = "Solicitud";
                
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(encabezados);
        tablaListado.setModel(tableModel);
    }
    
    public void listarPresupuestoFundacion() {
        String[] encabezados = new String[3];
        encabezados[0] = "Fundacion";
        encabezados[1] = "Presupuesto";
        encabezados[2] = "Porcentaje gastado";
                
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(encabezados);
        tablaListado.setModel(tableModel);
    }
    
    public void listarAsistenciaCharla() {
        String[] encabezados = new String[2];
        encabezados[0] = "Charla";
        encabezados[1] = "Beneficiario";
                
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(encabezados);
        tablaListado.setModel(tableModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaListado);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnRegresar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnRegresar.setMinimumSize(new java.awt.Dimension(77, 24));
        btnRegresar.setPreferredSize(new java.awt.Dimension(77, 25));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new MenuVista().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaListado;
    // End of variables declaration//GEN-END:variables
}
