package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exerc23 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = ler.nextInt();

			if (vetorA[i] % 2 != 0) {
				break;
			}
		}
	}
}
