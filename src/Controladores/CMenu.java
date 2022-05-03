/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
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


