package Practica1.Ejercicio8;

public class Main {
    public static void main(String[] args){
        Libro libro1 = new Libro();

        libro1.setTitulo("Alicia en el País de las Maravillas");
        libro1.setAnioPublicacion(1950);

        System.out.println("Libro: " + libro1.getTitulo());
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion());
    }
}
