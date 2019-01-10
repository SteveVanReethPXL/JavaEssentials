package be.pxl.h1Oefeningen.oefening1;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef lengte in: ");
        int lengte = input.nextInt();
        System.out.print("Geef breedte in: ");
        int breedte = input.nextInt();
        System.out.print("Geef diepte in: ");
        int diepte = input.nextInt();

        int volume = lengte * breedte * diepte;
        int liters = volume * 1000;
        System.out.printf("Liters water: %.0f , liters ontsmettingsmiddel: %.0f%n", liters * 0.98, liters * 0.02 );
    }
}
