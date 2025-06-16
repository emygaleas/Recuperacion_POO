package Practica4.Ejercicio5;

public class Estudiante {

    public void setNota(double nota){
        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota válida registrada: " + nota);
        } else {
            System.out.println("Error. Nota fuera de rango.");
        }
    }
}
