package br.com.elevador;

public class Elevador {
	//Atributos
	private int andarAtual;
	private int andarTotal;
	private int capacidade;
	private int qtdAtual;
	
	//construtor
	public Elevador(int andarTotal, int capacidade){
		this.andarAtual = 0;
		this.andarTotal = andarTotal;
		this.capacidade = capacidade;
		this.qtdAtual = 0;
	}
	
	//M?todos
	
	

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
		System.out.println("=============================");
		System.out.printf("\nO elevador est? no andar: %d\n", this.andarAtual);
		System.out.printf("\n H? %d pessoas no elevador.\n", this.qtdAtual);
		System.out.println("=============================");
	}
	
	public int getAndarTotal() {
		return andarTotal;
	}

	public void setAndarTotal(int andarTotal) {
		this.andarTotal = andarTotal;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}
}
