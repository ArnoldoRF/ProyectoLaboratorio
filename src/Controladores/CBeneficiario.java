
package Controladores;

import Modelos.MBeneficiario;
import Vistas.VBeneficiario;
import Modelos.CRUD.BeneficiarioCRUD;
import Generales.Mensajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CBeneficiario implements ActionListener {
    
    private VBeneficiario vista;
    private MBeneficiario modelo;
    private BeneficiarioCRUD database;
    private boolean encontrado;
        
    public CBeneficiario() {
        vista = new VBeneficiario();
        modelo = new MBeneficiario();
        database = new BeneficiarioCRUD();
        vista.setVisible(true);
        
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnEliminar.addActionListener(e -> eliminar());
        vista.btnRegresar.addActionListener(this);
        vista.btnCancelar.addActionListener(e -> limpiar());
    }
    
    public VBeneficiario getVista() {
        return vista;
    }
    
    public MBeneficiario getModelo() {
        return modelo;
    }
    
    public BeneficiarioCRUD getCRUD() {
        return database;
    }
    
    private void buscar() {
        if(vista.txtCedula.getText() != "") {
                modelo = new MBeneficiario();
                modelo.setCedula(vista.txtCedula.getText());
                encontrado = database.consultar(modelo);
                
                if(encontrado) {
                    vista.txtNombre.setText(modelo.getNombre());
                    vista.txtApellido.setText(modelo.getApellido());
                    vista.txtTelefono.setText(modelo.getTelefono());
                }
                else {
                    Mensajes msj = new Mensajes();
                    msj.mnencontrado();
                    vista.limpiar();
                }
            }
            else {
                System.out.printf("Error: No hay código escrito");
            }
    }
    
    private void limpiar() {
        vista.limpiar();
    }
    
    private void eliminar() {
        database.eliminar(modelo);
    }
    
    private void guardar() {
        modelo.setCedula(vista.txtCedula.getText());
        modelo.setNombre(vista.txtNombre.getText());
        modelo.setApellido(vista.txtApellido.getText());
        modelo.setTelefono(vista.txtTelefono.getText());
        modelo.setEstatus("A");
        
        if(encontrado)
            database.actualizar(modelo);
        else 
            database.insertar(modelo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
