
package Modelos;

public class MBeneficiario extends MPersona {
    
    public MBeneficiario() {}
    
    public MBeneficiario(String cedula, String nombre, String apellido,
            String telefono) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
}
