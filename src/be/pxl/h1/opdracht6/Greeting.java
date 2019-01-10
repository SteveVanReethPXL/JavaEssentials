package be.pxl.h1.opdracht6;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First name: ");
        String firstname = input.nextLine();

        System.out.println("Last name: ");
        String lastname = input.nextLine();

        System.out.println("Hello, you are " + firstname + " " + lastname);
    }
}
