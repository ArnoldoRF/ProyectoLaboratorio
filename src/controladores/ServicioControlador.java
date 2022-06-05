/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package controladores;

import modelos.ServicioModelo;
import vistas.ServicioVista;
import dao.ServicioDao;
import utilidades.dialogo.*;

public class ServicioControlador {
    
    private final ServicioDao dao;
    private final ServicioVista vista;
    private ServicioModelo modelo;
    
    private boolean encontrado = false;
            
    public ServicioControlador() {
        dao = new ServicioDao();
        
        vista = new ServicioVista();
        vista.setVisible(true);
        
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnEliminar.addActionListener(e -> eliminar());
    }
    
    private void cargarDatos() {
        vista.entryCodigo.setText(modelo.getCodigo());
        vista.entryNombre.setText(modelo.getNombre());
        vista.entryCosto.setText(String.valueOf(modelo.getCosto()));
    }
    
    private void buscar() {
        modelo = new ServicioModelo();
        modelo.setCodigo(vista.entryCodigo.getText());

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
        modelo.setCodigo(vista.entryCodigo.getText());
        modelo.setNombre(vista.entryNombre.getText());
        modelo.setCosto(Double.parseDouble(vista.entryCosto.getText()));
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
