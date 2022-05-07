/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package Modelos.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestionConexion {
    
    private final String DATABASE = "Gobernacion",
                              URL = "jdbc:postgresql://localhost:5432/" + DATABASE,
                             USER = "postgres",
                             PASS = "admin";
    
    private Connection conexion;
    
    public GestionConexion() {
        conexion = null;
    }
    
    public Connection getConexion() {
        if(conexion == null)
            conectar();
        return conexion;
    }
    
    public void conectar() {
        try {
            conexion = DriverManager.getConnection(URL, USER, DATABASE);
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            conexion.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}