package Practica2.Ejercicio1;

public class Main {
    public static void main(String[] args){
        Calculadora calculadora1 = new Calculadora();

        System.out.println("Suma de 2 enteros: " + calculadora1.sumar(5,3));
        System.out.println("Suma de 2 double: " + calculadora1.sumar(2.5,3.1));
        System.out.println("Suma de 3 enteros: " + calculadora1.sumar(1,2,3));
    }
}
