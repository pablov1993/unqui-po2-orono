package ar.edu.unq.po2.tpStateStrategy;

public class EstadoUnJugador extends EstadoMaquina {
	
	private Maquina maquina;
	private String mensaje;
	public EstadoUnJugador(Maquina maquina) {
		
		this.maquina = maquina;
		this.mensaje = "Modo single";
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
