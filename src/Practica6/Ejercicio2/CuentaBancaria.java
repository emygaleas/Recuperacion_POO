package Practica6.Ejercicio2;

public class CuentaBancaria {
    protected String numero;
    protected double saldo;

    public CuentaBancaria(String numero, double saldo) {
        if (numero == null || numero.trim().isEmpty()) {
            System.out.println("Número de cuenta inválido");
        }
        this.numero = numero;
        this.saldo = saldo;
    }

    public void mostrarDatos() {
        System.out.println("Número: " + numero + ", Saldo: " + saldo);
    }
}
