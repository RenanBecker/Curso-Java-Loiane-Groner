package com.loiane.cursojava.aula19;

public class Exerc11 {

	public static void main(String[] args) {
		int tamanho = 10;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i+1;
		}
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] % 2 == 0) {
				System.out.println(A[i]);
			}
		}
	}
}

