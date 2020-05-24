package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class TestSistemaInformatico {
	
	 HomeBanking sistemaInformatico;
	 Banco banco;
	
	@BeforeEach
	public void setUp() {
		
		this.sistemaInformatico = new HomeBanking();
		banco = mock(Banco.class);
		
	}
	

	@Test
	void testAltaDeSistemaInformatico() {
		
		when(banco.getSize()).thenReturn(1);
		assertEquals(banco.getSize(),1);
	}
	
	void testSistemaInformaticoRegistraCredito() {
		
	}
	

}
