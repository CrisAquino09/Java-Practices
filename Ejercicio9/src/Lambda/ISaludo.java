package Lambda;
//Este marcado especial es para indicar que esta es una interfaz funcional
//Interfaz Funcional: Es una interface que tiene exactamente un metodo y sirve precisamente
//en las  funciones lambda
@FunctionalInterface
public interface ISaludo {
    public String saludar(String saludo, String despedida);
}
