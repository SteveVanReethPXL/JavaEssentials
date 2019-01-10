package be.pxl.h2.oef1;

import java.util.Calendar;

public class Persoon {
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;

    public static final double MAX_LENGTE = 2.4;

    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(String naam, String voornaam){
        this.setNaam(naam);
        this.setVoornaam(voornaam);
    }
     public Persoon(Persoon persoon){
        this.voornaam = persoon.getVoornaam();
        this.naam = persoon.getNaam();
        this.lengte = persoon.getLengte();
        this.geboortejaar = persoon.getGeboortejaar();
        this.gewicht = persoon.getGewicht();
     }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte) {
        if (lengte > MAX_LENGTE) {
            lengte = MAX_LENGTE;
        }
        this.lengte = lengte;
        // this.lengte = Math.min(lengte, MAX_LENGTE);
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public int getLeeftijd(){return Calendar.getInstance().get(Calendar.YEAR) - this.geboortejaar; }

    public String toString(){
        StringBuilder builder = new StringBuilder("Deze persoon is ");
        builder.append(voornaam.toUpperCase());
        builder.append(" ");
        builder.append(naam.toUpperCase());
        builder.append("\n");
        builder.append(String.format("%-15s : %.2f%n", "gewicht", gewicht));
        builder.append(String.format("%-15s : %.2f%n", "lengte", lengte));
        builder.append(String.format("%-15s : %d%n", "geboortejaar", geboortejaar));
        return builder.toString();
    }

    public double berekenBmi(){
        double bmi = gewicht / (Math.pow(lengte, 2));
        bmi = Math.round(bmi * 10) / (double)10;
        return bmi;
    }

    public String geefOmschrijving(){
        double bmi = berekenBmi();
        if(bmi < 18){
            return "ondergewicht";
        }else if (bmi < 25){
            return "normaal";
        }else if (bmi < 30){
            return "overgewicht";
        }else if (bmi < 40){
            return "obesitas";
        }else {
            return "morbide obesitas";
        }
    }

    public void voegVoornamenToe(String... voornamen){
        StringBuilder nieuweVoornaam = new StringBuilder();
        nieuweVoornaam.append(this.getVoornaam());
        for (String voornaam : voornamen){
            nieuweVoornaam.append(" ");
            nieuweVoornaam.append(voornaam);
        }
        this.setVoornaam(nieuweVoornaam.toString());
    }

    public void groei(){
        this.groei(1);
    }
    public void groei(int cm){
        double teGroeienCm = (double) cm / 100;
        this.setLengte(this.getLengte() + teGroeienCm);
    }

    public String geefNaamAfgekort(){
        StringBuilder naam = new StringBuilder();
        naam.append(this.getVoornaam().toUpperCase().charAt(0));
        naam.append(".");
        String achternaam = this.getNaam();
        naam.append(achternaam.toUpperCase().charAt(0));
        naam.append(achternaam.substring(1).toLowerCase());
        return naam.toString();
    }

    public String geefInitiaal(){
        /* extra Paul 's Heren naar shpa nog te doen*/
        StringBuilder initiaal = new StringBuilder();
        String substringVoornaam = this.getVoornaam().substring(0,2);
        String substringNaam;
        if (this.getNaam().charAt(0) == '\'') {
            substringNaam = this.getNaam().substring(1,4).replace(" ", "");
        }else{
            substringNaam = this.getNaam().substring(0,2);
        }
        if(Character.isUpperCase(substringNaam.charAt(0))){
            initiaal.append(substringNaam.toUpperCase());
            initiaal.append(substringVoornaam.toUpperCase());
        }else{
            initiaal.append(substringNaam.toLowerCase());
            initiaal.append(substringVoornaam.toLowerCase());
        }
        return initiaal.toString();
    }

    /*controle invoergetal dient nog te gebeuren */
    public String encrypteerNaam(int encryptieGetal){
        StringBuilder geencrypteerdeNaam = new StringBuilder();
        String afgekorteNaam = this.geefNaamAfgekort();
        for(int i = 0; i < afgekorteNaam.length(); i++){
            char a = afgekorteNaam.charAt(i);
            a = (char)(a + encryptieGetal);
            geencrypteerdeNaam.append(a);
        }
        return geencrypteerdeNaam.toString();

    }
}
