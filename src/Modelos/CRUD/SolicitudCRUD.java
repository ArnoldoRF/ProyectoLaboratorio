
package Modelos.CRUD;

import Modelos.MSolicitud;
import Modelos.Database.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author josue
 */
public class SolicitudCRUD extends ConexionDB{
    
    public SolicitudCRUD() {}
    
    public void insertar(MSolicitud solicitud) {
        String sql = "INSERT INTO public.solicitud "
                + "(cod_solic, cedula_res, cedula_benef, cod_fund, prioridad, fecha_creacion, fecha_aprob, estatus) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, solicitud.getCodigo());
            ps.setString(2, solicitud.getCedulaResponsable());
            ps.setString(3, solicitud.getCedulaBeneficiario());
            ps.setInt(4, solicitud.getCodigoFundacion());
            ps.setString(5, solicitud.getPrioridad());
            ps.setDate(6, solicitud.getFechaCreacion());
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
        
        String sql = "SELECT * FROM public.servicio "
                + "WHERE cod_servicio=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(servicio.getCodigo()));
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                servicio.setNombre(rs.getString("nomb_servicio"));
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
        String sql = "UPDATE public.servicio SET nomb_servicio=?, costo=? "
                + "WHERE cod_servicio=?";
        
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
        String sql = "UPDATE public.servicio SET estatus=? "
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
