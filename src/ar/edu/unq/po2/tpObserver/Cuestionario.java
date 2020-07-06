package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Cuestionario {
	
	
	private List<String> preguntas;
	private List<String> respuestas;
	
	public Cuestionario() {
		
		this.preguntas = new ArrayList<String>();
		this.respuestas = new ArrayList<String>();
		
	}
	
	public void registrarPreguntaRespuesta(String pregunta, String respuesta) {
		this.preguntas.add(pregunta);
		this.respuestas.add(respuesta);
	}

	public List<String> getPreguntas() {
		// TODO Auto-generated method stub
		return this.preguntas;
	}

	public List<String> getRespuestas() {
		// TODO Auto-generated method stub
		return this.respuestas;
	}

}
