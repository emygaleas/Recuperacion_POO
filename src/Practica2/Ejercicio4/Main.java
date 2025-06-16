package Practica2.Ejercicio4;

public class Main {
    public static void main(String[] args){
        Videojuego juego1 = new Videojuego();
        juego1.mostrarInformacion("Valorant");
        System.out.println("---------------------------------");
        juego1.mostrarInformacion("Valorant","Riot Games");
        System.out.println("---------------------------------");
        juego1.mostrarInformacion("Valorant","Riot Games",2020);
        System.out.println("---------------------------------");
        juego1.mostrarInformacion("Valorant","Riot Games",2020,9.5);
    }
}
