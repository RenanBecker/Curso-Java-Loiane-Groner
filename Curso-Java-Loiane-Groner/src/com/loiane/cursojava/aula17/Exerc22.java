package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		int quantidade;
		double soma = 0, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de CDS");
		quantidade = ler.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite o preço do cd " + (i + 1));
			soma  += ler.nextDouble();
			
		}
		media = soma/quantidade;
		System.out.println("Média gasta com cada CD: " + media);
	}

}
