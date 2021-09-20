package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = 0;
		
		for (int i=0; i<5; i++) {
		System.out.println("Digite um número");
		numero = numero + ler.nextInt();
		
		}
		System.out.println("A soma é " + numero);
		System.out.println("A média é " + (numero/5));
	}

}
