package Modelos.CRUD;

import Modelos.Database.ConexionDB;
import Modelos.MFundacion;
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
}

