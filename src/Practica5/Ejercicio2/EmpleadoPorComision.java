package Practica5.Ejercicio2;

class EmpleadoPorComision extends Empleado {
    private double ventas;
    private double comision; // porcentaje
    private double salario;

    public EmpleadoPorComision(String nombre, double ventas, double comision) {
        super(nombre);
        this.ventas = ventas;
        this.comision = comision;
        this.salario = calcularSalario();
    }

    @Override
    public double calcularSalario() {
        return ventas + (ventas * comision / 100);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado por Comisión: " + nombre + ", Salario: " + calcularSalario());
    }

    @Override
    public void aplicarBono() {
        if (ventas > 1000) {
            salario += 200;
            System.out.println("Bono aplicado. Nuevo salario: " + salario);
        } else {
            System.out.println("No cumple requisitos para bono.");
        }
    }
}

