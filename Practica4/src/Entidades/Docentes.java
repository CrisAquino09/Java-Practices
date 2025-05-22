package Entidades;

public class Docentes {
    private int numDocente;
    private String nombre;
    private  String apellido;
    private int horasAsignadas;
    private String departamento;
    private double sueldo;

    public Docentes() {
    }

    public Docentes(int numDocente) {
        this.numDocente = numDocente;
    }

    public Docentes(int numDocente, String nombre, String apellido, int horasAsignadas, String departamento, double sueldo) {
        this.numDocente = numDocente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasAsignadas = horasAsignadas;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    public int getNumDocente() {
        return numDocente;
    }

    public void setNumDocente(int numDocente) {
        this.numDocente = numDocente;
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

    public int getHorasAsignadas() {
        return horasAsignadas;
    }

    public void setHorasAsignadas(int horasAsignadas) {
        this.horasAsignadas = horasAsignadas;
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

    @Override
    public String toString() {
        return "Docentes{" +
                "numDocente=" + numDocente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", horasAsignadas=" + horasAsignadas +
                ", departamento='" + departamento + '\'' +
                ", sueldo=" + sueldo +
                "}\n";
    }
}
