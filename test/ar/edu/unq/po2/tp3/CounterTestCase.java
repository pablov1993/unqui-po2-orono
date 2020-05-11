package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception{
		
		counter = new Counter();
		
		counter.agregarNumero(1);
		counter.agregarNumero(3);
		counter.agregarNumero(5);
		counter.agregarNumero(7);
		counter.agregarNumero(9);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(4);			
	}

	@Test
	public void testNumerosPares() {
		
		Integer pares = counter.cantidadDePares();
		assertEquals(pares,1);
	}
	
	@Test
	public void testNumerosImpares() {
		Integer impares = counter.cantidadDeImpares();
		assertEquals(impares,9);
	}
	
	@Test
	public void testMultiplosDeX() {
		Integer multiplos = counter.cantidadMultiplosDeX(7);
		assertEquals(multiplos,1);
	}
	

}
