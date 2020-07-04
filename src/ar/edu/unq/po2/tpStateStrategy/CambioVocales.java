package ar.edu.unq.po2.tpStateStrategy;

import java.util.ArrayList;
import java.util.List;

public class CambioVocales implements Encriptador {

	@Override
	public String encriptar(String mensaje) {
		
		List<String> palabras = new ArrayList<String>();

			
		for(String palabra : mensaje.split(" ")){
			
			palabras.add(this.reemplazarVocales(palabra));
		}
		

		
		return palabras.toString();
	}

	public String reemplazarVocales(String palabra) {
		
		List<String> list = new ArrayList<String>();
		
		for(String c : palabra.split("")) {
			
			list.add(this.remplzarSiEsVocal(c));
		}
		return list.toString();
	}

	public String remplzarSiEsVocal(String c) {
		
		String p = c;
		if(c == "o") {
			 
			p = "a";
		 }
		return p;
	}

	@Override
	public String desencriptar(String mensajeEncriptado) {
		// TODO Auto-generated method stub
		return null;
	}

}
