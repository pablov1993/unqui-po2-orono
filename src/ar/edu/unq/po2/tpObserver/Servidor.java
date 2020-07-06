package ar.edu.unq.po2.tpObserver;

public class Servidor implements Suscriptor {
	
	private Aplicacion app;
	
	public Servidor(Aplicacion app) {
		
		this.app = app;
	}

	@Override
	public void nuevoEvento(Partido partido) {
		// TODO Auto-generated method stub

	}

	@Override
	public void suscribirse(Tematica tematica) {
		this.app.registrarSuscriptor(this, tematica);;
		
	}

}
