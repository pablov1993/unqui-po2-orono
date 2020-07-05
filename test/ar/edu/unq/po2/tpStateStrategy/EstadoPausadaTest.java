package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class EstadoPausadaTest {
	
	private EstadoReproductor estado;
	private Reproductor reproductor;
	private Ireproducible cancion;
	
	@BeforeEach
	public void setUp() {
		
		this.reproductor = mock(Reproductor.class);
		this.cancion = mock(Ireproducible.class);
		this.estado = new Pausada(reproductor,cancion);
	}

	@Test
	void testPuasoCancionPausada() throws ReproductorException {
		
		this.estado.pausarReproduccion();
		
		verify(cancion).play();
		verify(reproductor).setEstado(any(EstadoReproductor.class));
		
	}
	
	@Test
	void testEnvioPlayACancionPausada() throws ReproductorException {
		
		String mensajeEsperado = "Para reproducir presione pausa";
		Exception exception = assertThrows(ReproductorException.class,() -> estado.reproducirCancion(cancion));
		
		assertEquals(mensajeEsperado,exception.getMessage());
		
	}
	
	@Test
	void testDetengoReproduccionDeCancionPausada() throws ReproductorException {
		
		this.estado.detenerReproduccion();
		
		verify(reproductor).setEstado(any(EstadoReproductor.class));
	}

}
