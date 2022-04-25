
package Modelos.CRUD;

import Modelos.MResponsable;
import Modelos.Database.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.sql.Date;
/**
 *
 * @author josue
 */
public class ResponsableCRUD extends ConexionDB{
    
    public ResponsableCRUD(){}
    
    public void insertar(MResponsable resp) {
        String sql = "INSERT INTO public.responsable "
                + "(cedula_res, nombre, apellido, cod_fund, telefono, estatus) "
                + "VALUES (?, ?, ?, ?, ?, ?, )";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, resp.getCedula());
            ps.setString(2, resp.getNombre());
            ps.setString(3, resp.getApellido());
            ps.setInt(4, Integer.parseInt(resp.getCodigoFundacion()));
            ps.setString(5, resp.getTelefono());
            ps.setString(6, "A");
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
                resp.setNombre(rs.getNString("nombre"));
                resp.setApellido(rs.getNString("apellido"));
                resp.setCodigoFundacion(rs.getNString("cod_fund"));
                resp.setTelefono(rs.getNString("telefono"));
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
            ps.setInt(3, Integer.parseInt(resp.getCodigoFundacion()));
            ps.setString(4, resp.getTelefono());
            ps.setString(5, "A");
            
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
            ps.setInt(1, Integer.parseInt(resp.getCedula()));
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
}
