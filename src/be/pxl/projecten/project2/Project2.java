package be.pxl.projecten.project2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Project2 {

    public static Score[] getScores(SpelEvaluatie[] evaluaties){
        Score[] scores = new Score[evaluaties.length];
        for (int i = 0; i < evaluaties.length; i++){
            scores[i] = evaluaties[i].getScore();
        }
        return scores;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Uitgever uitgever = new Uitgever("999 games", "Almere", 1990);
        uitgever.setWebsite("www.999games.nl");
        BordSpel teBeoordelenSpel = new BordSpel("Bonanaza", uitgever);
        teBeoordelenSpel.setMinimumLeeftijd(12);
        teBeoordelenSpel.setAantalSpelers(4);
        teBeoordelenSpel.setSpeelduur(45);

        int aantalEvalueerders;

        System.out.println("Hoeveel spelers evalueren het spel?");
        aantalEvalueerders = input.nextInt();
        input.nextLine();

        SpelEvaluatie[] evaluaties = new SpelEvaluatie[aantalEvalueerders];

        for (int i = 0 ; i < aantalEvalueerders; i++){
            String speler;
            int geboortejaar;
            int score;
            String motivatie;

            System.out.print("Geef speler naam: ");
            speler = input.nextLine();
            System.out.print("Geef geboortejaar: ");
            geboortejaar = input.nextInt();
            input.nextLine();
            System.out.print("Geef uw score (0-5): ");
            score = input.nextInt();
            input.nextLine();
            System.out.print("Geef uw motivatie: ");
            motivatie = input.nextLine();

            evaluaties[i]= new SpelEvaluatie(teBeoordelenSpel, new Speler(speler, geboortejaar));
            evaluaties[i].maakBeoordeling(score, motivatie);
        }

        System.out.println("Evaluatie " + teBeoordelenSpel.getNaam() + " " + uitgever.getNaam());
        for (SpelEvaluatie evaluatie : evaluaties){
            StringBuilder antwoord = new StringBuilder();
            antwoord.append(evaluatie.getSpeler().getNaam());
            antwoord.append(" ");
            antwoord.append(evaluatie.getScore().getStars());
            antwoord.append(" ");
            antwoord.append(evaluatie.getMotivatie());
            if (evaluatie.isGeldig()){
                antwoord.append(" +");
            }else {
                antwoord.append(" -");
            }
            System.out.println(antwoord.toString());

        }

        System.out.println("Totaalscore: " + new Score(getScores(evaluaties)).getStars());
    }
}
