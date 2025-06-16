package Practica1.Ejercicio10;

public class Empleado {
    public String departamento = "Ventas";
    public String horario;
    private String nombre = "";
    private double salario = 0.0;

    public void mostrarDatos() {
        System.out.println("Departamento: " + departamento);
        System.out.println("Horario: " + horario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
