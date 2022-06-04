/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package utilidades.dialogo;

import javax.swing.JOptionPane;

public class Mensaje extends JOptionPane {
    
    public static void mensaje(String mensaje) {
        showMessageDialog(null, mensaje);
    }
    
    public static void registroEncontrado() {
        mensaje("¡Registro encontrado!");
    }
    
    public static void registroReactivado() {
        mensaje("¡Reactivado exitosamente!");
    }
    
    public static void registroRegistrado() {
        mensaje("¡Registrado exitosamente!");
    }
    
    public static void registroActualizado() {
        mensaje("¡Actualizado exitosamente!");
    }

    public static void registroEliminado() {
        mensaje("¡Eliminado exitosamente!");
    }
}