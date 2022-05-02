
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
