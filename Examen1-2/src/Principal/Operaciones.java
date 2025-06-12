package Principal;

public class Operaciones {
    private int a;
    private int b;
    private int c;
    private int d;

    public Operaciones() {
    }

    //Metodos Personalizados
    public int multiplicar(int a, int b, int c, int d){
        return a*b*c*d;
    }

    public int multiplicar(int a, int b, int c){
        return a*b*c;
    }

    public int multiplicar(int a, int b){
        return a*b;
    }

    public int multiplicar(int a){
        return a;
    }

}
