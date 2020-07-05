package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ReproductorTest {
	
	private Reproductor reproductor;
	private Ireproducible cancion;
	private EstadoReproductor estado;
	
	@BeforeEach
	public void setUp() {
		
		this.reproductor = new Reproductor();
		this.cancion = mock(Ireproducible.class);
		this.estado = mock(EstadoReproductor.class);
	}

	@Test
	void testReproductoAgregaCancionesAsuPlayList() {
		
		this.reproductor.agregarCancion(cancion);
		
		assertFalse(reproductor.getPlayList().isEmpty());
	}
	
	@Test
	void testReproductorPideReproducirCancion() throws ReproductorException {
		
		reproductor.setEstado(estado);
		
		this.reproductor.reproducir(cancion);
		
		verify(estado).reproducirCancion(cancion);
	}
	
	@Test
	void testReproductorPausaReproduccion() throws ReproductorException {
		
		
		reproductor.setEstado(estado);
		this.reproductor.pausarCancion();
		
		verify(estado).pausarReproduccion();		
	}
	
	@Test
	void testReproductorDetieneReproduccion() throws ReproductorException {
		
		reproductor.setEstado(estado);
		this.reproductor.detenerCancion();
		
		verify(estado).detenerReproduccion();
	}
	

}
