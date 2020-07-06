package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCliente {
	
	private Cliente cliente;
	private Banco banco;
	private Propiedad propiedad;
	private SistemaInformatico homeBanking;
	
	@BeforeEach
	public void setUp() {
		
		
		this.banco = new Banco();		
		this.propiedad = new Propiedad("Depto","Bernal",120000f);
		this.homeBanking = new HomeBanking();
	}

	@Test
	void testSolicitarCreditoPersonal() {
		cliente.solicitarCredito(12000f,12);
		assertEquals(banco.getSolicitudes().size(),1);
		assertTrue(banco.evaluarSolicitudDe(cliente));
		assertEquals(cliente.getCuenta(),12000f);
	}
	
	@Test
	void testSolicitarCreditoHipotecario() {
		cliente.solicitarCredito(12000f, 10, propiedad);
		assertTrue(banco.evaluarSolicitudDe(cliente));
		assertEquals(cliente.getCuenta(),12000f);
	}
	

}
