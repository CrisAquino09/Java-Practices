package EstaticosYConstantes;

public class Main {

    //Miembros estaticos: Metodos o atributos qie se asocian a una clae en lugar de una instancia
    //Miembros Constantes: Son variables que durante la ejecucion del programa no cambian

    //Miembro Estatico: Variables que se asocian a una clase
    public static String frase1="Miembro Estatico.";

    //Constante o Variable Final que se asocia a una clase
    public final String frase2="Variable Final Constante.";

    //Constante estatica: No cambia despues de la inicializacion
    public static final String frase3="Variable Final Estatica.";

    //Metodo para carcular area del circulo
    private static  double calcularAreaCirculo(double radio){
        return Math.PI * (Math.pow(radio,2));
    }

    public static void main(String[] args) {
        //Acceso A mis miembros estaticos directamente de mi clase
        System.out.println(frase1);
        System.out.println(frase3);

        //Ejemplo del area de un circulo
        float radio=5;
        double area= calcularAreaCirculo(radio);
        System.out.println("El area del circulo con radio: " + radio + " \nEs: " + area);
    }
}
