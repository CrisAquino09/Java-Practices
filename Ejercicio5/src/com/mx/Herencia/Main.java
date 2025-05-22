package com.mx.Herencia;

public class Main {
    public static void main(String[] args) {

        //Instanciar Objeto Hijo
        Hijo h1 = new Hijo("Cris","Santiago", 23, 1.80,"Mexicana", "Cafe", "Delgado");

        System.out.println(h1);
        h1.setEdad(24);
        h1.setNombre("Juan");
        System.out.println(h1);
    }
}
