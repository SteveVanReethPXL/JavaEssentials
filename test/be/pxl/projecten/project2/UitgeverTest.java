package be.pxl.projecten.project2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class UitgeverTest {

    @Test
    public void testConstructor() {
        Uitgever uitgever = new Uitgever("NAAM", "HOOFDKANTOOR", 2015);
        assertNotNull(uitgever);
        assertEquals("NAAM", uitgever.getNaam());
        assertEquals("HOOFDKANTOOR", uitgever.getHoofdkantoor());
        assertEquals(2015, uitgever.getJaarOprichting());
    }

    @Test
    public void testSetJaarOprichtingGeeft0IndienGroterDanHuidigJaar() {
        Uitgever uitgever = new Uitgever("NAAM", "HOOFDKANTOOR", 2015);
        uitgever.setJaarOprichting(LocalDate.now().getYear() + 1);
        assertEquals(0, uitgever.getJaarOprichting());
    }

    @Test
    public void testSetWebsite() {
        Uitgever uitgever = new Uitgever("NAAM", "HOOFDKANTOOR", 2015);
        uitgever.setWebsite("WEBSITE");
        assertEquals("WEBSITE", uitgever.getWebsite());
    }
}
