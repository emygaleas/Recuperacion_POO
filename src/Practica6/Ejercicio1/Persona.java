package Practica6.Ejercicio1;

public class Persona {
    public String nombre;
    public int edad;
    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre inválido");
        }
        if (edad < 0) {
            System.out.println("Edad inválida");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
