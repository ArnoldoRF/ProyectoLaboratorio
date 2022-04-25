
package Modelos;

import java.util.Date;

public class MSolicitud {
    private int codigo;
    private String cedulaResponsable;
    private String cedulaBeneficiario;
    private int codigoFundacion;
    private String prioridad;
    private Date fechaCreacion;
    private Date fechaAprobacion;
    
    public MSolicitud() {}
    
    public MSolicitud(int codigo, String cedulaResponsable, String cedulaBeneficiario,
            int codigoFundacion, String prioridad, Date fechaCreacion, Date fechaAprobacion) {
        
        this.codigo = codigo;
        this.cedulaResponsable = cedulaResponsable;
        this.cedulaBeneficiario = cedulaBeneficiario;
        this.codigoFundacion = codigoFundacion;
        this.prioridad = prioridad;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaCreacion = fechaCreacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public int getCodigoFundacion() {
        return codigoFundacion;
    }

    public void setCodigoFundacion(int codigoFundacion) {
        this.codigoFundacion = codigoFundacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaAprovacion() {
        return fechaAprobacion;
    }

    public void setFechaAprovacion(Date fechaAprovacion) {
        this.fechaAprobacion = fechaAprovacion;
    }
    
}
