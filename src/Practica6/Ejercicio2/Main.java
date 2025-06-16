package Practica6.Ejercicio2;

public class Main {
    public static void main(String[] args){
        CuentaAhorros ca = new CuentaAhorros("001A", 1000, 2);
        ca.mostrarDatos();

        System.out.println("----------------------------------");

        CuentaCorriente cc = new CuentaCorriente("", 500, 200);
        cc.mostrarDatos();
    }
}
