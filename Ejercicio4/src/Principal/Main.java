package Principal;

import Entidades.Fruta;
import Implementacion.ImpFruta;

public class Main {
    public static void main(String[] args) {

        //Instanciar Objetos

        Fruta f1 = new Fruta("Mango", "Amarillo", 20.6,0.8,"Verano");
        Fruta f2 = new Fruta("Melon", "Cafe", 20.6,0.8,"Verano");
        Fruta f3 = new Fruta("Sandia", "Roja", 20.6,0.8,"Primavera");
        Fruta f4 = new Fruta("Manzana", "Verde", 20.6,0.8,"Invierno");

        //Variable Auxiliar
        Fruta fruta=null;
        ImpFruta impF= new ImpFruta();

        //Guardar Datos
        impF.guardar(f1.getNombre(),f1);
        impF.guardar(f2.getNombre(),f2);
        impF.guardar(f3.getNombre(),f3);
        impF.guardar(f4.getNombre(),f4);

        //Mostrar Datos
        impF.mostrar();

        //Buscar Datos
        //Casteo: Cambio de dato
        fruta=(Fruta) impF.buscar(f1.getNombre()) ;
        System.out.println(fruta);

        //Eliminar Datos
        impF.contar();
        impF.eliminar(f2.getNombre());
        System.out.println("Elemento eliminado exitosamente");

        //Contar Datos del HashMap
        impF.contar();
    }
}
//Realizar El uso de la clase Object con una lista Generica(No usar HasgMap)
//Usar 3 entidades diferentes y por cada enidad hay que crear al menos 4 instancias
//todas las entidades deben llevar las pruebas (agregar, mostrar, editar,eliminar y contar)
