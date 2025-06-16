package Practica5.Ejercicio3;

public abstract class Transporte {
    public abstract void iniciarViaje();

    public void registrarRuta(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            System.out.println("Error: dirección inválida");
        } else {
            System.out.println("Dirección registrada: " + direccion);
        }
    }

    public void registrarRuta(String direccion, String hora) {
        if (direccion == null || direccion.trim().isEmpty()) {
            System.out.println("Error: dirección inválida");
        } else {
            System.out.println("Dirección registrada: " + direccion + ", Hora: " + hora);
        }
    }

    public abstract double calcularDistancia(double velocidad, double tiempo);
}
