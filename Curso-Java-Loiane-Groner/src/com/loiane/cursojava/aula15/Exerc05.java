package com.loiane.cursojava.aula15;
import java.util.Scanner;


public class Exerc05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double nota1, nota2, media;
		
		System.out.println("Digite a nota 01");
		nota1 = ler.nextDouble();
		System.out.println("Digite a nota 02");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media < 7) {
			System.out.println("Reprovado");
		} else if (media >= 7 && media <= 9) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Aprovado com distinção");
		}
	}

}
