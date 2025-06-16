package Practica2.Ejercicio2;

public class Mensajero {
    public void enviar(String texto){
        System.out.println("Texto enviado: " + texto);
    }
    public void enviar(String texto, String destinatario){
        System.out.println("Texto enviado: " + texto);
        System.out.println("Destinatario: " + destinatario);
    }
    public void enviar(String texto, String destinatario, int prioridad){
        System.out.println("Texto enviado: " + texto);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Prioridad: " + prioridad);
    }
}
