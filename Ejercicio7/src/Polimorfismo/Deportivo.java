package Polimorfismo;

public class Deportivo extends Automovil{
    private int noCilindros;

    //Metodo Personalizado
    public String mostrarDatos(){
        return "Vehiculo\n" + "Marca: " +marca
                +"\nSub Marca: " + subMarca
                +"\nModelo: " + modelo
                +"\nNumero De Cilindros: " + noCilindros;
    }

    public Deportivo() {
    }

    public Deportivo(String marca, String subMarca, String modelo, int noCilindros) {
        super(marca, subMarca, modelo);
        this.noCilindros = noCilindros;
    }

    public int getNoCilindros() {
        return noCilindros;
    }

    public void setNoCilindros(int noCilindros) {
        this.noCilindros = noCilindros;
    }

    @Override
    public String toString() {
        return "Deportivo{" +
                ", marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo='" + modelo + '\'' +
                "noCilindros=" + noCilindros +
                "}\n";
    }
}
