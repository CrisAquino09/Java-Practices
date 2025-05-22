package ClaseAbstracta;

import Implementacion.EstudianteSetviceImpl;


public class Estudiante extends Persona{
    private String carrera;

    @Override
    public void mostrarInformacion() {
        System.out.println("Recepcion de Estudiantes");
    }

    public Estudiante() {
    }

    public Estudiante(int id, String nombre, int edad, String carrera) {
        super(id, nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                " carrera='" + carrera + '\'' +
                ", id=" + id +
                "}\n";
    }
}
