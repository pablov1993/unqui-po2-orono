package ar.edu.unq.po2.tpStateStrategy;

public class EstadoEnReposo extends EstadoMaquina {
	
	private String mensaje;
	private Maquina maquina;
	
	public EstadoEnReposo(Maquina maquina) {
		
		this.mensaje = "Ingresen fichas";
		this.maquina = maquina;
	}

	@Override
	public String getMensaje() {
		// TODO Auto-generated method stub
		return this.mensaje;
	}

	@Override
	protected void iniciar(int monedas) {

		EstadoMaquina estado = new EstadoUnJugador(this.maquina);
		if(monedas == 2) {
			estado = new EstadoDosJugadores(this.maquina);
		}
		
		this.maquina.setEstado(estado);		
	}

	@Override
	protected void terminarJuego() {
		// TODO Auto-generated method stub
		
	}

}
