package Principal;

import Polimorfismo.Audifono;
import Polimorfismo.Cargador;
import Polimorfismo.Celular;
import Polimorfismo.Productos;

public class Main {
    public static void main(String[] args) {

        //Intanciar Objetos
        Productos [] productos= new Productos[4];

        productos[0]= new Productos(432,"HP X360", 6000);
        productos[1]= new Celular(561,"Samsung", 12000,"Android");
        productos[2]= new Cargador(57,"Cargador Xiaomi", 500,"Carga Rapida");
        productos[3]= new Audifono(619,"JBL", 3400,"Bluetooth");

        for (Productos prod : productos){
            System.out.println(prod.mostrarDatos());
            System.out.println(prod);
        }
    }
}
