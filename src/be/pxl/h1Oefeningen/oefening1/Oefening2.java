package be.pxl.h1Oefeningen.oefening1;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geef naam in:");
        String naam = input.nextLine();
        System.out.print("Geef prijs vorig seizoen in: ");
        int prijs = input.nextInt();
        input.nextLine();
        System.out.print("Geef leeftijd in: ");
        int leeftijd = input.nextInt();
        input.nextLine();
        System.out.print("Geef gemiddeld beoordelingscijfer in: ");
        int beoordeling = Integer.parseInt(input.nextLine());
        System.out.print("Geef type speler: ");
        String typeSpeler = input.nextLine();
        System.out.print("Geef aantal doelpunten in: ");
        int doelpunten = Integer.parseInt(input.nextLine());

        int nieuwePrijs = prijs;
       if (leeftijd < 25){
           nieuwePrijs *= 1.1;
       } else {
            if (leeftijd > 30) {
                nieuwePrijs *= 0.95;
            }
        }
       switch (typeSpeler) {
           case "aanvaller":
               if (doelpunten > 4) {
                   nieuwePrijs += 10000;
                   if (doelpunten > 5) {
                       nieuwePrijs += (doelpunten - 5) * 20000;
                   }
               }
               break;

           case "doelman":
               if (doelpunten > 20) {
                   nieuwePrijs -= 9000;
               }
               break;
           default:
               nieuwePrijs += beoordeling * 10000;
               break;
       }
        System.out.printf("Naam: %s \t Prijs vorig seizoen: %15d%n \t\t\t\t Nieuwe Prijs: %22d",naam,prijs,nieuwePrijs);
    }
}
