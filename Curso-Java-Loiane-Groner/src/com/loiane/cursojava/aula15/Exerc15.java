package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		int ladoA, ladoB, ladoC;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o lado 1 do triangulo:");
		ladoA = ler.nextInt();
		System.out.println("Digite o lado 2 do triangulo");
		ladoB = ler.nextInt();
		System.out.println("Digite o lado 3 do triangulo");
		ladoC = ler.nextInt();

		if (ladoA + ladoB > ladoC || ladoB + ladoC > ladoA || ladoA + ladoC > ladoB) {
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("O triangulo é Equilátero");
			} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
				System.out.println("O triangulo é Isóceles");
			} else {
				System.out.println("O triangulo é Escaleno");
			}
		} else {
			System.out.println("Não pode ser um triangulo");
		}
	}

}
