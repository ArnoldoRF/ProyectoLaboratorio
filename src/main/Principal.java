
package main;
import Controladores.CServicio;

public class Principal {

    public static void main(String[] args) {
        CServicio servicio = new CServicio();
        servicio.getVista().setVisible(true);
    }
}
