
package Controladores;

import Modelos.MServicio;
import Vistas.VServicio;
import Modelos.CRUD.ServicioCRUD;
import Generales.Mensajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CServicio implements ActionListener {
    
    private VServicio vista;
    private MServicio modelo;
    private ServicioCRUD database;
    private boolean encontrado;
        
    public CServicio() {
        vista = new VServicio();
        modelo = new MServicio();
        database = new ServicioCRUD();
        
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnEliminar.addActionListener(e -> eliminar());
        vista.btnRegresar.addActionListener(this);
        vista.btnCancelar.addActionListener(e -> limpiar());
    }
    
    public VServicio getVista() {
        return vista;
    }
    
    public MServicio getModelo() {
        return modelo;
    }
    
    public ServicioCRUD getCRUD() {
        return database;
    }
    
    private void buscar() {
     
        
        if(vista.txtCodigo.getText() != "") {
                modelo = new MServicio();
                modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
                encontrado = database.consultar(modelo);
                
                if(encontrado) {
                    vista.txtNombre.setText(modelo.getNombre());
                    vista.txtCosto.setText(String.valueOf(modelo.getCosto()));
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
        modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
        modelo.setNombre(vista.txtNombre.getText());
        modelo.setCosto(Double.parseDouble(vista.txtCosto.getText()));
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
