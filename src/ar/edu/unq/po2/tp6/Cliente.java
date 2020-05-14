package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Float sueldoNetoMensual;
	private Float cuenta;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Float sueldoNetoMensual) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
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

	public void solicitarCredito(Banco banco, Float monto, Integer plazo) {
		banco.generarSolicitud(this, monto, plazo);
	}

	public void solicitarCredito(Banco banco, Float monto, Integer plazo, Propiedad propiedad) {
		banco.generarSolicitud(this, monto, plazo, propiedad);
	}

	public void setCuenta(Float monto) {
		cuenta = cuenta + monto;		
	}

	public Float getCuenta() {
		// TODO Auto-generated method stub
		return this.cuenta;
	}
	

}
