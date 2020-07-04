package ar.edu.unq.po2.tpStateStrategy;

public abstract class EstadoMaquina {
	
	public abstract String getMensaje();

	protected abstract void iniciar(int monedas);

	protected abstract void terminarJuego();

}
