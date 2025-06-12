package com.mx.celular;

public class celular {
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private int ram;
    private int rom;

    public celular(){

    }

    public celular(String marca, String modelo, String color, double precio, int ram, int rom) {
        this.marca = marca;
        this.modelo=modelo;
        this.color=color;
        this.precio=precio;
        this.ram=ram;
        this.rom=rom;
    }

    //Getter y Setters


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String toString(){
        return "Celular: \n" + "Marca= " + marca + "\nModelo= " +modelo + "\nColor= " +color + "\nPrecio= " +precio + "\nRam= " + ram + "\nRom: " + rom +"\n\n";
    }
}


