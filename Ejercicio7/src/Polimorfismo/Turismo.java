package Polimorfismo;

public class Turismo extends Automovil{
    private int numAsientos;

    public String mostrarDatos(){
        return "Vehiculo\n" + "Marca: " +marca
                +"\nSub Marca: " + subMarca
                +"\nModelo: " + modelo
                +"\nNumero De Asientos: " + numAsientos;
    }

    public Turismo() {
    }

    public Turismo(String marca, String subMarca, String modelo, int numAsientos) {
        super(marca, subMarca, modelo);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "Turismo{" +
                ", marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo='" + modelo + '\'' +
                "numAsientos=" + numAsientos +
                "}\n";
    }
}
