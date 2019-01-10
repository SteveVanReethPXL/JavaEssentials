package be.pxl.h2.oef2;

public class Tijdstip {
    private int uren;
    private int minuten;
    private int seconden;

    public Tijdstip() {
    }

    public Tijdstip(int seconden) {
        this(0,0,seconden);
    }

    public Tijdstip(int uren, int minuten, int seconden) {
        this.uren = uren;
        this.minuten = minuten;
        this.seconden = seconden;
        corrigeerTijd();
    }

    public Tijdstip(Tijdstip tijdstip){
         this(tijdstip.getUren(), tijdstip.getMinuten(), tijdstip.getSeconden());
    }

    public int getUren() {
        return uren;
    }

    public void setUren(int uren) {
        this.uren = uren;
        corrigeerTijd();
    }

    public int getMinuten() {
        return minuten;
    }

    public void setMinuten(int minuten) {
        this.minuten = minuten;
        corrigeerTijd();
    }

    public int getSeconden() {
        return seconden;
    }

    public void setSeconden(int seconden) {
        this.seconden = seconden;
        corrigeerTijd();
    }

    private void corrigeerTijd(){
        int uur = getUren();
        int min = getMinuten();
        int sec = getSeconden();
        while (sec > 59){
            sec -= 60;
            min += 1;
        }
        while (min > 59){
            min -= 60;
            uur += 1;
        }
        while (uur > 23){
            uur -= 24;
        }
        this.seconden = sec;
        this.minuten = min;
        this.uren = uur;

    }
    public void voegUrenToe(int uren){
        uren += this.getUren();
        this.setUren(uren);
    }
    public void voegUrenToe(){
        this.voegUrenToe(1);
    }
    public void voegMinutenToe(int minuten){
        minuten += this.getMinuten();
        this.setMinuten(minuten);
    }
    public void voegSecondenToe(int seconden){
        seconden += this.getSeconden();
        this.setSeconden(seconden);
    }
     /*public String toStringTijd(boolean engelseNotatie){
        if (engelseNotatie){
            if (getUren()> 12 ) {
                return String.format("%02d:%02d PM", (getUren() - 12), getMinuten());
            }else{
                return String.format("%02d:%02d AM", getUren(), getMinuten());
            }
        }else {
            return String.format("%d:%02d u", getUren(), getMinuten());
        }
    }
    */
    public String toStringTijd(boolean engels) {
        if (!engels) {
            return String.format("%d:%02d u", uren, minuten);
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append("%02d:%02d");
            int euren;
            if (uren % 12 == 0) {
                euren = 12;
            } else {
                euren = uren % 12;
            }
            if (uren < 12) {
                builder.append(" AM");
            } else{
                builder.append(" PM");
            }
            if (uren == 0)
                builder.append(" (midnight)");
            else if (uren == 12){
                builder.append(" (noon)");
            }
            return String.format(builder.toString(), euren, minuten);
        }
    }

    public String toStringTechnisch() {
        return String.format("%02d:%02d:%02d",getUren(),getMinuten(),getSeconden());
    }
}
