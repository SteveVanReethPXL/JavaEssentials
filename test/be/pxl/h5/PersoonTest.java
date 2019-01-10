package be.pxl.h5;

import be.pxl.h5.oef1.Persoon;
import be.pxl.h5.oef1.Adres;
import be.pxl.h5.oef1.Datum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class PersoonTest {
    private Persoon persoon;

    @Before
    public void init() {
        persoon = new Persoon("Aerts", "Jef", 29, 11, 1990, "Lindestraat", "23d", 3500, "Hasselt");

    }

    @Test
    public void testConstructorZonderObjecten() {
        assertEquals("Aerts", persoon.getNaam());
        assertEquals("Jef", persoon.getVoornaam());
        assertNotNull(persoon.getGeboortedatum());
        assertEquals(29, persoon.getGeboortedatum().getDag(), 0);
        assertEquals(11, persoon.getGeboortedatum().getMaandNr(), 0);
        assertEquals(1990, persoon.getGeboortedatum().getJaar(), 0);
        assertNotNull(persoon.getAdres());
        assertEquals("Lindestraat", persoon.getAdres().getStraat());
        assertEquals("23d", persoon.getAdres().getHuisNummer());
        assertNotNull(persoon.getAdres().getGemeente());
        assertEquals(3500, persoon.getAdres().getGemeente().getPostcode());
        assertEquals("Hasselt", persoon.getAdres().getGemeente().getGemeenteNaam());
    }

    @Test
    public void testConstructorMetObjecten() {
        Adres adres = new Adres("Lindestraat", "23d", 3500, "Hasselt");
        Datum geboorteDatum = new Datum(29, 11, 1990);
        Persoon persoonObject = new Persoon("Aerts", "Jef", geboorteDatum, adres);
        assertEquals("Aerts", persoonObject.getNaam());
        assertEquals("Jef", persoonObject.getVoornaam());
        assertNotNull(persoonObject.getGeboortedatum());
        assertEquals(geboorteDatum.toString(), persoonObject.getGeboortedatum().toString());
        assertNotNull(persoonObject.getAdres());
        assertEquals(adres.toString(), persoonObject.getAdres().toString());
    }

    @Test
    public void testVoegVoornamenToe() {
        String [] voornamen = {"Sofie", "Robbe", "Hans"};
        persoon.voegVoornamenToe(voornamen);
        assertEquals("Jef Sofie Robbe Hans", persoon.getVoornaam());
    }

    @Test
    public void testToString() {
        String tekst = "Jef Aerts\nLindestraat 23d\n3500 Hasselt";
        assertEquals(tekst, persoon.toString());
    }
}
