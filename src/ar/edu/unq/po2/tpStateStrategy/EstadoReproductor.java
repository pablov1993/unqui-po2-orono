package ar.edu.unq.po2.tpStateStrategy;

public abstract class EstadoReproductor {

	protected abstract void reproducirCancion(Ireproducible cancion) throws ReproductorException;

	protected abstract void pausarReproduccion() throws ReproductorException;

	protected abstract void detenerReproduccion() throws ReproductorException;	
	

}
