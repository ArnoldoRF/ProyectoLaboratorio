/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Modelos.CRUD;

import Modelos.MResponsable;
import Modelos.Database.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResponsableCRUD extends ConexionDB{
    
    public ResponsableCRUD(){}
    
    public void insertar(MResponsable resp) {
        String sql = "INSERT INTO public.responsable "
                + "(cedula_res, nombre, apellido, cod_fund, telefono, estatus) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, resp.getCedula());
            ps.setString(2, resp.getNombre());
            ps.setString(3, resp.getApellido());
            ps.setInt(4, resp.getCodigoFundacion());
            ps.setString(5, resp.getTelefono());
            ps.setString(6, resp.getEstatus());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public boolean consultar(MResponsable resp) {
        boolean encontrado = false;
        
        String sql = "SELECT * FROM public.responsable "
                + "WHERE cedula_res=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, resp.getCedula());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                resp.setNombre(rs.getString("nombre"));
                resp.setApellido(rs.getString("apellido"));
                resp.setCodigoFundacion(Integer.parseInt(rs.getString("cod_fund")));
                resp.setTelefono(rs.getString("telefono"));
                resp.setEstatus(rs.getString("estatus"));
                encontrado = true;
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return encontrado;
    }
    
    public void actualizar(MResponsable resp) {
        String sql = "UPDATE public.responsable SET nombre=?, apellido=?, cod_fund=?, telefono=?, estatus=? "
                + "WHERE cedula_res=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, resp.getNombre());
            ps.setString(2, resp.getApellido());
            ps.setInt(3, resp.getCodigoFundacion());
            ps.setString(4, resp.getTelefono());
            ps.setString(5, resp.getEstatus());
            ps.setString(6, resp.getCedula());
            
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void eliminar(MResponsable resp) {
        String sql = "UPDATE public.responsable SET estatus=? "
                + "WHERE cedula_res=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "E");
            ps.setString(2, resp.getCedula());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
}
