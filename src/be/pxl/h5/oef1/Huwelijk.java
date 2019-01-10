package be.pxl.h5.oef1;

public class Huwelijk {
    Persoon partner1;
    Persoon partner2;
    Datum huwelijksDatum;

    public Huwelijk(Persoon partner1, Persoon partner2, int dag, int maand, int jaar) {
        this.partner1 = partner1;
        partner2.setAdres(partner1.getAdres());
        this.partner2 = partner2;
        this.huwelijksDatum = new Datum(dag, maand, jaar);
        System.out.printf("%s %s en %s %s zijn gehuwd op %s. Proficiat! \n", this.partner1.getVoornaam(),
                this.partner1.getNaam(), this.partner2.getVoornaam(), this.partner2.getNaam(), this.huwelijksDatum.toString());
    }

    public Persoon getPartner1() {
        return partner1;
    }

    public Persoon getPartner2() {
        return partner2;
    }

    public Datum getHuwelijksDatum() {
        return huwelijksDatum;
    }

    public void adresWijziging(String straatnaam, String huisnr, int postcode, String gemeente){
        Adres nieuwAdres = new Adres(straatnaam, huisnr, postcode, gemeente);
        this.partner1.setAdres(nieuwAdres);
        this.partner2.setAdres(nieuwAdres);
    }

    public void print(){
        System.out.printf("%s \n\n %s \n\n Het huwelijk vond plaats op %s", this.partner1.toString(), this.partner2.toString(), this.huwelijksDatum.toString());
    }
}
