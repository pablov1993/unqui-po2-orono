package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Tematica {
	
	private List<Suscriptor> suscriptores;
	public Tematica() {
		
		this.suscriptores = new ArrayList<Suscriptor>();
		
	}
	
	public List<Suscriptor> getSuscriptores(){
		return this.suscriptores;
	}

	protected void suscribir(Suscriptor suscriptor) {
		this.suscriptores.add(suscriptor);
	}

	protected abstract void notificar(Partido partido);

}
