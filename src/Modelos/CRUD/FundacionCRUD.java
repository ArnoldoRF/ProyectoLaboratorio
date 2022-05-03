/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Modelos.CRUD;

import Modelos.Database.ConexionDB;
import Modelos.MBeneficiario;
import Modelos.MFundacion;
import Modelos.MServicio;
import Modelos.MResponsable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FundacionCRUD extends ConexionDB {
    
    public FundacionCRUD() {}
    
    public void insertar(MFundacion beneficiario) {
        String sql = "INSERT INTO public.beneficiario "
                + "(cedula_benef, nombre, apellido, telefono, estatus) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            //ps.setString(1, beneficiario.getCedula());
            //ps.setString(2, beneficiario.getNombre());
            //ps.setString(3, beneficiario.getApellido());
            //ps.setString(4, beneficiario.getTelefono());
            //ps.setString(5, beneficiario.getEstatus());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public boolean consultar(MFundacion beneficiario) {
        boolean encontrado = false;
        
        String sql = "SELECT * FROM public.beneficiario "
                + "WHERE cedula_benef=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            //ps.setString(1, beneficiario.getCedula());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                //beneficiario.setCedula(rs.getString("cedula_benef"));
                //beneficiario.setNombre(rs.getString("nombre"));
                //beneficiario.setApellido(rs.getString("apellido"));
                //beneficiario.setTelefono(rs.getString("telefono"));
                //beneficiario.setEstatus(rs.getString("estatus"));
                
                encontrado = true;
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return encontrado;
    }
    
    public void actualizar(MFundacion beneficiario) {
        String sql = "UPDATE public.beneficiario SET nombre=?, apellido=?, telefono=?, estatus=? "
                + "WHERE cedula_benef=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            //ps.setString(1, beneficiario.getNombre());
            //ps.setString(2, beneficiario.getApellido());
            //ps.setString(3, beneficiario.getTelefono());
            //ps.setString(4, beneficiario.getCedula());
            //ps.setString(5, beneficiario.getEstatus());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void eliminar(MFundacion beneficiario) {
        String sql = "UPDATE public.beneficiario SET estatus=? "
                + "WHERE cedula_benef=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            //ps.setString(1, "E");
            //ps.setString(2, beneficiario.getCedula());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public ArrayList<MFundacion> optenerFundaciones() {
        
        ArrayList<MFundacion> fundaciones = new ArrayList<MFundacion>();
        String sql = "SELECT * FROM public.fundacion "
                + "WHERE estatus=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "A");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                MFundacion fundacion = new MFundacion();
                fundacion.setCodigo(Integer.parseInt(rs.getString("cod_fund")));
                fundacion.setNombre(rs.getString("nombre_fund"));
                fundacion.setPresupuesto(Double.parseDouble(rs.getString("presupuesto")));
                fundacion.setEstatus(rs.getString("estatus"));
                fundaciones.add(fundacion);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return fundaciones;
    }
    
    public ArrayList<MServicio> optenerServicios(String codigo) {
        System.out.println("no sirve");
        ArrayList<MServicio> servicios = new ArrayList<MServicio>();
        String sql = "SELECT * FROM public.servicio s JOIN "
                + "public.serv_fund s_f ON s.cod_servicio = s_f.cod_servicio "
                + "WHERE s_f.cod_fund = ?";
                
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(codigo));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                MServicio servicio = new MServicio();
                servicio.setCodigo(Integer.parseInt(rs.getString("cod_servicio")));
                servicio.setNombre(rs.getString("nomb_servicio"));
                servicio.setCosto(Double.parseDouble(rs.getString("costo")));
                servicio.setEstatus(rs.getString("estatus"));
                servicios.add(servicio);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return servicios;
    }
    
    public ArrayList<MBeneficiario> optenerBeneficiario(String codigoFundacion) {
        ArrayList<MBeneficiario> beneficiarios = new ArrayList<MBeneficiario>();
        String sql = "SELECT * FROM public.beneficiario b JOIN "
                + "public.solicitud s ON b.cedula_benef = s.cedula_benef "
                + "JOIN public.fundacion f ON s.cod_fund = f.cod_fund "
                + "WHERE f.cod_fund = ?";
                
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(codigoFundacion));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                MBeneficiario beneficiario = new MBeneficiario();
                beneficiario.setCedula(rs.getString("cedula_benef"));
                beneficiario.setNombre(rs.getString("nombre"));
                beneficiario.setApellido(rs.getString("apellido"));
                beneficiario.setTelefono(rs.getString("telefono"));
                beneficiario.setEstatus(rs.getString("estatus"));
                
                beneficiarios.add(beneficiario);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return beneficiarios;
    }
    
    public ArrayList<MResponsable> optenerResponsable(String codigoFundacion) {
        ArrayList<MResponsable> responsables = new ArrayList<MResponsable>();
        String sql = "SELECT * FROM public.responsable r JOIN "
                + "public.solicitud s ON r.cedula_resp = s.cedula_benef "
                + "JOIN public.fundacion f ON s.cod_fund = f.cod_fund "
                + "WHERE f.cod_fund = ?";
               
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(codigoFundacion));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                MResponsable responsable = new MResponsable();
                responsable.setCedula(rs.getString("cedula_benef"));
                responsable.setNombre(rs.getString("nombre"));
                responsable.setApellido(rs.getString("apellido"));
                responsable.setTelefono(rs.getString("telefono"));
                responsable.setEstatus(rs.getString("estatus"));
                
                responsables.add(responsable);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return responsables;
    }
}

