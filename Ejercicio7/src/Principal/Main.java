package Principal;

import Polimorfismo.Automovil;
import Polimorfismo.Deportivo;
import Polimorfismo.PickUp;
import Polimorfismo.Turismo;

public class Main {
    public static void main(String[] args) {
        Automovil [] ves= new Automovil[4];

        ves[0]= new Automovil("Honda", "Civil", "2002");
        ves[1]= new Deportivo("Ford", "GT", "2010",8);
        ves[2]= new Turismo("Nissan", "GT", "2008", 4);
        ves[3]= new PickUp("Ford", "Raptor", "2024",1500);

        for (Automovil auto : ves){
            System.out.println(auto.mostrarDatos());
            System.out.println(auto);
        }

    }
}
