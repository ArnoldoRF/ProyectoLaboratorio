
package Modelos;

public class MServicio {
    private int codigo;
    private String nombre;
    private double costo;
    
    public MServicio() {
        codigo = 0;
        nombre = "";
        costo = 0;
    }
    
    public MServicio(int codigo, String nombre, double costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
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
    
}
