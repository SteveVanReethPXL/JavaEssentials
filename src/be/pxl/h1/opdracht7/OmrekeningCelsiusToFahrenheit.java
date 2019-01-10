package be.pxl.h1.opdracht7;

import java.util.Scanner;

public class OmrekeningCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geef de temperatuur in C: ");
        double celsius = input.nextDouble();

        double fahrenheit = Math.round((9 / 5 * celsius + 32) *10 ) / 10;

        System.out.println("De temperatuur in F is: " + fahrenheit );
    }
}
