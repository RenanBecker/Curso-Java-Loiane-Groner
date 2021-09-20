package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Entre com um número");
		numero = ler.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i< numero; i++) {
			if (numero % i == 0){
				System.out.println("Não é primo pois é divisivel por " + i);
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("É número primo");
		}
	}

}
