
package Modelos.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionDB extends DatosDB {
    
    protected Connection con;
    
    public ConexionDB() {
        con = null;
    }
    
    public void conectar() {
        try {
            con = DriverManager.getConnection(url, user, pass);
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            con.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public ResultSet ejecutarConsulta(String sql){
        try {
            Statement sentencia = con.createStatement();
            return sentencia.executeQuery(sql); 
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    public void ejecutarActualizacion(String sql) {
        try {
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate(sql);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}