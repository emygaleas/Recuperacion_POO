package Practica6.Ejercicio1;

public class Main {
    public static void main(String[] args){
        Gerente gerente1 = new Gerente("Luis", 40, 900, 100);
        Gerente gerente2 = new Gerente("Ana", 30, 700, 200);

        System.out.println("Gerente 1:");
        gerente1.mostrarInfo();

        System.out.println("\nGerente 2:");
        gerente2.mostrarInfo();
    }
}
