package Practica4.Ejercicio1;

public class Main {
    public static void main(String[] args){
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(5,3);
        System.out.println("Área Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área Triángulo: " + triangulo.calcularArea());
    }
}
