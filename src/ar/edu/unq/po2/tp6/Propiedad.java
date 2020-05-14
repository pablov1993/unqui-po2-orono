package ar.edu.unq.po2.tp6;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private Float valorFiscal;

	public Propiedad(String descripcion, String direccion, Float valorFiscal) {
		
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public double getValorFiscal() {
		return this.valorFiscal;
	}

}
