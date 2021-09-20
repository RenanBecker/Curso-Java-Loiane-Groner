package com.loiane.cursojava.aula17;

public class Exerc04 {
    
    public static void main(String[] args){
        
        int popA = 80000;
        int popB = 200000;
        int ano = 0;
        
        while (popA < popB){
            
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            ano++;
        }
        
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos:     " + ano);
    }
}