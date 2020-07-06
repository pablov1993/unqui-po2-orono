package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class ServidorConcurso {
	
	private Cuestionario cuestionario;
	private List<Participante> jugadores;
	
	public ServidorConcurso(Cuestionario cuestionario) {
		this.cuestionario = cuestionario;
		this.jugadores = new ArrayList<Participante>();
	}

	public List<Participante> getParticipantes() {
		// TODO Auto-generated method stub
		return this.jugadores;
	}

	public void agregarParticipante(Participante participante) {
		
		if(this.getParticipantes().size()< 5) {
			this.getParticipantes().add(participante);
			this.consultarArranqueJuego();
		}
		
		
	}
	
	private void consultarArranqueJuego() {
		if(this.getParticipantes().size() == 5) {
			this.arrancarJuego();
		}
		
	}

	private void arrancarJuego() {
		for(Participante jugador : this.getParticipantes()) {
			jugador.arrancaElJuego(this.getCuestionario());
		}
		
	}

	public Cuestionario getCuestionario(){
		return this.cuestionario;
	}

	public void recibirRespuestas(Participante jugador, String pregunta, String respuesta) {
		
		int indicePregunta = this.getPreguntas().indexOf(pregunta);
		if(this.esCorrecta(indicePregunta,respuesta)) {
			this.notificarRespuestaCorrecta(jugador.getNombre(),pregunta);
		}else {
			this.notificarRespuestaIncorrecta(jugador);
		}
		
	}
	
	public void notificarRespuestaIncorrecta(Participante jugador) {
		// TODO Auto-generated method stub
		jugador.registrarRespuestaIncorrecta();
	}

	public void notificarRespuestaCorrecta(String nombre,String pregunta) {
		for(Participante jugador : this.getParticipantes()) {
			jugador.nuevaRespuestaCorrecta(nombre,pregunta);
		}
		
	}

	public boolean esCorrecta(int indicePregunta, String respuesta) {
		// TODO Auto-generated method stub
		return this.getRespuestas().get(indicePregunta).equals(respuesta);
	}

	public List<String> getPreguntas(){
		return this.cuestionario.getPreguntas();
	}
	
	public List<String> getRespuestas(){
		return this.cuestionario.getRespuestas();
	}

}
