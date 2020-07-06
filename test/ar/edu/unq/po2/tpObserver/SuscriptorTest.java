package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class SuscriptorTest {
	
	private Suscriptor servidor;
	private Aplicacion app;
	private Tematica tenis;
	
	@BeforeEach
	public void setUp() {
		
		this.app = mock(Aplicacion.class);
		this.servidor = new Servidor(app);
		this.tenis = mock(Tematica.class);
	}

	@Test
	void testSuscriptorSeSuscribeAUnaTematica() {
		
		servidor.suscribirse(tenis);
		
		verify(app).registrarSuscriptor(servidor, tenis);
	}

}
