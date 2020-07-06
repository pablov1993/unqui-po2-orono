package ar.edu.unq.po2.tpObserver;

import java.util.List;

public class Partido {
	
	private String resultado;
	private Tematica deporte;
	private List<Tematica> contrincantes;

	
	public Partido(String resultado, Tematica deporte, List<Tematica> contrincantes) {
		
		this.resultado = resultado;
		this.deporte = deporte;
		this.contrincantes = contrincantes;
	}
	
	public Tematica getDeporte() {
	
		return this.deporte;
	}
	
	public String getResultado() {
		return this.resultado;
	}
	public List<Tematica> getContrincantes(){
		return this.contrincantes;
	}
	public void dispararNotificaciones() {
		this.deporte.notificar(this);
		for(Tematica rival : contrincantes) {
			rival.notificar(this);
		}
		
	}
}
