/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package Generales;
import javax.swing.*;

public class Dialogo extends JOptionPane {
    
    public static void mensaje(String mensaje) {
        showMessageDialog(null, mensaje);
    }
    
    public static void encontrado() {
        mensaje("¡Registro encontrado!");
    }
    
    public static void reactivado() {
        mensaje("¡Reactivado exitosamente!");
    }
    
    public static void registrado() {
        mensaje("¡Registrado exitosamente!");
    }
    
    public static void actualizado() {
        mensaje("¡Actualizado exitosamente!");
    }

    public static void eliminado() {
        mensaje("¡Eliminado exitosamente!");
    }
    
    public static boolean preguntar(String pregunta, String mensaje) {
        int respuesta = showConfirmDialog(null, pregunta, mensaje, YES_NO_OPTION);
        return respuesta == YES_OPTION;
    }
    
    public static boolean preguntaRegistrar() {
        return preguntar("Registro no encontrado. ¿Desea registrarlo?", "Registrando");
    }
    
    public static boolean preguntaReactivar() {
        return preguntar("Registro inactivo. ¿Desea activarlo?", "Reactivando");
    }
    
    public static boolean preguntaCancelar() {
        return preguntar("¿Desea cancelar?", "Cancelando");
    }
    
    public static boolean preguntaSalir() {
        return preguntar("¿Desea salir?", "Saliendo");
    }
    
    public static void advertencia(String mensaje) {
        showMessageDialog(null, mensaje, "Informando", WARNING_MESSAGE);
    }
    
    /*
    public static boolean preguntaAdvertencia(String pregunta, String mensaje) {
        int respuesta = showConfirmDialog(null, pregunta, mensaje, YES_NO_OPTION, WARNING_MESSAGE);
        return respuesta == YES_OPTION;
    }
    
    public static void informacion(String mensaje) {
        showMessageDialog(null, mensaje, "Informando", INFORMATION_MESSAGE);
    }
    
    public static void error(String mensaje1, String mensaje2) {
        showMessageDialog(null, mensaje1, mensaje2, ERROR_MESSAGE);
    }
    
    public static void campoVacio(String mensaje1, String mensaje2, JTextField campo){
        error(mensaje1, mensaje2);
        campo.requestFocus();
    }
    
    public static void campoVacio(String mensaje1, String mensaje2, JTextArea campo){
        error(mensaje1, mensaje2);
        campo.requestFocus();
    }
    
    public void campoVacio(String mensaje1, String mensaje2, JPasswordField campo){
        error(mensaje1, mensaje2);
        campo.requestFocus();
    }
    
    public void campoVacio(String mensaje1,Object mm, String mensaje2, JComboBox<String> campo){
        error(mensaje1, mensaje2);
        campo.requestFocus();
    }
 
    public void mnoimplementado(){
        JOptionPane.showMessageDialog(null, "Accion no implementada","NO IMPLEMENTADO",JOptionPane.ERROR_MESSAGE);
        
    }

    public void mingresarsistema(String usuario){
        JOptionPane.showMessageDialog(null,"Bienvenido al sistema: "+ usuario,"BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void msuperusuario(String usuario){
        JOptionPane.showMessageDialog(null,"Bienvenido al sistema: "+ usuario + " verifica que el sistema este en orden","BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
    }
    public void mnoingresarsistema(){
        JOptionPane.showMessageDialog(null,"Login o Clave Incorrecta","INGRESANDO AL SISTEMA",JOptionPane.ERROR_MESSAGE);
    }
    public int mcerrarsistema(){
        int resp = JOptionPane.showConfirmDialog(null,"¿Desea cerrar el sistema?","SALIENDO DEL SISTEMA",JOptionPane.YES_NO_OPTION);
        return resp;
    }
    
    public void mcomparacionincorrecta(String msj1,String msj2){
        JOptionPane.showMessageDialog(null, msj1,msj2,JOptionPane.ERROR_MESSAGE);
    }
    */
}
