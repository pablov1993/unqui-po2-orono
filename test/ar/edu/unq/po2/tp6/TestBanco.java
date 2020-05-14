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
		this.cliente = new Cliente("Pablo","Orono","Bernal",27,30000f,banco);
		this.rocio = new Cliente("Rocio","Altinier","Bernal",27,20000f,banco);
		this.propiedad = new Propiedad("Depto","Bernal",120000f);
	}
	
	@Test
	void testRegistrarCliente() {		
		banco.registrarCliente(cliente);
		assertEquals(banco.getClientes().size(),1);
	}
	
	@Test
	void testGenerarSolicitud() {		
		banco.generarSolicitud(new CreditoPersonal(cliente,20000f,10));
		assertEquals(banco.getSolicitudes().size(),1);
	}
	
	@Test
	void testEvaluarSolicitudCreditoPersonal() {
		banco.generarSolicitud(new CreditoPersonal(cliente,20000f,10));
		assertTrue(banco.evaluarSolicitudDe(cliente));
		assertEquals(banco.solicitudDe(cliente).getStatus(),"Aprobado");
	}
	
	@Test
	void testEvaluarSolicitudCreditoHipotecario() {
		
		banco.generarSolicitud(new CreditoHipotecario(rocio,20000f,10,propiedad));
		assertEquals(banco.evaluarSolicitudDe(rocio),true);
	}	
}
