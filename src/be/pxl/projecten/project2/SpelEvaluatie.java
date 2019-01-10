package be.pxl.projecten.project2;

public class SpelEvaluatie {
    private Spel spel;
    private Speler speler;
    private Score score;
    private String motivatie;

    public SpelEvaluatie(Spel spel, Speler speler) {
        this.spel = spel;
        this.speler = speler;
    }

    public Spel getSpel() {
        return spel;
    }

    public Speler getSpeler() {
        return speler;
    }

    public Score getScore() {
        return score;
    }

    public String getMotivatie() {
        return motivatie;
    }

    public boolean isGeldig(){
        boolean antwoord = false;
        if(spel != null && speler != null && score != null && speler.getLeeftijd() >= spel.getMinimumLeeftijd()){
            antwoord = true;
        }
        return antwoord;
    }

    public boolean maakBeoordeling(int score, String motivatie){
        boolean antwoord = false;
        if (this.motivatie == null){
            this.score = new Score(score);
            this.motivatie = motivatie;
            antwoord = true;
        }
        return antwoord;
    }
}
