package Practica6.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria{
    private double interesMensual; // porcentaje

    public CuentaAhorros(String numero, double saldo, double interesMensual) {
        super(numero, saldo);
        this.interesMensual = interesMensual;
    }

    public void aplicarInteres() {
        saldo += saldo * interesMensual / 100;
    }

    @Override
    public void mostrarDatos() {
        aplicarInteres();
        System.out.println("Cuenta de Ahorros:");
        super.mostrarDatos();
    }
}
