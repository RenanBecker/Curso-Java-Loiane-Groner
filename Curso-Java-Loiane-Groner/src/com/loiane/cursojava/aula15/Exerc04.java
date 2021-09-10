package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char letra;

		System.out.println("Digite uma letra");
		letra = ler.next().charAt(0);

		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("vogal");
			break;
		default:
			System.out.println("consoante");
		}

	}
}
