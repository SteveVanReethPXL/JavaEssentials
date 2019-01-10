package be.pxl.h1Oefeningen.oefening1;

public class Oefening3 {
    public static void main(String[] args) {
        System.out.printf("|%20s| |%-20s| |%20s| |%20s| \n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");
        double getal = 0;
        for (int i = 1; i < 10; i++) {
            if (i < 6) {
                getal = getal * 10 + i;
            }else {
                getal = getal + i / Math.pow(10, i - 5);
            }

            System.out.printf("|%20.5f| |%-20.5f| |%020.5f| |%20.3f| \n", getal, getal, getal, getal);
        }
    }
}
