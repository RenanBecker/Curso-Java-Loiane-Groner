package com.loiane.cursojava.aula19;

public class Exerc14 {

	public static void main(String[] args) {
		int tamanho = 10;
		int quant = 0;
		double soma = 0;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i+1;
		}
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] % 2 != 0) {
				soma += A[i];
				quant++;
			}
		}
		System.out.println(soma/quant);

	}
}

