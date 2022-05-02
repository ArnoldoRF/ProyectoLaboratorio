
package Generales;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Validacion {
    
    public static void validarEntero(KeyEvent e){
        if(!Character.isDigit(e.getKeyChar()))
            e.consume();
    }
    
    public static void validarDecimal(KeyEvent e, JTextField textField) {
        if(!Character.isDigit(e.getKeyChar())) {
            if(e.getKeyChar() == '.' || e.getKeyChar() == ',') {
                boolean puntoDecimal = false;
        
                String texto = textField.getText();
                int longitudTexto = texto.length();
                
                if(longitudTexto == 0) {
                    textField.setText("0");
                    return;
                }
        
                for(int i = 0; i < longitudTexto; i++) {
                    char caracter = texto.charAt(i);
                    
                    if(caracter == '.' || caracter == ',') {
                        puntoDecimal = true;
                        break;
                    }
                }
                
                if(puntoDecimal)
                    e.consume();
                
                e.setKeyChar('.');
            }
            else
                e.consume();
        }
    }
    
    public static void validarLetra(KeyEvent e){
        if(!Character.isLetter(e.getKeyChar()) && e.getKeyChar() != ' ')
            e.consume();
    }
    
    public static void validarAlfanumerico(KeyEvent e) {
        char caracter = e.getKeyChar();
        
        if(!Character.isDigit(caracter) && !Character.isLetter(caracter))
                e.consume();
    }
}
