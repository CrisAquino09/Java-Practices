package ClaseAbstracta;

public class Verduras extends Productos{
    private double precioMenudeo;
    private boolean existencia;

    @Override
    public void ventas() {
        System.out.println("Venta de Verduras");
    }

    public Verduras() {
    }

    public Verduras(String nombre, String temporada, double precio, double peso, int cantidad, double precioMenudeo, boolean existencia) {
        super(nombre, temporada, precio, peso, cantidad);
        this.precioMenudeo = precioMenudeo;
        this.existencia = existencia;
    }

    public double getPrecioMenudeo() {
        return precioMenudeo;
    }

    public void setPrecioMenudeo(double precioMenudeo) {
        this.precioMenudeo = precioMenudeo;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Verduras{" +
                ", nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", cantidad=" + cantidad +
                "precioMenudeo=" + precioMenudeo +
                ", existencia=" + existencia +
                "}\n";
    }
}
