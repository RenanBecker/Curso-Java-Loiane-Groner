package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		boolean validaNota = false;
		
		do {
			System.out.println("Digite uma nota:");
			double nota = ler.nextDouble();
			
			if(nota >=0 && nota <= 10) {
				validaNota = true;
				System.out.println("Nota:" + nota);
			} else {
				System.out.println("Nota inválida, digite novamente");
			}
			
		} while (!validaNota);
		
	}

}
