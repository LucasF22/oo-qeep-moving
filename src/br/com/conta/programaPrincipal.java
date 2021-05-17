package br.com.conta;

public class programaPrincipal {

	public static void main(String[] args) {
		contaBancaria cc = new contaBancaria (12345, 300.00, "Lucas Pinheiro");
	    cc.extrato ();
	    
	    cc.deposito (200.00);
	    
	    cc.extrato ();
	}

}
