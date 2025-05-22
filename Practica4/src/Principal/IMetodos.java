package Principal;

public interface IMetodos {
    void guardar(Object object);
    void editar(int indice,Object object);
    void eliminar(int indice);
    Object buscar(int indice);
    void mostrar();

}
