
package Modelos;

import Modelos.MServicio;

public class MFundacion {
    private int codigo;
    private String nombre;
    private double presupuesto;
    private String estatus;
    
    public MFundacion() {}
    
    public MFundacion(int codigo, String nombre, double presupuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
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

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public String getEstatus() {
        return estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
}