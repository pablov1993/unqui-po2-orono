package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	
	public ArrayList<Cobrable> registrados;
	
	public Caja() {
		
		this.registrados = new ArrayList<Cobrable>();
		
	}
	
	public void registrarProducto(Cobrable cobrable) {
		
		this.registrados.add(cobrable);
		cobrable.concretarCompra();
		
	}
	
	public ArrayList<Cobrable> getMontoAPagar(){
		return this.registrados;
	}
	
	public Double total() {
		
		Double total = 0d;
		for(Cobrable cobrable :registrados) {
			
			total = total + cobrable.getPrecio();
		}
		return total;
	}

}
