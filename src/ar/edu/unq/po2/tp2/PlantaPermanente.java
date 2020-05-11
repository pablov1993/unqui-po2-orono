package ar.edu.unq.po2.tp2;

import java.util.ArrayList;

public class PlantaPermanente extends Empleado {
	
	private Integer cantHijos;
	private Integer antiguedad;
	private ArrayList<String> conceptos;

	public PlantaPermanente(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento,
			Integer sueldoBasico, Integer cantHijos, Integer antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
		this.conceptos = new ArrayList<String>();
	}
	
	public Integer salarioFamiliar() {
		return this.cantHijos*150;
	}
	
	public Integer plusConyuge() {		
		
		Integer plus = 0;
		
		if(this.getEstadoCivil()) {
			plus = 150; 
		}
		
		return plus;	
	}
	
	public Integer plusAntiguedad() {
		return this.antiguedad*50;
	}
	
	
	public Integer sueldoBruto() {
		
		return this.getSueldoBasico() + this.salarioFamiliar() + this.plusConyuge() + this.plusAntiguedad();
	}
	
	public Integer aportesObraSocial() {
		return (10 * this.sueldoBruto())/100;
	}
	
	public Integer aportesHijos() {
		return 20 * this.cantHijos;
	}
	
	public Integer aportesJubilatorios(){
		return (15 * this.sueldoBruto())/100;
	}
	
	public Integer retenciones() {
		return this.aportesObraSocial() + this.aportesHijos() + this.aportesJubilatorios();				
	}
	
	public Integer sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public void registrarConceptos(String concepto) {
		this.conceptos.add(concepto);
	}
	
	public void generarConceptos() {
		
		this.registrarConceptos("Sueldo Basico: " + this.getSueldoBasico());
		this.registrarConceptos("Salario Familiar: "+this.salarioFamiliar());
		this.registrarConceptos("Plus Conyuge: " + this.plusConyuge());
		this.registrarConceptos("Plus Antiguedad: " + this.plusAntiguedad());
		this.registrarConceptos("Obra Social: " + this.aportesObraSocial());
		this.registrarConceptos("Jubilacion: " + this.aportesJubilatorios());
		this.registrarConceptos("Hijos: " + this.aportesHijos());
	}
	
	public ArrayList<String> getConceptos(){
		return this.conceptos;
	}
}
