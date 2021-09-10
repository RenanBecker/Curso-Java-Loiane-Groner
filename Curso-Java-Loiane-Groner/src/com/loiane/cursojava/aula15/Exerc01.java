package com.loiane.cursojava.aula15;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o primeiro número");
		int numero01 = ler.nextInt();

		System.out.println("Entre com o segundo número");
		int numero02 = ler.nextInt();

		if (numero01 > numero02) {
			System.out.println("O número 01 é maior: " + numero01);
		} else {
			System.out.println("O número 02 é maior: " + numero02);
		}

	}

}
