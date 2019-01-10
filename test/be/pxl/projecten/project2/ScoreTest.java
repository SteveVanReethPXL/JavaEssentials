package be.pxl.projecten.project2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScoreTest {

    @Test
    public void testScoreMetGeldigeWaarde() {
        Score score = new Score(3);
        assertEquals("***", score.getStars());
    }

    @Test
    public void testScoreMetNegatieveWaarde() {
        Score score = new Score(0);
        assertEquals("", score.getStars());
    }

    @Test
    public void testScoreMetGrotereWaardeDanMaxWaarde() {
        Score score = new Score(Score.MAX_SCORE + 1);
        assertEquals(Score.MAX_SCORE, score.getStars().length());
    }

    @Test
    public void testScoreMetLegeArrayGeeftGeenSterren() {
        Score score = new Score(new Score[0]);
        assertEquals("", score.getStars());
    }

    @Test
    public void testScoreMetMeerdereScoresGeeftGemiddelde() {
        Score[] scores = {new Score(3), new Score(4), new Score(5)};
        Score score = new Score(scores);
        assertEquals("****", score.getStars());
    }
}
