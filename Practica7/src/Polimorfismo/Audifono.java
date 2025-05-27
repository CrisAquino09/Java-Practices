package Polimorfismo;

public class Audifono extends Productos{
    private String tipoConexion;

    public String mostrarDatos(){
        return "Producto\n"
                + "Clave: " +clave
                +"\nNombre: " + nombre
                +"\nPrecio: " + precio
                +"\nTipo De Conexion: " + tipoConexion ;
    }

    public Audifono() {
    }

    public Audifono(int clave, String nombre, int precio, String tipoConexion) {
        super(clave, nombre, precio);
        this.tipoConexion = tipoConexion;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    @Override
    public String toString() {
        return "Audifono{" +
                ", clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                "tipoConexion='" + tipoConexion + '\'' +
                "}\n";
    }
}
