package Practica5.Ejercicio1;

public class CursoRegular extends Curso{
    public CursoRegular(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
