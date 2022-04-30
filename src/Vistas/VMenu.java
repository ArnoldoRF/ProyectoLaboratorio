
package Vistas;

import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;


public class VMenu extends javax.swing.JFrame {

  
    public VMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnBeneficiario = new javax.swing.JMenuItem();
        btnResponsable = new javax.swing.JMenuItem();
        btnAgenda = new javax.swing.JMenuItem();
        btnFundacion = new javax.swing.JMenuItem();
        btnSolicitud = new javax.swing.JMenuItem();
        btnServicios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnprobarCone = new javax.swing.JMenuItem();
        boton = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1113, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        btnArchivo.setText("Archivo");

        btnBeneficiario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnBeneficiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/beneficiario.png"))); // NOI18N
        btnBeneficiario.setText("Beneficiario");
        btnBeneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeneficiarioActionPerformed(evt);
            }
        });
        btnArchivo.add(btnBeneficiario);

        btnResponsable.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnResponsable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/responsable.png"))); // NOI18N
        btnResponsable.setText("Responsable");
        btnArchivo.add(btnResponsable);

        btnAgenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agenda.png"))); // NOI18N
        btnAgenda.setText("Agenda");
        btnArchivo.add(btnAgenda);

        btnFundacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnFundacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundacion.png"))); // NOI18N
        btnFundacion.setText("Fundacion");
        btnArchivo.add(btnFundacion);

        btnSolicitud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/curriculum.png"))); // NOI18N
        btnSolicitud.setText("Solicitud");
        btnArchivo.add(btnSolicitud);

        btnServicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios.png"))); // NOI18N
        btnServicios.setText("Servicios");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        btnArchivo.add(btnServicios);

        jMenuBar1.add(btnArchivo);

        jMenu2.setText("Edit");

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        btnprobarCone.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnprobarCone.setText("Probar Conexion");
        btnprobarCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprobarConeActionPerformed(evt);
            }
        });
        jMenu3.add(btnprobarCone);

        jMenuBar1.add(jMenu3);

        boton.setText("Salir");

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        btnSalir.setText("Salir");
        boton.add(btnSalir);

        jMenuBar1.add(boton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
       VServicio mostrar  = new VServicio();
        escritorio.add(mostrar);
        mostrar.show();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnprobarConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprobarConeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprobarConeActionPerformed

    private void btnBeneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeneficiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBeneficiarioActionPerformed

    
    public void agregarListener(ActionListener actionListener) {
        getBtnResponsable().addActionListener(actionListener);
        getBtnAgenda().addActionListener(actionListener);
        getBtnFundacion().addActionListener(actionListener);
        getBtnSalir().addActionListener(actionListener);
        getBtnServicios().addActionListener(actionListener);
        getBtnSolicitud().addActionListener(actionListener);
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu boton;
    private javax.swing.JMenuItem btnAgenda;
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenuItem btnBeneficiario;
    private javax.swing.JMenuItem btnFundacion;
    private javax.swing.JMenuItem btnResponsable;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btnServicios;
    private javax.swing.JMenuItem btnSolicitud;
    private javax.swing.JMenuItem btnprobarCone;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnBeneficiario
     */
    public javax.swing.JMenuItem getBtnBeneficiario() {
        return btnBeneficiario;
    }

    /**
     * @param btnBeneficiario the btnBeneficiario to set
     */
    public void setBtnBeneficiario(javax.swing.JMenuItem btnBeneficiario) {
        this.btnBeneficiario = btnBeneficiario;
    }

    /**
     * @return the btnResponsable
     */
    public javax.swing.JMenuItem getBtnResponsable() {
        return btnResponsable;
    }

    /**
     * @param btnResponsable the btnResponsable to set
     */
    public void setBtnResponsable(javax.swing.JMenuItem btnResponsable) {
        this.btnResponsable = btnResponsable;
    }

    /**
     * @return the btnarchivo
     */
    public javax.swing.JMenu getBtnarchivo() {
        return getBtnArchivo();
    }

    /**
     * @param btnarchivo the btnarchivo to set
     */
    public void setBtnarchivo(javax.swing.JMenu btnarchivo) {
        this.setBtnArchivo(btnarchivo);
    }

    /**
     * @return the btnAgenda
     */
    public javax.swing.JMenuItem getBtnAgenda() {
        return btnAgenda;
    }

    /**
     * @param btnAgenda the btnAgenda to set
     */
    public void setBtnAgenda(javax.swing.JMenuItem btnAgenda) {
        this.btnAgenda = btnAgenda;
    }

    /**
     * @return the btnArchivo
     */
    public javax.swing.JMenu getBtnArchivo() {
        return btnArchivo;
    }

    /**
     * @param btnArchivo the btnArchivo to set
     */
    public void setBtnArchivo(javax.swing.JMenu btnArchivo) {
        this.btnArchivo = btnArchivo;
    }

    /**
     * @return the btnFundacion
     */
    public javax.swing.JMenuItem getBtnFundacion() {
        return btnFundacion;
    }

    /**
     * @param btnFundacion the btnFundacion to set
     */
    public void setBtnFundacion(javax.swing.JMenuItem btnFundacion) {
        this.btnFundacion = btnFundacion;
    }

    /**
     * @return the btnSalir
     */
    public javax.swing.JMenuItem getBtnSalir() {
        return btnSalir;
    }

    /**
     * @param btnSalir the btnSalir to set
     */
    public void setBtnSalir(javax.swing.JMenuItem btnSalir) {
        this.btnSalir = btnSalir;
    }

    /**
     * @return the btnServicios
     */
    public javax.swing.JMenuItem getBtnServicios() {
        return btnServicios;
    }

    /**
     * @param btnServicios the btnServicios to set
     */
    public void setBtnServicios(javax.swing.JMenuItem btnServicios) {
        this.btnServicios = btnServicios;
    }

    /**
     * @return the btnSolicitud
     */
    public javax.swing.JMenuItem getBtnSolicitud() {
        return btnSolicitud;
    }

    /**
     * @param btnSolicitud the btnSolicitud to set
     */
    public void setBtnSolicitud(javax.swing.JMenuItem btnSolicitud) {
        this.btnSolicitud = btnSolicitud;
    }


}
