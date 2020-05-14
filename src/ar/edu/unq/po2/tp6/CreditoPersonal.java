package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends SolicitudesCredito {

	public CreditoPersonal(String nombre, String apellido, Float monto, Integer plazo) {
		super(nombre, apellido, monto, plazo);

	}

	@Override
	public boolean solicitudAceptable(Cliente cliente) {
		return cliente.sueldoNetoAnual() >= 150000 & cliente.getSueldoMensual() * 0.7f >= this.montoCuotas() ;
	}

	

}
