package br.com.carro;

import java.util.Scanner;

public class programaPrincipal {

	public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			Carro gol = new Carro("Gol", 1200, "Volkswagen", "Preto", 50000);
			Carro polo = new Carro("Polo", 1350, "Volkswagen", "Prata", 70000);
			
			System.out.printf("\nA cor do %s é %s", gol.nome, gol.cor);
			System.out.printf("\nA cor do %s é %s", polo.nome, polo.cor);
			
			gol.pintar("Azul");
			polo.pintar("Vermelho");
			
			System.out.printf("\nA cor do %s é %s", gol.nome, gol.cor);
			System.out.printf("\nA cor do %s é %s", polo.nome, polo.cor);
			
			System.out.println("\n-------\n");
			
			System.out.printf("\nA cor do %s é %s", gol.nome, gol.cor);
			System.out.printf("\nA cor do %s é %s", polo.nome, polo.cor);
			
			System.out.println("\nQual valor você quer dar de desconto?");
			float desconto = teclado.nextFloat();
			gol.darDesconto(desconto);
			polo.darDescontoGerente(desconto);
			
			System.out.printf("\nA cor do %s é %s", gol.nome, gol.cor);
			System.out.printf("\nA cor do %s é %s", polo.nome, polo.cor);
			
			teclado.close();
			

	}

}
