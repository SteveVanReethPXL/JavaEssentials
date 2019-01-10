package be.pxl.projecten.project2;

public abstract class Spel {
    private String naam;
    private int minimumLeeftijd;
    private Uitgever uitgever;

    public Spel(String naam, Uitgever uitgever) {
        this.naam = naam;
        this.uitgever = uitgever;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setMinimumLeeftijd(int minimumLeeftijd) {
        if(minimumLeeftijd < 0){
            minimumLeeftijd = 12;
        }
        this.minimumLeeftijd = minimumLeeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getMinimumLeeftijd() {
        return minimumLeeftijd;
    }

    public Uitgever getUitgever() {
        return uitgever;
    }

    public String toString(){
        return new StringBuilder().append("naam='").append(naam).append("', minimumLeeftijd=")
                .append(minimumLeeftijd).append("', uitgever=").append(uitgever.toString())
                .toString();
    }
}
