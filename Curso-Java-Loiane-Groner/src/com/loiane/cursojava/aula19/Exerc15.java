package com.loiane.cursojava.aula19;

public class Exerc15 {

	public static void main(String[] args) {
		int tamanho = 9;
		double quant = 0;
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
		System.out.println((quant/A.length)*100 + "% de impares");

	}
}

