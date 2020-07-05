package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CambioVocalesTest {
	
	private CambioVocales encriptador;
	
	@BeforeEach
	public void setUp() {
		
		this.encriptador = new CambioVocales();
	}

	@Test
	void testEncriptoMensajeCambiandoVocalesYDesencripto() {
		
		String mensaje = "Yo soy bueno";
		
		
		String mensajeEncriptado = "Yu suy bainu";
		
			
		assertEquals(mensajeEncriptado, encriptador.encriptar(mensaje));
		
		
		
		assertEquals(mensaje, encriptador.desencriptar(mensajeEncriptado));
	}
	
	

}
