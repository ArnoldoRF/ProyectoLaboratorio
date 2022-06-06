/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package controladores;

import modelos.SolicitudModelo;
import vistas.SolicitudVista;
import dao.SolicitudDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import utilidades.dialogo.*;

public class SolicitudControlador {
    
    private final SolicitudDao dao;
    private final SolicitudVista vista;
    private SolicitudModelo modelo;
    
    private boolean encontrado = false;
            
    public SolicitudControlador() {
        
        dao = new SolicitudDao();
        
        vista = new SolicitudVista();
        vista.setVisible(true);
        
        vista.btnBuscar.addActionListener(e -> buscar());
        //vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnEliminar.addActionListener(e -> eliminar());
    //    vista.btnAñadirServicio.addActionListener(e -> añadirServicio());
    //    vista.btnQuitarServicio.addActionListener(e -> quitarServicio());
    }
    
    private void cargarDatos() {
        vista.entryCodigo.setText(modelo.getCodigo());
        vista.entryBeneficiario.setText(modelo.getCedulaBeneficiario());
        vista.entryResponsable.setText(modelo.getCedulaResponsable());
        vista.boxFundaciones.addItem(modelo.getCodigoFundacion());
        vista.boxPrioridad.setSelectedItem(modelo.getPrioridad());
        vista.entryPresupuesto.setText(String.valueOf(modelo.getCostoTotal()));
        vista.entryEstatus.setText(modelo.getEstado());
        /*vista.entryPresupuesto.setText(String.valueOf(modelo.getPresupuesto()));
        
        servicios = dao.listarServicios(modelo.getCodigo());
        DefaultTableModel tableModel = (DefaultTableModel) vista.tablaServicio.getModel();
        tableModel.setRowCount(0);
        
        String[] datosServicio = new String[2];
        for(ServicioModelo servicio : servicios) {
            datosServicio[0] = servicio.getCodigo();
            datosServicio[1] = servicio.getNombre();
            
            tableModel.addRow(datosServicio);
        }
        
        vista.tablaServicio.setModel(tableModel);
        */
    }
    
    private void buscar() {
        modelo = new SolicitudModelo();
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
    /*
    private void guardar() {
        modelo.setCodigo(vista.entryCodigo.getText());
        modelo.setNombre(vista.entryNombre.getText());
        modelo.setPresupuesto(Double.parseDouble(vista.entryPresupuesto.getText()));
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
    
    public void añadirServicio() {
        String codigoServicio = Mensaje.showInputDialog("Ingrese el código del servicio");
        
        boolean estaRepetido = false; 
        for(ServicioModelo servicio : servicios)
            if(servicio.getCodigo().equals(codigoServicio))
                estaRepetido = true;
        
        if(estaRepetido)
            Mensaje.mensaje("Esta fundación ya presta este servicio");
        else {
            if(new ServicioDao().existe(codigoServicio)) {
                if(dao.añadirServicio(modelo, codigoServicio)) {
                    Mensaje.mensaje("Servicio añadido exitosamente");
                }
            }
            else
                Mensaje.mensaje("El servicio no existe");
        }
        
        cargarDatos();
    }
    
    public void quitarServicio() {
        String codigoServicio = Mensaje.showInputDialog("Ingrese el código del servicio");
        
        boolean estaRepetido = false; 
        for(ServicioModelo servicio : servicios) {
            if(servicio.getCodigo().equals(codigoServicio)) {
                estaRepetido = true;
            }
        }
        
        if(estaRepetido) {
            if(dao.eliminarServicio(modelo, codigoServicio))
                Mensaje.mensaje("Servicio eliminado exitosamente");
            else
                Mensaje.mensaje("El servicio no fue eliminado");
        }
        else
            Mensaje.mensaje("La fundación no presta ese servicio");
        
        cargarDatos();
    }*/
}
