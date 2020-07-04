package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


class EmpleadoPasanteTest {
	
	private Empleado pablo;
	
	@BeforeEach
	public void setUp() {
		
		this.pablo = new Pasante("Pablo",40d);
	}

	@Test
	void testAltaDeEmpleado() {
		assertEquals("Pablo",pablo.getNombre());
	}
	
	@Test
	void testPidoSueldoAEmpleado() {
		
		double sueldo = pablo.sueldo();
		double sueldoEsperado = 1392d;
		assertEquals(sueldoEsperado,sueldo);
	}

}
