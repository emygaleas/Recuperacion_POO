package Practica1.Ejercicio13;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setAnio(1999);
        pelicula1.setDirector("Wachowski");
        pelicula1.setDuracion(2.5);
        System.out.println("Ficha Película:");
        pelicula1.mostrarFicha();
    }
}