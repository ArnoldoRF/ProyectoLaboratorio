
package Controladores;

import Controladores.CBeneficiario;
import Vistas.VBeneficiario;

public class CSolicitud {
    CBeneficiario ne;
    
    public CSolicitud() {
        ne = new CBeneficiario();
        VBeneficiario n = ne.getVista();
        n.setVisible(true);
        n.btnEliminar.setText("SIGUIENTE");
    }
}
