
package Modelos.CRUD;

import Modelos.MServicio;
import Modelos.Database.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ServicioCRUD extends ConexionDB {
    
    public ServicioCRUD() {}
    
    public void insertar(MServicio servicio) {
        String sql = "INSERT INTO public.servicio "
                + "(cod_servicio, nomb_servicio, costo, estatus) "
                + "VALUES (?, ?, ?, ?)";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, servicio.getCodigo());
            ps.setString(2, servicio.getNombre());
            ps.setDouble(3, servicio.getCosto());
            ps.setString(4, servicio.getEstatus());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public boolean consultar(MServicio servicio) {
        boolean encontrado = false;
        
        String sql = "SELECT * FROM public.servicio "
                + "WHERE cod_servicio=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, servicio.getCodigo());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                servicio.setNombre(rs.getString("nomb_servicio"));
                servicio.setCosto(Double.parseDouble(rs.getString("costo")));
                servicio.setEstatus(rs.getString("estatus"));
                encontrado = true;
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return encontrado;
    }
    
    public void actualizar(MServicio servicio) {
        String sql = "UPDATE public.servicio SET nomb_servicio=?, costo=?, estatus=? "
                + "WHERE cod_servicio=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, servicio.getNombre());
            ps.setDouble(2, servicio.getCosto());
            ps.setString(3, servicio.getEstatus());
            ps.setInt(4, servicio.getCodigo());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void eliminar(MServicio servicio) {
        String sql = "UPDATE public.servicio SET estatus=? "
                + "WHERE codigo=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "E");
            ps.setInt(1, servicio.getCodigo());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
}
