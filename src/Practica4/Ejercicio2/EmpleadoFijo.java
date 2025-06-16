package Practica4.Ejercicio2;

public class EmpleadoFijo extends Empleado{
    private double sueldo;

    public EmpleadoFijo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSalario() {
        return sueldo;
    }
}
