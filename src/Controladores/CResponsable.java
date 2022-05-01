
package Controladores;

import Modelos.MResponsable;
import Vistas.VResponsable;
import Modelos.CRUD.ResponsableCRUD;
import Generales.Mensajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CResponsable implements ActionListener {
    
    private VResponsable vista;
    private MResponsable modelo;
    private ResponsableCRUD database;
    private boolean encontrado;
        
    public CResponsable() {
        vista = new VResponsable();
        modelo = new MResponsable();
        database = new ResponsableCRUD();
        
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnEliminar.addActionListener(e -> eliminar());
        vista.btnRegresar.addActionListener(this);
        vista.btnCancelar.addActionListener(e -> limpiar());
    }
    
    public VResponsable getVista() {
        return vista;
    }
    
    public MResponsable getModelo() {
        return modelo;
    }
    
    public ResponsableCRUD getCRUD() {
        return database;
    }
    
    private void buscar() {
        if(vista.txtCedula.getText() != "") {
                modelo = new MResponsable();
                modelo.setCedula(vista.txtCedula.getText());
                encontrado = database.consultar(modelo);
                
                if(encontrado) {
                    vista.txtNombre.setText(modelo.getNombre());
                    vista.txtApellido.setText(modelo.getApellido());
                    vista.txtTelefono.setText(modelo.getTelefono());
                    vista.txtFundacion.setText(String.valueOf(modelo.getCodigoFundacion()));
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
        modelo.setCodigoFundacion(Integer.parseInt(vista.txtFundacion.getText()));
        modelo.setEstatus("A");
        
        if(encontrado)
            database.actualizar(modelo);
        else 
            database.insertar(modelo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
