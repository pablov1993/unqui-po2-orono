package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
class ArticuloTest {
	
	private Articulo articulo;
	private Interesante componente;
	private List<Interesado> suscriptores;
	private Interesado investigador;
	
	@BeforeEach
	public void setUp() {
		
		this.suscriptores = new ArrayList<Interesado>();
		this.investigador = mock(Interesado.class);
		this.suscriptores.add(investigador);
		this.componente = mock(Interesante.class);
		when(componente.getSuscriptores()).thenReturn(suscriptores);
		this.articulo = new Articulo("Articulo",componente,componente,componente);
		
	}

	@Test
	void testArticuloRegistraObservadoresDeSusComponentes() {
		assertEquals(3,articulo.getSuscriptores().size());
	}
	
	@Test
	void testArticuloNotificaAlInvestigador() {
		
		articulo.notificarNuevoArticulo(articulo);
		
		verify(investigador , times(3)).nuevoArticulo(articulo);
	}

}
