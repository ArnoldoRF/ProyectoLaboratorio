/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package dao;

import java.sql.*;
import modelos.ServicioModelo;
import utilidades.GestorConexion;

public class ServicioDao implements DaoInterface<ServicioModelo> {

    @Override
    public boolean insertar(final ServicioModelo modelo) {
        String sql = "INSERT INTO servicio " +
                     "(servicio_codigo, nombre, costo, estatus) " +
                     "VALUES (?, ?, ?, ?)";
        
        boolean insertado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            sentencia.setString(2, modelo.getNombre());
            sentencia.setDouble(3, modelo.getCosto());
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
    public boolean consultar(final ServicioModelo modelo) {        
        String sql = "SELECT * FROM servicio " +
                     "WHERE servicio_codigo=?";
        
        boolean encontrado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCodigo());
            
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next()) {
                modelo.setNombre(resultados.getString("nombre"));
                modelo.setCosto(resultados.getDouble("costo"));
                modelo.setEstatus(resultados.getString("estatus"));
                
                encontrado = !modelo.getNombre().isBlank();
                System.out.println(modelo.getNombre());
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return encontrado;
    }

    @Override
    public boolean actualizar(final ServicioModelo modelo) {
        String sql = "UPDATE servicio " +
                     "SET nombre=?, costo=?, estatus=? " +
                     "WHERE servicio_codigo=?";
        
        boolean actualizado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getNombre());
            sentencia.setDouble(2, modelo.getCosto());
            sentencia.setString(3, modelo.getEstatus());
            sentencia.setString(4, modelo.getCodigo());
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
    public boolean eliminar(final ServicioModelo modelo) {
        String sql = "UPDATE servicio SET estatus=? " +
                     "WHERE servicio_codigo=?";
        
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
    
    public boolean existe(String codigo) {
        ServicioModelo servicio = new ServicioModelo();
        servicio.setCodigo(codigo);
        return consultar(servicio);
        //servicio.
    }
}
