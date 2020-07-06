package ar.edu.unq.po2.tpTDD;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	private List<String> mano;
	
	public PokerStatus() {
		this.mano = new ArrayList<String>();
	}
	
	public Boolean verificar(String string, String string2, String string3, String string4, String string5) {
		this.mano.add(string);
		this.mano.add(string2);
		this.mano.add(string3);
		this.mano.add(string4);
		this.mano.add(string5);
		
		return this.hayPoker();
	}

	private Boolean hayPoker() {
		
		List<String> sinRepetidos = this.mano.stream().distinct().collect(Collectors.toList());
		return sinRepetidos.size() == 2;
	}
	



}
