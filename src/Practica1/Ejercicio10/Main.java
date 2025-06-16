package Practica1.Ejercicio10;

public class Main {
    public static void main(String[] args){
        Empleado emp = new Empleado();
        emp.departamento = "Marketing";
        emp.horario = "9am-6pm";
        emp.setNombre("Laura");
        emp.setSalario(3000);
        System.out.println("Datos Empleado:");
        emp.mostrarDatos();
    }
}
