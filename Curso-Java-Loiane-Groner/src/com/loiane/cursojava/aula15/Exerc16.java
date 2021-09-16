package com.loiane.cursojava.aula15;

import java.util.Scanner;
import java.lang.Math;

public class Exerc16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, xMais, xMenos, delta;

		System.out.println("Bem vindo a calculadora de segundo grau");
		System.out.println("Informe as variaveis da fórmula ax2+bx+c=0");
		System.out.println("Informe o valor de A");
		a = ler.nextDouble();

		if (a == 0) { // testa o valor de A, caso seja zero ele encerra
			System.out.println("O valor de A é zero, então não é equação de segundo grau");
			System.out.println("A calculadora sera encerrada");
		} else { // executa o programa caso A != 0
			System.out.println("Informe o valor de B");
			b = ler.nextDouble();
			System.out.println("Informe o valor de C");
			c = ler.nextDouble();

			delta = b * b - ((4 * a) * c); //resolve delta
			xMais = (b * (-1)) + Math.sqrt(delta); 
			xMenos = (b * (-1)) - Math.sqrt(delta);
			if (delta < 0) { //verifica se possui valores de X
				System.out.println("O delta é negativo\nA calculadora sera encerrada");
			} else if (delta == 0) { //verifica se possui somente 1 valor de X
				System.out.println("O delta vale zero então a equação possui apenas um valor de X");
				System.out.println("O valor de X é: " + xMais);
			} else { // equação com dois valores de X
				System.out.println("A equação possui duas raizes reais");
				System.out.println("Os valores são: X' = " + xMais + " X\"= " + xMenos);
			}

		}

	}
}
