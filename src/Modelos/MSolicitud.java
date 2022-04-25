
package Modelos;

import java.time.LocalDate;

public class MSolicitud {
    private int codigo;
    private String cedulaResponsable;
    private String cedulaBeneficiario;
    private int codigoFundacion;
    private LocalDate fechaCreacion;
    private LocalDate fechaAprovacion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getCodigoFundacion() {
        return codigoFundacion;
    }

    public void setCodigoFundacion(int codigoFundacion) {
        this.codigoFundacion = codigoFundacion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaAprovacion() {
        return fechaAprovacion;
    }

    public void setFechaAprovacion(LocalDate fechaAprovacion) {
        this.fechaAprovacion = fechaAprovacion;
    }
    
}
