package br.com.carro;

public class Carro {
//	1. Crie uma classe que represente um carro, que tenha como caracter�sticas
//	o nome, o peso, a fabricante, a cor e o valor do carro. 
//	Crie tamb�m o m�todo darDesconto() que servir� para diminuir o pre�o do carro e o m�todo pintar(),
//	que ser� respons�vel por mudar a cor do carro. 
//	Crie um carro no seu programa principal, utilize os m�todos criados e mostre na tela o pre�o e 
//	a cor do carro antes e depois da utiliza��o dos m�todos.}

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
