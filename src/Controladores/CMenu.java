
package Controladores;

import Generales.Mensajes;
import Modelos.MMenu;
import Vistas.VMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CMenu implements ActionListener {
    private Mensajes msj=new Mensajes();
    private VMenu vmenu ;
    
    public CMenu(){
        vmenu = new VMenu();
        vmenu.setVisible(true);
        vmenu.setTitle("MENU GESTION SOCIAL");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("PROBANDOOOOOOOOOOOOOOOOOOOOO");
    }
    
}


