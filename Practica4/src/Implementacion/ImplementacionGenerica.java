package Implementacion;

import Principal.IMetodos;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionGenerica implements IMetodos {

   public List<Object> list=new ArrayList<Object>();

    @Override
    public void guardar(Object object) {
        list.add(object);
    }

    @Override
    public void editar(int indice, Object object) {
        list.set(indice,object);
    }

    @Override
    public void eliminar(int indice) {
        list.remove(indice);
    }

    @Override
    public Object buscar(int indice) {
        return list.get(indice);
    }

    @Override
    public void mostrar() {
        System.out.println(list);
    }

}
