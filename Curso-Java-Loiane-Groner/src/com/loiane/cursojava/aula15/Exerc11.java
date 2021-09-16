package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Bem vindo a calculadora de salário das Organizações Tabajara");
		System.out.println("Digite seu salário atual:");
		double salario = ler.nextDouble();
		double percentual = 0;
		
		if(salario<= 280) { 
			percentual = 20;
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
		}else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		}else if (salario>= 1500) {
			percentual = 5;
		}
		double aumento = salario * (percentual/100);
		double salarioNovo = salario + aumento;	
		
		System.out.println("Salário atual: " + salario);
		System.out.println("Percentual de reajuste: " + percentual);
		System.out.println("Aumento: " + aumento);
		System.out.println("Salario novo: " + salarioNovo);
		
	}

}
