package be.pxl.h5.oef1;

public class Persoon {
    private String naam;
    private String voornaam;
    private Datum geboortedatum;
    private Adres adres;

    public Persoon(String naam, String voornaam, int dag, int maand, int jaar, String straatnaam,
                   String huisNummer, int postcode, String gemeenteNaam) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.geboortedatum = new Datum(dag, maand, jaar);
        this.adres = new Adres(straatnaam, huisNummer, postcode, gemeenteNaam);
    }
    public Persoon(){
        this("Aerts", "Jef", 29, 11, 1990, "Lindestraat", "23D", 3500, "Hasselt");
    }
    public Persoon(String naam, String voornaam, Datum datum, Adres adres){
        this(naam, voornaam, datum.getDag(),datum.getMaandNr(), datum.getJaar(),adres.getStraat(),
                adres.getHuisNummer(),adres.getGemeente().getPostcode(), adres.getGemeente().getGemeenteNaam());
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public Datum getGeboortedatum() {
        return geboortedatum;
    }

    public Adres getAdres() {
        return adres;
    }
    public void voegVoornamenToe(String... voornamen){
        StringBuilder newVoornaam = new StringBuilder(getVoornaam());
        for(String voornaam : voornamen){
            newVoornaam.append(" ");
            newVoornaam.append(voornaam);
        }
        setVoornaam(newVoornaam.toString());
    }
    public String toString(){
        return getVoornaam() + " " + getNaam() + "\n" +
                this.adres.toString();
    }
}
