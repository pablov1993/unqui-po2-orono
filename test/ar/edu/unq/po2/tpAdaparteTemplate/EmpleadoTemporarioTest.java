package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {
	
	Empleado pablo;	
	@BeforeEach
	public void setUp() {
		
		this.pablo = new Temporario("Pablo",40d,false,true);
	}

	@Test
	void testEmpleadoCreado() {
		
		assertEquals(pablo.getNombre(),"Pablo");
	
	}
	
	@Test
	void testPidoSueldoAunEmpleadoTemporario() {
		
		double sueldo = pablo.sueldo();
		
		assertEquals(1131d,sueldo);
	}

}
