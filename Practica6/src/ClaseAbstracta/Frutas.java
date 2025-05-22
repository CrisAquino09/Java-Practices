package ClaseAbstracta;

public class Frutas extends Productos {
    private boolean existencia;
    private double costoMayoreo;

    @Override
    public void ventas() {
        System.out.println("Venta de Frutas");
    }

    public Frutas() {
    }

    public Frutas(String nombre, String temporada, double precio, double peso, int cantidad, boolean existencia, double costoMayoreo) {
        super(nombre, temporada, precio, peso, cantidad);
        this.existencia = existencia;
        this.costoMayoreo = costoMayoreo;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public double getCostoMayoreo() {
        return costoMayoreo;
    }

    public void setCostoMayoreo(double costoMayoreo) {
        this.costoMayoreo = costoMayoreo;
    }

    @Override
    public String toString() {
        return "Frutas{" +
                ", nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", cantidad=" + cantidad +
                "existencia=" + existencia +
                ", costoMayoreo=" + costoMayoreo +
                "}\n";
    }
}
