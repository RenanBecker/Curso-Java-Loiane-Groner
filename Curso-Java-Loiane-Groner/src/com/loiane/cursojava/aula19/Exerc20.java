package com.loiane.cursojava.aula19;
import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		double dolar;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a cotação do dolar");
		dolar = ler.nextDouble();
		
		double cotacao[] = new double[20];
		
		for(int i = 0; i < cotacao.length; i++) {
			cotacao[i] = dolar * (i + 1);
			System.out.println("A cotação de " + (i + 1) + " é " + cotacao[i] + " dolares");
		}
	}

}
