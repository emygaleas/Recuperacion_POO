package Practica3.Ejercicio3;

public class Main {
    public static void main(String[] args){
        Empleado[] personal = {new Gerente(), new Asistente()};
        for (Empleado p : personal){
            p.mostrarInfo();
        }
    }
}
