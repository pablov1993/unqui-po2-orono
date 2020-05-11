package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> enteros;
	
	public Multioperador() {
		
		this.enteros = new ArrayList<Integer>();
	}
	
	public void agregarNumero(Integer numero) {
		this.enteros.add(numero);
	}
	
	public Integer sumar() {
		
		Integer suma = 0;
		
		for(Integer i=0;this.enteros.size()>i;i++) {
			
			suma = suma + this.enteros.get(i);
		}
		return suma;
	}

}
