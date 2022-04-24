
package Modelos;

import Modelos.MServicio;
import java.util.ArrayList;

public class MFundacion {
    private int codigo;
    private String nombre;
    private ArrayList<MServicio> servicios;
    private String presidente;
    
    public MFundacion() {}
    
    public MFundacion(int codigo, String nombre, ArrayList<MServicio> servicios, String presidente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.servicios = servicios;
        this.presidente = presidente;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
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

    public ArrayList<MServicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<MServicio> servicios) {
        this.servicios = servicios;
    }
    
    public void añadirServicio(MServicio servicio) {
        this.servicios.add(servicio);
    }
    
    public void eliminarServicio(String codigoServicio) {
        int lenght = servicios.size();
        
        for(int i = 0; i < lenght; i++) {
            if(servicios.get(i).getCodigo().equals(codigoServicio)) {
                servicios.remove(i);
                break;
            }
        }
    }
    
    public MServicio buscarServicio(String codigoServicio) {
        for(MServicio servicioActual : servicios) {
            if(servicioActual.getCodigo().equals(codigoServicio))
                return servicioActual;
        }
        return null;
    }
}