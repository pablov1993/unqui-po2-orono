package ar.edu.unq.po2.tp4;

import java.text.DecimalFormat;

public class ProductoPrimeraNecesidad extends Producto {
	
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado;
	private Double descuento;

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double descuento) {
		
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	
	@Override
	public Double getPrecio() {
		
		return super.getPrecio() * (1d - (this.descuento / 100d));
	}
	

}
