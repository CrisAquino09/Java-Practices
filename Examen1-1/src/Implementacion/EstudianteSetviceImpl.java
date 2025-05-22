package Implementacion;

import ClaseAbstracta.Estudiante;
import Principal.EstudianteService;

import java.util.ArrayList;
import java.util.List;

public class EstudianteSetviceImpl implements EstudianteService {

    public List<Estudiante> lista = new ArrayList<Estudiante>();

    @Override
    public void guardar(Estudiante estudiante) {
        lista.add(estudiante);
    }

    @Override
    public void editar(int indice, Estudiante estudiante) {
        lista.set(indice,estudiante);
    }

    @Override
    public void eliminar(int indice) {
        lista.remove(indice);

    }

    @Override
    public void mostrar() {
        System.out.println(lista);
    }

    @Override
    public Estudiante buscar(int indice) {
        return lista.get(indice);
    }

}
