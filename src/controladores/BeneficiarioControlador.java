/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package controladores;

import modelos.BeneficiarioModelo;
import vistas.BeneficiarioVista;
import dao.BeneficiarioDao;
import utilidades.dialogo.*;

public class BeneficiarioControlador {
    
    private final BeneficiarioDao dao;
    private final BeneficiarioVista vista;
    private BeneficiarioModelo modelo;
    
    private boolean encontrado = false;
            
    public BeneficiarioControlador() {
        dao = new BeneficiarioDao();
        
        vista = new BeneficiarioVista();
        vista.setVisible(true);
        
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnEliminar.addActionListener(e -> eliminar());
    }
    
    private void cargarDatos() {
        vista.entryCedula.setText(modelo.getCedula());
        vista.entryNombre.setText(modelo.getNombre());
        vista.entryApellido.setText(modelo.getApellido());
        vista.entryTelefono.setText(modelo.getTelefono());
    }
    
    private void buscar() {
        modelo = new BeneficiarioModelo();
        modelo.setCedula(vista.entryCedula.getText());

        encontrado = dao.consultar(modelo);
        if(encontrado) {
            if(modelo.getEstatus().equals("A")) {
                vista.habilitarEdicion();
                cargarDatos();
            }
            else {
                if(Pregunta.deseaReactivar()) {
                    reactivar();
                    vista.habilitarEdicion();
                    cargarDatos();
                }
                else {
                    vista.reiniciar();
                }
            }
        }
        else {
            if(Pregunta.deseaRegistrar())
                vista.habilitarRegistro();
            else
                vista.reiniciar();
        }
    }
    
    private void eliminar() {
        boolean estaEliminado = dao.eliminar(modelo);
        
        if(estaEliminado)
            Mensaje.registroEliminado();
        else
            Problema.errorEliminar();
        
        vista.reiniciar();
    }
    
    private void reactivar() {
        modelo.setEstatus("A");
        
        boolean estaReactivado = dao.actualizar(modelo);
        if(estaReactivado)
            Mensaje.registroReactivado();
        else
            Problema.errorReactivar();
    }
    
    private void guardar() {
        modelo.setCedula(vista.entryCedula.getText());
        modelo.setNombre(vista.entryNombre.getText());
        modelo.setApellido(vista.entryApellido.getText());
        modelo.setTelefono(vista.entryTelefono.getText());
        modelo.setEstatus("A");
        
        if(encontrado) {
            if(dao.actualizar(modelo))
                Mensaje.registroActualizado();
            else
                Problema.errorActualizar();
        }
        else {
            if(dao.insertar(modelo)) 
                Mensaje.registroRegistrado();
            else
                Problema.errorRegistrar();
        }
        
        vista.reiniciar();
    }
}
