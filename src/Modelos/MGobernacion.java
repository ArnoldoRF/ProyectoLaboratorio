/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Modelos;

import Modelos.MFundacion;

public class MGobernacion {
    private MFundacion fundacion;

    public MFundacion getFundacion() {
        return fundacion;
    }

    public void setFundacion(MFundacion fundacion) {
        this.fundacion = fundacion;
    }

    public MGobernacion(MFundacion fundacion) {
        this.fundacion = fundacion;
    }
}
