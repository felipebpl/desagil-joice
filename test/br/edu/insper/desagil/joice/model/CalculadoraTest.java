package br.edu.insper.desagil.joice.model;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;



class CalculadoraTest {



	@Test
	void testeCobre() {
		CalculadoraCFC Cobre = new CalculadoraCFC(63.55, 0.128);
		double densidade = Cobre.calcula(Cobre.getPeso(), Cobre.getRaio());
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(8.89,densidadeDuasCasas);
	}
	
	@Test
	void testeOuro() {
		CalculadoraCFC Ouro = new CalculadoraCFC(196.97, 0.144);
		double densidade = Ouro.calcula(Ouro.getPeso(), Ouro.getRaio());
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(19.36,densidadeDuasCasas);
	}
	
	@Test
	void testePrata() {
		CalculadoraCFC Prata = new CalculadoraCFC(107.87, 0.144);
		double densidade = Prata.calcula(Prata.getPeso(), Prata.getRaio());
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(10.60,densidadeDuasCasas);
	}
	
	@Test
	void testeNiobio() {
		CalculadoraCCC Niobio = new CalculadoraCCC(92.91, 0.143);
		double densidade = Niobio.calcula(Niobio.getPeso(), Niobio.getRaio());
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(8.57,densidadeDuasCasas);
	}

	@Test
	void testeTungstenio() {
		CalculadoraCCC Tungstenio = new CalculadoraCCC(183.84, 0.137);
		double densidade = Tungstenio.calcula(Tungstenio.getPeso(), Tungstenio.getRaio());
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(19.28,densidadeDuasCasas);
	}

	@Test
	void testeLitio() {
		CalculadoraCCC Litio = new CalculadoraCCC(6.94, 0.152);
		double densidade = Litio.calcula(Litio.getPeso(), Litio.getRaio());
		double densidadeDuasCasas = Math.round(densidade*100)/100.00;
		assertEquals(0.53,densidadeDuasCasas);
	}
	
}
	