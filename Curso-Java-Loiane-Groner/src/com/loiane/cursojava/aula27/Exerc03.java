package com.loiane.cursojava.aula27;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno");
		aluno.nome = ler.next();

		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = ler.next();

		System.out.println("Entre com a matricula");
		aluno.matricula = ler.next();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + i);
			aluno.nomeDisciplinas[i] = ler.next();
		}

		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				aluno.notasDisciplinas[i][j] = ler.nextDouble();
			}
		}

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
			}
		}
	}

}
