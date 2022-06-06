/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package vistas;

import controladores.*;

public class MenuVista extends javax.swing.JFrame {

    public MenuVista() {
        com.formdev.flatlaf.FlatLightLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBeneficiario = new javax.swing.JButton();
        lbListados = new javax.swing.JLabel();
        btnResponsable = new javax.swing.JButton();
        btnFundacion = new javax.swing.JButton();
        btnServicio = new javax.swing.JButton();
        btnBuscar4 = new javax.swing.JButton();
        btnListadoBeneficiarioFundacion = new javax.swing.JButton();
        btnListadoPresupuestoEstatus = new javax.swing.JButton();
        btnListadoAsistenciaCharla = new javax.swing.JButton();
        btnListadoSolicitudResponsable = new javax.swing.JButton();
        btnBuscar9 = new javax.swing.JButton();
        lbOpciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBeneficiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBeneficiario.setText("BENEFICIARIO");
        btnBeneficiario.setMaximumSize(new java.awt.Dimension(77, 24));
        btnBeneficiario.setMinimumSize(new java.awt.Dimension(77, 24));
        btnBeneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeneficiarioActionPerformed(evt);
            }
        });

        lbListados.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbListados.setText("Listados");

        btnResponsable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResponsable.setText("RESPONSABLE");
        btnResponsable.setMaximumSize(new java.awt.Dimension(77, 24));
        btnResponsable.setMinimumSize(new java.awt.Dimension(77, 24));
        btnResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponsableActionPerformed(evt);
            }
        });

        btnFundacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFundacion.setText("FUNDACIÓN");
        btnFundacion.setMaximumSize(new java.awt.Dimension(77, 24));
        btnFundacion.setMinimumSize(new java.awt.Dimension(77, 24));
        btnFundacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundacionActionPerformed(evt);
            }
        });

        btnServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnServicio.setText("SERVICIO");
        btnServicio.setMaximumSize(new java.awt.Dimension(77, 24));
        btnServicio.setMinimumSize(new java.awt.Dimension(77, 24));
        btnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicioActionPerformed(evt);
            }
        });

        btnBuscar4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar4.setText("SOLICITUD");
        btnBuscar4.setMaximumSize(new java.awt.Dimension(77, 24));
        btnBuscar4.setMinimumSize(new java.awt.Dimension(77, 24));
        btnBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar4ActionPerformed(evt);
            }
        });

        btnListadoBeneficiarioFundacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListadoBeneficiarioFundacion.setText("BENEFICIARIOS POR FUNDACIÓN");
        btnListadoBeneficiarioFundacion.setMaximumSize(new java.awt.Dimension(77, 24));
        btnListadoBeneficiarioFundacion.setMinimumSize(new java.awt.Dimension(77, 24));
        btnListadoBeneficiarioFundacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoBeneficiarioFundacionActionPerformed(evt);
            }
        });

        btnListadoPresupuestoEstatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListadoPresupuestoEstatus.setText("PRESUPUESTOS POR ESTATUS");
        btnListadoPresupuestoEstatus.setMaximumSize(new java.awt.Dimension(77, 24));
        btnListadoPresupuestoEstatus.setMinimumSize(new java.awt.Dimension(77, 24));
        btnListadoPresupuestoEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoPresupuestoEstatusActionPerformed(evt);
            }
        });

        btnListadoAsistenciaCharla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListadoAsistenciaCharla.setText("ASISTENCIAS POR CHARLA");
        btnListadoAsistenciaCharla.setMaximumSize(new java.awt.Dimension(77, 24));
        btnListadoAsistenciaCharla.setMinimumSize(new java.awt.Dimension(77, 24));
        btnListadoAsistenciaCharla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoAsistenciaCharlaActionPerformed(evt);
            }
        });

        btnListadoSolicitudResponsable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListadoSolicitudResponsable.setText("SOLICITUDES POR RESPONSABLE");
        btnListadoSolicitudResponsable.setMaximumSize(new java.awt.Dimension(77, 24));
        btnListadoSolicitudResponsable.setMinimumSize(new java.awt.Dimension(77, 24));
        btnListadoSolicitudResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoSolicitudResponsableActionPerformed(evt);
            }
        });

        btnBuscar9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar9.setText("PRESUPUESTO POR FUNDACIÓN");
        btnBuscar9.setMaximumSize(new java.awt.Dimension(77, 24));
        btnBuscar9.setMinimumSize(new java.awt.Dimension(77, 24));
        btnBuscar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar9ActionPerformed(evt);
            }
        });

        lbOpciones.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbOpciones.setText("Opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOpciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnListadoPresupuestoEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListadoBeneficiarioFundacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListadoAsistenciaCharla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListadoSolicitudResponsable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbListados, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbListados)
                    .addComponent(lbOpciones))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListadoBeneficiarioFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListadoPresupuestoEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListadoAsistenciaCharla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListadoSolicitudResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponsableActionPerformed
        new ResponsableControlador();
        this.dispose();
    }//GEN-LAST:event_btnResponsableActionPerformed

    private void btnFundacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFundacionActionPerformed
        new FundacionControlador();
        this.dispose();
    }//GEN-LAST:event_btnFundacionActionPerformed

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        new ServicioControlador();
        this.dispose();
    }//GEN-LAST:event_btnServicioActionPerformed

    private void btnBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar4ActionPerformed
        new SolicitudControlador();
        this.dispose();
    }//GEN-LAST:event_btnBuscar4ActionPerformed

    private void btnBeneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeneficiarioActionPerformed
        new BeneficiarioControlador();
        this.dispose();
    }//GEN-LAST:event_btnBeneficiarioActionPerformed

    private void btnListadoBeneficiarioFundacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoBeneficiarioFundacionActionPerformed
        new ListadoControlador("BENEFICIARIO_FUNDACION");
        this.dispose();
    }//GEN-LAST:event_btnListadoBeneficiarioFundacionActionPerformed

    private void btnListadoPresupuestoEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoPresupuestoEstatusActionPerformed
        new ListadoControlador("PRESUPUESTO_ESTATUS");
        this.dispose();
    }//GEN-LAST:event_btnListadoPresupuestoEstatusActionPerformed

    private void btnListadoAsistenciaCharlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoAsistenciaCharlaActionPerformed
        new ListadoControlador("ASISTENCIA_CHARLA");
        this.dispose();
    }//GEN-LAST:event_btnListadoAsistenciaCharlaActionPerformed

    private void btnListadoSolicitudResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoSolicitudResponsableActionPerformed
        new ListadoControlador("SOLICITUD_RESPONSABLE");
        this.dispose();
    }//GEN-LAST:event_btnListadoSolicitudResponsableActionPerformed

    private void btnBuscar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar9ActionPerformed
        new ListadoControlador("PRESUPUESTO_FUNDACION");
        this.dispose();
    }//GEN-LAST:event_btnBuscar9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBeneficiario;
    public javax.swing.JButton btnBuscar4;
    public javax.swing.JButton btnBuscar9;
    public javax.swing.JButton btnFundacion;
    public javax.swing.JButton btnListadoAsistenciaCharla;
    public javax.swing.JButton btnListadoBeneficiarioFundacion;
    public javax.swing.JButton btnListadoPresupuestoEstatus;
    public javax.swing.JButton btnListadoSolicitudResponsable;
    public javax.swing.JButton btnResponsable;
    public javax.swing.JButton btnServicio;
    private javax.swing.JLabel lbListados;
    private javax.swing.JLabel lbOpciones;
    // End of variables declaration//GEN-END:variables
}
