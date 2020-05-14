package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Float sueldoNetoMensual;
	private Float cuenta;
	private Banco banco;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Float sueldoNetoMensual,Banco banco){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.banco = banco;
		this.cuenta = 0f;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}

	public Float sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}

	public Float getSueldoMensual() {
		return this.sueldoNetoMensual;
	}

	public int getEdad() {
		return this.edad;
	}
	
	public String getDireccion() {
		return this.direccion;
	}

	public void solicitarCredito(Float monto, Integer plazo) {
		this.banco.generarSolicitud(new CreditoPersonal(this,monto,plazo));
	}

	public void solicitarCredito(Float monto, Integer plazo, Propiedad propiedad) {
		this.banco.generarSolicitud(new CreditoHipotecario(this,monto,plazo,propiedad));
	}

	public void setCuenta(Float monto) {
		cuenta = cuenta + monto;		
	}

	public Float getCuenta() {
		return this.cuenta;
	}
	

}
