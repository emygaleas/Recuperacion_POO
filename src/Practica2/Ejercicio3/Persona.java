package Practica2.Ejercicio3;

public class Persona {
    public void mostrar(String nombre) {
        System.out.println("Nombre: " + nombre);
    }
    public void mostrar(String nombre, int edad) {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }
    public void mostrar(String nombre, int edad, String ciudad) {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nCiudad: " + ciudad);
    }
}
