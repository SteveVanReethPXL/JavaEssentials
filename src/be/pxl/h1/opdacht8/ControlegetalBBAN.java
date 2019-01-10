package be.pxl.h1.opdacht8;

import java.util.Scanner;

public class ControlegetalBBAN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Geef rekeningnummer in: ");
        long rekeningnummer = input.nextLong() % 1000000000000L;
        System.out.println("Laatste 12 cijfers zijn : " + rekeningnummer);
        rekeningnummer *= 1000000;
        rekeningnummer += 111400;
        int bban = (int) (rekeningnummer % 97);
        bban = 98 - bban;
        System.out.println("BBAN is BE" + bban);
    }
}

