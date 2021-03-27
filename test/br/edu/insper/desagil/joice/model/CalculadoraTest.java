package br.edu.insper.desagil.joice.model;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;



class CalculadoraTest {



	@Test
	void testeCobre() {
		CalculadoraCFC Cobre = new CalculadoraCFC();
		double densidade = Cobre.calcula(63.55, 0.128);
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(8.89,densidadeDuasCasas);
	}
	
	@Test
	void testeOuro() {
		CalculadoraCFC Ouro = new CalculadoraCFC();
		double densidade = Ouro.calcula(196.97, 0.144);
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(19.36,densidadeDuasCasas);
	}
	
	@Test
	void testePrata() {
		CalculadoraCFC Prata = new CalculadoraCFC();
		double densidade = Prata.calcula(107.87, 0.144);
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(10.60,densidadeDuasCasas);
	}
	
	@Test
	void testeNiobio() {
		CalculadoraCCC Niobio = new CalculadoraCCC();
		double densidade = Niobio.calcula(92.91, 0.143);
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(8.57,densidadeDuasCasas);
	}

	@Test
	void testeTungstenio() {
		CalculadoraCCC Tungstenio = new CalculadoraCCC();
		double densidade = Tungstenio.calcula(183.84, 0.137);
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(19.28,densidadeDuasCasas);
	}

	@Test
	void testeLitio() {
		CalculadoraCCC Litio = new CalculadoraCCC();
		double densidade = Litio.calcula(6.94, 0.152);
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(0.53,densidadeDuasCasas);
	}
	
}
	