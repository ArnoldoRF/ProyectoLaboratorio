/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package modelos;

public class ServicioModelo {
    private String codigo;
    private String nombre;
    private double costo;
    private String estatus;
    
    public ServicioModelo() {}
    
    public ServicioModelo(String codigo, String nombre, double costo, String estatus) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.estatus = estatus;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEstatus() {
        return estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
