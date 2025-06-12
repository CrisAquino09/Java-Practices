package Principal;

import ClaseAbstracta.Administrador;
import ClaseAbstracta.Estudiante;
import Implementacion.EstudianteSetviceImpl;

public class Main {
    public static void main(String[] args) {
        //Instanciar Objetos
        Estudiante e1 = new Estudiante(15,"Cristian", 23, "Sistemas Computacionales");
        Estudiante e2 = new Estudiante(28,"Juan", 25, "Sistemas Computacionales");

        Administrador a1 = new Administrador(17,"Estrella", 25, "Informatica");
        Administrador a2 = new Administrador(18,"Karen", 21, "Gestion Empresarial");


        //Variables Auxiliares
        Estudiante aux=null;
        EstudianteSetviceImpl imp= new EstudianteSetviceImpl();

        //Agregar
        imp.guardar(e1);
        imp.guardar(e2);

        //Mostrar con el metodo Abstracto
        System.out.println("Metodo Abstracto: ");
        e1.mostrarInformacion();

        //Editar
        System.out.println("Metodo Concreto: ");
        aux= imp.buscar(0);
        aux.setEdad(30);
        imp.editar(0,aux);
        imp.mostrar();

        //Eliminar
        imp.eliminar(1);
        imp.mostrar();

    }
}
