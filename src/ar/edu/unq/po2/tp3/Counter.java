package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numeros;
	
	public Counter(){
		
		this.numeros = new ArrayList<Integer>();
	}
	
	public void agregarNumero(Integer numero) {
		numeros.add(numero);
	}
	
	public Integer cantidadDePares() {
		
		Integer pares = 0;
		
		for(Integer i = 0; this.numeros.size()> i; i++) {
			
			if(numeros.get(i)%2 == 0) {
				pares++;
			}
		}
		return pares;
	}
	
	public Integer cantidadDeImpares() {
		
		Integer impares = 0;
		
		for(Integer i = 0; this.numeros.size()> i; i++) {
			
			if(numeros.get(i)%2 != 0) {
				
				impares++;
			}
		}
		return impares;
	}
	
	public Integer cantidadMultiplosDeX(Integer multiplo) {
		
		Integer multiplos = 0;
		
		for(Integer i = 0; this.numeros.size()> i; i++) {
			
			if(numeros.get(i)% multiplo == 0) {
				
				multiplos++;
			}
		}
		return multiplos;
	}

}
