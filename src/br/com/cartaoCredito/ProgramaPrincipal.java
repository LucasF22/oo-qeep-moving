package br.com.cartaoCredito;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		cartaoCredito credito = new cartaoCredito(500.00, 0.00, "Lucas França");
		
		credito.aumentaLimite(300.00);
		
		credito.diminuiLimite(200.00);
		
		credito.realizarCompra(300.00);
		
		credito.realizarCompra(600.00);
		
		credito.imprimeFatura();
	}

}
