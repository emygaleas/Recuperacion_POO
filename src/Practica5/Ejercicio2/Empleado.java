package Practica5.Ejercicio2;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
    }

    public abstract double calcularSalario();

    public abstract void mostrarDatos();

    public abstract void aplicarBono();
}
