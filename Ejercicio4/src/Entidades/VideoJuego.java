package Entidades;

public class VideoJuego {
    private String nombre;//Clave
    private String categoria;
    private String compania;
    private int estreno;
    private double precio;
    private  String clasificacion;

    public VideoJuego() {
    }

    public VideoJuego(String nombre) {
        this.nombre = nombre;
    }

    public VideoJuego(String nombre, String categoria, String compania, int estreno, double precio, String clasificacion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.compania = compania;
        this.estreno = estreno;
        this.precio = precio;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", compania='" + compania + '\'' +
                ", estreno=" + estreno +
                ", precio=" + precio +
                ", clasificacion='" + clasificacion + '\'' +
                "}\n";
    }
}
