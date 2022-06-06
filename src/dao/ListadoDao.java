/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import utilidades.GestorConexion;

public class ListadoDao {
    
    private final String BENEFICIARIO_FUNDACION =
            "SELECT f.fundacion_codigo, b.beneficiario_cedula, b.nombre, b.apellido, b.telefono " +
            "FROM beneficiario b JOIN solicitud s " +
            "ON b.beneficiario_cedula = s.beneficiario_cedula " +
            "JOIN fundacion f ON s.fundacion_codigo = f.fundacion_codigo";
    
    private final String PRESUPUESTO_ESTATUS =
            "SELECT s.estatus, ss.costo_total FROM solicitud s " +
            "JOIN solicitud_servicio ss " +
            "ON s.solicitud_codigo = ss.solicitud_codigo";
    
    private final String ASISTENCIA_CHARLA =
            "SELECT a.charla_codigo, a.beneficiario_cedula FROM asistencia a";
    
    private final String PRESUPUESTO_FUNDACION =
            "";
    
    private final String SOLICITUD_RESPONSABLE =
            "SELECT s.responsable_cedula, s.solicitud_codigo FROM solicitud s";
    
    public  List<List<String>> listar(String sql) {
        
        List<List<String>> listado = new ArrayList<>();
        Connection conexion = GestorConexion.getConexion();
        
        try(PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            ResultSet resultados = sentencia.executeQuery();
            int numeroColumnas = resultados.getMetaData().getColumnCount();
            
            while(resultados.next()) {
                List<String> datos = new ArrayList<>();
                for(int i = 1; i <= numeroColumnas; i++) {
                    datos.add(resultados.getString(i));
                }
                listado.add(datos);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        GestorConexion.desconectar();
        return listado;
    }
    
    public List<List<String>> listarBeneficiarioFundacion() {
        return listar(BENEFICIARIO_FUNDACION);
    }
    
    public List<List<String>> listarPresupuestoEstatus() {
        return listar(PRESUPUESTO_ESTATUS);
    }
    
    public List<List<String>> listarAsistenciaCharla() {
        return listar(ASISTENCIA_CHARLA);
    }
    
    public List<List<String>> listarSolicitudResponsable() {
        return listar(SOLICITUD_RESPONSABLE);
    }
}
