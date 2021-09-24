package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exerc18 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a idade " + i);
			vetorA[i] = ler.nextInt();
		}

		int menor = vetorA[0];
        int indexMenor = 0;
        int maior = vetorA[0];
        int indexMaior = 0;
        for (int i=1; i<vetorA.length; i++){
            if (vetorA[i] > maior){
                maior = vetorA[i];
                indexMaior = i;
            } else if (vetorA[i] < menor){
                menor = vetorA[i];
                indexMenor = i;
            }
        }
        
        System.out.print("Vetor de idades = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Menor idade: " + menor);
        System.out.println("Índice menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Índice menor idade: " + indexMaior);
	}
}
