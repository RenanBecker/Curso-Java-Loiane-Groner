package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		int base, expoente,resultado;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a base");
		base = ler.nextInt();
		resultado = base;
		System.out.println("Digite o expoente");
		expoente = ler.nextInt();
		
		for (int i = 1; i < expoente; i++) {
			resultado = resultado * base;
		}
		System.out.println(resultado);
	}

}
