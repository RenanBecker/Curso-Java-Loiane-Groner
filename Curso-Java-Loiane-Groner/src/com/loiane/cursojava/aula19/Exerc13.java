package com.loiane.cursojava.aula19;

public class Exerc13 {

	public static void main(String[] args) {
		int tamanho = 100;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i+1;
		}
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] % 5 == 0) {
				System.out.println(A[i]);
			}
		}
	}
}

