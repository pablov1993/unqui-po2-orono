package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaTest {
	
	private Maquina maquina;
	
	@BeforeEach
	public void setUp() {
		
		this.maquina = new Maquina();		
	}

	@Test
	void testMaquinaSeEncuentraEnReposo() {
		
		String mensajeEsperado = "Ingresen fichas";
		
		assertEquals(mensajeEsperado, maquina.mensaje());
	}
	
	@Test
	void testMaquinaIniciaEnUnicoJugador() {
		
		maquina.inicio(1);
		String mensajeEsperado = "Modo single";
		
		assertEquals(mensajeEsperado, maquina.mensaje());
		
		maquina.finalizarJuego();
		
		assertEquals("Ingresen fichas", maquina.mensaje());
		
	}
	
	@Test
	void testMaquinaIniciaModoDobles() {
		
		maquina.inicio(0);
		
		assertEquals("Ingresen fichas", maquina.mensaje());
		
		
		maquina.inicio(2);
		String mensajeEsperado = "Modo dobles";
		
		assertEquals(mensajeEsperado, maquina.mensaje());
	}
}
