package Practica5.Ejercicio1;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new CursoRegular("Java Básico",100);
        Curso curso2 = new CursoCertificado("Java Avanzado",150,50);
        curso1.mostrarInfo(curso1.nombre);;
        System.out.println("Costo Total del curso: " + curso1.calcularDescuento(curso1.costo));
        System.out.println("------------------------------------------------------");
        curso2.mostrarInfo(curso2.nombre, curso2.calcularCosto());
        System.out.println("Costo Total del curso: " + curso2.calcularDescuento(curso2.calcularCosto()));
    }
}
