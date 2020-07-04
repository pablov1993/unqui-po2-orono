package ar.edu.unq.po2.tpStateStrategy;

public class Maquina {
	
	private EstadoMaquina estado;
	
	
	public Maquina() {
		
		this.estado = new EstadoEnReposo(this);
		
	}
	
	public String mensaje() {
		return this.estado.getMensaje();		
	}

	public void inicio(int monedas) {
		if(this.monedasCorrectas(monedas)) {
			
			this.estado.iniciar(monedas);
		}
		
	}

	private boolean monedasCorrectas(int monedas) {
	
		return monedas == 1 || monedas == 2;
	}

	public void setEstado(EstadoMaquina estado) {
		this.estado = estado;
	}
	
	public void finalizarJuego() {
		this.estado.terminarJuego();
	}
}
