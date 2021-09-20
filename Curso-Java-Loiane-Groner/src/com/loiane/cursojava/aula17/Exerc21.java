package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		int turmas, alunos = 0, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de turmas");
		turmas = ler.nextInt();
		
		for (int i = 0; i < turmas; i++) {
			System.out.println("Digite a quantidade de alunos da turma " + (i + 1) );
			alunos += ler.nextInt();
		}
		media = alunos/turmas;
		System.out.println("A média de alunos por turma é " + media);
	}

}
