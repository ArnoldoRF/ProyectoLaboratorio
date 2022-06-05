/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package dao;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import modelos.SolicitudModelo;
import modelos.ServicioModelo;
import utilidades.GestorConexion;

public class SolicitudDao implements DaoInterface<SolicitudModelo> {
        
    @Override
    public boolean insertar(final SolicitudModelo modelo) {
        String sql = "INSERT INTO solicitud " +
                     "(solicitud_codigo, responsable_cedula, beneficiario_cedula, " +
                     "fundacion_codigo, prioridad, fecha_creacion, fecha_aprobacion, estatus) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        boolean insertado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            sentencia.setString(2, modelo.getCedulaResponsable());
            sentencia.setString(3, modelo.getCedulaBeneficiario());
            sentencia.setString(4, modelo.getCodigoFundacion());
            sentencia.setString(5, modelo.getPrioridad());
            sentencia.setDate(6, modelo.getFechaCreacion());
            sentencia.setDate(7, modelo.getFechaAprobacion());
            sentencia.setString(8, modelo.getEstatus());
            sentencia.executeUpdate();
            
            insertado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return insertado;
    }
    
    @Override
    public boolean consultar(final SolicitudModelo modelo) {        
        String sql = "SELECT * FROM solicitud " +
                     "WHERE solicitud_codigo=?";
        
        boolean encontrado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next()) {
                modelo.setCodigo(resultados.getString("fundacion_codigo"));
                modelo.setCedulaResponsable(resultados.getString("responsable_cedula"));
                modelo.setCedulaBeneficiario(resultados.getString("beneficiario_cedula"));
                modelo.setCodigoFundacion(resultados.getString("fundacion_codigo"));
                modelo.setPrioridad(resultados.getString("prioridad"));
                modelo.setFechaCreacion(resultados.getDate("fecha_creacion"));
                modelo.setFechaAprobacion(resultados.getDate("fecha_aprobacion"));
                modelo.setEstatus(resultados.getString("estatus"));
                
                encontrado = true;
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    
        GestorConexion.desconectar();
        return encontrado;
    }
    
    @Override
    public boolean actualizar(final SolicitudModelo modelo) {
        String sql = "UPDATE solicitud " +
                     "SET responsable_cedula=?, beneficiario_cedula=?, " +
                     "fundacion_codigo=?, priodidad=?, " +
                     "fecha_creacion=?, fecha_aprobacion=?, estatus=? " +
                     "WHERE solicitud_codigo=?";
        
        boolean actualizado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCedulaResponsable());
            sentencia.setString(2, modelo.getCedulaBeneficiario());
            sentencia.setString(3, modelo.getCodigoFundacion());
            sentencia.setString(4, modelo.getPrioridad());
            sentencia.setDate(5, modelo.getFechaCreacion());
            sentencia.setDate(6, modelo.getFechaAprobacion());
            sentencia.setString(7, modelo.getEstatus());
            sentencia.setString(8, modelo.getCodigo());
            sentencia.executeUpdate();
            
            actualizado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        GestorConexion.desconectar();
        return actualizado;
    }
    
    @Override
    public boolean eliminar(final SolicitudModelo modelo) {
        String sql = "UPDATE solicitud SET estatus=? " +
                     "WHERE solicitud_codigo=?";
        
        boolean eliminado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, "E");
            sentencia.setString(2, modelo.getCodigo());
            sentencia.executeUpdate();
            
            eliminado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return eliminado;
    }
    
    public List<ServicioModelo> listarServicios(final String codigo) {
        List<ServicioModelo> servicios = new ArrayList<>();
        String sql = "SELECT * FROM servicio serv " + 
                     "JOIN servicio_fundacion serv_fund " +
                     "ON serv.servicio_codigo=serv_fund.servicio_codigo " +
                     "WHERE serv_fund.fundacion_codigo=?";
        
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, codigo);
            ResultSet resultados = sentencia.executeQuery();
            
            while(resultados.next()) {
                ServicioModelo servicio = new ServicioModelo();
                servicio.setCodigo(resultados.getString("servicio_codigo"));
                servicio.setNombre(resultados.getString("nombre"));
                servicio.setCosto(resultados.getDouble("costo"));
                servicio.setEstatus(resultados.getString("estatus"));
                
                servicios.add(servicio);
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return servicios;
    }
    /*
    public boolean añadirServicio(String codigoSolicitud, String codigoServicio) {
        String sql = "INSERT INTO servicio_fundacion " +
                     "(fundacion_codigo, servicio_codigo) " +
                     "VALUES (?, ?)";
        
        boolean servicioAñadido = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            sentencia.setString(2, codigoServicio);
            sentencia.executeUpdate();
            
            servicioAñadido = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return servicioAñadido;
    }
    
    public boolean eliminarServicio(final FundacionModelo modelo, String codigoServicio) {
        String sql = "DELETE FROM servicio_fundacion " +
                     "WHERE fundacion_codigo=? " +
                     "AND servicio_codigo=? ";
        
        boolean servicioEliminado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            sentencia.setString(2, codigoServicio);
            sentencia.executeUpdate();
            
            servicioEliminado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return servicioEliminado;
    }*/
}

