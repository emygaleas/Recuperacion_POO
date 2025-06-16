package Practica4.Ejercicio2;

public class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double tarifa;

    public EmpleadoPorHoras(int horas, double tarifa) {
        this.horas = horas;
        this.tarifa = tarifa;
    }


    @Override
    public double calcularSalario() {
        return horas * tarifa;
    }
}
