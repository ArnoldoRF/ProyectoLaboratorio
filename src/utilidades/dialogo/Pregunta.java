/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package utilidades.dialogo;

import javax.swing.JOptionPane;

public class Pregunta extends JOptionPane {
    
    public static boolean preguntar(String pregunta, String mensaje) {
        int respuesta = showConfirmDialog(null, pregunta, mensaje, YES_NO_OPTION);
        return respuesta == YES_OPTION;
    }
    
    public static boolean deseaRegistrar() {
        return preguntar("Registro no encontrado. ¿Desea registrarlo?", "Registrando");
    }
    
    public static boolean deseaReactivar() {
        return preguntar("Registro inactivo. ¿Desea activarlo?", "Reactivando");
    }
    
    public static boolean deseaCancelar() {
        return preguntar("¿Desea cancelar?", "Cancelando");
    }
    
    public static boolean deseaRegresar() {
        return preguntar("¿Desea regresar?", "Regresando");
    }
    
    public static boolean deseaSalir() {
        return preguntar("¿Desea salir?", "Saliendo");
    }
}