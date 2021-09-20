package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int fatorial, resultado;
			
			System.out.println("Digite o numero que deseja calcular o fatorial");
			fatorial = ler.nextInt();
			
			resultado = 1;
			for (int i = fatorial; i > 0; i--) {
				resultado *= i;
				if (i != 1) {
				System.out.print(i + ".");
				} else {
					System.out.println(i);
				}
			}
			System.out.println("Resultado: " + resultado);
	}

}
