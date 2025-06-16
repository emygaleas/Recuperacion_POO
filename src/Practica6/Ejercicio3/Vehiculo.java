package Practica6.Ejercicio3;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        if (marca == null) {
            System.out.println("Marca no puede ser nula");
        }else {
            this.marca = marca;
            this.modelo = modelo;
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
