package uniRomatre.DiaDia.ambienti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import it.uniRoma3.DiaDia.Partita;
import it.uniRoma3.DiaDia.ambienti.Stanza;



public class PartitaTest {

	Partita p = new Partita();
	Stanza s = new Stanza("Stanza");
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", p.labirinto.getStanzaVincente().getNome());
	}

	@Test
	public void testSetStanzaCorrente() {
		p.labirinto.setStanzaCorrente(s);
		assertEquals(s, p.labirinto.getStanzaCorrente());
	}

	@Test
	public void testIsFinita() {
		
		assertTrue(p.isFinita());
	}
	
}
