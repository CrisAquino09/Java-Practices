package EstaticosYConstantes;

public class Prueba {
    public static void main(String[] args) {
        //Instanciar Por Clase Principal
        Main o1= new Main();
        Main o2 = new Main();

        //Acceder a los miembros de la clase instanciada
        System.out.println("Objeto 1: " + o1.frase2);// Miembro de instancia
        System.out.println("Objeto 2: " + Main.frase1);//Miembros A travez de una clase
        System.out.println("Objeto 3: " + Main.frase3);
    }
}
