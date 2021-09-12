package com.loiane.cursojava.aula15;
import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;

		System.out.println("Entre com primeiro número:");
		numero1 = ler.nextInt();

		System.out.println("Entre com segundo número:");
		numero2 = ler.nextInt();

		System.out.println("Entre com terceiro número:");
		numero3 = ler.nextInt();
		
		 if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3){
	            System.out.println(numero3 + " - " + numero2 + " - " + numero1);
	            
	        } else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2){
	            System.out.println(numero2 + " - " + numero3 + " - " + numero1);
	            
	        } else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3){
	            System.out.println(numero3 + " - " + numero1 + " - " + numero2);
	            
	        } else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1){
	            System.out.println(numero1 + " - " + numero3 + " - " + numero2);
	            
	        } else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2){
	            System.out.println(numero2 + " - " + numero1 + " - " + numero3);
	            
	        } else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1){
	            System.out.println(numero1 + " - " + numero2 + " - " + numero3);
	            
	        }
		
	}

}
