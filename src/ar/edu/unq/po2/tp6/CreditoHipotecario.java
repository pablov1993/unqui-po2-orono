package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends SolicitudesCredito {
	
	private Propiedad propiedad;
	
	public CreditoHipotecario(String nombre, String apellido, Float monto, Integer plazo, Propiedad propiedad) {
		super(nombre, apellido, monto, plazo);
		this.propiedad = propiedad;
	}

	@Override
	public boolean solicitudAceptable(Cliente cliente) {
		
		return this.sueldoAceptable(cliente) & this.propiedadAceptable() & this.edadAceptable(cliente) ;
	}
	
	public boolean sueldoAceptable(Cliente cliente) {
		return cliente.getSueldoMensual() * 0.5f >= this.montoCuotas();
	}
	
	public boolean propiedadAceptable() {
		return this.propiedad.getValorFiscal() * 0.7f >= this.monto;
	}
	
	public boolean edadAceptable(Cliente cliente) {
		return cliente.getEdad() <= 65;
	}

}
