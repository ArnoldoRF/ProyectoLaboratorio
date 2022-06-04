/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package utilidades.dialogo;

import javax.swing.JOptionPane;

public class Problema extends JOptionPane {
    
    public static void error(String error) {
        showMessageDialog(null, error, "", ERROR_MESSAGE);
    }
    
    public static void errorReactivar() {
        error("Error: no se puedo reactivar el registro");
    }
    
    public static void errorRegistrar() {
        error("Error: no se puedo registrar");
    }
    
    public static void errorActualizar() {
        error("Error: no se pudo actualizar el registro");
    }

    public static void errorEliminar() {
        error("Error: no se pudo eliminar el registro");
    }
}
