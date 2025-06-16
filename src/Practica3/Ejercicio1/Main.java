package Practica3.Ejercicio1;

public class Main {
    public static void main(String[] args){
        Gato gato = new Gato();
        Perro perro = new Perro();
        Animal[] animales = {gato, perro};

        for (Animal mascota : animales){
            mascota.hacerSonido();
        }

    }
}
