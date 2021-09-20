package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b,soma = 0;
		
		System.out.println("Digite o numero A");
		a = ler.nextInt();
		System.out.println("Digite o numero B");
		b = ler.nextInt();
		
		for(int i = a + 1; i < b; i++) {
			soma +=i;
			System.out.println(i);
			
		}
		System.out.println(soma);

	}

}
