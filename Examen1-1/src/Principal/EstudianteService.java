package Principal;

import ClaseAbstracta.Estudiante;

public interface EstudianteService {
    void guardar (Estudiante estudiante);
    void editar (int indice, Estudiante estudiante);
    void eliminar(int indice);
    void mostrar ();
    Estudiante buscar(int indice);
}
