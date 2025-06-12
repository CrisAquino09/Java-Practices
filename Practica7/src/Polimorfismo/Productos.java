package Polimorfismo;

public class Productos {
    protected int clave;
    protected String nombre;
    protected int precio;

    public String mostrarDatos(){
        return "Producto\n"
                + "Clave: " +clave
                +"\nNombre: " + nombre
                +"\nPrecio: " + precio;
    }

    public Productos() {
    }

    public Productos(int clave, String nombre, int precio) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                "}\n";
    }
}
