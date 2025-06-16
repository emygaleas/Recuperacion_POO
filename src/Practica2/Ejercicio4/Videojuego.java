package Practica2.Ejercicio4;

public class Videojuego {
    public void mostrarInformacion(String nombre){
        System.out.println("Nombre del videojuego: " + nombre);
    }

    public void mostrarInformacion(String nombre, String empresa){
        System.out.println("Nombre del videojuego: " + nombre);
        System.out.println("Empresa desarrolladora: " + empresa);
    }

    public void mostrarInformacion(String nombre, String empresa, int anioLanzamiento){
        System.out.println("Nombre del videojuego: " + nombre);
        System.out.println("Empresa desarrolladora: " + empresa);
        System.out.println("Año de Lanzamiento: " + anioLanzamiento);
    }

    public void mostrarInformacion(String nombre, String empresa, int anioLanzamiento, double calificacion){
        System.out.println("Nombre del videojuego: " + nombre);
        System.out.println("Empresa desarrolladora: " + empresa);
        System.out.println("Año de Lanzamiento: " + anioLanzamiento);
        System.out.println("Calificación: " + calificacion);
    }
}
