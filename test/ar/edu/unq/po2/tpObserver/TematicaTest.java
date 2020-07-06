package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TematicaTest {
	
	
	
	private Tematica deporte;
	private Tematica nadal;
	private Tematica federer;
	private Suscriptor servidor;
	private Suscriptor pablo;
	private List<Tematica> contrincantes;
	private List<Suscriptor> suscriptores;
	private Partido partido;
	
	@BeforeEach
	public void setUp() {
		
		this.deporte = mock(Tematica.class);
		this.nadal = new ComponentePartido("Nadal");
		this.federer = mock(Tematica.class);
		this.servidor = mock(Suscriptor.class);
		this.pablo = mock(Suscriptor.class);
		this.contrincantes = new ArrayList<Tematica>();
		contrincantes.add(federer);
		contrincantes.add(nadal);
		this.partido = mock(Partido.class);
	}

	@Test
	void testTematicaRegistraSuscriptorYDaAviso() {

		nadal.suscribir(pablo);
		nadal.notificar(partido);
		
		assertFalse(nadal.getSuscriptores().isEmpty());
		verify(pablo).nuevoEvento(partido);
	}

}
