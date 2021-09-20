package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem vindo a calculadora de Tabuada");
		System.out.println("Digite o número que deseja gerar a tabuada");
		numero = ler.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
	}

}
