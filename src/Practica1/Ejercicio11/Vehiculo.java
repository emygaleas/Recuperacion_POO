package Practica1.Ejercicio11;

public class Vehiculo {
    public String tipo = "Automóvil";
    public int velocidadMaxima;
    private String placa = "";
    private String marca = "Toyota";

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
    }
}
