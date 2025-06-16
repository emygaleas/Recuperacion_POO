package Practica1.Ejercicio9;

public class Main {
    public static void main(String[] args){
        CuentaBancaria cb = new CuentaBancaria();
        cb.setTitular("Carlos");
        cb.setSaldo(2500.75);
        System.out.println("Titular: " + cb.getTitular() + ", Saldo: " + cb.getSaldo());
    }
}
