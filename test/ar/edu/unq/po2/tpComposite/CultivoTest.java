package ar.edu.unq.po2.tpComposite;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivoTest {
	
	
	private Tierra soja;
	private Tierra trigo;
	
	
	@BeforeEach
	public void setUp() {
		
		this.soja = new Soja();
		this.trigo = new Trigo();
	}

	@Test
	void testPidoGananciaAnualAcultivos() {
		
		assertTrue(soja.getGananciaAnual() == 500d);
		assertTrue(trigo.getGananciaAnual() == 300d);
	}

}
