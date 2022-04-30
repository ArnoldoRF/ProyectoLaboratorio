
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
    
    public CServicio(CMenu cmenu){
        //vserv = new VServicio(cmenu.getVMenu(),false,null)
    }
    
    public CServicio() {
        vista = new VServicio();
        modelo = new MServicio();
        database = new ServicioCRUD();
        
        vista.btnBuscar.addActionListener(this);
        //vista.btnInsertar.addActionListener(this);
        //vista.btnModificar.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnRegresar.addActionListener(this);
        vista.btnCancelar.addActionListener(this);
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnBuscar) {
            if(vista.txtCodigo.getText() != "") {
                modelo = new MServicio();
                modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
                if(database.consultar(modelo)) {
                    encontrado = true;
                
                    vista.txtNombre.setText(modelo.getNombre());
                    vista.txtCosto.setText(String.valueOf(modelo.getCosto()));
                
                    //vista.btnEliminar.setEnabled(true);
                    //vista.btnInsertar.setEnabled(true);
                    //vista.btnModificar.setEnabled(true);
                }
                else {
                    Mensajes msj = new Mensajes();
                    msj.mnencontrado();
                    encontrado = false;
                    //vista.limpiar();
                }
            }
            else {
                System.out.printf("Error: No hay código escrito");
            }
        }
        
        if(e.getSource() == vista.btnCancelar)  {
            //vista.limpiar();
        }
        
        if(e.getSource() == vista.btnGuardar) {
            if(encontrado) {
                modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
                modelo.setNombre(vista.txtNombre.getText());
                modelo.setCosto(Double.parseDouble(vista.txtCosto.getText()));
                database.actualizar(modelo);
            }
            else {
                modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
                modelo.setNombre(vista.txtNombre.getText());
                modelo.setCosto(Double.parseDouble(vista.txtCosto.getText()));
                database.insertar(modelo);
            }
        }
        
        if(e.getSource() == vista.btnEliminar) {
            modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
            database.eliminar(modelo);
        }
    }
}
