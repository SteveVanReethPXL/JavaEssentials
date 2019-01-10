package be.pxl.h6.voorbeeldPersoon;

public class Lector extends Persoon {
    private String personeelsnummer;
    private double aanstellingspercentage = -1;
    private double salaris = -1;
    private static int aantal = 0;

    public Lector(){
        this("onbekend", "onbekend", 2000, 100);
    }

    public Lector(String naam, String voornaam, double aanstellingspercentage, double salaris) {
        this(naam, voornaam, "20009999", aanstellingspercentage, salaris);
    }

    public Lector(String naam, String voornaam, String personeelsnummer, double aanstellingspercentage, double salaris) {
        super(naam, voornaam);
        this.personeelsnummer = personeelsnummer;
        this.aanstellingspercentage = aanstellingspercentage;
        this.salaris = salaris;
        aantal++;
    }

    public void setPersoneelsnummer(String personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    public void setAanstellingspercentage(double aanstellingspercentage) {
        if(aanstellingspercentage < 1){
            aanstellingspercentage = 0;
        }else if (aanstellingspercentage > 100){
            aanstellingspercentage = 100;
        }
        if (salaris != -1 && this.aanstellingspercentage != -1){
            salaris *= aanstellingspercentage / 100;
        }
        this.aanstellingspercentage = aanstellingspercentage;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public String getPersoneelsnummer() {
        return personeelsnummer;
    }

    public double getAanstellingspercentage() {
        return aanstellingspercentage;
    }

    public double getSalaris() {
        return salaris;
    }
    @Override
    public void print(){
       super.print();
        System.out.println("Personeelsnummer: " + personeelsnummer + "\n" +
                "Aanstellingspercentage: " + aanstellingspercentage + "\n" +
                "salaris: " + salaris);
    }

    public static int getAantal(){
        return aantal;
    }
}
