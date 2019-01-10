package be.pxl.projecten.project2;

import java.time.LocalDate;

public class Uitgever {
    private String naam;
    private int jaarOprichting;
    private String hoofdkantoor;
    private String website;

    public Uitgever(String naam, String hoofdKantoor, int jaarOprichting) {
        this.naam = naam;
        setJaarOprichting(jaarOprichting);
        this.hoofdkantoor = hoofdKantoor;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setJaarOprichting(int jaarOprichting) {
        if(jaarOprichting > LocalDate.now().getYear()){ jaarOprichting = 0;}
        this.jaarOprichting = jaarOprichting;
    }

    public void setHoofdkantoor(String hoofdkantoor) {
        this.hoofdkantoor = hoofdkantoor;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNaam() {
        return naam;
    }

    public int getJaarOprichting() {
        return jaarOprichting;
    }

    public String getHoofdkantoor() {
        return hoofdkantoor;
    }

    public String getWebsite() {
        return website;
    }

    public String toString(){
        return new StringBuilder().append("Uitgever{naam='<<").append(naam).append(">>', jaarOprichting=<<")
                .append(jaarOprichting).append(">>, hoofdkantoor='<<").append(hoofdkantoor).append(">>', website='<<")
                .append(website).append(">>'}").toString();
    }
}
