package org.example;

public class GeneradorContrasenya {
    private int numberLenght;
    private boolean letter, number, symbol;

    public GeneradorContrasenya(int numberLenght, boolean letter, boolean number, boolean symbol) {
        this.numberLenght = numberLenght;
        this.letter = letter;
        this.number = number;
        this.symbol = symbol;
    }

    public int getNumberLenght() {
        return numberLenght;
    }

    public void setNumberLenght(int numberLenght) {
        this.numberLenght = numberLenght;
    }

    public boolean isLetter() {
        return letter;
    }

    public void setLetter(boolean letter) {
        this.letter = letter;
    }

    public boolean isNumber() {
        return number;
    }

    public void setNumber(boolean number) {
        this.number = number;
    }

    public boolean isSymbol() {
        return symbol;
    }

    public void setSymbol(boolean symbol) {
        this.symbol = symbol;
    }

    public String generatePassword() {
        StringBuilder letterPart = new StringBuilder();
        StringBuilder letter = new StringBuilder();

        for (int counter = 0; counter < getNumberLenght(); counter++) {
            letterPart = new StringBuilder();

            letterPart.append(RandomJava.randomChar(isLetter()));

            if (isNumber()){
                letterPart.append((RandomJava.randomInt(0, 9)));
            }

            if (isSymbol()){
                letterPart.append(getSymbolRandom());
            }

            letter.append(letterPart.toString().charAt(RandomJava.randomInt(0, letterPart.toString().length())));
        }

        return letter.toString();
    }

    private char getSymbolRandom() {
        int numberSymbolRandom = 0;
        numberSymbolRandom = RandomJava.randomInt(33, 126);

        while ((isLetter((char) numberSymbolRandom) || isNumber((char) numberSymbolRandom))){
            numberSymbolRandom = RandomJava.randomInt(33, 126);
        }

        return (char) numberSymbolRandom;
    }

    private boolean isNumber(char numberSymbolRandom) {
        boolean isNumber = true;

        try {
            Integer.parseInt(String.valueOf(numberSymbolRandom));
        }catch (Exception e){
            isNumber =false;
        }
        return isNumber;
    }

    private boolean isLetter(char numberSymbolRandom) {
        String setOfCharacters = "abcdefghksjmnopqrtuwxyz";
        return setOfCharacters.contains(String.valueOf(numberSymbolRandom)) || setOfCharacters.toUpperCase().contains(String.valueOf(numberSymbolRandom));
    }
}
