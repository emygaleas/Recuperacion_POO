package Practica1.Ejercicio11;

public class Main {
    public static void main(String[] args){
        Vehiculo veh = new Vehiculo();
        veh.tipo = "Camioneta";
        veh.velocidadMaxima = 120;
        veh.setPlaca("XYZ-123");
        System.out.println("Información Vehículo:");
        veh.mostrarInfo();
    }
}
