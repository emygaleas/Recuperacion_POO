package Practica1.Ejercicio7;

public class Main {
    public static void main(String[] args){
        Producto producto = new Producto();

        // asignar valores
        producto.setNombre("Coca-Cola 3L");
        producto.setPrecio(2.99);
        // imprimir valores
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
    }
}
