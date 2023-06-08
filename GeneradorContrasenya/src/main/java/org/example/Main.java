package org.example;

public class Main {
    public static void main(String[] args) {
        GeneradorContrasenya generadorContrasenya = new GeneradorContrasenya(15, true, true, true);
        String password = generadorContrasenya.generatePassword();
        System.out.println(password);
    }
}