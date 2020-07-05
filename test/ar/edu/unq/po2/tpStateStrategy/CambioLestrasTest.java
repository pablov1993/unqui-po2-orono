package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CambioLestrasTest {
	
	private Encriptador encriptador;
	
	@BeforeEach
	public void setUp() {
		this.encriptador = new CambioLetras();
	}

	@Test
	void testEncriptoMensajeCambiandoLetras() {
		
		String mensaje = "Abc def";
		String mensajeEncriptado = "1,2,3,0,4,5,6";
		String otroMensaje = "Diego";
		String otroEncript = "4,9,5,7,15";
		assertEquals(mensajeEncriptado, encriptador.encriptar(mensaje));
		assertEquals(otroEncript, encriptador.encriptar(otroMensaje));
		
	}
	
	@Test
	void testDesencriptoMensajeCambiandoLetras() {
		
		String mensaje = "Abc def";
		String mensajeEncriptado = "1,2,3,0,4,5,6";
		
		assertEquals(mensaje.toLowerCase(), encriptador.desencriptar(mensajeEncriptado));
		assertEquals("diego", encriptador.desencriptar("4,9,5,7,15"));
	}
	

}
