package Modelos.CRUD;

import Modelos.Database.ConexionDB;
import Modelos.MBeneficiario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BeneficiarioCRUD extends ConexionDB {
    
    public BeneficiarioCRUD() {}
    
    public void insertar(MBeneficiario beneficiario) {
        String sql = "INSERT INTO public.beneficiario "
                + "(cedula_benef, nombre, apellido, telefono, estatus) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, beneficiario.getCedula());
            ps.setString(2, beneficiario.getNombre());
            ps.setString(3, beneficiario.getApellido());
            ps.setString(4, beneficiario.getTelefono());
            ps.setString(5, "A");
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public boolean consultar(MBeneficiario beneficiario) {
        boolean encontrado = false;
        
        String sql = "SELECT * FROM public.beneficiario "
                + "WHERE cedula_benef=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, beneficiario.getCedula());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                beneficiario.setCedula(rs.getString("cedula"));
                beneficiario.setNombre(rs.getString("nombre"));
                beneficiario.setApellido(rs.getString("apellido"));
                beneficiario.setTelefono(rs.getString("telefono"));
                
                encontrado = true;
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return encontrado;
    }
    
    public void actualizar(MBeneficiario beneficiario) {
        String sql = "UPDATE public.beneficiario SET nombre=?, apellido=?, telefono=?, estatus=? "
                + "WHERE cedula_benef=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, beneficiario.getNombre());
            ps.setString(2, beneficiario.getApellido());
            ps.setString(3, beneficiario.getTelefono());
            ps.setString(4, beneficiario.getCedula());
            ps.setString(5, "A");
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void eliminar(MBeneficiario beneficiario) {
        String sql = "UPDATE public.beneficiario SET estatus=? "
                + "WHERE cedula_benef=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "E");
            ps.setString(1, beneficiario.getCedula());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
}

