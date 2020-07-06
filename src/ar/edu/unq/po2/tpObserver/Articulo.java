package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Articulo extends Interesante {
	
	private Interesante titulo;
	private List<Interesante> autores;
	private Interesante filiacion;
	private Interesante lugar;
	private List<Interesante> palabrasClave;

	
	public Articulo(String nombre, Interesante titulo, Interesante filiacion, Interesante lugar) {
		
		super(nombre);
		this.titulo = titulo;
		this.autores = new ArrayList<Interesante>();
		this.filiacion = filiacion;
		this.lugar = lugar;
		this.palabrasClave = new ArrayList<Interesante>();
		this.getSuscriptores().addAll(titulo.getSuscriptores());
		this.getSuscriptores().addAll(filiacion.getSuscriptores());
		this.getSuscriptores().addAll(lugar.getSuscriptores());
		for(Interesante obs : autores) {
			this.getSuscriptores().addAll(obs.getSuscriptores());
		}
		for(Interesante obs : palabrasClave) {
			this.getSuscriptores().addAll(obs.getSuscriptores());
		}
		
		
	}



	@Override
	protected void notificarNuevoArticulo(Interesante articulo) {
		
		for(Interesado obs : this.getSuscriptores()) {
			obs.nuevoArticulo(articulo);
		}
		
	}

}
