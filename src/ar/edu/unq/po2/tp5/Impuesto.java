package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private Double monto;
	
	public Impuesto(Double monto) {
		this.monto = monto;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.monto;
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}
}
