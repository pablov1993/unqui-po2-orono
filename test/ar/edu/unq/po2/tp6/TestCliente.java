package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCliente {
	
	private Cliente cliente;
	private Banco banco;
	private Propiedad propiedad;
	
	@BeforeEach
	public void setUp() {
		
		this.cliente = new Cliente("Pablo","Orono","Bernal", 27,30000f);
		this.banco = new Banco();
		this.propiedad = new Propiedad("Depto","Bernal",120000f);
	}

	@Test
	void testSolicitarCreditoPersonal() {
		cliente.solicitarCredito(banco,12000f,12);
		assertEquals(banco.getSolicitudes().size(),1);
		assertTrue(banco.evaluarSolicitudDe(cliente));
		assertEquals(cliente.getCuenta(),12000f);
	}
	
	@Test
	void testSolicitarCreditoHipotecario() {
		cliente.solicitarCredito(banco, 12000f, 10, propiedad);
		assertTrue(banco.evaluarSolicitudDe(cliente));
		assertEquals(cliente.getCuenta(),12000f);
	}

}
