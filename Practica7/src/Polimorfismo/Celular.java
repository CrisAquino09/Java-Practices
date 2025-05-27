package Polimorfismo;

public class Celular extends Productos{
    private String sistemaOperativo;

    public String mostrarDatos(){
        return "Producto\n"
                + "Clave: " +clave
                +"\nNombre: " + nombre
                +"\nPrecio: " + precio
                +"\nSistema Operativo: " + sistemaOperativo;
    }

    public Celular() {
    }

    public Celular(int clave, String nombre, int precio, String sistemaOperativo) {
        super(clave, nombre, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Celular{" +
                ", clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                "}\n";
    }
}
