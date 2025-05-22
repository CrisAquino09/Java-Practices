package Principal;

//Clase Object: Es la clase raiz de todas las clases
//Si se usa para un HashMap o en una lista(Ejemplo HashMap<object, object>) estamos diciendo que
// tanto la clave como el valor puede ser de cualquier tipo de dato o valor

public interface IMetodos {
    void guardar(Object key, Object value);
    void editar (Object key, Object value);
    void eliminar(Object key);
    Object buscar(Object key);
    void mostrar();
}
