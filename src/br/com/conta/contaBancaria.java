package br.com.conta;

public class contaBancaria {
 int numero;
 double saldo;
 String nomeCompleto;
 
 //Construtor:
 public contaBancaria (int numero, double saldo, String nomeCompleto) {
	this.numero = numero;
	this.saldo = saldo;
	this.nomeCompleto = nomeCompleto;
 };
 //metodos
 public boolean saqueConta(float valor) {
	 if (this.saldo >= valor && valor > 0){
		 this.saldo -= valor;
		 return true;
	 }
	 return false;
 }
 public double deposito (double addValor)
 {
   return this.saldo = saldo + addValor;
 }
 public void extrato(){
   System.out.println("========================");
   System.out.printf (" Nº da conta: %d", numero);
   System.out.printf ("\n Nome: %s", nomeCompleto);
   System.out.printf ("\n Saldo R$ %.2f\n", saldo);
   System.out.println("========================");
 }
  
 
}
