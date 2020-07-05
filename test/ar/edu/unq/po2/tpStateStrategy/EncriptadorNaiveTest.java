package ar.edu.unq.po2.tpStateStrategy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTest {
	
	private Encriptador encriptador;
	
	@BeforeEach
	public void setUp() {
		
		this.encriptador = new CambioDeOrden();
	}

	@Test
	void testEncriptoMensaje() {
		
		
		String mensaje = "Hola Javi";
		
		String mensajeEncriptado = encriptador.encriptar(mensaje);
		
		assertEquals(mensaje , encriptador.desencriptar(mensajeEncriptado));
	}

}
