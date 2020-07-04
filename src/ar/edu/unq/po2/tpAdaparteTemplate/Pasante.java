package ar.edu.unq.po2.tpAdaparteTemplate;

public class Pasante extends Empleado {
	
	private String nombre;
	private double horas;

	public Pasante(String nombre, double horas) {
		
		this.nombre = nombre;
		this.horas = horas;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	
	public double getHoras() {
		return this.horas;
	}
	
	

	@Override
	protected double calcularSueldo() {
		
		return this.getHoras() * 40d;
	}

}
