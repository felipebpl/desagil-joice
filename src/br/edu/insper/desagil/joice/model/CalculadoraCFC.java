package br.edu.insper.desagil.joice.model;



public class CalculadoraCFC extends Calculadora{
	private double avogadro;
	private double raio;
	private double peso;
	private int quantidade;
	
	public CalculadoraCFC(double peso, double raio) {
		super("CFC");
		this.avogadro = 6.023*Math.pow(10, 23);
		this.raio = raio;
		this.peso = peso;
		this.quantidade = 4;
	}
	
	@ Override
	public double calcula (double peso, double raio) {
		double prevolume = 2*raio*Math.pow(10, -7)*(Math.pow(2, 0.5));
		double volume = Math.pow(prevolume, 3);
		double densidade = (this.quantidade*this.peso)/(this.avogadro*volume);
			
		return densidade;
	}
	
	public double getAvogadro() {
		return this.avogadro;
	}
	
	
	
	public double getRaio() {
		return this.raio;
	}
	
	
	
	public double getPeso() {
		return this.peso;
	}
	
	
	
	public int getQuantidade() {
		return this.quantidade;
	}
	


}


