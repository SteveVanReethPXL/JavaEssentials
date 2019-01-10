package be.pxl.h6.voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;

    private static int aantal = 0;

    public Persoon() {
    }

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
        aantal++;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }
    public void print(){
        System.out.println("naam: " + voornaam + " " + naam);
    }

    public static int getAantal(){
        return aantal;
    }
}
