package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoModoSeleccionTest {

	private EstadoReproductor estado;
	private Reproductor reproductor;
	private Ireproducible cancion;
	
	@BeforeEach
	public void setUp() {
		
		this.reproductor = mock(Reproductor.class);
		this.estado = new ModoSeleccion(reproductor);
		this.cancion = mock(Ireproducible.class);
	}

	
	@Test
	void testEstadoReproduceCancion() throws ReproductorException {
		
		this.estado.reproducirCancion(cancion);
		
		verify(cancion,times(1)).play();
	}
	
	@Test
	void testPausoLaReproduccionDeLaCancion() throws ReproductorException {
		
		String mensajeEsperado = "No puede pausar sin iniciar";
		Exception exception = assertThrows(ReproductorException.class,() -> estado.pausarReproduccion());
		
		assertEquals(mensajeEsperado,exception.getMessage());
		
	}
	
	@Test
	void testDetengoCancionNoEnModoSeleccion() throws ReproductorException {
		
		String mensajeEsperado = "No puede detener sin reproducir";
		Exception exception = assertThrows(ReproductorException.class,() -> estado.detenerReproduccion());
		
		assertEquals(mensajeEsperado,exception.getMessage());
	}

}
