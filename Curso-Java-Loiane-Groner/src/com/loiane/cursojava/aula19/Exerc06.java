package com.loiane.cursojava.aula19;

public class Exerc06 {

	public static void main(String[] args) {
		int tamanho = 10;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i + 10;
		}
		
		
		double[] B = new double[A.length];
		double[] C = new double[A.length];
		
		for(int i = 0; i <A.length; i++) {
			C[i] = A[i] + B[i];
		}
		
		
		for (double D : C) {
			System.out.println(D);
		}
	}
}

