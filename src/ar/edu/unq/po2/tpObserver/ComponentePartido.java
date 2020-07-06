package ar.edu.unq.po2.tpObserver;

public class ComponentePartido extends Tematica {
	
	private String nombre;
	
	public ComponentePartido(String nombre) {
		
		this.nombre = nombre;
	}

	@Override
	protected void notificar(Partido partido) {
		
		for(Suscriptor suscriptor : this.getSuscriptores()) {
			suscriptor.nuevoEvento(partido);
		}

	}

}
