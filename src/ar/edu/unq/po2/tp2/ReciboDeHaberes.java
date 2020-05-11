package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReciboDeHaberes {
	
	private String nombreEmp;
	private String direccionEmp;
	private LocalDate fecha;
	private Integer sueldoBruto;
	private Integer sueldoNeto;
	private ArrayList<String> degloceDeConceptos;
	
	public ReciboDeHaberes(String nombreEmp, String direccionEmp, Integer sueldoBruto, Integer sueldoNeto, ArrayList<String> degloceDeConceptos) {
		
		this.nombreEmp = nombreEmp;
		this.direccionEmp = direccionEmp;
		this.fecha = LocalDate.now();
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.degloceDeConceptos = degloceDeConceptos;
		
	}
	
	public ArrayList<String> getDegloceDeConceptos(){
		return this.degloceDeConceptos;
	}
	
	public String getNombre() {
		return this.nombreEmp;
	}


	public Integer getSueldoBruto() {
		// TODO Auto-generated method stub
		return this.sueldoBruto;
	}
}
