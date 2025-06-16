package Practica6.Ejercicio2;

public class CuentaCorriente extends CuentaBancaria{
    private double sobregiroPermitido;

    public CuentaCorriente(String numero, double saldo, double sobregiroPermitido) {
        super(numero, saldo);
        this.sobregiroPermitido = sobregiroPermitido;
    }

    public boolean puedeSobregirar(double monto) {
        return monto <= saldo + sobregiroPermitido;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta Corriente:");
        super.mostrarDatos();
        System.out.println("Sobregiro permitido: " + sobregiroPermitido);
    }
}
