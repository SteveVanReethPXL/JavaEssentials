package be.pxl.projecten.project2;

import java.time.LocalDate;

public class Speler {
    private String naam;
    private int geboortejaar;

    public Speler(String naam, int geboortejaar) {
        this.naam = naam;
       setGeboortejaar(geboortejaar);
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGeboortejaar(int geboortejaar) {
        if ((geboortejaar > LocalDate.now().getYear()) || (geboortejaar < 1900)){
            geboortejaar = 0;
        }
        this.geboortejaar = geboortejaar;
    }

    public String getNaam() {
        return naam;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public int getLeeftijd(){
        if (geboortejaar == 0){
            return -1;
        }else {
            return LocalDate.now().getYear() - geboortejaar;
        }
    }
}
