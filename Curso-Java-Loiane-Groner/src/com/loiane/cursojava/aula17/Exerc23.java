package com.loiane.cursojava.aula17;

public class Exerc23 {

	public static void main(String[] args) {
		double preco = 1.99;
		
		System.out.println("Lojas Quase Dois - Tabela de Preços");
		for(int i = 1; i <= 50;i++) {
			System.out.println(i + " - R$ " + (preco * i) );
		}
	}

}
