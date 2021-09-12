package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("Entre com preço do primeiro produto:");
		numero1 = ler.nextInt();

		System.out.println("Entre com preço do segundo produto:");
		numero2 = ler.nextInt();

		System.out.println("Entre com preço do terceiro produto:");
		numero3 = ler.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("produto 1 é o mais barato: ");
		} else if (numero2 <= numero1 && numero2 <= numero3) {
			System.out.println("produto 2 é o mais barato: ");
		} else if (numero3 <= numero1 && numero3 <= numero2) {
			System.out.println("produto 3 é o mais barato: ");
		}
	}

}
