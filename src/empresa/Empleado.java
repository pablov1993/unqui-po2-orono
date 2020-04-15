package empresa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Empleado {
	
	private String nombre;
	private String direccion;
	private Boolean estadoCivil;
	private String fechaNacimiento;
	private Integer sueldoBasico;
	
	static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


	public Empleado(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento, Integer sueldoBasico) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil= estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	
	public Integer edad() {
		
		LocalDate nacimiento = LocalDate.parse(this.fechaNacimiento,fmt);
		LocalDate hoy = LocalDate.now();
		Period edad = Period.between(nacimiento,hoy);
		return edad.getYears();
	}
	
	public String getNacimiento() {
		return this.fechaNacimiento;
	}
	
	public Boolean getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public Integer getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public Integer sueldoBruto() {
		return null;
	}


	public Integer sueldoNeto() {
		// TODO Auto-generated method stub
		return null;
	}


	public Integer retenciones() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}


	public String getDireccion() {
		// TODO Auto-generated method stub
		return this.direccion;
	}


	public void generarConceptos() {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<String> getConceptos(){
		return null;
	}
	
	
}
