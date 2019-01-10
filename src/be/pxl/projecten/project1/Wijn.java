package be.pxl.projecten.project1;

import java.time.LocalDate;

public class Wijn {
    public static final double MAX_ALCOHOLPERCENTAGE = 17;
    private String naam;
    private String omschrijving;
    private String druivenras;
    private String kleur;
    private String land;
    private String regio;
    private int jaargang;
    private double alcoholPercentage;
    private String serveerTip;

    public Wijn(String naam, String land, String kleur) {
        this(naam, land, kleur, LocalDate.now().getYear(), 12.5);
    }
    public Wijn(String naam, String land, String kleur, int jaargang, double alcoholPercentage) {
        this.naam = naam;
        setLand(land);
        setKleur(kleur);
        setJaargang(jaargang);
        setAlcoholPercentage(alcoholPercentage);
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public void setDruivenras(String druivenras) {
        this.druivenras = druivenras;
    }

    public void setKleur(String kleur) {
        if(kleur.matches("Wit|Rood|Rosé")){
            this.kleur = kleur;
        }else{
            this.kleur = "Rood";
        }
    }

    public void setLand(String land) {
        if(land.matches("Frankrijk|Chili|Italië|Spanje")){
            this.land = land;
        }else {
            this.land = "Onbekend";
        }
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }

    public void setJaargang(int jaargang) {
        if(jaargang < 1950){
            jaargang = 1950;
        }else if(jaargang > LocalDate.now().getYear()){
            jaargang = LocalDate.now().getYear();
        }
        this.jaargang = jaargang;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0){
            alcoholPercentage = 0;
        }else if (alcoholPercentage > MAX_ALCOHOLPERCENTAGE){
            alcoholPercentage = MAX_ALCOHOLPERCENTAGE;
        }
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setServeerTip(String serveerTip) {
        this.serveerTip = serveerTip;
    }

    public String getNaam() {
        return naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public String getDruivenras() {
        return druivenras;
    }

    public String getKleur() {
        return kleur;
    }

    public String getLand() {
        return land;
    }

    public String getRegio() {
        return regio;
    }

    public int getJaargang() {
        return jaargang;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public String getServeerTip() {
        return serveerTip;
    }
    public double getAdviesPrijs(){
        double adviesPrijs = 0;
        if (jaargang % 10 != 7){
            adviesPrijs = (LocalDate.now().getYear() - jaargang) * 0.10;
        }
        if(land.equals("Frankrijk")){
            adviesPrijs += 7.5;
        }else if (land.equals("Chili")){
            adviesPrijs +=  8.25;
        }else if (land.equals("Spanje")){
            adviesPrijs += 6.45;
        }else{
            adviesPrijs += 9.30;
        }
        return adviesPrijs;
    }

    public String getLabel(){
        return  naam + "\n" + druivenras + "\n" + regio + "\n" + Integer.toString(jaargang);
    }

    public String toString(){
        return new StringBuilder().append(getLabel()).append("\n").append(kleur).append("\n").append(omschrijving).append("\n").append(land).append("\n").append(jaargang).append("\n").append(alcoholPercentage).append("\n").append(serveerTip).toString();
    }
}
