package com.mx.Herencia;

public class Productos {
    protected String nombre;
    protected String marca;
    protected String categoria;
    protected int existencia;
    protected double precio;

    public Productos() {
    }

    public Productos(String nombre, String marca, String categoria, int existencia, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.existencia = existencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                ", existencia=" + existencia +
                ", precio=" + precio +
                '}';
    }

    //Metodo Personalizado
    public void Existe(int existencia){
        if (existencia>0){
            System.out.println("Hay " + existencia + " Productos");
        }else{
            System.out.println("No Hay Productos en existencia");
        }

    }
}
