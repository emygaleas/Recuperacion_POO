package Practica1.Ejercicio4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        System.out.printf("Ingrese una contraseña para su cuenta: ");
        String password = sc.nextLine();
        c1.setPassword(password);
        System.out.println("Contraseña guardada exitosamente.");
    }
}
