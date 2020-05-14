package ar.edu.unq.po2.tp6;

public abstract class SolicitudesCredito {
	
	protected String nombre;
	protected String apellido;
	protected Float monto;
	protected Integer plazo;
	protected String status;
	public SolicitudesCredito(String nombre, String apellido, Float monto, Integer plazo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.monto = monto;
		this.plazo = plazo;
		this.status = "Pendiente";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public abstract boolean solicitudAceptable(Cliente cliente);
	
	public Float montoCuotas() {
		return this.monto / this.plazo;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public Float getMonto() {
		return this.monto;
	}
}
