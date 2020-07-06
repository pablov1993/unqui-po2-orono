package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Interesante {
	
	protected List<Interesado> suscriptores;
	protected String nombre;
	
	public Interesante(String nombre) {
		
		this.nombre = nombre;
		this.suscriptores = new ArrayList<Interesado>();
	}
	public  void suscribir(Interesado suscriptor) {
		this.suscriptores.add(suscriptor);
	}
	public List<Interesado> getSuscriptores() {
		// TODO Auto-generated method stub
		return this.suscriptores;
	}

	protected abstract void notificarNuevoArticulo(Interesante articulo);

}
