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
    
    /*public ArrayList<FundacionModelo> optenerFundaciones() {
        
        ArrayList<FundacionModelo> fundaciones = new ArrayList<FundacionModelo>();
        String sql = "SELECT * FROM public.fundacion "
                + "WHERE estatus=?";
        
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "A");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                FundacionModelo fundacion = new FundacionModelo();
                fundacion.setCodigo(Integer.parseInt(rs.getString("cod_fund")));
                fundacion.setNombre(rs.getString("nombre_fund"));
                fundacion.setPresupuesto(Double.parseDouble(rs.getString("presupuesto")));
                fundacion.setEstatus(rs.getString("estatus"));
                fundaciones.add(fundacion);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        GestorConexion.desconectar();
        return fundaciones;
    }
    
    public ArrayList<MServicio> optenerServicios(String codigo) {
        System.out.println("no sirve");
        ArrayList<MServicio> servicios = new ArrayList<MServicio>();
        String sql = "SELECT * FROM public.servicio s JOIN "
                + "public.serv_fund s_f ON s.cod_servicio = s_f.cod_servicio "
                + "WHERE s_f.cod_fund = ?";
                
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(codigo));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                MServicio servicio = new MServicio();
                servicio.setCodigo(Integer.parseInt(rs.getString("cod_servicio")));
                servicio.setNombre(rs.getString("nomb_servicio"));
                servicio.setCosto(Double.parseDouble(rs.getString("costo")));
                servicio.setEstatus(rs.getString("estatus"));
                servicios.add(servicio);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return servicios;
    }
    
    public ArrayList<MBeneficiario> optenerBeneficiario(String codigoFundacion) {
        ArrayList<MBeneficiario> beneficiarios = new ArrayList<MBeneficiario>();
        String sql = "SELECT * FROM public.beneficiario b JOIN "
                + "public.solicitud s ON b.cedula_benef = s.cedula_benef "
                + "JOIN public.fundacion f ON s.cod_fund = f.cod_fund "
                + "WHERE f.cod_fund = ?";
                
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(codigoFundacion));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                MBeneficiario beneficiario = new MBeneficiario();
                beneficiario.setCedula(rs.getString("cedula_benef"));
                beneficiario.setNombre(rs.getString("nombre"));
                beneficiario.setApellido(rs.getString("apellido"));
                beneficiario.setTelefono(rs.getString("telefono"));
                beneficiario.setEstatus(rs.getString("estatus"));
                
                beneficiarios.add(beneficiario);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return beneficiarios;
    }
    
    public ArrayList<MResponsable> optenerResponsable(String codigoFundacion) {
        ArrayList<MResponsable> responsables = new ArrayList<MResponsable>();
        String sql = "SELECT * FROM public.responsable r JOIN "
                + "public.solicitud s ON r.cedula_resp = s.cedula_benef "
                + "JOIN public.fundacion f ON s.cod_fund = f.cod_fund "
                + "WHERE f.cod_fund = ?";
               
        conectar();
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(codigoFundacion));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                MResponsable responsable = new MResponsable();
                responsable.setCedula(rs.getString("cedula_benef"));
                responsable.setNombre(rs.getString("nombre"));
                responsable.setApellido(rs.getString("apellido"));
                responsable.setTelefono(rs.getString("telefono"));
                responsable.setEstatus(rs.getString("estatus"));
                
                responsables.add(responsable);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return responsables;
    }
    */
}

