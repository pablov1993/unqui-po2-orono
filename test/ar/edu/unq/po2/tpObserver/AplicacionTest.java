package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class AplicacionTest {
	
	private Aplicacion app;
	private Partido partido;
	private Suscriptor servidor;
	private Tematica tenis;
	
	@BeforeEach
	public void setUp() {
		this.app = new Aplicacion();
		this.partido = mock(Partido.class);
		this.servidor = mock(Suscriptor.class);
		this.tenis = mock(Tematica.class);
	}

	@Test
	void testAplicacionAgregaPartidoAsuLista() {
		
		this.app.registrarPartido(partido);
		assertFalse(this.app.getPartidos().isEmpty());
	}
	
	@Test
	void testAplicacionSuscribeServidorATematica() {
		
		this.app.registrarSuscriptor(servidor, tenis);
		verify(tenis).suscribir(servidor);
	}
	
	@Test
	void testAppRegistraPartidoYDisparaNotificacionDeTematica() {
		
		this.app.registrarSuscriptor(servidor, tenis);
		
		
		this.app.registrarPartido(partido);
		
		verify(tenis).suscribir(servidor);
		verify(partido).dispararNotificaciones();
	}

}
