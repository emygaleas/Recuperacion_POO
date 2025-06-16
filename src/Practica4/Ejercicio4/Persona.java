package Practica4.Ejercicio4;

public class Persona {
    public void setEdad(int edad){
        if (edad >= 0) {
            System.out.println("Edad aceptada: " + edad);
        } else {
            System.out.println("Error. Edad inválida.");
        }
    }
}
