
package Modelos.CRUD;

import Modelos.MServicio;
import Modelos.Database.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ServicioCRUD extends ConexionDB {
    
    public ServicioCRUD() {}
    
    public void insertar(MServicio servicio) {
        String sql = "INSERT INTO public.\"Servicio\" "
                + "(codigo, nombre, costo) "
                + "VALUES (?, ?, ?)";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, servicio.getCodigo());
            ps.setString(2, servicio.getNombre());
            ps.setDouble(3, servicio.getCosto());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void consultar(MServicio servicio) {
        String sql = "SELECT * FROM public.\"Servicio\" "
                + "WHERE codigo=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, servicio.getCodigo());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                servicio.setNombre(rs.getString("nombre"));
                servicio.setCosto(Double.parseDouble(rs.getString("costo")));
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void actualizar(MServicio servicio) {
        String sql = "UPDATE public.\"Servicio\" SET nombre=?, costo=?) "
                + "WHERE codigo=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, servicio.getNombre());
            ps.setDouble(2, servicio.getCosto());
            ps.setString(3, servicio.getCodigo());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void eliminar(MServicio servicio) {
        String sql = "DELETE FROM public.\"Servicio\" "
                + "WHERE codigo=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, servicio.getCodigo());
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
}
