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
	
	public void aumentaLimite(double aumentoLim) {
		if (aumentoLim > 0) {
			this.limite += aumentoLim;
		System.out.println("Limite aumentado com sucesso!");
		}
	}
	public void diminuiLimite(double diminuiLim) {
		if (diminuiLim > 0 && diminuiLim <= this.limite) {
			this.limite -= diminuiLim;
		System.out.println("Limite reduzido com sucesso!");
		}
	}
	public void realizarCompra(double compraTotal)  {
		double novoSaldo = this.saldo + compraTotal;
		if(novoSaldo <= limite && novoSaldo > 0) {
			this.saldo = novoSaldo;
			System.out.println("Transação Aprovada!");
		}else {
			System.out.println("Transação não Autorizada!");
		}		
	}
	
	public void imprimeFatura() {
		System.out.println("================================");
		System.out.printf("\n %s\n", this.nomeCliente);
		System.out.printf("\n O seu limite é: %.2f\n", this.limite);
		System.out.printf("\n Você já gastou %.2f\n", this.saldo);
		System.out.printf("\n Você ainda pode gastar: %.2f\n", this.limite - this.saldo);
		System.out.println("================================");
	}
	
	
}
