/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Modelos;

public class MBeneficiario extends MPersona {
    
    public MBeneficiario() {}
    
    public MBeneficiario(String cedula, String nombre, String apellido,
            String telefono, String estatus) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.estatus = estatus;
    }
}
