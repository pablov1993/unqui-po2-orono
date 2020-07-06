package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTest {
	
	private Partido partido;
	private Tematica deporte;
	private Tematica nadal;
	private Tematica federer;
	private Suscriptor servidor;
	private Suscriptor pablo;
	private List<Tematica> contrincantes;
	private List<Suscriptor> suscriptores;
	
	@BeforeEach
	public void setUp() {
		
		this.deporte = mock(Tematica.class);
		this.nadal = mock(Tematica.class);
		this.federer = mock(Tematica.class);
		this.servidor = mock(Suscriptor.class);
		this.pablo = mock(Suscriptor.class);
		this.contrincantes = new ArrayList<Tematica>();
		contrincantes.add(federer);
		contrincantes.add(nadal);
		this.partido = new Partido("1:1",deporte,contrincantes);
	}
	

	@Test
	void testPartidoDisparaNotificacionesDeSusTematicas() {
		
		this.partido.dispararNotificaciones();
		
		verify(nadal).notificar(partido);
		verify(federer).notificar(partido);
		verify(deporte).notificar(partido);
	}

}
