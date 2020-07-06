package ar.edu.unq.po2.tpObserver;

public class Participante {
	
	private String nombre;
	
	public Participante(String nombre) {
		this.nombre = nombre;
	}

	public void unirseAPartida(ServidorConcurso servidor) {
		servidor.agregarParticipante(this);
		
	}

	public void arrancaElJuego(Cuestionario cuestionario) {
		// TODO Auto-generated method stub
		
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public void nuevaRespuestaCorrecta(String nombre2, String pregunta) {
		// TODO Auto-generated method stub
		
	}

	public void registrarRespuestaIncorrecta() {
		// TODO Auto-generated method stub
		
	}
	
	

}
