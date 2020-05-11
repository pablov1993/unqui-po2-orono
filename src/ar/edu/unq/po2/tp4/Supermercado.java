package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogo;

	public Supermercado(String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogo = new ArrayList<Producto>();
	}

	public Integer getCantidadDeProductos() {
		return catalogo.size();
	}

	public void agregarProducto(Producto producto) {
		
		this.catalogo.add(producto);
	}

	public Double getPrecioTotal() {
		
		Double precioTotal = 0d;
		
		for(Producto producto: catalogo){
			
			precioTotal = precioTotal + producto.getPrecio();
		}
		
		return precioTotal;
	}

}
