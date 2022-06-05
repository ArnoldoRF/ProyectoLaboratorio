/*
 *  Equipo Nro. 1 
 *  Arnoldo Rodríguez 27.479.958
 *  Ana Calles 28.363.935
 *  Fernando Montilla 26.182.328
 *  Josue Faneittes 27.436.537
 */

package dao;

public interface DaoInterface<T> {
    
    public abstract boolean insertar(final T modelo);
    public abstract boolean consultar(final T modelo);
    public abstract boolean actualizar(final T modelo);
    public abstract boolean eliminar(final T modelo);
}
