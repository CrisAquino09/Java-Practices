package Polimorfismo;

public class Cargador extends Productos{
    private String tipoCarga;

    public String mostrarDatos(){
        return "Producto\n"
                + "Clave: " +clave
                +"\nNombre: " + nombre
                +"\nPrecio: " + precio
                +"\nTipo De Carga: " + tipoCarga;
    }

    public Cargador() {
    }

    public Cargador(int clave, String nombre, int precio, String tipoCarga) {
        super(clave, nombre, precio);
        this.tipoCarga = tipoCarga;
    }

    public String getTipoCarga() {        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return "Cargador{" +
                ", clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                "tipoCarga='" + tipoCarga + '\'' +
                "}\n";
    }
}
