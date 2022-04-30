
package main;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import Controladores.CServicio;

public class Principal extends JFrame {

    public static void main(String[] args) {
        JFrame j = new JFrame();
        CServicio servicio = new CServicio();
        System.out.println("Hola");
        servicio.getVista().setVisible(true);
        servicio.getVista().show();;
        j.add(servicio.getVista());
        j.setSize(300, 400);
        j.setVisible(true);
    }
    
}
