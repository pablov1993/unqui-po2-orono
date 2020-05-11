package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private Double costoUnitario;
	private Integer cantidad;
	
	public Servicio(Double costoUnitario, Integer cantidad) {
		
		this.costoUnitario = costoUnitario;
		this.cantidad = cantidad;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.costoUnitario * this.cantidad;
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}
	

}
