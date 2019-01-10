package be.pxl.h2.oef3;

import java.util.Scanner;

public class Bankrekening {
    private String rekeningsNr;
    private String naamEigenaar;
    private double saldo;
    private double rentePercentage;

    Scanner input = new Scanner(System.in);

    public Bankrekening() {
        this("geen", "onbekend", 0, 1.2);
    }

    public Bankrekening(String rekeningsNr, String naamEigenaar, double saldo, double rentePercentage) {
        this.rekeningsNr = rekeningsNr;
        this.naamEigenaar = naamEigenaar;
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
        this.rentePercentage = rentePercentage;
    }
    private boolean validateAccount() {
        boolean antwoord = true;
        if (rekeningsNr == "geen"){
            antwoord = false;
        }else if ( naamEigenaar == "onbekend"){
            System.out.println("Geef eerst naam in voor verdere acties mogelijk zijn! \n naam: ");
            setNaamEigenaar(input.nextLine());
        }
        return antwoord;
    }

    public void setNaamEigenaar(String naamEigenaar) {
        this.naamEigenaar = naamEigenaar;
    }

    public void setRekeningsNr(String rekeningsNr) {
        this.rekeningsNr = rekeningsNr;
    }

    public double getSaldo() {
        return saldo;
    }
    public void stort(double bedrag){
        if (validateAccount()) {
            saldo += Math.abs(bedrag);
            print();
        }else {
            System.out.println("sorry, geen rekeningnummer");
        }
    }
    public void neemOp(double bedrag){
        if(validateAccount()){
            if(bedrag <= saldo){
                saldo -= bedrag;
            }else if(saldo == 0){
                System.out.println("u kan geen geld opnemen");
            }else if(bedrag > saldo){
                System.out.println(String.format("u mag enkel %0.2d opnemen", saldo));
            }
            print();
        }
}
    public void doeVerrichting(double... bedragen){
        for (double bedrag : bedragen ){
            if(bedrag > 0 ){
                stort(bedrag);
            }else if(bedrag < 0) {
                neemOp(bedrag);
            }
        }
    }
    public void schrijfRenteBij() {
        stort(saldo * rentePercentage);
    }
    public void print(){
        System.out.println(String.format("Saldo op de spaarrekening %s op naam van %s bedraagt %0.2d saldo",
                rekeningsNr, naamEigenaar, getSaldo()));
    }
}

