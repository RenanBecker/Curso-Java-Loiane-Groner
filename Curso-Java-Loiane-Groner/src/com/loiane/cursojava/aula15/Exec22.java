package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exec22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pesoMorango, pesoMaca, pesoTotal, valorTotal, precoMorango, precoMaca;
		
		System.out.println("Digite a quantidade de morango em Kg:");
		pesoMorango = ler.nextDouble();
		System.out.println("Digite a quantidade de maça em kg");
		pesoMaca = ler.nextDouble();

		pesoTotal = pesoMorango + pesoMaca;

		if (pesoMorango > 5) {
			precoMorango = 2.2;
		} else {
			precoMorango = 2.5;
		}

		if (pesoMaca > 5) {
			precoMaca = 1.5;
		} else {
			precoMaca = 1.8;
		}

		valorTotal = (pesoMorango * precoMorango) + (pesoMaca * precoMaca);

		if (valorTotal > 25 || pesoTotal > 8) {
			valorTotal = valorTotal - (valorTotal * 0.1);
			System.out.println("O valor a ser pago é: " + valorTotal);
		} else {
			System.out.println("O valor a ser pago é: " + valorTotal);
		}

	}

}
