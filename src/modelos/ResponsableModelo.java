/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package modelos;

public class ResponsableModelo extends PersonaModelo {

    private String codigoFundacion;
    
    public ResponsableModelo() {}
    
    public ResponsableModelo(String cedula, String nombre, String apellido,
            String telefono, String codigoFundacion, String estatus) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.codigoFundacion = codigoFundacion;
        this.estatus = estatus;
    }
    
    public String getCodigoFundacion() {
        return codigoFundacion;
    }

    public void setCodigoFundacion(String codigoFundacion) {
        this.codigoFundacion = codigoFundacion;
    }
}
