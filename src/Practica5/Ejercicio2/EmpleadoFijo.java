package Practica5.Ejercicio2;

class EmpleadoFijo extends Empleado {
    private double salarioBase;
    private int aniosEmpresa;

    public EmpleadoFijo(String nombre, double salarioBase, int aniosEmpresa) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.aniosEmpresa = aniosEmpresa;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado Fijo: " + nombre + ", Salario Base: " + salarioBase);
    }

    @Override
    public void aplicarBono() {
        if (aniosEmpresa > 5) {
            salarioBase += 100;
            System.out.println("Bono aplicado. Nuevo salario: " + salarioBase);
        } else {
            System.out.println("No cumple requisitos para bono.");
        }
    }
}
