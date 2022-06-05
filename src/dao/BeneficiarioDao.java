/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.BeneficiarioModelo;
import utilidades.GestorConexion;

public class BeneficiarioDao implements DaoInterface<BeneficiarioModelo> {

    @Override
    public boolean insertar(final BeneficiarioModelo modelo) {
        String sql = "INSERT INTO beneficiario " +
                     "(beneficiario_cedula, nombre, apellido, telefono, estatus) " +
                     "VALUES (?, ?, ?, ?, ?)";
        
        boolean insertado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCedula());
            sentencia.setString(2, modelo.getNombre());
            sentencia.setString(3, modelo.getApellido());
            sentencia.setString(4, modelo.getTelefono());
            sentencia.setString(5, modelo.getEstatus());
            sentencia.executeUpdate();
            
            insertado = true;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
            
        GestorConexion.desconectar();
        return insertado;
    }

    @Override
    public boolean consultar(final BeneficiarioModelo modelo) {        
        String sql = "SELECT * FROM beneficiario " +
                     "WHERE beneficiario_cedula=?";
        
        boolean encontrado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getCedula());
            
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next()) {
                modelo.setNombre(resultados.getString("nombre"));
                modelo.setApellido(resultados.getString("apellido"));
                modelo.setTelefono(resultados.getString("telefono"));
                modelo.setEstatus(resultados.getString("estatus"));
                
                encontrado = true;
            }
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
            
        GestorConexion.desconectar();
        return encontrado;
    }

    @Override
    public boolean actualizar(final BeneficiarioModelo modelo) {
        String sql = "UPDATE beneficiario " +
                     "SET nombre=?, apellido=?, telefono=?, estatus=? " +
                     "WHERE beneficiario_cedula=?";
        
        boolean actualizado = false;
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getNombre());
            sentencia.setString(2, modelo.getApellido());
            sentencia.setString(3, modelo.getTelefono());
            sentencia.setString(4, modelo.getEstatus());
            sentencia.setString(5, modelo.getCedula());
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
    public boolean eliminar(final BeneficiarioModelo modelo) {
        String sql = "UPDATE beneficiario SET estatus=? " +
                     "WHERE beneficiario_cedula=?";
        
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