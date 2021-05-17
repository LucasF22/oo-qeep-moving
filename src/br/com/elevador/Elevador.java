package br.com.elevador;

public class Elevador {
	//Atributos
	int andarAtual;
	int andarTotal;
	int capacidade;
	int qtdAtual;
	
	//construtor
	public Elevador(int andarTotal, int capacidade){
		this.andarAtual = 0;
		this.andarTotal = andarTotal;
		this.capacidade = capacidade;
		this.qtdAtual = 0;
	}
	
	//Métodos
	

	public void entra() {
		if (qtdAtual < capacidade) {
			qtdAtual++;
		}
	}
	
	public void sai() {
		if (qtdAtual > 0) {
			qtdAtual--;
		}
	}
	
	public void sobe() {
		if (andarAtual < andarTotal) {
			andarAtual++;
		}
	}
	
	public void desce() {
		if (andarAtual > 0) {
			andarAtual--;
		}
	}
	
	public void status() {
		System.out.println("==========");
		System.out.printf("\nO elevador está no andar: %d\n", this.andarAtual);
		System.out.printf("\n Há %d pessoas no elevador.\n", this.qtdAtual);
		System.out.println("==========");
	}
	
}
