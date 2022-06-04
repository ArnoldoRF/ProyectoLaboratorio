/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package modelos;

import java.time.LocalDate;

public class SolicitudModelo {
    private String codigo;
    private String cedulaResponsable;
    private String cedulaBeneficiario;
    private String codigoFundacion;
    private String prioridad;
    private LocalDate fechaCreacion;
    private LocalDate fechaAprobacion;
    
    public SolicitudModelo() {}
    
    public SolicitudModelo(String codigo, String cedulaResponsable, String cedulaBeneficiario,
            String codigoFundacion, String prioridad, LocalDate fechaCreacion, LocalDate fechaAprobacion) {
        
        this.codigo = codigo;
        this.cedulaResponsable = cedulaResponsable;
        this.cedulaBeneficiario = cedulaBeneficiario;
        this.codigoFundacion = codigoFundacion;
        this.prioridad = prioridad;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaCreacion = fechaCreacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getCedulaResponsable() {
        return cedulaResponsable;
    }

    public void setCedulaResponsable(String cedulaResponsable) {
        this.cedulaResponsable = cedulaResponsable;
    }

    public String getCedulaBeneficiario() {
        return cedulaBeneficiario;
    }

    public void setCedulaBeneficiario(String cedulaBeneficiario) {
        this.cedulaBeneficiario = cedulaBeneficiario;
    }

    public String getCodigoFundacion() {
        return codigoFundacion;
    }

    public void setCodigoFundacion(String codigoFundacion) {
        this.codigoFundacion = codigoFundacion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaAprovacion() {
        return fechaAprobacion;
    }

    public void setFechaAprovacion(LocalDate fechaAprovacion) {
        this.fechaAprobacion = fechaAprovacion;
    }
}