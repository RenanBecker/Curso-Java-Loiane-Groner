package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc36 {
     public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor de n:");
        int n = ler.nextInt();
        
        double soma = 0;
        
        for (int i=1; i<=n; i++){
            
            soma += 1/i;
        }
        
        System.out.println("Soma = " + soma);
    }
}
