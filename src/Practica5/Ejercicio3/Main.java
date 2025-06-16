package Practica5.Ejercicio3;

public class Main {
    public static void main(String[] args){
        Taxi taxi = new Taxi();
        Patineta patineta = new Patineta();

        taxi.iniciarViaje();
        patineta.iniciarViaje();

        taxi.registrarRuta("Av. Quito", "08:00");
        patineta.registrarRuta("Parque Central");
        taxi.registrarRuta("", "08:00");

        System.out.println("Distancia Taxi: " + taxi.calcularDistancia(60, 2));
        System.out.println("Distancia Patineta: " + patineta.calcularDistancia(15, 1.5));
    }
}
