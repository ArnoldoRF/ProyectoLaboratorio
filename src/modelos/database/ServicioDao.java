/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package modelos.database;

import modelos.MServicio;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServicioDao implements Dao<MServicio> {

    private GestionConexion gestionConexion;
    private Connection conexion;
    
    public ServicioDao() {
        this.gestionConexion = new GestionConexion();
    }

    @Override
    public boolean insertar(MServicio modelo) {
        String sql = "INSERT INTO servicio " +
                     "(servicio_codigo, nombre, costo, estatus) " +
                     "VALUES (?, ?, ?, ?)";
        
        boolean estaInsertado = false;
        conexion = gestionConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setInt(1, modelo.getCodigo());
            sentencia.setString(2, modelo.getNombre());
            sentencia.setDouble(3, modelo.getCosto());
            sentencia.setString(4, modelo.getEstatus());
            sentencia.executeUpdate();
            
            conexion.close();
            estaInsertado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return estaInsertado;
    }

    @Override
    public List<MServicio> listar() {
        String sql = "SELECT * FROM servicio";
        
        List<MServicio> servicios = new ArrayList<MServicio>();
        conexion = gestionConexion.getConexion();
        
        try(Statement sentencia = conexion.createStatement()) {    
            ResultSet resultados = sentencia.executeQuery(sql);
            
            while(resultados.next()) {
                MServicio servicio = new MServicio();
                servicio.setCodigo(Integer.parseInt(resultados.getString("servicio_codigo")));
                servicio.setNombre(resultados.getString("nombre"));
                servicio.setCosto(Double.parseDouble(resultados.getString("costo")));
                servicio.setEstatus(resultados.getString("estatus"));
                
                servicios.add(servicio);
            }
            
            conexion.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        return servicios;
    }

    @Override
    public MServicio consultar(MServicio modelo) {        
        String sql = "SELECT * FROM servicio " +
                     "WHERE servicio_codigo=?";
        
        conexion = gestionConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setInt(1, modelo.getCodigo());
            
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next()) {
                modelo.setNombre(resultados.getString("nombre"));
                modelo.setCosto(Double.parseDouble(resultados.getString("costo")));
                modelo.setEstatus(resultados.getString("estatus"));
            }
            
            conexion.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return modelo;
    }

    @Override
    public boolean actualizar(MServicio modelo) {
        String sql = "UPDATE servicio " +
                     "SET nombre=?, costo=?, estatus=? " +
                     "WHERE servicio_codigo=?";
        
        boolean estaActualizado = false;
        conexion = gestionConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, modelo.getNombre());
            sentencia.setDouble(2, modelo.getCosto());
            sentencia.setString(3, modelo.getEstatus());
            sentencia.setInt(4, modelo.getCodigo());
            sentencia.executeUpdate();
            
            conexion.close();
            estaActualizado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return estaActualizado;
    }

    @Override
    public boolean eliminar(MServicio modelo) {
        String sql = "UPDATE servicio SET estatus=? " +
                     "WHERE servicio_codigo=?";
        
        boolean estaEliminado = false;
        conexion = gestionConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, "E");
            sentencia.setInt(2, modelo.getCodigo());
            sentencia.executeUpdate();
            
            conexion.close();
            estaEliminado = true;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return estaEliminado;
    }
}
