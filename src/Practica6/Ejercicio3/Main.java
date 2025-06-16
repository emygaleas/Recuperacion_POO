package Practica6.Ejercicio3;

public class Main {
    public static void main(String[] args){
        Auto auto = new Auto("Toyota", "Yaris");
        auto.mostrarInfo();
        System.out.println("----------------------------------");
        Camion camion = new Camion(null, "Volvo FH"); // marca nula
        camion.mostrarInfo();
    }
}
