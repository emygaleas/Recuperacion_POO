package Practica2.Ejercicio2;

public class Main {
    public static void main(String[] args){
        Mensajero mensajero1 = new Mensajero();
        mensajero1.enviar("Hola");
        System.out.println("-------------------------------");
        mensajero1.enviar("¿Cómo estás?","Emily");
        System.out.println("-------------------------------");
        mensajero1.enviar("Feliz inicio de semana","Martín",3);
    }
}
