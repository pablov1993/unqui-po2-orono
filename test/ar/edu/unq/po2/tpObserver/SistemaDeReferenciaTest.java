package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class SistemaDeReferenciaTest {
	
	private SistemaDeReferencias sistema;
	private Interesado investigador;
	private Interesante articulo;

	@BeforeEach
	public void setUp() {
		this.sistema = new SistemaDeReferencias();
		this.investigador = mock(Interesado.class);
		this.articulo = mock(Interesante.class);
	}
	@Test
	void testObservableRegistraObservador() {
		
		sistema.registrarArticulo(articulo);
		
		
		assertFalse(sistema.getArticulos().isEmpty());
		
	}
	
	@Test
	void testSistemaRegistraArtculoEInformaAsuscriptores() {
		
		sistema.registrarSuscriptor(investigador,articulo);
		this.sistema.registrarArticulo(articulo);
		
		verify(articulo).suscribir(investigador);
		verify(articulo).notificarNuevoArticulo(articulo);
		
	}
	

}
