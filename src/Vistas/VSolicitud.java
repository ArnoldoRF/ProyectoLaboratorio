
package Vistas;

import Controladores.CMenu;
import java.awt.event.ItemEvent;
import Controladores.CSolicitud;
import javax.swing.table.DefaultTableModel;

public class VSolicitud extends javax.swing.JFrame {

    CSolicitud soli;
    DefaultTableModel dt = null;
    
    public VSolicitud(CSolicitud soli) {
        initComponents();
        txtCodigo.setEditable(false);
        boxFundacion.setEnabled(false);
        boxPrioridad.setEnabled(false);
        txtResponsable.setEditable(false);
        btnGuardar.setEnabled(false);
        txtCedula.setText("");   
        boxFundacion.addItemListener(this::cambio);
        this.soli = soli; 
        dt = (DefaultTableModel) tablaServicio.getModel();
    }
    
    public void cambio(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
            tablaServicio.removeAll();
            //DefaultTableModel temp = dt;
            //tablaServicio.setModel(temp);
            soli.cargarServicios();
        }
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

        tablaServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        lbCedula.setBackground(new java.awt.Color(255, 255, 255));
        lbCedula.setText("Cedula");

        txtCedula.setBackground(new java.awt.Color(232, 234, 246));
        txtCedula.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        btnConsultar.setBackground(new java.awt.Color(63, 81, 181));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 1, 4, 1));
        btnConsultar.setBorderPainted(false);
        btnConsultar.setFocusPainted(false);
        btnConsultar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnConsultar.setMinimumSize(new java.awt.Dimension(77, 24));

        btnCancelar.setBackground(new java.awt.Color(63, 81, 181));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnCancelar.setMinimumSize(new java.awt.Dimension(77, 24));

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

        lbCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("Código");

        txtCodigo.setBackground(new java.awt.Color(232, 234, 246));
        txtCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        lbFundacion.setBackground(new java.awt.Color(255, 255, 255));
        lbFundacion.setText("Fundación");

        boxFundacion.setBackground(new java.awt.Color(232, 234, 246));
        boxFundacion.setFocusable(false);
        boxFundacion.setLightWeightPopupEnabled(false);

        lbPrioridad.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridad.setText("Prioridad");

        boxPrioridad.setBackground(new java.awt.Color(232, 234, 246));
        boxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));
        boxPrioridad.setFocusable(false);
        boxPrioridad.setLightWeightPopupEnabled(false);

        txtResponsable.setBackground(new java.awt.Color(232, 234, 246));
        txtResponsable.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        lbResponsable.setBackground(new java.awt.Color(255, 255, 255));
        lbResponsable.setText("Responsable");

        btnGuardar.setBackground(new java.awt.Color(63, 81, 181));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnGuardar.setBorderPainted(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(77, 24));
        btnGuardar.setMinimumSize(new java.awt.Dimension(77, 24));

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(baseLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(baseLayout.createSequentialGroup()
                            .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigo))
                        .addGroup(baseLayout.createSequentialGroup()
                            .addComponent(lbFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boxFundacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(baseLayout.createSequentialGroup()
                            .addComponent(lbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(baseLayout.createSequentialGroup()
                            .addComponent(lbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boxPrioridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(baseLayout.createSequentialGroup()
                            .addComponent(lbResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtResponsable))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
