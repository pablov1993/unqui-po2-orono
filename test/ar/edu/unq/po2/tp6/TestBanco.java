package ar.edu.unq.po2.tp6;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBanco {

	private Banco banco;
	private Cliente cliente;
	private Propiedad propiedad;
	private Cliente rocio;
	@BeforeEach
	public void setUp() {
		
		this.banco = new Banco();
		this.cliente = new Cliente("Pablo","Orono","Bernal",27,30000f);
		this.rocio = new Cliente("Rocio","Altinier","Bernal",27,20000f);
		this.propiedad = new Propiedad("Depto","Bernal",120000f);
	}
	
	@Test
	void testRegistrarCliente() {		
		banco.registrarCliente(cliente);
		assertEquals(banco.getClientes().size(),1);
	}
	
	@Test
	void testGenerarSolicitud() {		
		banco.generarSolicitud(cliente,2000f,2);
		assertEquals(banco.getSolicitudes().size(),1);
	}
	
	@Test
	void testEvaluarSolicitudCreditoPersonal() {
		banco.generarSolicitud(cliente,2000f,2);
		assertTrue(banco.evaluarSolicitudDe(cliente));
		assertEquals(banco.solicitudDe(cliente).getStatus(),"Aprobado");
	}
	
	@Test
	void testEvaluarSolicitudCreditoHipotecario() {
		
		banco.generarSolicitud(rocio, 2000f, 2, propiedad);
		assertEquals(banco.evaluarSolicitudDe(rocio),true);
	}
}
