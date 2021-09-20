package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		double soma = 0;
		double media, nota;
		int notas;
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o número de notas:");
		notas = ler.nextInt();

		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota " + (i + 1));
			nota = ler.nextDouble();

			soma += nota;
		}

		media = soma / notas;

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
