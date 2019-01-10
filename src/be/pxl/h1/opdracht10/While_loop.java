package be.pxl.h1.opdracht10;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        int snelste = -1;
        int snelsteTijd = 24*60*60;
        int counter = 0, counterTrager = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Geef inschrijvingsnummer in: ");
        int inschijvingsnummer = input.nextInt();
        while (!(inschijvingsnummer < 0)) {
            System.out.println("Geef de tijd in: ");
            int tijd = input.nextInt();
            if (tijd < snelsteTijd ) {
                snelste = inschijvingsnummer;
                snelsteTijd = tijd;
            }
            System.out.println("Geef inschrijvingsnummer in: ");
            inschijvingsnummer = input.nextInt();
            counter++;
            if (tijd > 3600){
                counterTrager++;
            }
        }
        if (counter == 0){
            System.out.println("Geen ingave");
        }else{
            int percentage = 0;
            System.out.println("Snelste renner is: " + snelste);
            if (counter !=0){
                percentage = Math.round(counterTrager / counter * 100) / 100;
            }
            System.out.println("Het percentage renners dat er langer dan 1u over doet is: " + percentage + "%");
        }


    }
}
