
package main;

import Modelos.MServicio;
import Controladores.CServicio;
import Vistas.VServicio;

public class Principal {

    public static void main(String[] args) {
        MServicio ser = new MServicio();
        VServicio ta = new VServicio();
        CServicio sd = new CServicio(ta, ser);
        ta.setVisible(true);
    }
    
}
