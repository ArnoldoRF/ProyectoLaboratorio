/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Modelos;

import java.text.SimpleDateFormat;
import java.sql.Date;

public class MSolicitud {
    private String codigo;
    private String cedulaResponsable;
    private String cedulaBeneficiario;
    private String codigoFundacion;
    private String prioridad;
    private Date fechaCreacion;
    private Date fechaAprobacion;
    
    public MSolicitud() {
        codigo="";
        cedulaResponsable="";
        cedulaBeneficiario="";
        codigoFundacion= "";
        prioridad="";
    }
    
    public MSolicitud(String codigo, String cedulaResponsable, String cedulaBeneficiario,
            String codigoFundacion, String prioridad, Date fechaCreacion, Date fechaAprobacion) {
        
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