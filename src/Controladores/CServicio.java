/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
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
    private Mensajes msj;
    
    private boolean encontrado;
        
    public CServicio() {
        vista = new VServicio();
        modelo = new MServicio();
        database = new ServicioCRUD();
        msj = new Mensajes();
        vista.setVisible(true);
        
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnEliminar.addActionListener(e -> eliminar());
        vista.btnCancelar.addActionListener(e -> limpiar());
        vista.btnRegresar.addActionListener(this);
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
    
    private void setDatos() {
        vista.txtNombre.setText(modelo.getNombre());
        vista.txtCosto.setText(String.valueOf(modelo.getCosto()));
    }
    
    private void activarOpciones() {
        vista.activarBoton(vista.btnGuardar);
        vista.activarBoton(vista.btnEliminar);
    }
    
    private void buscar() {
        if(!vista.txtCodigo.getText().isBlank()) {
                modelo = new MServicio();
                modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
                encontrado = database.consultar(modelo);
                
                if(encontrado) {
                    if(modelo.getEstatus().contentEquals("A")) {
                        setDatos();
                        activarOpciones();
                        vista.registroenc();
                    }
                    else {
                        int resp = msj.mpreguntar("Registro eliminado. ¿Desea restaurarlo?", "Restaurado");
                        if(resp == 0) {
                            reactivar();
                            setDatos();
                            activarOpciones();
                        }
                    }
                }
                else {
                    int resp = msj.mpreguntar("Registro inexistente. ¿Desea añadirlo?", "Restaurado");
                    if(resp == 0)
                        vista.registronoenc();
                    else
                        vista.reiniciar();
                }
            }
            else {
                msj.madvertencia("Por favor escriba el código");
            }
    }
    
    private void limpiar() {
        vista.reiniciar();
        vista.sinregistro();
    }
    
    private void eliminar() {
        database.eliminar(modelo);
        vista.reiniciar();
        msj.meliminado();
    }
    
    private void reactivar() {
        modelo.setEstatus("A");
        database.actualizar(modelo);
    }
    
    private void guardar() {
        modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
        modelo.setNombre(vista.txtNombre.getText());
        modelo.setCosto(Double.parseDouble(vista.txtCosto.getText()));
        modelo.setEstatus("A");
        
        if(encontrado){
            database.actualizar(modelo);
            msj.mactualizado();
            limpiar();
        }else{
            database.insertar(modelo);
            msj.mregistrado();
            limpiar();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
