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
import modelos.FundacionModelo;
import modelos.ServicioModelo;
import utilidades.GestorConexion;

public class FundacionDao implements DaoInterface<FundacionModelo> {
        
    @Override
    public boolean insertar(final FundacionModelo modelo) {
        String sql = "INSERT INTO fundacion " +
                     "(fundacion_codigo, nombre, presupuesto, estatus) " +
                     "VALUES (?, ?, ?, ?)";
        
        boolean insertado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            sentencia.setString(2, modelo.getNombre());
            sentencia.setDouble(3, modelo.getPresupuesto());
            sentencia.setString(4, modelo.getEstatus());
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
    public boolean consultar(final FundacionModelo modelo) {        
        String sql = "SELECT * FROM fundacion " +
                     "WHERE fundacion_codigo=?";
        
        boolean encontrado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next()) {
                modelo.setCodigo(resultados.getString("fundacion_codigo"));
                modelo.setNombre(resultados.getString("nombre"));
                modelo.setPresupuesto(resultados.getDouble("presupuesto"));
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
    public boolean actualizar(final FundacionModelo modelo) {
        String sql = "UPDATE fundacion " +
                     "SET fundacion_codigo=?, nombre=?, presupuesto=?, estatus=? " +
                     "WHERE fundacion_codigo=?";
        
        boolean actualizado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            sentencia.setString(2, modelo.getNombre());
            sentencia.setDouble(3, modelo.getPresupuesto());
            sentencia.setString(4, modelo.getEstatus());
            sentencia.setString(5, modelo.getCodigo());
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
    public boolean eliminar(final FundacionModelo modelo) {
        String sql = "UPDATE fundacion SET estatus=? " +
                     "WHERE fundacion_codigo=?";
        
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
    
    public boolean añadirServicio(final FundacionModelo modelo, String codigoServicio) {
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
    }
}