
package Modelos;

public class MServicio {
    private int codigo;
    private String nombre;
    private double costo;
    private String estatus;
    
    public MServicio() {}
    
    public MServicio(int codigo, String nombre, double costo, String estatus) {
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
