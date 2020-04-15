package empresa;

import java.util.ArrayList;

public class PlantaTemporaria extends Empleado {
	
	private String finContrato;
	private Integer horasExtras;
	private ArrayList<String> conceptos;
	
	public PlantaTemporaria(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento,
			Integer sueldoBasico, String finContrato, Integer horasExtras) {
		
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.finContrato = finContrato;
		this.horasExtras = horasExtras;
		this.conceptos = new ArrayList<String>();
		
	}
	
	public Integer plusHsExtras() {
		return 40 * this.horasExtras;
	}
	
	public Integer sueldoBruto() {
		return this.getSueldoBasico() + this.plusHsExtras();
	}
	
	public Integer aportesObraSocial() {
		return (10 * this.sueldoBruto())/100;
	}
	
	public Integer aportesEdad() {
		Integer aporte = 0;
		
		if(this.edad()>50) {
			
			aporte = 50;
		}
		
		return aporte;
	}
	
	public Integer aportesJubilatorios() {		
		Integer hsExtras = this.horasExtras * 5;
		return ((10 * this.sueldoBruto())/100)+ hsExtras;
	}
	
	public Integer retenciones() {
		return this.aportesObraSocial() + this.aportesEdad() + this.aportesJubilatorios();
	}
	
	public Integer sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public void registrarConceptos(String concepto) {
		this.conceptos.add(concepto);
	}
	
	public void generarConceptos() {
		
		this.registrarConceptos("Sueldo Basico: " + this.getSueldoBasico());
		this.registrarConceptos("Plus hs Extras: " + this.plusHsExtras());
		this.registrarConceptos("Obra Social: " + this.aportesObraSocial());
		this.registrarConceptos("Jubilacion: " + this.aportesJubilatorios());
		this.registrarConceptos("Aporte Edad: " + this.aportesEdad());
	}
	
	public ArrayList<String> getConceptos(){
		return this.conceptos;
	}

}
