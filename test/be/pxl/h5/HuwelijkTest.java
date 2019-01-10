package be.pxl.h5;

import static org.junit.Assert.*;

import be.pxl.h5.oef1.Huwelijk;
import be.pxl.h5.oef1.Persoon;
import org.junit.Before;
import org.junit.Test;


public class HuwelijkTest {
	private Persoon an;
	private Persoon jo;
	private Huwelijk huwelijk;

	@Before
	public void init() {
		an = new Persoon("Adams", "An", 29, 9, 1990, "lentestraat", "3B", 3290, "Diest");
		jo = new Persoon("Bex", "Jo", 12, 6, 1992, "garagestraat", "15", 3500, "Hasselt");
		huwelijk = new Huwelijk(an, jo, 3, 4, 2016);
	}

	@Test
	public void testConstructor() {

		Persoon persoon1 = huwelijk.getPartner1();
		Persoon persoon2 = huwelijk.getPartner2();
		assertNotNull(persoon1);
		assertEquals(an, persoon1);
		assertNotNull(persoon2);
		assertTrue(persoon2.equals(jo));
		assertNotNull(huwelijk.getHuwelijksDatum());
		assertEquals(3, huwelijk.getHuwelijksDatum().getDag());
		assertEquals(4, huwelijk.getHuwelijksDatum().getMaandNr());
		assertEquals(2016, huwelijk.getHuwelijksDatum().getJaar());
		assertNotNull(jo.getAdres());
		assertEquals("Diest", jo.getAdres().getGemeente().getGemeenteNaam());
		assertEquals(3290, jo.getAdres().getGemeente().getPostcode(), 0);
		assertEquals("3B", jo.getAdres().getHuisNummer());
		assertEquals("lentestraat", jo.getAdres().getStraat());
	}

	@Test
	public void testGetPartner1() {
		Persoon persoon1 = huwelijk.getPartner1();
		assertNotNull(persoon1);
		assertEquals(an, persoon1);
	}

	@Test
	public void testGetPartner2() {
		Persoon persoon2 = huwelijk.getPartner2();
		assertNotNull(persoon2);
		assertEquals(jo, persoon2);
	}

	@Test
	public void testGetAdres() {
		assertNotNull(jo.getAdres());
		assertEquals("Fout bij gemeentenaam van het adres", "Diest", jo.getAdres().getGemeente().getGemeenteNaam());
		assertEquals("Fout bij de postcode van het adres", 3290, jo.getAdres().getGemeente().getPostcode());
		assertEquals("Fout bij huisnummer van het adres", "3B", jo.getAdres().getHuisNummer());
		assertEquals("Fout bij straat van het adres", "lentestraat", jo.getAdres().getStraat());
	}

	@Test
	public void testAdresWijziging() {
		huwelijk.adresWijziging("kerkstraat", "12", 3960, "Bree");
		assertNotNull(an.getAdres());
		assertNotNull(jo.getAdres());
		assertEquals("Fout van straat bij adreswijziging", "kerkstraat", jo.getAdres().getStraat());
		assertEquals("Fout van straat bij adreswijziging", "kerkstraat", an.getAdres().getStraat());
		assertEquals("Fout bij huisnummer bij adreswijziging", "12", jo.getAdres().getHuisNummer());
		assertEquals("Fout bij huisnummer bij adreswijziging", "12", an.getAdres().getHuisNummer());
		assertEquals("Fout bij gemeentenaam bij adreswijziging", "Bree", jo.getAdres().getGemeente().getGemeenteNaam());
		assertEquals("Fout bij gemeentenaam bij adreswijziging", "Bree", an.getAdres().getGemeente().getGemeenteNaam());
		assertEquals("Fout bij postcode bij adreswijziging", 3960, jo.getAdres().getGemeente().getPostcode());
		assertEquals("Fout bij postcode bij adreswijziging", 3960, an.getAdres().getGemeente().getPostcode());

	}
}
