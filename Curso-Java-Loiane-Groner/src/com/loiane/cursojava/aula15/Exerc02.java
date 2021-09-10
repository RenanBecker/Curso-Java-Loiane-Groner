package com.loiane.cursojava.aula15;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.println("Número é positivo");
		} else {
			System.out.println("Número é negativo");
		}

	}

}
