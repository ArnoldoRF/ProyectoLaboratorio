package Modelos.CRUD;

import Modelos.MSolicitud;
import Modelos.Database.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.sql.Date;
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
            ps.setInt(1, Integer.parseInt(solicitud.getCodigo()));
            ps.setString(2, solicitud.getCedulaResponsable());
            ps.setString(3, solicitud.getCedulaBeneficiario());
            ps.setInt(4, Integer.parseInt(solicitud.getCodigoFundacion()));
            ps.setString(5, solicitud.getPrioridad());
            ps.setDate(6, solicitud.getFechaCreacion());
            ps.setDate(7, solicitud.getFechaAprovacion());
            ps.setString(8, "A");
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public boolean consultar(MSolicitud solicitud) {
        boolean encontrado = false;
        
        String sql = "SELECT * FROM public.solicitud "
                + "WHERE cod_solic=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(solicitud.getCodigo()));
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                solicitud.setCedulaResponsable(rs.getNString("cedula_res"));
                solicitud.setCedulaBeneficiario(rs.getNString("cedula_benef"));
                solicitud.setCodigoFundacion(rs.getNString("cod_fund"));
                solicitud.setPrioridad(rs.getNString("prioridad"));
                solicitud.setFechaCreacion(rs.getDate("fecha_creacion"));
                solicitud.setFechaCreacion(rs.getDate("fecha_aprob"));
             
                encontrado = true;
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return encontrado;
    }
    
    public void actualizar(MSolicitud solicitud) {
        String sql = "UPDATE public.solicitud SET cedula_res=?, cedula_benef=?, cod_fund=?, prioridad=?, fecha_creacion=?, fecha_aprob=?, estatus=? "
                + "WHERE cod_solic=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, solicitud.getCedulaResponsable());
            ps.setString(2, solicitud.getCedulaBeneficiario());
            ps.setInt(3, Integer.parseInt(solicitud.getCodigoFundacion()));
            ps.setString(4, solicitud.getPrioridad());
            ps.setDate(5, solicitud.getFechaCreacion());
            ps.setDate(6, solicitud.getFechaAprovacion());
            ps.setString(7, "A");
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
    
    public void eliminar(MSolicitud solicitud) {
        String sql = "UPDATE public.solicitud SET estatus=? "
                + "WHERE cod_solic=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "E");
            ps.setInt(1, Integer.parseInt(solicitud.getCodigo()));
            ps.execute();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
}
