package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o ano");
		
		int ano = ler.nextInt();
		 if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
	            System.out.println("O ano informado é bissexto");
	        } else {
	            System.out.println("O ano informado não é bissexto");
	        }
	}

}
