
package Controladores;

import Generales.Mensajes;
import Vistas.VSolicitud;
import Modelos.CRUD.FundacionCRUD;
import Modelos.MSolicitud;
import Modelos.CRUD.SolicitudCRUD;
import Modelos.MBeneficiario;
import Modelos.CRUD.BeneficiarioCRUD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelos.MFundacion;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import Modelos.Database.ConexionDB;
import Modelos.MServicio;
import javax.swing.table.DefaultTableModel;

public class CSolicitud implements ActionListener {
    
    private VSolicitud vista;
    private MSolicitud modelo;
    private SolicitudCRUD database;
    
    private boolean encontrado;
    
    private ArrayList<MFundacion> fundaciones;
    private ArrayList<MServicio> servicios;
    
    public CSolicitud() {
        vista = new VSolicitud(this);
        modelo = new MSolicitud();
        database = new SolicitudCRUD();
        vista.setVisible(true);
        //cargarFundaciones();
        
        vista.btnConsultar.addActionListener(e -> consultar());
        //vista.btnGuardar.addActionListener(e -> guardar());
        //vista.btnCancelar.addActionListener(e -> limpiar());
        //vista.btnRegresar.addActionListener(this);
    }
    
    public VSolicitud getVista() {
        return vista;
    }
    
    public MSolicitud getModelo() {
        return modelo;
    }
    
    public SolicitudCRUD getCRUD() {
        return database;
    }
    
    public void cargarFundaciones() {
        fundaciones = new FundacionCRUD().optenerFundaciones();
        vista.boxFundacion.addItem("");
        for(MFundacion fundacion : fundaciones) {
            vista.boxFundacion.addItem(fundacion.getNombre());
        }
    }
    
    public void cargarServicios() {
        String codigo = "";
        for(MFundacion fundacion : fundaciones) {
            if(fundacion.getNombre().equals((String)vista.boxFundacion.getSelectedItem())) {
                codigo = String.valueOf(fundacion.getCodigo());
                //servicios = new ArrayList<
                servicios = new FundacionCRUD().optenerServicios(codigo);
                DefaultTableModel dt = (DefaultTableModel) vista.tablaServicio.getModel();
                dt.setRowCount(0);
                for(MServicio servicio : servicios) {
                    Object[] fila = new Object[2];
                    fila[0] = servicio.getNombre();
                    fila[1] = false;
                    dt.addRow(fila);
                }
            }
        }
    }
    
    public void consultar() {
        if(!vista.txtCedula.getText().isBlank()) {
            encontrado = new BeneficiarioCRUD().consultar(vista.txtCedula.getText());
                if(!encontrado) {
                    Mensajes msj = new Mensajes();
                    msj.mnencontrado();
                }
                else {
                    vista.boxFundacion.setEnabled(true);
                    cargarFundaciones();
                }
            }
        else {
            System.out.printf("Error: No hay código escrito");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
