
package Vistas;

import java.awt.Color;
import javax.swing.UIManager;

public class VServicio extends javax.swing.JFrame {

    public VServicio() {
        initComponents();
        limpiar();
    }
    
    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCosto.setText("");
        
        btnInsertar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtCosto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicio");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 44, 70, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 91, 70, -1));

        jLabel3.setText("Costo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 125, 70, -1));

        btnInsertar.setText("Añadir");
        btnInsertar.setBorderPainted(false);
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 249, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.setBorderPainted(false);
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 249, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 249, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 249, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 249, -1, -1));

        txtCodigo.setBorder(null);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoMousePressed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 44, 230, -1));

        btnBuscar.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnBuscar.setBorderPainted(false);
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 40, -1, -1));

        txtCosto.setBorder(null);
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 125, 276, -1));

        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 91, 276, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 234, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMousePressed
        if(txtCodigo.getText()=="") {
            txtCodigo.setText("Ingrese el cógido");
            txtCodigo.setForeground(Color.GRAY);
        }
        if(txtCodigo.getText()!="Ingrese el código") {
            txtCodigo.setText("");
            txtCodigo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCodigoMousePressed

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked
        if(txtCodigo.getText()=="") {
            txtCodigo.setText("Ingrese el cógido");
            txtCodigo.setForeground(Color.GRAY);
        }
        if(txtCodigo.getText()!="Ingrese el código") {
            txtCodigo.setText("");
            txtCodigo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCodigoMouseClicked

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code">
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
        }
        catch (Exception e) {
            System.out.println("Error: Estilo no encontrado");
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnInsertar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
