package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite um número");
			numero = ler.nextInt();
			
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O maior número digitado é " + maior);
	}

}
