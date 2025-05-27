package Polimorfismo;

public class PickUp extends Automovil{
    private int capacidadCarga;

    public String mostrarDatos(){
        return "Vehiculo\n" + "Marca: " +marca
                +"\nSub Marca: " + subMarca
                +"\nModelo: " + modelo
                +"\nCapacidad De Carga: " + capacidadCarga;
    }

    public PickUp() {
    }

    public PickUp(String marca, String subMarca, String modelo, int capacidadCarga) {
        super(marca, subMarca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "PickUp{" +
                ", marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo='" + modelo + '\'' +
                "capacidadCarga=" + capacidadCarga +
                "}\n";
    }
}
