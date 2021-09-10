package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char s;
		
		System.out.println("Digite M para Masculino, F para Feminino");
		s = ler.next().charAt(0);
		
		if (s == 'm' || s == 'M') {
			System.out.println("Sexo Masculino");
		} else if (s == 'f' || s == 'F') {
			System.out.println("Sexo Feminino");
		} else {
			System.out.println("Sexo inválido");
		}
			
	
	}

}
//