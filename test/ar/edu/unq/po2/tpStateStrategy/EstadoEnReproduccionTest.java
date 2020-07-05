package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoEnReproduccionTest {

	private EstadoReproductor estado;
	private Reproductor reproductor;
	private Ireproducible cancion;
	
	@BeforeEach
	public void setUp() {
		
		this.reproductor = mock(Reproductor.class);
		this.cancion = mock(Ireproducible.class);
		this.estado = new Reproduciendo(reproductor,cancion);
	}

	@Test
	void testPuasoCancionReproduciendo() throws ReproductorException {
		
		this.estado.pausarReproduccion();
		
		verify(cancion).pause();
		verify(reproductor).setEstado(any(EstadoReproductor.class));
		
	}
	
	@Test
	void testEnvioPlayACancionReproduciendo() throws ReproductorException {
		
		String mensajeEsperado = "Ya esta en reproduccion";
		Exception exception = assertThrows(ReproductorException.class,() -> estado.reproducirCancion(cancion));
		
		assertEquals(mensajeEsperado,exception.getMessage());
		
	}
	
	@Test
	void testDetengoReproduccionDeCancionPausada() throws ReproductorException {
		
		this.estado.detenerReproduccion();
		
		verify(reproductor).setEstado(any(EstadoReproductor.class));
	}

}
