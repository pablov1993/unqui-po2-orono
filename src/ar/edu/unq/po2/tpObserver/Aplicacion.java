package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
	
	private List<Partido> partidos;
	
	public Aplicacion() {
		this.partidos = new ArrayList<Partido>();
	}

	
	public List<Partido> getPartidos() {
		return this.partidos;
	}
	public void registrarPartido(Partido partido) {
		this.getPartidos().add(partido);
		partido.dispararNotificaciones();
		
	}


	public void registrarSuscriptor(Suscriptor servidor, Tematica tematica) {
		tematica.suscribir(servidor);
		
	}
	
	

}
