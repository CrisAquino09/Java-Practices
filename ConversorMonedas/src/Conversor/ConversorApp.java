package Conversor;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa La cantidad en pesos mxn: $");
        double cantidad = in.nextDouble();
        in.nextLine();

        System.out.println("Elige La Moneda De Cambio: (DOLAR, EURO,YEN)");
        String tipo= in.next().toUpperCase();

        try {
            TipoMoneda moneda = TipoMoneda.valueOf(tipo);
            double resultado = moneda.convertir(cantidad);
            System.out.println("$" + cantidad +" MXN = " + resultado + " " + tipo);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de Moneda No Valido");
        }

    }
}
