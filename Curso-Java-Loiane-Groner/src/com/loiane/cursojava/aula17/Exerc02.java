package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		boolean valida = false;
		String nome, senha;
		
		do {
			
			System.out.println("Digite o nome do usuário");
			nome = ler.next();
			
			System.out.println("Digite a senha");
			senha = ler.next();
			
			if (nome.equalsIgnoreCase(senha)) {
				//mantem valida false
				System.out.println("Senha e usuário são iguais");
			} else {
				System.out.println("Senha e usuário válidos");
				valida = true;
				
			}
		}while (!valida);
	}

}
