/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Controladores;

import Vistas.VListadoSolicitante;
import Modelos.CRUD.FundacionCRUD;
import Modelos.MBeneficiario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CListadoBeneficiario implements ActionListener{
    VListadoSolicitante listado;
    
    public CListadoBeneficiario() {
        listado = new VListadoSolicitante();
        listado.btnBuscar.addActionListener(e -> buscar());
        listado.setVisible(true);
    } 
    
    public VListadoSolicitante getVista() {
        return listado;
    }
    
    private void buscar() {
        String codigoFundacion = listado.txtCodigo.getText();
        ArrayList<MBeneficiario> beneficiarios = new FundacionCRUD().optenerBeneficiario(codigoFundacion);
        DefaultTableModel dt = (DefaultTableModel) listado.tablaBeneficiario.getModel();
        dt.setRowCount(0);
        for(MBeneficiario beneficiario : beneficiarios) {
            Object[] fila = new Object[4];
            fila[0] = beneficiario.getCedula();
            fila[1] = beneficiario.getNombre();
            fila[2] = beneficiario.getApellido();
            fila[3] = beneficiario.getTelefono();
            dt.addRow(fila);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {}
}
