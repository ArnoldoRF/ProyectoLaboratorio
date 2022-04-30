
package Vistas;

public class VServicio extends javax.swing.JInternalFrame {

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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(50, 255, 181));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(null);

        jLabel1.setText("Código:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 50, 40);
        jPanel2.add(txtCodigo);
        txtCodigo.setBounds(70, 20, 230, 40);

        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(310, 20, 100, 40);

        jLabel8.setFont(new java.awt.Font("Aller Light", 0, 12)); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 430, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 20, 430, 80);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(null);

        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 60, 70, 40);

        jLabel3.setText("Costo:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 130, 60, 40);
        jPanel3.add(txtNombre);
        txtNombre.setBounds(100, 60, 280, 40);
        jPanel3.add(txtCosto);
        txtCosto.setBounds(100, 130, 280, 40);

        jLabel7.setFont(new java.awt.Font("Aller Light", 0, 12)); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 430, 250);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 120, 430, 250);

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setLayout(null);

        btnInsertar.setText("Añadir");
        jPanel5.add(btnInsertar);
        btnInsertar.setBounds(30, 40, 110, 30);

        btnEliminar.setText("Eliminar");
        jPanel5.add(btnEliminar);
        btnEliminar.setBounds(30, 120, 110, 30);

        btnCancelar.setText("Cancelar");
        jPanel5.add(btnCancelar);
        btnCancelar.setBounds(30, 160, 110, 30);

        btnSalir.setText("Salir");
        jPanel5.add(btnSalir);
        btnSalir.setBounds(30, 200, 110, 30);

        btnModificar.setText("Modificar");
        jPanel5.add(btnModificar);
        btnModificar.setBounds(30, 80, 110, 30);

        jLabel4.setFont(new java.awt.Font("Aller Light", 0, 12)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 0, 170, 250);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(490, 120, 170, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
