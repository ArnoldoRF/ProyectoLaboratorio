
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

public class CSolicitud implements ActionListener {
    
    private VSolicitud vista;
    private MSolicitud modelo;
    private SolicitudCRUD database;
    
    private boolean encontrado;
    
    private ArrayList<MFundacion> fundaciones;
    
    public CSolicitud() {
        vista = new VSolicitud();
        modelo = new MSolicitud();
        database = new SolicitudCRUD();
        cargarFundaciones();
        
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
            /*ConexionDB conn = new ConexionDB();
            conn.conectar();
        
            String sql = "SELECT cod_fund, nombre_fund FROM public.fundacion "
                        + "WHERE estatus=?";
        
            try(PreparedStatement ps = conn.con.prepareStatement(sql)) {
                ps.setString(1, "A");
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()) {
                    MFundacion fundacion = new MFundacion();
                    fundacion.setCodigo(Integer.parseInt(rs.getString("cod_fund")));
                    fundacion.setNombre(rs.getString("nombre_fund"));
                    vista.boxFundacion.addItem(fundacion.getNombre());
                }
            }
            catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            conn.desconectar();*/
            ArrayList<MFundacion> fundaciones = new FundacionCRUD().optenerFundaciones();
            for(MFundacion fundacion : fundaciones) {
                vista.boxFundacion.addItem(fundacion.getNombre());
            }
    }
    
    public void consultar() {
        if(!vista.txtCedula.getText().isBlank()) {
                MBeneficiario beneficiario = new MBeneficiario();
                beneficiario.setCedula(vista.txtCedula.getText());
                encontrado = new BeneficiarioCRUD().consultar(beneficiario);
                
                if(!encontrado || !beneficiario.getEstatus().contentEquals("A")) {
                    Mensajes msj = new Mensajes();
                    msj.mnencontrado();
                    //vista.limpiar();
                }
                System.out.println("nanana");
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
