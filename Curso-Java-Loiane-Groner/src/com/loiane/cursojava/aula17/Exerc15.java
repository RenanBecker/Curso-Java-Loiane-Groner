package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		long fibo, proximo, primeiro = 1, segundo = 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero da fibo");
		fibo = ler.nextLong();
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (long i = 3; i<=fibo; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
		
	}

}
