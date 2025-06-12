package Entidades;

public class Administrativos {
    private int numEmpleado;
    private String nombre;
    private  String apellido;
    private String puesto;
    private  String departamento;
    private double sueldo;
    private int antiguedad;

    public Administrativos() {
    }

    public Administrativos(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public Administrativos(int numEmpleado, String nombre, String apellido, String puesto, String departamento, double sueldo, int antiguedad) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Administrativos{" +
                "numEmpleado=" + numEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", puesto='" + puesto + '\'' +
                ", departamento='" + departamento + '\'' +
                ", sueldo=" + sueldo +
                ", antiguedad=" + antiguedad +
                "}/n";
    }
}
