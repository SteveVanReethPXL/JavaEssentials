package be.pxl.h5.opdracht;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek() {
        this.auteur = new Auteur();
    }

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        this.isbn = isbn;
        this.titel = titel;
        this.bladzijden = bladzijden;
        this.auteur = auteur;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBladzijden(int bladzijden) {
        this.bladzijden = bladzijden;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public int getBladzijden() {
        return bladzijden;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void toonBoekGegevens(){
        System.out.println(String.format("Titel: %s\n" +
                "ISBN: %s\n" +
                "bladzijden: %s\n" +
                "%s",getTitel(), getIsbn(), getBladzijden(), getAuteur().toString()));
    }
}
