package com.loiane.cursojava.aula19;

public class Exerc03 {

	public static void main(String[] args) {
		int tamanho = 15;
		int[] A = new int[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i + 1;
		}
		
		
		int[] B = new int[A.length];
		
		for(int i = 0; i <A.length; i++) {
			B[i] = A[i] * A[i];
		}
		
		
		for (int C : B) {
			System.out.println(C);
		}
	}

}
