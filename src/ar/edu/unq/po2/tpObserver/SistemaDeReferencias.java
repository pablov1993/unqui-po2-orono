package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeReferencias{
	
	List<Interesante> articulos;
	
	public SistemaDeReferencias() {
		
		this.articulos = new ArrayList<Interesante>();
		
	}
	
	protected List<Interesante> getArticulos() {
		return this.articulos;
	}

	protected void registrarArticulo(Interesante articulo) {
		this.articulos.add(articulo);
		articulo.notificarNuevoArticulo(articulo);
				
	}
	
	protected void registrarSuscriptor(Interesado observador, Interesante obs) {
		
		obs.suscribir(observador);

	}

	protected void notificarNuevoArticulo(Articulo articulo) {
		
		articulo.notificarNuevoArticulo(articulo);
		for(Interesante art : articulos) {
			
			art.notificarNuevoArticulo(articulo);
		}
		
	}

}
