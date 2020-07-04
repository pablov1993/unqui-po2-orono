package ar.edu.unq.po2.tpStateStrategy;

public class EstadoDosJugadores extends EstadoMaquina {
	
	private Maquina maquina;
	private String mensaje;
	public EstadoDosJugadores(Maquina maquina) {
		
		this.maquina = maquina;
		this.mensaje = "Modo dobles";
	}

	@Override
	public String getMensaje() {
		
		return this.mensaje;
	}

	@Override
	protected void iniciar(int monedas) {
		// TODO Auto-generated method stub

	}

	@Override
	public void terminarJuego() {
		this.maquina.setEstado(new EstadoEnReposo(this.maquina));
		
	}

}
