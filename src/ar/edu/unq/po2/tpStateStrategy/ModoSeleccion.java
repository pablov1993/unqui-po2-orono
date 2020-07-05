package ar.edu.unq.po2.tpStateStrategy;

public class ModoSeleccion extends EstadoReproductor {
	
	private Reproductor reproductor;

	
	public ModoSeleccion(Reproductor reproductor) {
		this.reproductor = reproductor;
	}


	@Override
	protected void reproducirCancion(Ireproducible cancion) {
		cancion.play();
		this.reproductor.setEstado(new Reproduciendo(this.reproductor,cancion));

	}

	@Override
	protected void pausarReproduccion() throws ReproductorException{	
		
		throw new ReproductorException("No puede pausar sin iniciar");

	}


	@Override
	protected void detenerReproduccion() throws ReproductorException {
		
		throw new ReproductorException("No puede detener sin reproducir");
		
	}

}
