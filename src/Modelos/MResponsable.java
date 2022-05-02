
package Modelos;

public class MResponsable extends MPersona {

    private int codigoFundacion;
    
    public MResponsable() {}
    
    public MResponsable(String cedula, String nombre, String apellido,
            String telefono, int codigoFundacion, String estatus) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.codigoFundacion = codigoFundacion;
        this.estatus = estatus;
    }
    
    public int getCodigoFundacion() {
        return codigoFundacion;
    }

    public void setCodigoFundacion(int codigoFundacion) {
        this.codigoFundacion = codigoFundacion;
    }
}
