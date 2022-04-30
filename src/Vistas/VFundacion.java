
package Vistas;

public class VFundacion extends javax.swing.JDialog {

    public VFundacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 255, 181));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(null);

        jButton9.setText("Guardar");
        jPanel4.add(jButton9);
        jButton9.setBounds(10, 10, 72, 22);

        jButton7.setText("Insertar");
        jPanel4.add(jButton7);
        jButton7.setBounds(90, 10, 72, 22);

        jButton6.setText("Borrar");
        jPanel4.add(jButton6);
        jButton6.setBounds(170, 10, 72, 22);

        jButton10.setText("jButton9");
        jPanel4.add(jButton10);
        jButton10.setBounds(330, 10, 75, 22);

        jButton8.setText("Salir");
        jPanel4.add(jButton8);
        jButton8.setBounds(250, 10, 72, 22);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 370, 780, 40);

        jTabbedPane3.setBackground(new java.awt.Color(51, 153, 255));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setLayout(null);

        jButton11.setText("Quitar servicio");
        jPanel5.add(jButton11);
        jButton11.setBounds(6, 119, 106, 22);

        jButton12.setText("Agregar servicio");
        jPanel5.add(jButton12);
        jButton12.setBounds(118, 119, 115, 22);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable3);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(171, 6, 390, 103);

        jTabbedPane3.addTab("Servicios", jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));
        jPanel6.setLayout(null);
        jTabbedPane3.addTab("Solicitudes", jPanel6);

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));
        jPanel7.setLayout(null);
        jTabbedPane3.addTab("Responsables", jPanel7);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(10, 150, 780, 200);

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));
        jPanel8.setLayout(null);

        jLabel1.setText("codigo");
        jPanel8.add(jLabel1);
        jLabel1.setBounds(34, 18, 75, 16);

        jLabel2.setText("jLabel1");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(34, 55, 75, 16);

        jLabel3.setText("jLabel1");
        jPanel8.add(jLabel3);
        jLabel3.setBounds(34, 92, 75, 16);

        jButton1.setText("Buscar");
        jPanel8.add(jButton1);
        jButton1.setBounds(663, 15, 72, 22);

        jTextField1.setText("jTextField1");
        jPanel8.add(jTextField1);
        jTextField1.setBounds(115, 15, 542, 22);

        jTextField2.setText("jTextField2");
        jPanel8.add(jTextField2);
        jTextField2.setBounds(115, 49, 620, 22);

        jTextField3.setText("jTextField3");
        jPanel8.add(jTextField3);
        jTextField3.setBounds(115, 89, 620, 22);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(10, 10, 780, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
