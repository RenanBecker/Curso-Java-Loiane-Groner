package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exerc27 {
	  public static void main(String[] args){
	        
	        Scanner ler = new Scanner(System.in);
	        
	        int[] vetorA = new int[10];
	        char[] vetorB = new char[vetorA.length];
	        
	        for (int i=0; i<vetorA.length; i++){
	            
	            System.out.println("Entre com um número para a posição = " + i);
	            vetorA[i] = ler.nextInt();
	            
	            if (vetorA[i] < 7){
	                vetorB[i] = 'a';
	            } else if (vetorA[i] == 7){
	                vetorB[i] = 'b';
	            } else if (vetorA[i] > 7 && vetorA[i] < 10){
	                vetorB[i] = 'c';
	            } else if (vetorA[i] == 10){
	                vetorB[i] = 'd';
	            } else if (vetorA[i] > 10){
	                vetorB[i] = 'e';
	            }
	        }
	        
	        System.out.print("Vetor A = ");
	        for (int i=0; i<vetorA.length; i++){
	            System.out.print(vetorA[i] + " ");
	        }
	        System.out.println();
	        
	        
	        System.out.print("Vetor B = ");
	        for (int i=0; i<vetorB.length; i++){
	            System.out.print(vetorB[i] + " ");
	        }
	        System.out.println();
	    }  
}
