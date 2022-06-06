/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package controladores;

import vistas.ListadoVista;
import dao.ListadoDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListadoControlador {
    
    private final ListadoDao dao;
    private final ListadoVista vista;
    
    private boolean encontrado = false;
            
    public ListadoControlador(String tipo) {
        dao = new ListadoDao();
        
        vista = new ListadoVista();
        
        switch (tipo) {
            case "BENEFICIARIO_FUNDACION":
                vista.listarBeneficiarioFundacion();
                setTabla(dao.listarBeneficiarioFundacion());
                vista.setTitle("Detalles de los solicitantes por fundación");
                break;
            case "PRESUPUESTO_ESTATUS":
                vista.listarPresupuestoEstatus();
                setTabla(dao.listarPresupuestoEstatus());
                vista.setTitle("Listado de presupuestos por estatus");
                break;
            case "ASISTENCIA_CHARLA":
                vista.listarAsistenciaCharla();
                setTabla(dao.listarAsistenciaCharla());
                vista.setTitle("Listado de asistencia por charla");
                break;
            case "PRESUPUESTO_FUNDACION":
                vista.listarPresupuestoFundacion();
                setTabla(dao.listarPresupuestoFundacion());
                vista.setTitle("Detalles del presupuesto por fundacion");
                break;
            case "SOLICITUD_RESPONSABLE":
                vista.listarSolicitudResponsable();
                setTabla(dao.listarSolicitudResponsable());
                vista.setTitle("Listado de solicitudes asignadas a un responsable");
                break;
        }
        
        vista.setVisible(true);
    }
    
    public void setTabla(List<List<String>> listado) {
        DefaultTableModel modeloTabla = (DefaultTableModel) vista.tablaListado.getModel();
        for(List<String> datos : listado) {
            modeloTabla.addRow(datos.toArray(String[]::new));
        }
        vista.tablaListado.setModel(modeloTabla);
    }
}
