package ar.edu.unq.po2.tp4;

import java.util.function.BooleanSupplier;

public class Producto {
	
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado;
	
	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	
	public Producto(String nombre, Double precio) {
		
		this.nombre = nombre;
		this.precio = precio;	
		this.esPrecioCuidado = false;
	}


	public String getNombre() {
		return this.nombre;
	}


	public Double getPrecio() {
		return this.precio;
	}


	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}


	public void aumentarPrecio(double precio) {
		
		this.precio = this.precio + precio;
	}

}
