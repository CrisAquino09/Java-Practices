package Implementacion;

import Entidades.Estudiantes;

public class ImpEstudiantes extends ImplementacionGenerica{
    //Metodo Personalizado
    public void contar() {
        int cont= list.size();
        System.out.println("La lista contiene: " + cont + " Etudiantes");
    }

    //Metodo de existencia de duplicados
    /*
    public boolean existeDuplicado(Estudiantes estudiantes){
        for (Estudiantes c:list){
            if(c.getNumEstudiante() == estudiantes.getNumEstudiante()
                    && c.getNombre().equalsIgnoreCase(estudiantes.getNombre())
                    && c.getApellido().equalsIgnoreCase(estudiantes.getApellido())
                    && c.getEspecialidad().equalsIgnoreCase(estudiantes.getEspecialidad())
                    && c.getNumMaterias() == estudiantes.getNumMaterias()
                    && c.getSemestre() == estudiantes.getSemestre()){
                return true;
            }
        }
        return false;
    }*/
}
