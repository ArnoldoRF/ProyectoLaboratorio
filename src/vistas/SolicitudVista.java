/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package vistas;

import javax.swing.table.DefaultTableModel;
import utilidades.EventoCambio;

public class SolicitudVista extends javax.swing.JFrame {

    public SolicitudVista() {
        com.formdev.flatlaf.FlatLightLaf.setup();
        initComponents();
        EventoCambio.agregar(entryCodigo, e -> habilitarBusqueda());
        EventoCambio.agregar(entryBeneficiario, e -> habilitarBusquedaBeneficiario());
        reiniciar();
        this.setLocationRelativeTo(null);
    }
    
    public void habilitarBusqueda() {
        boolean estado = !entryCodigo.getText().isBlank() && entryCodigo.isEditable();
        btnBuscar.setEnabled(estado);
    }
    
    public void habilitarBusquedaBeneficiario() {
        boolean estado = !entryBeneficiario.getText().isBlank() && entryBeneficiario.isEditable();
        btnBuscarBeneficiario.setEnabled(estado);
    }
    
    public void habilitarRegistro() {
        btnBuscar.setEnabled(false);
        btnProcesar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        
        entryCodigo.setEditable(false);
        entryBeneficiario.setEditable(true);
    }
    
    public void habilitarFundacion() {
        btnBuscarBeneficiario.setEnabled(false);
        entryBeneficiario.setEnabled(false);
        boxFundaciones.setEnabled(true);
    }
    
    public void habilitarServicio() {
        boxFundaciones.setEnabled(false);
        btnAñadirServicio.setEnabled(true);
        btnQuitarServicio.setEnabled(false);
    }
    
    public void habilitarEdicion() {
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnAñadirServicio.setEnabled(true);
        btnQuitarServicio.setEnabled(true);
        btnProcesar.setEnabled(true);
        
        entryCodigo.setEditable(false);
        entryBeneficiario.setEditable(true);
        boxFundaciones.setEnabled(true);     
    }
    
    public void reiniciar() {
        btnBuscar.setEnabled(false);
        btnBuscarBeneficiario.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnProcesar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAñadirServicio.setEnabled(false);
        btnQuitarServicio.setEnabled(false);
        
        entryCodigo.setEditable(true);
        entryBeneficiario.setEditable(false);
        boxFundaciones.setEnabled(false);
        
        entryCodigo.setText("");
        entryBeneficiario.setText("");
        boxFundaciones.removeAllItems();
        entryResponsable.setText("");
        entryPresupuesto.setText("");
        entryEstatus.setText("");
        
        DefaultTableModel tableModel = (DefaultTableModel) tablaServicios.getModel();
        tableModel.setRowCount(0);
        tablaServicios.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        entryCodigo = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        entryBeneficiario = new javax.swing.JTextField();
        lbBeneficiario = new javax.swing.JLabel();
        lbFundacion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        btnQuitarServicio = new javax.swing.JButton();
        btnAñadirServicio = new javax.swing.JButton();
        btnBuscarBeneficiario = new javax.swing.JButton();
        boxFundaciones = new javax.swing.JComboBox<>();
        entryResponsable = new javax.swing.JTextField();
        lbResponsable = new javax.swing.JLabel();
        lbPresupuesto = new javax.swing.JLabel();
        entryPresupuesto = new javax.swing.JTextField();
        lbEstatus = new javax.swing.JLabel();
        entryEstatus = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        boxPrioridad = new javax.swing.JComboBox<>();
        lbPrioridad = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fundacion");
        setMinimumSize(new java.awt.Dimension(486, 0));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnBuscar.setMinimumSize(new java.awt.Dimension(77, 24));

        lbCodigo.setText("Código");

        lbBeneficiario.setText("Beneficiario");

        lbFundacion.setText("Fundacion");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnGuardar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnGuardar.setMinimumSize(new java.awt.Dimension(77, 24));
        btnGuardar.setPreferredSize(new java.awt.Dimension(77, 25));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnEliminar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnEliminar.setMinimumSize(new java.awt.Dimension(77, 24));
        btnEliminar.setPreferredSize(new java.awt.Dimension(77, 25));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCancelar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnCancelar.setMinimumSize(new java.awt.Dimension(77, 24));
        btnCancelar.setPreferredSize(new java.awt.Dimension(77, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Servicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaServicios);
        if (tablaServicios.getColumnModel().getColumnCount() > 0) {
            tablaServicios.getColumnModel().getColumn(0).setMinWidth(70);
            tablaServicios.getColumnModel().getColumn(0).setPreferredWidth(70);
            tablaServicios.getColumnModel().getColumn(0).setMaxWidth(70);
            tablaServicios.getColumnModel().getColumn(1).setResizable(false);
        }

        btnQuitarServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuitarServicio.setText("QUITAR");
        btnQuitarServicio.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnQuitarServicio.setMaximumSize(new java.awt.Dimension(77, 24));
        btnQuitarServicio.setMinimumSize(new java.awt.Dimension(77, 24));
        btnQuitarServicio.setPreferredSize(new java.awt.Dimension(77, 25));

        btnAñadirServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAñadirServicio.setText("AÑADIR");
        btnAñadirServicio.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnAñadirServicio.setMaximumSize(new java.awt.Dimension(77, 24));
        btnAñadirServicio.setMinimumSize(new java.awt.Dimension(77, 24));
        btnAñadirServicio.setPreferredSize(new java.awt.Dimension(77, 25));

        btnBuscarBeneficiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarBeneficiario.setText("BUSCAR");
        btnBuscarBeneficiario.setMaximumSize(new java.awt.Dimension(77, 24));
        btnBuscarBeneficiario.setMinimumSize(new java.awt.Dimension(77, 24));

        boxFundaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        entryResponsable.setEnabled(false);

        lbResponsable.setText("Responsable");

        lbPresupuesto.setText("Presupuesto");

        entryPresupuesto.setEnabled(false);

        lbEstatus.setText("Estatus");

        entryEstatus.setEnabled(false);

        btnProcesar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProcesar.setText("PROCESAR");
        btnProcesar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnProcesar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnProcesar.setMinimumSize(new java.awt.Dimension(77, 24));
        btnProcesar.setPreferredSize(new java.awt.Dimension(77, 25));

        boxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));

        lbPrioridad.setText("Prioridad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entryEstatus))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entryPresupuesto))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boxFundaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(entryBeneficiario))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(entryCodigo)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscarBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnAñadirServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnQuitarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entryResponsable))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boxPrioridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxFundaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuitarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new MenuVista().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxFundaciones;
    private javax.swing.JComboBox<String> boxPrioridad;
    public javax.swing.JButton btnAñadirServicio;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnBuscarBeneficiario;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnProcesar;
    public javax.swing.JButton btnQuitarServicio;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JTextField entryBeneficiario;
    public javax.swing.JTextField entryCodigo;
    public javax.swing.JTextField entryEstatus;
    public javax.swing.JTextField entryPresupuesto;
    public javax.swing.JTextField entryResponsable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbBeneficiario;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEstatus;
    private javax.swing.JLabel lbFundacion;
    private javax.swing.JLabel lbPresupuesto;
    private javax.swing.JLabel lbPrioridad;
    private javax.swing.JLabel lbResponsable;
    public javax.swing.JTable tablaServicios;
    // End of variables declaration//GEN-END:variables
}
