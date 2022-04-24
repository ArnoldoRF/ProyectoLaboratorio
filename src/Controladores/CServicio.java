
package Controladores;

import Generales.Mensajes;
import Modelos.MServicio;
import Vistas.VServicio;
import Modelos.CRUD.ServicioCRUD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CServicio implements ActionListener {
    
    private VServicio vista;
    private MServicio modelo;
    private ServicioCRUD crud;
    
    public CServicio(CMenu cmenu){
        //vserv = new VServicio(cmenu.getVMenu(),false,null)
    }
    
    public CServicio(VServicio vista, MServicio modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.crud = new ServicioCRUD();
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnInsertar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnBuscar) {
            if(vista.txtCodigo.getText() != "") {
                modelo.setCodigo(vista.txtCodigo.getText());
                crud.consultar(modelo);
                
                vista.txtNombre.setText(modelo.getNombre());
                vista.txtCosto.setText(String.valueOf(modelo.getCosto()));
                
                vista.btnEliminar.setEnabled(true);
                vista.btnInsertar.setEnabled(true);
                vista.btnModificar.setEnabled(true);
            }
            else {
                System.out.printf("Error: No hay código escrito");
            }
        }
        
        if(e.getSource() == vista.btnCancelar)  {
            vista.limpiar();
        }
        
        if(e.getSource() == vista.btnInsertar) {
            modelo.setCodigo(vista.txtCodigo.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setCosto(Double.parseDouble(vista.txtCosto.getText()));
            crud.insertar(modelo);
        }
        
        if(e.getSource() == vista.btnModificar) {
            modelo.setCodigo(vista.txtCodigo.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setCosto(Double.parseDouble(vista.txtCosto.getText()));
            crud.insertar(modelo);
        }
        
        if(e.getSource() == vista.btnEliminar) {
            modelo.setCodigo(vista.txtCodigo.getText());
            crud.eliminar(modelo);
        }
    }
}
