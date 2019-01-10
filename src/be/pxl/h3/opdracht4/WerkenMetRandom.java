package be.pxl.h3.opdracht4;

import java.util.Random;

public class WerkenMetRandom {
    public static void main(String[] args) {
        Random randomGetal = new Random();

        int getal = randomGetal.nextInt();
        System.out.println("Random getal: " + getal);

        for (int i = 0; i < 10; i++) {
            System.out.println("getal " + i + " : " + randomGetal.nextInt(11));
        }

        for (int i = 0; i < 10; i++) {
            int getal2 = randomGetal.nextInt(11) + 20;
            System.out.println("getal  " + i + " tussen 20 en 30: " + getal2);
        }

        for (int i = 0; i < 10; i++) {
            char a = (char) (randomGetal.nextInt(27) + 'a');
            System.out.println("Random letter " + a);
        }

    }
}
