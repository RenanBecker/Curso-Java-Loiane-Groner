package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exerc17 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a idade " + i);
			vetorA[i] = ler.nextInt();
		}

		int qtdMaior35 = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 35) {
				qtdMaior35++;
			}
			}
		
		

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Quantidade maior que 35: " + qtdMaior35);
	}
}
