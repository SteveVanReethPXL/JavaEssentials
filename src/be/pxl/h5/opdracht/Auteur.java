package be.pxl.h5.opdracht;

public class Auteur {
    private String naam;
    private String voornaam;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public String toString() {
        return "Auteur: " + voornaam + " " + naam;
    }
}
