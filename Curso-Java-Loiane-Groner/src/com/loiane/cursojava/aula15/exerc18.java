package com.loiane.cursojava.aula15;
import java.util.Scanner;

public class exerc18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = ler.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
	}

}
