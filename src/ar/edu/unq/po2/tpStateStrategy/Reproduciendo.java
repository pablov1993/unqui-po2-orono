package ar.edu.unq.po2.tpStateStrategy;

public class Reproduciendo extends EstadoReproductor {
	
	private Ireproducible cancion;
	private Reproductor reproductor;
	
	public Reproduciendo(Reproductor reproductor, Ireproducible cancion) {
		
		this.cancion = cancion;
		this.reproductor = reproductor;}

	@Override
	protected void reproducirCancion(Ireproducible cancion) throws ReproductorException {
		throw new ReproductorException("Ya esta en reproduccion");
		
	}

	@Override
	protected void pausarReproduccion() {
		this.cancion.pause();
		this.reproductor.setEstado(new Pausada(this.reproductor, this.cancion));
	}

	@Override
	protected void detenerReproduccion() throws ReproductorException {
		this.reproductor.setEstado(new ModoSeleccion(this.reproductor));
		
	}
	
	

}
