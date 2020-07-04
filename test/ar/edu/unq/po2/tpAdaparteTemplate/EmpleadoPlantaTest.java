package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class EmpleadoPlantaTest {
	
	private Empleado pablo;
	
	@BeforeEach
	public void setUp(){
		
		this.pablo = new Planta("Pablo",2);
	}

	@Test
	void testAltaDeEmpleado() {
		assertEquals("Pablo",pablo.getNombre());
	}
	
	@Test
	void testPidoSueldoAEmpleado() {
		
		double sueldo = pablo.sueldo();
		double sueldoEsperado = 2871d;
		assertEquals(sueldoEsperado,sueldo);
	}

}
