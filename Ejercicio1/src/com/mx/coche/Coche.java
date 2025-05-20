package com.mx.coche;

public class Coche {
    //Definicion de atributos: Definicion de caracteristicas o propiedaes que representan al objeto

    private String marca;
    private String subMarca;
    private int modelo;
    private String color;
    private double precio;

    //Constructores: Inicializan el objeto, estos se ejecutan cuando se crear la instancia del objeto
    //constructor vacio o constructor por defecto
    //El constuctor debe llevar siempre el nombre de la clase y se debe definir como publico

    //Constructor vacio
    public Coche(){

    }

    //Constructor parametrizado: se inicialia con valores especificos
    public Coche(String marca, String subMarca, int modelo, String color, double precio){
        this.marca=marca;
        this.subMarca=subMarca;
        this.modelo=modelo;
        this.color=color;
        this.precio=precio;
    }

    //metodos getter y setter: Se utilizan ya que los atributos fueron declarados en private, para acceder
    //y modificar estos atributos de una forma controlada.

    //get: obtiene el valor del atributo
    //set: modifica el valor del atributo con validacion.

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
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

    //Metodo toString, declaracion en las funciones, sirve para cualquier objeto en cadena y se utiliza para
    // representr un objeto en cadena y lo convierte en legible. (Es lo que se visiaulizara en la consola)

    public String toString(){
        return "Coche: \n" + "Marca= " + marca + "\nSubMarca= " +subMarca + "\nModelo= " +modelo + "\nColor= " +color + "\nPrecio= " + precio +"\n\n";
    }
}
