package org.example.Task1;

public class Simple {
    public static void main(String[] args) {
        TranslateDeutschToRus trDToR = new TranslateDeutschToRus("Vasya", 40, "male");
        TranslateRusToEng trRusToEng = new TranslateRusToEng("Elena", 30, "female");
        TranslateEngToFrance trEngToFr = new TranslateEngToFrance("Petya", 35, "male");
    }
}
