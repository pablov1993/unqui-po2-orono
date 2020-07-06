package ar.edu.unq.po2.tpTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
class PokerStatusTest {

	private PokerStatus poker;
	
	
	@BeforeEach
	public void setUp() {
		//setUp
		this.poker = new PokerStatus();
	}
	@Test
	void testHayPoker() {
		
		//exercise
		Boolean hayPoker = this.poker.verificar("2p","2p","2p","2p","3p");
		//verify
		assertTrue(hayPoker);
	}

}
