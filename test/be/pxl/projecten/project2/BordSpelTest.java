package be.pxl.projecten.project2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class BordSpelTest {
    public static final String RUMIKUB = "Rumikub";
    private Uitgever uitgever;

    @Before
    public void setup() {
        uitgever = new Uitgever("999Games", "Almere", 1990);
    }

    @Test
    public void testConstructor() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        assertNotNull(bordSpel);
        assertNotNull(bordSpel.getUitgever());
        assertEquals(uitgever, bordSpel.getUitgever());
        assertEquals(RUMIKUB, bordSpel.getNaam());
    }

    @Test
    public void testSetAantalSpelers() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setAantalSpelers(5);
        assertEquals(5, bordSpel.getAantalSpelers());
    }

    @Test
    public void testAantalSpelersWordt1IndienNegatieveWaarde() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setAantalSpelers(-2);
        assertEquals(1, bordSpel.getAantalSpelers());
    }

    @Test
    public void testSetMinimumLeeftijd() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setMinimumLeeftijd(8);
        assertEquals(8, bordSpel.getMinimumLeeftijd());
    }

    @Test
    public void testMinimumLeeftijdWordt12IndienNegatieveWaarde() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setMinimumLeeftijd(-2);
        assertEquals(12, bordSpel.getMinimumLeeftijd());
    }

    @Test
    public void testSetSpeelduur() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setSpeelduur(50);
        assertEquals(50, bordSpel.getSpeelduur());
    }

    @Test
    public void testSpeelduurWordt30IndienNegatieveWaarde() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setSpeelduur(-15);
        assertEquals(30, bordSpel.getSpeelduur());
    }
}
