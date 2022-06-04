/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package dao;

import java.sql.*;
import modelos.ResponsableModelo;
import utilidades.GestorConexion;

public class ResponsableDao implements DaoInterface<ResponsableModelo> {

    @Override
    public boolean insertar(final ResponsableModelo modelo) {
        String sql = "INSERT INTO responsable " +
                     "(beneficiario_cedula, nombre, apellido, telefono, fundacion_codigo, estatus) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        
        boolean insertado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCedula());
            sentencia.setString(2, modelo.getNombre());
            sentencia.setString(3, modelo.getApellido());
            sentencia.setString(4, modelo.getTelefono());
            sentencia.setString(5, modelo.getCodigoFundacion());
            sentencia.setString(6, modelo.getEstatus());
            sentencia.executeUpdate();
            
            insertado = true;
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return insertado;
    }

    @Override
    public boolean consultar(final ResponsableModelo modelo) {        
        String sql = "SELECT * FROM responsable " +
                     "WHERE responsable_cedula=?";
        
        boolean encontrado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCedula());
            
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next()) {
                modelo.setNombre(resultados.getString("nombre"));
                modelo.setApellido(resultados.getString("apellido"));
                modelo.setTelefono(resultados.getString("telefono"));
                modelo.setCodigoFundacion(resultados.getString("fundacion_codigo"));
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
    public boolean actualizar(final ResponsableModelo modelo) {
        String sql = "UPDATE responsable " +
                     "SET nombre=?, apellido=?, telefono=?, fundacion_codigo=?, estatus=? " +
                     "WHERE responsable_cedula=?";
        
        boolean actualizado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getNombre());
            sentencia.setString(2, modelo.getApellido());
            sentencia.setString(3, modelo.getTelefono());
            sentencia.setString(4, modelo.getEstatus());
            sentencia.setString(5, modelo.getCodigoFundacion());
            sentencia.setString(6, modelo.getCedula());
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
    public boolean eliminar(final ResponsableModelo modelo) {
        String sql = "UPDATE responsable SET estatus=? " +
                     "WHERE responsable_cedula=?";
        
        boolean eliminado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, "E");
            sentencia.setString(2, modelo.getCedula());
            sentencia.executeUpdate();
            
            eliminado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
            
        GestorConexion.desconectar();
        return eliminado;
    }
}