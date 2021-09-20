package com.loiane.cursojava.aula17;
import java.util.Scanner;
import java.lang.Math;

public class Exerc24 {
	public static void main(String[] args) {
		double preco;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Panificadora Pão Sonâmbulo");
		System.out.println("Digite o preço do pão");
		preco = ler.nextDouble();
		
		
		for(int i = 1; i <= 50;i++) {
			System.out.print(i + " - R$ " );
			System.out.printf("%.2f",preco * i);
			System.out.println("");
		}
	}

}
