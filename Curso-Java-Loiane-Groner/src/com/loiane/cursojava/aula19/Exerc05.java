package com.loiane.cursojava.aula19;

public class Exerc05 {

	public static void main(String[] args) {
		int tamanho = 10;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i + 10;
		}
		
		
		double[] B = new double[A.length];
		
		for(int i = 0; i <A.length; i++) {
			B[i] = A[i] * i;
		}
		
		
		for (double C : B) {
			System.out.println(C);
		}
	}

}
