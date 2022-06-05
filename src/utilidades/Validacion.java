/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package utilidades;

import javax.swing.text.JTextComponent;

public class Validacion {
    
    public static void validarEntero(JTextComponent textField){
        String texto = textField.getText();
        int longitudTexto = texto.length();
        
        StringBuilder sb = new StringBuilder(texto);
        
        for(int i = 0; i < longitudTexto; i++)
            if(!Character.isDigit(texto.charAt(i)))
                sb.deleteCharAt(i);
        
        texto = sb.toString();
        textField.setText(texto);
    }
    
    public static void validarDecimal(JTextComponent textField) {
        String texto = textField.getText();
        int longitudTexto = texto.length();
        
        boolean puntoDecimal = false;
        StringBuilder sb = new StringBuilder(texto);
        
        for(int i = 0; i < longitudTexto; i++) {            
            if(!Character.isDigit(texto.charAt(i)))
                if(texto.charAt(i) == '.' && !puntoDecimal)
                    puntoDecimal = true;
                else
                    sb.deleteCharAt(i);
        }
        
        texto = sb.toString();
        textField.setText(texto);
    }
    
    public static void validarLetra(JTextComponent textField){
        String texto = textField.getText();
        int longitudTexto = texto.length();
        
        StringBuilder sb = new StringBuilder(texto);
        
        for(int i = 0; i < longitudTexto; i++)
            if(!Character.isLetter(texto.charAt(i)) && !(texto.charAt(i) != ' '))
                sb.deleteCharAt(i);
        
        texto = sb.toString();
        textField.setText(texto);
    }
    
    public static void validarAlfanumerico(JTextComponent textField) {
        validarLetra(textField);
        validarEntero(textField);
    }
}
