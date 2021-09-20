package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, par = 0, impar = 0;

		System.out.println("Digite um número");
		numero = ler.nextInt();

		for (int i = 0; i < numero-1; i++) {//soma a quantidade de numeros pares
			if (i % 2 == 0) {				//considerando o proprio zero
				par++;						//por isso o -1 no numero
			}
		}
		for (int i = 0; i <= numero; i++) {
			if ((i % 2) != 0) {
				impar++;
			}
		}
		System.out.println("Pares: " + par);
		System.out.println("Impares: " + impar);

	}
}
