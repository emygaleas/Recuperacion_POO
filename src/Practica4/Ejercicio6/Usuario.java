package Practica4.Ejercicio6;

public class Usuario {
    public void setPassword(String password){
        if (password.length() >= 8) {
            System.out.println("Contraaseña aceptada.");
        }else {
            System.out.println("Error: Contraseña demasiado corta.");
        }
    }
}
