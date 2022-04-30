
package Controladores;

import Generales.Mensajes;
import Modelos.MMenu;
import Vistas.VMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CMenu implements ActionListener {
    private Mensajes msj=new Mensajes();
    private VMenu vmenu;
    private CBeneficiario benef;
    private CCharla charla;
    private CFundacion fund;
    private CGobernacion gob;
    private CResponsable resp;
    private CServicio serv;
    private CSolicitud solic;
    private MMenu mmenu;
    private boolean abeneficiario=false;
    private boolean aservicio=false;
    
    public CMenu(){
        vmenu = new VMenu();
        vmenu.setVisible(true);
        mmenu = new MMenu();
        vmenu.setTitle("MENU GESTION SOCIAL");
        vmenu.getEscritorio();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("PROBANDOOOOOOOOOOOOOOOOOOOOO");
         if (e.getActionCommand().equalsIgnoreCase("Servicios")){
            if(!aservicio){
                serv=new CServicio(this);
                aservicio=true;
            }else{
                msj.mcomparacionincorrecta("Ya abrio el formulario servicios","FORMULARIO ABIERTO");
            }
        }
    }

    public Mensajes getMsj() {
        return msj;
    }

    public void setMsj(Mensajes msj) {
        this.msj = msj;
    }

    public VMenu getVmenu() {
        return vmenu;
    }

    public void setVmenu(VMenu vmenu) {
        this.vmenu = vmenu;
    }

    public CBeneficiario getBenef() {
        return benef;
    }

    public void setBenef(CBeneficiario benef) {
        this.benef = benef;
    }

    public CCharla getCharla() {
        return charla;
    }

    public void setCharla(CCharla charla) {
        this.charla = charla;
    }

    public CFundacion getFund() {
        return fund;
    }

    public void setFund(CFundacion fund) {
        this.fund = fund;
    }

    public CGobernacion getGob() {
        return gob;
    }

    public void setGob(CGobernacion gob) {
        this.gob = gob;
    }

    public CResponsable getResp() {
        return resp;
    }

    public void setResp(CResponsable resp) {
        this.resp = resp;
    }

    public CServicio getServ() {
        return serv;
    }

    public void setServ(CServicio serv) {
        this.serv = serv;
    }

    public CSolicitud getSolic() {
        return solic;
    }

    public void setSolic(CSolicitud solic) {
        this.solic = solic;
    }

    public MMenu getMmenu() {
        return mmenu;
    }

    public void setMmenu(MMenu mmenu) {
        this.mmenu = mmenu;
    }

    public boolean isAbeneficiario() {
        return abeneficiario;
    }

    public void setAbeneficiario(boolean abeneficiario) {
        this.abeneficiario = abeneficiario;
    }
 
}
