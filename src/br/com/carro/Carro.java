package br.com.carro;

public class Carro {
//	1. Crie uma classe que represente um carro, que tenha como características
//	o nome, o peso, a fabricante, a cor e o valor do carro. 
//	Crie também o método darDesconto() que servirá para diminuir o preço do carro e o método pintar(),
//	que será responsável por mudar a cor do carro. 
//	Crie um carro no seu programa principal, utilize os métodos criados e mostre na tela o preço e 
//	a cor do carro antes e depois da utilização dos métodos.}

	String nome;
	float peso;
	String fabricante;
	String cor;
	float preco;
	
	
	public Carro(String nome, float peso, String fabricante, String cor, float preco) {
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.preco = preco;
	}

	public void darDesconto(float porcentagem) {
		if (porcentagem > 0 && porcentagem <= 10) {
			this.preco = this.preco * (1 - (porcentagem / 100F));
		}
	}
	public void darDescontoGerente(float porcentagem) {
		if (porcentagem > 0 && porcentagem <= 20) {
			this.preco = this.preco * (1 - (porcentagem / 100F));
		}
	}
	
	public void pintar(String novaCor) {
		this.cor = novaCor;
	}
	
}
