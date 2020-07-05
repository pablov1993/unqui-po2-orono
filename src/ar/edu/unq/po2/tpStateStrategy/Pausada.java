package ar.edu.unq.po2.tpStateStrategy;

public class Pausada extends EstadoReproductor {
	
	private Reproductor reproductor;
	private Ireproducible cancion;
	public Pausada(Reproductor reproductor, Ireproducible cancion) {

		this.reproductor = reproductor;
		this.cancion = cancion;
	}

	@Override
	protected void reproducirCancion(Ireproducible cancion) throws ReproductorException {
		
		throw new ReproductorException("Para reproducir presione pausa");
	}

	@Override
	protected void pausarReproduccion() {
		
		this.cancion.play();
		this.reproductor.setEstado(new Reproduciendo(this.reproductor,this.cancion));

	}

	@Override
	protected void detenerReproduccion() throws ReproductorException {
		this.reproductor.setEstado(new ModoSeleccion(this.reproductor));		
	}

}
