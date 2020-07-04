package ar.edu.unq.po2.tpAdaparteTemplate;

public class Temporario extends Empleado {
	
	private String nombre;
	private double sueldoBasico;
	private double horasTrabajadas;
	private boolean poseeHijos;
	private boolean estaCasado;

	public Temporario(String nombre, double horasTrabajadas, boolean poseeHijos, boolean estaCasado) {
		
		super();
		this.nombre = nombre;
		this.sueldoBasico = 1000d;
		this.horasTrabajadas = horasTrabajadas;
		this.poseeHijos = poseeHijos;
		this.estaCasado = estaCasado;
	}

	public String getNombre() {
		return nombre;
	}


	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public boolean getPoseeHijos() {
		return poseeHijos;
	}

	public boolean getEstaCasado() {
		return estaCasado;
	}


	@Override
	public double calcularSueldo() {
		
		return this.getSueldoBasico() + this.calculoDeHoras() + this.plusFamiliar();
	}

	private double plusFamiliar() {
		double monto = 0d;
		if(this.getPoseeHijos() || this.getEstaCasado()) {
			monto = 100d;
		}
		return monto;
	}

	private double calculoDeHoras() {
	
		return this.getHorasTrabajadas() * 5d;
	}

}
