package Practica6.Ejercicio1;

public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, int edad, double salario, double bono) {
        super(nombre, edad, salario);
        this.bono = bono;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        if (salario > 800) {
            System.out.println("Bono aplicado: " + bono);
            System.out.println("Salario total: " + (salario + bono));
        } else {
            System.out.println("Bono no aplicado, salario insuficiente");
        }
    }
}
