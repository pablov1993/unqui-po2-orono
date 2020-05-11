package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable{
	
	private Double precio;
	private Integer stock;
	
	public Producto(Double precio, Integer stock) {
		this.precio = precio;
		this.stock = stock;
	}
	public  Double getPrecio() {
		return this.precio;
	}
	
	public void concretarCompra() {
		this.stock = stock - 1;
	}
	
	protected Integer getStock() {
		return this.stock;
	}

}
