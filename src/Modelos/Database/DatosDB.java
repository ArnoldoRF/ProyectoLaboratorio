/*
Equipo Nro 1 
Arnoldo Rodríguez 27.479.958
Ana Calles 28.363.935
Fernando Montilla 26.182.328
Josue Faneittes 27.436.537
*/
package Modelos.Database;

public class DatosDB {
    
    protected String database = "postgres",
                          url = "jdbc:postgresql://localhost:5432/" + database,
                         user = "postgres",
                         pass = "admin";
}
