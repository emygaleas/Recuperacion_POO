package Practica1.Ejercicio6;

public class Main {
    public static void main(String[] args){
        Estudiante estudiante1 =  new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        // asignar valores
        estudiante1.setNombre("Emily");
        estudiante1.setCarrera("Desarrollo de software");

        // imprimir valores
        System.out.println("Estudiante 1");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Carrera: " + estudiante1.getCarrera());
    }
}
