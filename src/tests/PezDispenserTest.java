package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import basics.PezDispenser;

public class PezDispenserTest {

	private static PezDispenser pez;
	
    @Before public void initialize() {
	  pez = new PezDispenser("Yoda");
    }
	
	@Test
	public void shouldCreatePezDispenser() {
		assertEquals("Pez character name should be", "Yoda", pez.getCharacterName());
		assertEquals("Pez count should be", 0, pez.getPezCount());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void loadingTooManyPezShouldThrow() {
		pez.load(500);
	}
	
	@Test
	public void shouldLoadPez() {
		pez.load(8);
		assertEquals("load amount should equal pez count", 8, pez.getPezCount());
	}
	
	@Test
	public void shouldLoadMaxPezCount() {
		pez.load();
		assertEquals("amount should be 12", 12, pez.getMaxPez());
	}

	@Test
	public void shouldDispenseOnePez() {
		pez.setPezCount(5);
		pez.dispense();
		assertEquals("should dispense one pez", 4, pez.getPezCount());
	}
	
	@Test
	public void shouldNotDispenseOnePez() {
		pez.setPezCount(0);
		pez.dispense();
		assertEquals("should not dispense one pez", 0, pez.getPezCount());
	}

}
