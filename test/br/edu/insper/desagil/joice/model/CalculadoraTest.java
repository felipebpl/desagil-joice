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
	
}
	