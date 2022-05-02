
package main;
import Controladores.CSolicitud;
import Controladores.CBeneficiario;

public class Principal {

    public static void main(String[] args) {
        //CBeneficiario servicio = new CBeneficiario();
        //servicio.getVista().setVisible(true);
        
        CSolicitud vi = new CSolicitud();
        vi.getVista().setVisible(true);
    }
}
