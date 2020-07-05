package ar.edu.unq.po2.tpStateStrategy;

import java.util.ArrayList;
import java.util.List;

public class CambioVocales implements Encriptador {
	
	private List<String> vocales;
	
	public CambioVocales(){
		
		this.vocales = new ArrayList<String>();
		this.vocales.add("a");
		this.vocales.add("e");
		this.vocales.add("i");
		this.vocales.add("o");
		this.vocales.add("u");
	}

	@Override
	public String encriptar(String mensaje) {
		
		List<String> palabras = new ArrayList<String>();

			
		for(String palabra : mensaje.split(" ")){
			
			palabras.add(this.encriptarVocales(palabra));
		}
		

		
		return String.join(" ", palabras);
	}

	public String encriptarVocales(String palabra) {
		
		List<String> list = new ArrayList<String>();
		
		for(String c : palabra.split("")) {
			
			list.add(this.encriptarSiEsVocal(c));
		}
		return String.join("", list);
	}

	public String encriptarSiEsVocal(String c) {
		
		String p = c;
		if(vocales.contains(c)) {
			 
			p = this.valorPara(c);
		 }
		return p;
	}

	private String valorPara(String c) {
		
		String vocal = "";
		if(vocales.get(vocales.size()-1).equals(c)){
			vocal = vocales.get(0);
		}else {
			vocal = vocales.get(vocales.indexOf(c)+1);
		}
		return vocal;
	}

	@Override
	public String desencriptar(String mensajeEncriptado) {
		List<String> palabras = new ArrayList<String>();

		
		for(String palabra : mensajeEncriptado.split(" ")){
			
			palabras.add(this.desencriptarVocales(palabra));
		}
		

		
		return String.join(" ", palabras);
	}

	private String desencriptarVocales(String palabra) {
		List<String> list = new ArrayList<String>();
		
		for(String c : palabra.split("")) {
			
			list.add(this.desencriptarSiEsVocal(c));
		}
		return String.join("", list);
	}

	private String desencriptarSiEsVocal(String c) {
		String p = c;
		if(vocales.contains(c)) {
			 
			p = this.valorDesencriptadoPara(c);
		 }
		return p;
	}

	private String valorDesencriptadoPara(String c) {
		String vocal = "";
		if(vocales.get(0).equals(c)){
			vocal = vocales.get(vocales.size()-1);
		}else {
			vocal = vocales.get(vocales.indexOf(c)-1);
		}
		return vocal;
	}

}
