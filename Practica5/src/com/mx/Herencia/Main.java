package com.mx.Herencia;

public class Main {
    public static void main(String[] args) {

        //Instanciar Objeto
        ProductosLimpieza pl1 = new ProductosLimpieza("Jabon Zote","Zote","Limpieza",330,25.0,300.0,"Barra");
        ProductosLimpieza pl2 = new ProductosLimpieza("Axion","Axion","Limpieza",100,50.0,500.0,"Liquido");

        //Comprobar la cantidad de productos existentes
        pl2.Existe(pl2.existencia);

        //Actualizacion de datos de existencia
        pl2.setExistencia(0);
        pl2.setNombre("Salvo");
        System.out.println(pl2);

        //Comrpobar existencia de datos
        pl1.Existe(pl2.existencia);
    }
}
