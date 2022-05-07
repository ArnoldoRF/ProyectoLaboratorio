/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Controladores;

import Modelos.MBeneficiario;
import Vistas.VBeneficiario;
import Modelos.CRUD.BeneficiarioCRUD;
import Generales.Dialogo;
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
    
     private void setDatos() {
        vista.txtNombre.setText(modelo.getNombre());
        vista.txtApellido.setText(modelo.getApellido());
        vista.txtTelefono.setText(modelo.getTelefono());
    }
    
    private void activarOpciones() {
        vista.activarBoton(vista.btnGuardar);
        vista.activarBoton(vista.btnEliminar);
    }
    
    private void buscar() {
        if(vista.txtCedula.getText() != "") {
                modelo = new MBeneficiario();
                modelo.setCedula(vista.txtCedula.getText());
                encontrado = database.consultar(modelo);
                
                if(encontrado) {
                    if (modelo.getEstatus().contentEquals("A")) {
                        setDatos();
                        activarOpciones();
                        vista.registroenc();
                    }
                    else {
                        boolean resp = Dialogo.preguntaReactivar();
                            if(resp) {
                                reactivar();
                                setDatos();
                                activarOpciones();
                        }
                    }
                }
                else {
                    boolean resp = Dialogo.preguntaRegistrar();
                    if(resp)
                        vista.registronoenc();
                    else
                        vista.reiniciar();
                }
            }
            else {
                System.out.printf("Error: No hay código escrito");
            }
    }
    
        
    private void reactivar() {
        modelo.setEstatus("A");
        database.actualizar(modelo);
    }
    
    private void limpiar() {
        vista.limpiar();
        vista.sinregistro();
    }
    
    private void eliminar() {
        database.eliminar(modelo);
        vista.reiniciar();
        Dialogo.eliminado();
    }
    
    private void guardar() {
        modelo.setCedula(vista.txtCedula.getText());
        modelo.setNombre(vista.txtNombre.getText());
        modelo.setApellido(vista.txtApellido.getText());
        modelo.setTelefono(vista.txtTelefono.getText());
        modelo.setEstatus("A");
        
        if(encontrado){
            database.actualizar(modelo);
            Dialogo.actualizado();
            limpiar();
        }else {
            database.insertar(modelo);
            Dialogo.registrado();
            limpiar();
         }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
