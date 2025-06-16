package Practica4.Ejercicio2;

public class Main {
    public static void main(String[] args){
        Empleado empleadoFijo = new EmpleadoFijo(600);
        Empleado empleadoHoras = new EmpleadoPorHoras(40,5);

        System.out.println("El sueldo del empleado fijo es: " + empleadoFijo.calcularSalario());
        System.out.println("El sueldo del empleado por horas es: " + empleadoHoras.calcularSalario());
    }
}
