package ar.edu.unq.po2.tpStateStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CambioLetras implements Encriptador {

	private String abecedario;
	
	public CambioLetras() {
		
		this.abecedario = " abcdefghijklmnopqrstuvwxyz";
	}
	@Override
	public String encriptar(String mensaje) {
		
		String mensajeMin = mensaje.toLowerCase();		
		String mensajeEncriptado = "";		
		
		List<String> mensajeList = Arrays.asList(mensajeMin.split(""));
		
		int contador = 0;
		for(String letra : mensajeList) {
			mensajeEncriptado = mensajeEncriptado.concat(this.cambiarLetra(letra));
			contador ++;
			if(mensajeList.size() != contador) {
				mensajeEncriptado = mensajeEncriptado + ",";
			}
			
	
		}
		return mensajeEncriptado;
	}

	private String cambiarLetra(String letra) {
		
		String[] abc = this.abecedario.split("");
		
		List<String> list = Arrays.asList(abc);
		
		
		return Integer.toString(list.indexOf(letra));
	}
	@Override
	public String desencriptar(String mensaje) {
		
		String mensajeMin = mensaje.toLowerCase();		
		String mensajeDesencriptado = "";		
		
		List<String> mensajeList = Arrays.asList(mensajeMin.split(","));
		
		
		for(String letra : mensajeList) {
			mensajeDesencriptado = mensajeDesencriptado.concat(this.desencriptarLetra(letra));	
		}
		return mensajeDesencriptado;
	}
	private String desencriptarLetra(String letra) {
		
		String[] abc = this.abecedario.split("");
		
		List<String> list = Arrays.asList(abc);
		
		
		return list.get(Integer.parseInt(letra));
	}

}
