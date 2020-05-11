package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception{
		
		multioperador = new Multioperador();
		multioperador.agregarNumero(2);
		multioperador.agregarNumero(2);
		multioperador.agregarNumero(2);
	}
	
	@Test
	public void testSumar() {
		Integer suma = multioperador.sumar();
		assertEquals(suma,6);
	}

}
