package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

class ServidorConcursoTest {
	
	private ServidorConcurso servidor;
	private Participante participante;
	private Cuestionario cuestionario;
	private List<String> preguntas;
	private List<String> respuestas;
	
	
	@BeforeEach
	public void setUp() {
		
		this.cuestionario = mock(Cuestionario.class);
		this.servidor = new ServidorConcurso(cuestionario);
		this.participante = mock(Participante.class);
		this.preguntas = new ArrayList<String>();
		this.respuestas = new ArrayList<String>();
		this.preguntas.add("¿Que dia es?");
		this.preguntas.add("¿Que color es?");
		this.preguntas.add("¿Que año es?");
		this.preguntas.add("¿Que mes es?");
		this.preguntas.add("¿Que hora es?");
		this.respuestas.add("Hoy");
		this.respuestas.add("Verde");
		this.respuestas.add("2020");
		this.respuestas.add("Julio");
		this.respuestas.add("Hora");
		
		
	}
	

	@Test
	void testServidorTieneListaDeParticipantes() {
		
		assertTrue(servidor.getParticipantes().isEmpty());
		
		this.servidor.agregarParticipante(participante);
		
		assertFalse(servidor.getParticipantes().isEmpty());
	}
	
	@Test
	void testServidorEmpiezaLaPartidaCuandoTiene5Jugadores() {
		
		
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		
		verify(participante,times(5)).arrancaElJuego(cuestionario);
	}
	
	@Test
	void testServidorRecibeRespuestaLaVerificaYEnviaRespuesta() {
		
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		servidor.agregarParticipante(participante);
		
		when(cuestionario.getPreguntas()).thenReturn(this.preguntas);
		when(cuestionario.getRespuestas()).thenReturn(this.respuestas);
		when(participante.getNombre()).thenReturn("Pablo");
		
		String primeraPregunta = this.preguntas.get(0);
		this.servidor.recibirRespuestas(participante,primeraPregunta,"Hoy");
		
		 verify(participante,times(0)).registrarRespuestaIncorrecta();
		 verify(participante,times(5)).nuevaRespuestaCorrecta("Pablo",primeraPregunta);
	}
	
	@Test
	void testTrueSiLaRespuestaEsCorrecta() {
		
		when(cuestionario.getPreguntas()).thenReturn(this.preguntas);
		when(cuestionario.getRespuestas()).thenReturn(this.respuestas);
		when(participante.getNombre()).thenReturn("Pablo");
		
		assertTrue(this.servidor.esCorrecta(0,"Hoy"));
	}

}
