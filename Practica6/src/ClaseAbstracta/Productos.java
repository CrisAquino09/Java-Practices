package ClaseAbstracta;

public abstract class Productos {
    protected String nombre;
    protected String temporada;
    protected double precio;
    protected double peso;
    protected int cantidad;

    public void vender(String nombre, int cantidad){
        if(cantidad > 0){
            System.out.println("Hay " + cantidad + " de " + nombre + " por vender");
        }else {
            System.out.println("Felicidades Ya vendiste todos los " + nombre);
        }
    }

    //Metodo Abstracto
    public abstract void ventas();

    public Productos() {
    }

    public Productos(String nombre, String temporada, double precio, double peso, int cantidad) {
        this.nombre = nombre;
        this.temporada = temporada;
        this.precio = precio;
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public String getNombre() {        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", cantidad=" + cantidad +
                "}\n";
    }
}
