package Practica5.Ejercicio2;

public class Main {
    public static void main(String[] args){
        EmpleadoFijo ef = new EmpleadoFijo("Luis", 500, 6);
        EmpleadoPorComision ec = new EmpleadoPorComision("María", 1000, 10);

        System.out.println("Salario Empleado Fijo: " + ef.calcularSalario());
        ef.mostrarDatos();
        ef.aplicarBono();
        System.out.println("--------------------------------------------------");
        System.out.println("Salario Empleado Comisión: " + ec.calcularSalario());
        ec.mostrarDatos();
        ec.aplicarBono();
    }
}
