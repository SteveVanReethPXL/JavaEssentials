package be.pxl.h2.oef1;

import java.util.Random;

public class PersoonApp {
    public static void main(String[] args) {
        Random random = new Random();
        Persoon persoon = new Persoon();
        persoon.setVoornaam("Pipi");
        persoon.setNaam("Langkous");
        persoon.setGewicht(random.nextInt(61) + 40);
        persoon.setLengte((double)(random.nextInt(210 - 157)+ 157) / 100);
        persoon.setGeboortejaar(1984);
        System.out.println(persoon.geefInitiaal());
        /* random.nextInt(19) + 1 voor gegenereerd getal */
        System.out.println(persoon.encrypteerNaam(1));
    }
}
