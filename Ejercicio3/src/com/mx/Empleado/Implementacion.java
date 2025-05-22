package com.mx.Empleado;

import java.util.HashMap;

public class Implementacion implements IMetodos{

    /*
    * Sintaxis HashMap
    * HashMap<Clave, Valor> hash= new HashMap<Clave, Valor>();
    *
    * HashMap -> Es una libreria de java.util
    * KeyDataType -> Es la clase contenedora del dato primitivo de la clave
    * ValueDataType -> Es el nombre de la clase
    * nombre -> Es asignado por el programador
    * new -> palabra reservaa para invocar al constructor y lo llama por defecto
    * */

    //Declaracion del HashMap
    HashMap<Integer, Empleado> hash= new HashMap<Integer,Empleado>();


    @Override
    public void guardar(Empleado empleado) {

        hash.put(empleado.getClave(), empleado);

    }

    @Override
    public Empleado buscar(Empleado empleado) {

        return hash.get(empleado.getClave());
    }

    @Override
    public void editar(Empleado empleado) {
        hash.replace(empleado.getClave(),empleado);

    }

    @Override
    public void eliminar(Empleado empleado) {
        hash.remove(empleado.getClave());

    }

    @Override
    public void mostrar() {
        System.out.println(hash);
    }

    //Metodos Personalizados
    public void contar(){
        System.out.println("El HashMap Contiene: " + hash.size() + " Empleados");
    }

    //Metodo para evitar Duplicados
    public boolean existeClave(int clave){
        return hash.containsKey(clave);
    }
}
