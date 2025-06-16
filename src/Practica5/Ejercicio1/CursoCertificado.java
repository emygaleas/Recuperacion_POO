package Practica5.Ejercicio1;

public class CursoCertificado extends Curso{
    private double recargo;

    public CursoCertificado(String nombre, double costo, double recargo) {
        super(nombre, costo);
        this.recargo = recargo;
    }

    public double calcularCosto(){
        return costo + recargo;
    }
}
