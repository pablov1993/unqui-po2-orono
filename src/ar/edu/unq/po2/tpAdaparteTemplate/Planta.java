package ar.edu.unq.po2.tpAdaparteTemplate;

public class Planta extends Empleado {
	
	private String nombre;
	private Integer cantidadHijos;
	private double sueldoBasico;
	
	public Planta(String nombre, Integer cantidadHijos) {
		
		this.nombre = nombre;
		this.cantidadHijos = cantidadHijos;
		this.sueldoBasico = 3000d;
	}

	@Override
	protected String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	
	public double getSueldoBasico() {
		return this.sueldoBasico;
	}

	@Override
	protected double calcularSueldo() {
		return this.getSueldoBasico() + this.plusFamiliar();
	}

	private double plusFamiliar() {
		// TODO Auto-generated method stub
		return this.getCantidadHijos() * 150d;
	}

	private Integer getCantidadHijos() {
		// TODO Auto-generated method stub
		return this.cantidadHijos;
	}

}
