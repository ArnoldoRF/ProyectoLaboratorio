
package Modelos.CRUD;

import Modelos.MServicio;
import Modelos.Database.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BeneficiarioCRUD extends ConexionDB {
    
    public BeneficiarioCRUD() {}
    
    public void insertar(MServicio servicio) {
        String sql = "INSERT INTO public.\"Servicio\" "
                + "(codServicio, nombServicio, costo, estatus) "
                + "VALUES (?, ?, ?, ?)";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(servicio.getCodigo()));
            ps.setString(2, servicio.getNombre());
            ps.setDouble(3, servicio.getCosto());
            ps.setString(4, "A");
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public boolean consultar(MServicio servicio) {
        boolean encontrado = false;
        
        String sql = "SELECT * FROM public.\"Servicio\" "
                + "WHERE \"codServicio\"=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(servicio.getCodigo()));
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                servicio.setNombre(rs.getString("nombServicio"));
                servicio.setCosto(Double.parseDouble(rs.getString("costo")));
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
        String sql = "UPDATE public.\"Servicio\" SET nombServicio=?, costo=? "
                + "WHERE codServicio=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, servicio.getNombre());
            ps.setDouble(2, servicio.getCosto());
            ps.setInt(3, Integer.parseInt(servicio.getCodigo()));
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void eliminar(MServicio servicio) {
        String sql = "UPDATE public.\"Servicio\" SET estatus=? "
                + "WHERE codigo=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "E");
            ps.setInt(1, Integer.parseInt(servicio.getCodigo()));
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
}
