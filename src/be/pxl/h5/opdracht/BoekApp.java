package be.pxl.h5.opdracht;

public class BoekApp {
    public static void main(String[] args) {
        Boek boek = new Boek();
        boek.setTitel("boektitel");
        boek.setIsbn("256.235.689.789");
        boek.setBladzijden(360);
        boek.getAuteur().setNaam("Brusselmans");
        boek.getAuteur().setVoornaam("Herman");
        boek.toonBoekGegevens();
    }

}
