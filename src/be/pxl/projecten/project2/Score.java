package be.pxl.projecten.project2;

public class Score {
    public static final int MAX_SCORE = 5;
    private int waarde;

    public Score(int waarde) {
        setWaarde(waarde);
    }

    public Score(Score[] scores){
        int totaal = 0;
        int counter = 0;
        for (Score score : scores){
            totaal += score.waarde;
            counter++;
        }
        if (counter != 0){
            setWaarde((int) Math.floor(totaal / counter));
        }else {
            this.waarde = 0;
        }
    }

    private void setWaarde(int waarde){
        if(waarde < 0){
            waarde = 0;
        }else if (waarde > MAX_SCORE){
            waarde = MAX_SCORE;
        }
        this.waarde = waarde;
    }

    public String getStars(){
        StringBuilder antwoord = new StringBuilder();
        for (int i = 1; i <= waarde; i++){
            antwoord.append("*");
        }
        return antwoord.toString();
    }

    public boolean equals(Object o){
        boolean respons = false;
        if ( o instanceof Score){
            if (((Score) o).waarde == waarde){
                respons = true;
            }
        }
        return respons;
    }
}
