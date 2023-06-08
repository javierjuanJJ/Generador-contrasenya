package org.example;

import java.util.Random;

public class RandomJava {
    public static int randomInt(int numberbeggining, int numberend){
        return (int) (Math.random() * numberend + numberbeggining);
    }

    public static char randomChar(boolean letter) {
        Random random = new Random();

        String setOfCharacters = "abcdefghsmnopqrtuwxyz";

        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);

        if (letter){
            randomChar = String.valueOf(randomChar).toUpperCase().charAt(0);
        }

        return randomChar;
    }
}
