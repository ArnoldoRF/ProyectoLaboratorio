/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package modelos.database;

import java.util.List;

public interface Dao<T> {
    
    public abstract boolean insertar(T obj);
    public abstract List<T> listar();
    public abstract T consultar(T obj);
    public abstract boolean actualizar(T obj);
    public abstract boolean eliminar(T obj);
}
