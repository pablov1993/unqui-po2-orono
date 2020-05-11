package empresa;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private String cuit;
	private ArrayList<Empleado> empleados;
	private ArrayList<ReciboDeHaberes> reciboDeHaberes;
	
	public Empresa(String nombre, String cuit) {
		
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
		this.reciboDeHaberes = new ArrayList<ReciboDeHaberes>();
		
	}
	
	public void contratarEmpleado(Empleado empleado) {
		
		empleados.add(empleado);
	}
	
	public ArrayList<Empleado> getEmpleados() {
		
		return this.empleados;
	}
	
	public Integer totalNeto() {
		
		Integer totalNeto = 0;
		
		for(Empleado empleado : empleados) {
			totalNeto = totalNeto + empleado.sueldoNeto();
		}
		return totalNeto;
		
	}
	
	public Integer totalBruto() {
		
		Integer totalBruto = 0;
		
		for(Empleado empleado : empleados) {
			totalBruto = totalBruto + empleado.sueldoBruto();
		}
		return totalBruto;
	}
	
	public Integer totalRetenciones() {
		
		Integer totalRetenciones = 0;
		
		for(Empleado empleado : empleados) {
			totalRetenciones = totalRetenciones + empleado.retenciones();
		}
		return totalRetenciones;
	}
	
	public void registrarRecibo(ReciboDeHaberes recibo) {
		this.reciboDeHaberes.add(recibo);
	}
	
	public ArrayList<ReciboDeHaberes> getRecibos(){
		return this.reciboDeHaberes;
	}
	
	public void liquidacionDeSueldos() {
		
		for(Empleado emp : empleados) {
			
			emp.generarConceptos();
			this.registrarRecibo(new ReciboDeHaberes(emp.getNombre(), emp.getDireccion(), emp.sueldoBruto(), emp.getSueldoBasico(), emp.getConceptos()));
		}
	}

}
