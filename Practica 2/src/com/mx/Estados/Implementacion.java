package com.mx.Estados;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos{

    //Crear lista
    List<Estados> lista= new ArrayList<Estados>();

    @Override
    public void guardar(Estados estado) {
        lista.add(estado);

    }

    @Override
    public void editar(int indice, Estados estado) {
        lista.set(indice,estado);
    }

    @Override
    public void mostrar() {
        System.out.println(lista);
    }

    @Override
    public void eliminar(int indice) {
        lista.remove(indice);
    }

    @Override
    public Estados buscar(int indice) {
        return lista.get(indice);
    }

    public void contar(){
        System.out.println("Actualmente hay: " + lista.size() + " estados registrados");
    }

    public boolean existeDuplicado(Estados nuevo){
        for (Estados c:lista){
            if(c.getNombre().equalsIgnoreCase(nuevo.getNombre())
                    && c.getCapital().equalsIgnoreCase(nuevo.getCapital())
                    && c.getNumHabitantes() == nuevo.getNumHabitantes()
                    && c.getPib() == nuevo.getPib()){
                return true;
            }
        }
        return false;
    }

    public void Estados buscarNombre(String nombre){
        for (Estados c:lista){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return c;
            }
        }
        return null;
    }
}
