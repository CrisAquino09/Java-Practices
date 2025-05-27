package Principal;

import Entidades.Serie;
import Entidades.Videojuegos;

public class Main {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuegos[] videojuegos = new Videojuegos[5];

        //Crear objetos en cada posición del array
        series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        series[1] = new Serie("Stranger Things", "Duffer Brothers");
        series[2] = new Serie("Naruto", 4, "Drama histórico", "Peter Morgan");
        series[3] = new Serie("Two And A Half Men", 10, "Comedia", "David Crane");
        series[4] = new Serie("Los Simpson", 3, "Ciencia ficción", "Baran bo Odar");

        videojuegos[0] = new Videojuegos("Far Cry 4", 50, "RPG", "CD Projekt Red");
        videojuegos[1] = new Videojuegos("Outlast 2", 100,"Aventura","Mojan");
        videojuegos[2] = new Videojuegos("Red Dead Redemption 2", 60, "Aventura", "Rockstar Games");
        videojuegos[3] = new Videojuegos("Cyberpunk 2077", 45, "RPG", "CD Projekt Red");
        videojuegos[4] = new Videojuegos("Death Space", 80, "Aventura", "Nintendo");

        // Entregar de Videojuegos y Series
        series[1].entregar();
        series[3].entregar();
        series[4].entregar();
        videojuegos[0].entregar();
        videojuegos[2].entregar();
        videojuegos[4].entregar();

        //Variables Auxiliares
        int contadorJuegos=0,contadorSeries=0;
        Serie mayorSeries=series[0];
        Videojuegos mayorJuegos=videojuegos[0];

        System.out.println("Informacion de Series\n");
        for (Serie serie : series){
            System.out.println("Estado: " + serie.isEntregado());
            System.out.print("Informacion: " + serie);
            if(serie.isEntregado()){
                contadorSeries++;
                serie.devolver();
            }
            if (serie.compareTo(mayorSeries) > 0) {
                mayorSeries = serie;
            }
        }

        System.out.println("Informacion de Videojuegos\n");
        for (Videojuegos juegos : videojuegos){
            System.out.println("Estado: " + juegos.isEntregado());
            System.out.print("Informaicon: " + juegos);
            if(juegos.isEntregado()){
                contadorJuegos++;
                System.out.println("Entregado");
                juegos.devolver();
            }
            if (juegos.compareTo(mayorJuegos) > 0) {
                mayorJuegos = juegos;
            }
        }

        System.out.println("\n<<<<<<<<<<<<CANTIDAD DE ARTICULOS ENTREGADOS>>>>>>>>>>>>");
        System.out.println("Series entregadas: " + contadorSeries);
        System.out.println("Videojuegos entregados: " + contadorJuegos);

        System.out.println("<<<<<<<<<<<<ARTICULOS MAS POPULARES>>>>>>>>>>>>");
        System.out.println("Serie con mas Temporadas:\n" + mayorSeries);
        System.out.println("Juegos con mas Horas:\n" + mayorJuegos);

    }
}
