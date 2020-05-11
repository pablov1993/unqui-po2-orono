package ar.edu.unq.po2.tp2;

import java.util.ArrayList;

public class Contratado extends Empleado {

	private Integer nroContrato;
	private String medioDePaog;
	private ArrayList<String> conceptos;
	
	public Contratado(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento,
			Integer sueldoBasico, Integer nroContrato, String medioDePago) {
		// TODO Auto-generated constructor stub
		
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.nroContrato = nroContrato;
		this.medioDePaog = medioDePago;
		this.conceptos = new ArrayList<String>();
	}
	
	public Integer retenciones() {
		return 50;
	}
	
	public Integer sueldoBruto() {
		return this.getSueldoBasico();
	}
	
	public Integer sueloNeto() {
		return this.sueldoBruto()-this.retenciones();
	}
	
	public void registrarConceptos(String concepto) {
		this.conceptos.add(concepto);
	}
	
	public void generarConceptos() {
		
		this.registrarConceptos("Sueldo Basico: " + this.getSueldoBasico());
		this.registrarConceptos("Retenciones: " + this.retenciones());
		
	}
	
	public ArrayList<String> getConceptos(){
		return this.conceptos;
	}

}
