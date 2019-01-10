package be.pxl.h3.opdracht1_3;

import java.util.Scanner;

public class Gebruik_Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.print("Geef X in: ");
        x = input.nextInt();
        input.nextLine();

        int x3 = (int) Math.pow(x, 3);
        System.out.println(x + " tot de 3de macht is " + x3);

        System.out.print("Geef opp van cirkel in: ");
        int opp = input.nextInt();
        double diameter = Math.sqrt(opp / Math.PI) * 2;
        diameter = Math.round(diameter * 100) / 100.0;
        System.out.println("Diameter van de cirkel met opp " + opp + " is " + diameter);

    }
}
