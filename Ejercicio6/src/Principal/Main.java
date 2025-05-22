package Principal;

import ClaseAbstracta.Abogado;
import ClaseAbstracta.Medico;


public class Main {
    public static void main(String[] args) {
        //Instanciar
        Abogado a1= new Abogado("Ricardo", "Jimenez",30,78738,"UNAM",6,"Litigante", "Bufete no 2",2500);
        System.out.println(a1);
        a1.trabajar();
        a1.cobrar(a1.getTipo(),a1.getHonorarios());

        //Instanciar
        Medico m1= new Medico("Julio","Gomez", 32,87618,"BUAP", 9,"Medico Familiar", "El Ahorro", 1200);
        System.out.println(m1);
        m1.trabajar();
        m1.cobrar(m1.getEspecialidad(),m1.getCostoConsulta());
    }
}
