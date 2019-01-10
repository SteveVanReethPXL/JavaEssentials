package be.pxl.projecten.project2;

public class BordSpel extends Spel {
    private int speelduur;
    private int aantalSpelers;

    public BordSpel(String naam, Uitgever uitgever) {
        super(naam, uitgever);
    }

    public void setSpeelduur(int speelduur) {
        if(speelduur < 0){
            speelduur = 30;
        }
        this.speelduur = speelduur;
    }

    public void setAantalSpelers(int aantalSpelers) {
        if(aantalSpelers < 0 ){
            aantalSpelers = 1;
        }
        this.aantalSpelers = aantalSpelers;
    }

    public int getSpeelduur() {
        return speelduur;
    }

    public int getAantalSpelers() {
        return aantalSpelers;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("BordSpel{").append(super.toString()).append(", aantalSpelers=")
                .append(aantalSpelers).append(", speelduur=").append(speelduur).append("}").toString();
    }
}
