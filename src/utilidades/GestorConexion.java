/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorConexion {
    
    private static final String DATABASE = "Gobernacion",
                                     URL = "jdbc:postgresql://localhost:5432/" + DATABASE,
                                    USER = "postgres",
                                    PASS = "admin";
    
    private static Connection conexion = null;
    
    private GestorConexion() {
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Connection getConexion() {
        try {
            if(conexion == null || conexion.isClosed())
                new GestorConexion();
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }

        return conexion;
    }
    
    public static void desconectar() {
        try {
            if(conexion != null && !conexion.isClosed())
                conexion.close();
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}