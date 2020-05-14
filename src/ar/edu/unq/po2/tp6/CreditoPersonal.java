package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends SolicitudCredito {

	public CreditoPersonal(Cliente cliente, Float monto, Integer plazo) {
		super(cliente, monto, plazo);

	}

	@Override
	public boolean solicitudAceptable(Cliente cliente) {
		return cliente.sueldoNetoAnual() >= 150000 & cliente.getSueldoMensual() * 0.7f >= this.montoCuotas() ;
	}

	

}
