package com.mx.Aplicaciones;

import java.util.HashMap;

public class Implementacion implements IMetodos{

    //Declaracion del HashMap
    HashMap<Integer, Aplicaciones> hash= new HashMap<Integer,Aplicaciones>();

    @Override
    public void guardar(Aplicaciones aplicaciones) {
        hash.put(aplicaciones.getClave(), aplicaciones);
    }

    @Override
    public void editar(Aplicaciones aplicaciones) {
        hash.replace(aplicaciones.getClave(), aplicaciones);
    }

    @Override
    public void eliminar(Aplicaciones aplicaciones) {
        hash.remove(aplicaciones.getClave());
    }

    @Override
    public Aplicaciones buscar(Aplicaciones aplicaciones) {
        return hash.get(aplicaciones.getClave());
    }

    @Override
    public void mostrar() {
        System.out.println(hash);
    }

    //Metodos Personalizados
    public void contar(){
        System.out.println("El HashMap Contiene: " + hash.size() + " Aplicaciones");
    }

    public boolean existeClave(int clave){
        return hash.containsKey(clave);
    }
}
