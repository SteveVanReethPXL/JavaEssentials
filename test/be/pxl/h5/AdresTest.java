package be.pxl.h5;

import static org.junit.Assert.*;


import be.pxl.h5.oef1.Adres;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AdresTest {
	private Adres adres;

	@Before
	public void init() {
		adres = new Adres("kerkstraat", "12b", 3500, "Hasselt");
	}

	@Test
	public void testConstructor() {
		assertEquals("Fout bij de straat", "kerkstraat", adres.getStraat());
		assertEquals("Fout bij het huisnummer", "12b", adres.getHuisNummer());
		assertNotNull(adres.getGemeente());
		assertEquals(3500, adres.getGemeente().getPostcode());
		assertEquals("Fout bij de gemeentenaam", "Hasselt", adres.getGemeente().getGemeenteNaam());
	}

	@Test
	public void testGetStraat() {
		assertEquals("Fout bij de straat", "kerkstraat", adres.getStraat());

	}

	@Test
	public void testSetStraat() {
		adres.setStraat("kiekenweg");
		assertEquals("Fout bij de straat", "kiekenweg", adres.getStraat());
	}

	@Test
	public void testGetHuisNr() {
		assertEquals("Fout bij het huisnummer", "12b", adres.getHuisNummer());
	}

	@Test
	public void testSetHuisNr() {
		adres.setHuisNummer("44");
		assertEquals("44", adres.getHuisNummer());
	}

	@Test
	public void testGetGemeente() {
		assertNotNull(adres.getGemeente());
		assertEquals(3500, adres.getGemeente().getPostcode());
		assertEquals("Hasselt", adres.getGemeente().getGemeenteNaam());
	}

	@Test
	public void testToString() {
		String tekst = "kerkstraat 12b\n3500 Hasselt";
		assertEquals(tekst, adres.toString());
	}
}
