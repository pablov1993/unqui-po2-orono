package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
class FiltroMismaLetraInicialTest {
	
	private MismaLetraInicial filtro;
	private WikipediaPage pagina;
	private WikipediaPage pagina2;
	private WikipediaPage pagina3;
	private List<WikipediaPage> paginas;
	
	@BeforeEach
	public void setUp() {
		this.filtro = new MismaLetraInicial();
		this.pagina = mock(WikipediaPage.class);
		this.pagina2 = mock(WikipediaPage.class);
		this.pagina3 = mock(WikipediaPage.class);
		this.paginas = new ArrayList<WikipediaPage>();
	}
	
	
	@Test
	void testPidoLetraInicialDeUnString() {
		
		String pag = "Pagina";
		
		assertEquals("p",filtro.getInicial(pag));
	}
	
	@Test
	void testComparoQueDosTitulosTengasMismaLetraInicial() {
		
		when(pagina.getTitle()).thenReturn("Bernal");
		when(pagina2.getTitle()).thenReturn("Quilmes");
		when(pagina3.getTitle()).thenReturn("Buenos Aires");
		
		assertTrue(this.filtro.mismoString(pagina,pagina3));
		assertFalse(this.filtro.mismoString(pagina,pagina2));
	}

	@Test
	void testPidoEltituloDeLaPagina() {
		
		
		when(pagina.getTitle()).thenReturn("Cuevana");
		when(pagina2.getTitle()).thenReturn("Norte");
		when(pagina3.getTitle()).thenReturn("Colombia");
		this.paginas.add(pagina2);
		this.paginas.add(pagina3);
	
		
		assertEquals(1,filtro.getSimilarPage(pagina, paginas).size());
		
		
		
	}

}
