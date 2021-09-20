package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o numero A");
		a = ler.nextInt();
		System.out.println("Digite o numero B");
		b = ler.nextInt();
		
		for(int i = a + 1; i < b; i++) {
			System.out.println(i);
		}
	}

}
