package com.mx.Herencia;

public class ProductosLimpieza extends Productos{
    private double peso;
    private String tipo;

    public ProductosLimpieza() {
    }

    public ProductosLimpieza(String nombre, String marca, String categoria, int existencia, double precio, double peso, String tipo) {
        super(nombre, marca, categoria, existencia, precio);
        this.peso = peso;
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProductosLimpieza{" +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                ", existencia=" + existencia +
                ", precio=" + precio +
                "peso=" + peso +
                ", tipo='" + tipo + '\'' +
                "}\n";
    }

}
