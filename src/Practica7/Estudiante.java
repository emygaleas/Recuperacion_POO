package Practica7;

public class Estudiante extends Persona{
    protected String carrera;
    protected double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        super(nombre, edad);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public boolean esAptoBeca() {
        return promedio >= 8.5;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Promedio: " + promedio);
    }

    public void inscribir(String semestre) {
        System.out.println(nombre + " inscrito en semestre " + semestre);
    }

    public void inscribir(String semestre, String modalidad) {
        System.out.println(nombre + " inscrito en semestre " + semestre + " modalidad " + modalidad);
    }
}
