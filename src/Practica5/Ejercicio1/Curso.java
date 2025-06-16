package Practica5.Ejercicio1;

public abstract class Curso {
    public String nombre;
    public double costo;

    public Curso(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public abstract double calcularCosto();

    public void mostrarInfo(String nombre){
        System.out.println("Curso: " + nombre);
    }

    public void mostrarInfo(String nombre, double costo){
        System.out.println("Curso: " + nombre);
        System.out.println("Costo: " + costo);
    }

    public double calcularDescuento(double costo) {
        if (costo > 150){
            return (costo - costo * 0.1);
        }else {
            return costo;
        }
    }
}
