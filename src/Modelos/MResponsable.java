
package Modelos;

public class MResponsable extends MPersona {

    private String codigoFundacion;
    
    public MResponsable() {
        codigoFundacion="";
    }
    
    public MResponsable(String cedula, String nombre, String apellido,
            String telefono, String codigoFundacion) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.codigoFundacion = codigoFundacion;
    }
    
    public String getCodigoFundacion() {
        return codigoFundacion;
    }

    public void setCodigoFundacion(String codigoFundacion) {
        this.codigoFundacion = codigoFundacion;
    }

}
