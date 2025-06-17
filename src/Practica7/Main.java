package Practica7;

public class Main {
    public static void main(String[] args){
        EstudianteBecado est1 = new EstudianteBecado("Luis", 20, "Sistemas", 9.2, "Académica");
        EstudianteBecado est2 = new EstudianteBecado("Ana", 19, "Derecho", 8.0, "Económica");

        est1.mostrarDatos();
        est1.aplicarDescuento();

        est2.mostrarDatos();
        est2.aplicarDescuento();

        // Prueba validación nombre vacío
        EstudianteBecado est3 = new EstudianteBecado("", 19, "Medicina", 9.0, "Académica");
        est3.mostrarDatos();
        // Prueba edad menor a 18
        EstudianteBecado est4 = new EstudianteBecado("Pedro", 17, "Arquitectura", 8.5, "Económica");
        est4.mostrarDatos();
    }
}
