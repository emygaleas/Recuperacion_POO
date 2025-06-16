package Practica1.Ejercicio12;

public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.codigoCliente = 101;
        cliente1.activo = true;
        cliente1.setNombre("Pedro");
        cliente1.setTelefono("555-1234");
        System.out.println("Datos Cliente:");
        cliente1.verCliente();
    }
}
