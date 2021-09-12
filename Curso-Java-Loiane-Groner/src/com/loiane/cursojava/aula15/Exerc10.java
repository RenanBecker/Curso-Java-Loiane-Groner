package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o turno\nM-Matutino\nV-Vespertino\nN-Noturno");
		String turno = ler.next();

		switch (turno) {
		case "M":
			System.out.println("Bom dia");
			break;
		case "V":
			System.out.println("Boa tarde");
			break;
		case "N":
			System.out.println("Boa noite");
			break;
		default:
			System.out.println("Comando inválido");
		}
	}
}
