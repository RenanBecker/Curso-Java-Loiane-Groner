package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		int idade, media, quantidade;
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas");
		quantidade = ler.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Entre com a idade ");
			idade = ler.nextInt();

			soma += idade;
		}
		media = soma/quantidade;
		
		if(media < 25) {
			System.out.println("A turma é jovemzinha");
		}else if (media >= 25 && media < 60) {
			System.out.println("Turma adulta");
		} else {
			System.out.println("Turma da terceira idade");
		}
	}

}
