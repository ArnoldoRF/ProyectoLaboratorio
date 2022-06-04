/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package modelos;

import java.time.LocalDate;

public class CharlaModelo {
    private String codigo;
    private String rifOrganismo;
    private String topico;
    private LocalDate fecha;
    
    public CharlaModelo() {}
    
    public CharlaModelo(String codigo, String rifOrganismo, String topico, LocalDate fecha) {
        this.codigo = codigo;
        this.rifOrganismo = rifOrganismo;
        this.topico = topico;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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
