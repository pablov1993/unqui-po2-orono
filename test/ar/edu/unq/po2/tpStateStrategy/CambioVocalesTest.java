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
	void test() {
		
		String mensaje = "Hola";
		
		String mensajeEncriptado = "Hale";
		
		List<String> lista = new ArrayList<String>();
		
		for(String s : mensaje.split("")) {
			
			lista.add(s);
		}
		
		String st = "";
		for(String s : lista) {
			
			st.concat(s);
		}
		
		assertEquals("Ho","H".concat("o"));
	}

}
