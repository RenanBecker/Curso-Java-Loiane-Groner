package com.loiane.cursojava.aula19;

public class Exerc02 {

	public static void main(String[] args) {
		int[] A = new int[8];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		A[5] = 6;
		A[6] = 7;
		A[7] = 8;
		
		int[] B = new int[8];
		
		for(int i = 0; i <8; i++) {
			B[i] = A[i] * 2;
		}
		
		
		for (int C : B) {
			System.out.println(C);
		}
	}

}
