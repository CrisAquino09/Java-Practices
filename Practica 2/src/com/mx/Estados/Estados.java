package com.mx.Estados;

public class Estados {
    private String nombre;
    private  String capital;
    private int numHabitantes;
    private double pib;

    public Estados() {
    }

    public Estados(String nombre, String capital, int numHabitantes, double pib) {
        this.nombre = nombre;
        this.capital = capital;
        this.numHabitantes = numHabitantes;
        this.pib = pib;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        return "Estados{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", numHabitantes=" + numHabitantes +
                ", pib=" + pib +
                "}\n";
    }
}
