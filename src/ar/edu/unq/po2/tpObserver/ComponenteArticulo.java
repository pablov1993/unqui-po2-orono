package ar.edu.unq.po2.tpObserver;

public class ComponenteArticulo extends Interesante {
	
	public String nombre;
	public ComponenteArticulo(String nombre) {
		
		super(nombre);
	}


	@Override
	protected void notificarNuevoArticulo(Interesante articulo) {
		// TODO Auto-generated method stub

	}

}
