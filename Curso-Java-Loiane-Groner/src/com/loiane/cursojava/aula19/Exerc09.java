package com.loiane.cursojava.aula19;
import java.lang.Math;

public class Exerc09 {

	public static void main(String[] args) {
		int tamanho = 10;
		double[] A = new double[tamanho];
	
		for(int i = 0; i<A.length; i++) {
			A[i] = Math.random();
		}
		double[] B = new double[A.length];
		for(int i = 0; i<A.length; i++) {
			B[i] = i + 10;
		}
		
		
		double[] C = new double[A.length];
		
		for(int i = 0; i <A.length; i++) {
			C[i] = A[i] / (B[i]);
		}
		
		
		for (double D : C) {
			System.out.println(D);
		}
	}
}

