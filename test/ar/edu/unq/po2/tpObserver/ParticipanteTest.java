package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class ParticipanteTest {
	
	public Participante jugador;
	public ServidorConcurso servidor;
	
	
	@BeforeEach
	public void setUp() {
		this.jugador = new Participante("Pablo");
		this.servidor = mock(ServidorConcurso.class);
	}

	@Test
	void testParticipanteSolicitaUnirseAlJuego() {
		
		this.jugador.unirseAPartida(servidor);
		
		verify(servidor).agregarParticipante(jugador);
	}

}
