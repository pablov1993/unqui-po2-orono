package ar.edu.unq.po2.tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MixtoTest {
	
	private Tierra cultivos;
	private Soja soja;
	private Trigo trigo;
	private List<Tierra> cultivosList;
	private List<Tierra> cultivosMixtos;
	
	@BeforeEach
	public void setUp() {
		
		
		this.cultivosList = new ArrayList<Tierra>();
		this.cultivosMixtos = new ArrayList<Tierra>();
		this.soja = new Soja();
		this.trigo = new Trigo();
		this.cultivosList.add(soja);
		this.cultivosList.add(soja);
		this.cultivosList.add(trigo);
		this.cultivosList.add(trigo);
		this.cultivos = new CultivoMixto(this.cultivosList);
		this.cultivosMixtos.add(cultivos);
		this.cultivosMixtos.add(soja);
		this.cultivosMixtos.add(soja);
		this.cultivosMixtos.add(trigo);
	}

	@Test
	void testPidoGananciaDeCultivoMixtoConCultivosSimples() {
		
		assertEquals(400d,this.cultivos.getGananciaAnual());
	}
	
	@Test
	void testPidoGananciaDeCultivosAunoMixtoConSimplesYmixtos() {
		
		Tierra otrosCultivos = new CultivoMixto(this.cultivosMixtos);
	
		assertEquals(425d,otrosCultivos.getGananciaAnual());
	}

}
