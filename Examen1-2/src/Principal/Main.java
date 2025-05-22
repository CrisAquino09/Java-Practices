package Principal;

public class Main {
    public static void main(String[] args) {
        Operaciones o1= new Operaciones();

        System.out.println("Ejemplo 1: " + o1.multiplicar(56));
        System.out.println("Ejemplo 2: " + o1.multiplicar(56,67));
        System.out.println("Ejemplo 3: " + o1.multiplicar(56,233,23));
        System.out.println("Ejemplo 4: " + o1.multiplicar(56,23,2,13));
    }
}
