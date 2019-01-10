package be.pxl.h5.oef1;

public class Datum {
    private int dag;
    private int maand;
    private int jaar;
    private String[] maandNamen = {"januari", "februari", "maart", "april", "mei",
            "juni", "juli", "augustus", "september", "oktober", "november", "december"};

    public Datum() {
        this(1, 1, 2018);
    }

    public Datum(int dag, int maand, int jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }
    public Datum(Datum datum) {
        this(datum.getDag(), datum.getMaandNr(), datum.getJaar());
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public void setMaand(int maand) {
        if(maand < 1){
            maand = 1;
        }else if (maand > 12){
            maand = 12;
        }
        this.maand = maand;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public int getDag() {
        return dag;
    }

    public int getMaandNr() {
        return maand;
    }
    public String getMaandNaam() {
        return maandNamen[getMaandNr() - 1];
    }

    public int getJaar() {
        return jaar;
    }

    @Override
    public String toString() {
        return getDag() + " " + getMaandNaam() + " " + getJaar();
    }
}
