
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
import Modelos.MServicio;
import Modelos.MFundacion;
import java.util.ArrayList;

public class CSolicitud implements ActionListener {
    
    private VSolicitud vista;
    private MSolicitud modelo;
    private SolicitudCRUD database;
    
    private boolean encontrado;
    
    private ArrayList<MFundacion> fundaciones;
    private ArrayList<MServicio> servicios;
    
    public CSolicitud() {
        vista = new VSolicitud();
        modelo = new MSolicitud();
        database = new SolicitudCRUD();
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
