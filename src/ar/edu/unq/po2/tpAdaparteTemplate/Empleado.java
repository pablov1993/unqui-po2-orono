package ar.edu.unq.po2.tpAdaparteTemplate;

public abstract class Empleado {
	
	
	public Empleado() {
		
	}
	
	protected abstract String getNombre();

	public double sueldo() {
		
		return this.calcularSueldo() * 0.87d;
	}

	protected abstract double calcularSueldo();

}
