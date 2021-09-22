package com.loiane.cursojava.aula19;

public class Exerc12 {

	public static void main(String[] args) {
		int tamanho = 10;
		int soma = 0;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i+1;
		}
		
		for(int i = 0; i<A.length; i++) {
			soma += A[i];
		}
		System.out.println(soma);
	}
}

