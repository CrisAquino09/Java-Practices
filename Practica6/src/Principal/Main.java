package Principal;

import ClaseAbstracta.Frutas;
import ClaseAbstracta.Verduras;

public class Main {
    public static void main(String[] args) {

        //Instanciar Objetos
        Frutas f1 = new Frutas("Manzana", "Invierno", 78,0.7,200,true,30);

        //Impresion de datos
        System.out.println(f1);
        f1.ventas();
        f1.vender(f1.getNombre(), f1.getCantidad());

        Verduras v1 = new Verduras("Tomate", "Primavera", 20, 0.3, 600,14,true);
        System.out.println(v1);
        v1.ventas();
        v1.vender(v1.getNombre(), v1.getCantidad());
        v1.setCantidad(0);
        v1.vender(v1.getNombre(), v1.getCantidad());

    }
}
