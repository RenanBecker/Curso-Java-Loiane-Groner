package com.loiane.cursojava.aula19;

public class Exerc01 {

	public static void main (String[] args) {

		int[] A = new int[5];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		
		int[] B = new int[5];
		
		for(int i = 0; i <5; i++) {
			B[i] = A[i];
		}
		
		
		for (int C : B) {
			System.out.println(C);
		}
	}
	
}
