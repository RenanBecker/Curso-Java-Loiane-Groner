package com.loiane.cursojava.aula19;
import java.lang.Math;
public class Exerc04 {

	public static void main(String[] args) {
		int tamanho = 15;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = i + 10;
		}
		
		
		double[] B = new double[A.length];
		
		for(int i = 0; i <A.length; i++) {
			B[i] = Math.sqrt(A[i]);
		}
		
		
		for (double C : B) {
			System.out.println(C);
		}
	}

}
