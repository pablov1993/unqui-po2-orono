package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCajaRegistrar {	
	
	private Caja caja;
	private Producto arroz;
	private Producto vino;
	private Factura internet;
	private Factura municipal;
	
	@BeforeEach
	public void setUp() {
		
		this.caja = new Caja();
		this.arroz = new ProductoCooperativa(10d,20);
		this.vino = new ProductoTradicional(150d,100);
		this.internet = new Servicio(10d,100);
		this.municipal = new Impuesto(300d);
	}

	@Test
	void testProductoCooperativa() {
		
		caja.registrarProducto(arroz);
		assertEquals(9d, arroz.getPrecio());
		assertEquals(19,arroz.getStock());
	}
	
	@Test
	void testProductoTradicional() {
		caja.registrarProducto(vino);
		assertEquals(150d,vino.getPrecio());
		assertEquals(99,vino.getStock());
	}
	
	@Test
	void testRegistrarServicio() {
		caja.registrarProducto(internet);
		assertEquals(1000,internet.getPrecio());
	}
	
	@Test
	void testRegistrarImpuesto() {
		caja.registrarProducto(municipal);
		assertEquals(300d,municipal.getPrecio());		
	}
		
	@Test
	void testMontoTotal() {
		caja.registrarProducto(vino);
		caja.registrarProducto(arroz);
		caja.registrarProducto(municipal);
		caja.registrarProducto(internet);
		assertEquals(1459d, caja.total());
	}
	
	

}
