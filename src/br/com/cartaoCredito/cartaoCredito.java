package br.com.cartaoCredito;

public class cartaoCredito {
	//Atributos
	double limite;
	double saldo;
	String nomeCliente;
	
	//Construtor
	public cartaoCredito(double limite, double saldo, String nomeCliente) {
		this.limite = limite;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
	}
	
	//Métodos
	
	public void aumentaLimite() {}
	public void diminuiLimite() {}
	public void realizarCompra()  {}
	public void imprimeFatura() {}
	
}
