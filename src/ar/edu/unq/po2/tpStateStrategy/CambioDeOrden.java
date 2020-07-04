package ar.edu.unq.po2.tpStateStrategy;

import java.util.ArrayList;
import java.util.List;

public class CambioDeOrden implements Encriptador {
	
	private List<String> caracteres;
	
	public CambioDeOrden() {
		
		this.caracteres = new ArrayList<String>();		
	}
	
	public List<String> getCaracteres(){
		
		return this.caracteres;
	}

	@Override
	public String encriptar(String mensaje) {
		
		
		return new StringBuilder(mensaje).reverse().toString();
		
	}

	@Override
	public String desencriptar(String mensaje) {

		return new StringBuilder(mensaje).reverse().toString();
	}

}
