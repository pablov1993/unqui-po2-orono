package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroLinkEnComunTest {
	
	private LinkEnComun filtro;
	private WikipediaPage pagina;
	private WikipediaPage pagina2;
	private WikipediaPage pagina3;
	private WikipediaPage pagina4;
	private List<WikipediaPage> paginas;
	
	@BeforeEach
	public void setUp() {
		this.filtro = new LinkEnComun();
		this.pagina = mock(WikipediaPage.class);
		this.pagina2 = mock(WikipediaPage.class);
		this.pagina3 = mock(WikipediaPage.class);
		this.pagina4 = mock(WikipediaPage.class);
		this.paginas = new ArrayList<WikipediaPage>();
	}

	@Test
	void testUnaListaDePaignasContieneUnaPagina() {
		
		this.paginas.add(pagina);
		this.paginas.add(pagina2);
		this.paginas.add(pagina3);
		
		assertTrue(filtro.contieneLink(pagina, paginas));
	}
	
	@Test
	void testDosListasDePaginasTienenLinksEnComun() {
		
		List<WikipediaPage> links = new ArrayList<WikipediaPage>();
		
		links.add(pagina4);
		this.paginas.add(pagina);
		this.paginas.add(pagina2);
		this.paginas.add(pagina3);
		
		assertFalse(this.filtro.tieneLinkEnComun(links, paginas));
		
		links.add(pagina);
		
		assertTrue(this.filtro.tieneLinkEnComun(links, paginas));
	}
	
	@Test
	void testDevuelvoLasPaginasQueTenganLinkEnComun() {
		
		List<WikipediaPage> links = new ArrayList<WikipediaPage>();
		
		
		links.add(pagina4);
		
		when(pagina.getLinks()).thenReturn(links);
		when(pagina4.getLinks()).thenReturn(links);
		this.paginas.add(pagina);
		this.paginas.add(pagina2);
		this.paginas.add(pagina3);
		this.paginas.add(pagina4);
		
		assertTrue(this.filtro.getSimilarPage(pagina, links).contains(pagina4));
	}

}
