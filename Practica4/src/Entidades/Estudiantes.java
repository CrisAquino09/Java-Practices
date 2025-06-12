package Entidades;

public class Estudiantes {
    private int numEstudiante;
    private String nombre;
    private String apellido;
    private String especialidad;
    private int numMaterias;
    private int semestre;

    public Estudiantes() {
    }

    public Estudiantes(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    public Estudiantes(int numEstudiante, String nombre, String apellido, String especialidad, int numMaterias, int semestre) {
        this.numEstudiante = numEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.numMaterias = numMaterias;
        this.semestre = semestre;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "numEstudiante=" + numEstudiante +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", numMaterias=" + numMaterias +
                ", semestre=" + semestre +
                "}\n";
    }
}
