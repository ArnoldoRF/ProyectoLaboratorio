
package Modelos;

import java.time.LocalDate;

public class MCharla {
    private int codigo;
    private String rifOrganismo;
    private String topico;
    private LocalDate fecha;
    
    public MCharla() {}
    
    public MCharla(int codigo, String rifOrganismo, String topico, LocalDate fecha) {
        this.codigo = codigo;
        this.rifOrganismo = rifOrganismo;
        this.topico = topico;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRifOrganismo() {
        return rifOrganismo;
    }

    public void setRifOrganismo(String rifOrganismo) {
        this.rifOrganismo = rifOrganismo;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
