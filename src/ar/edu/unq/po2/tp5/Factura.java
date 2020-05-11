package ar.edu.unq.po2.tp5;

public abstract class Factura implements Cobrable , Agencia {
	
	

	@Override
	public abstract Double getPrecio();

	@Override
	public void concretarCompra() {
		
		this.registrarPago(this);
	}

}
