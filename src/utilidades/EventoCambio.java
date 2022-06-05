/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package utilidades;

import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EventoCambio {

    public static void agregar(JTextComponent text, ChangeListener event) {
        DocumentListener documentListener;
        
        documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                SwingUtilities.invokeLater(() -> {
                    text.getDocument().removeDocumentListener(this);
                    event.stateChanged(new ChangeEvent(text));
                    text.getDocument().addDocumentListener(this);
                });
            }     
        };
    
        text.getDocument().addDocumentListener(documentListener);
    }
}