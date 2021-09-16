package com.loiane.cursojava.aula15;

import java.util.Scanner;


public class Exerc19 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número:");
        int numero1 = ler.nextInt();
        
        System.out.println("Entre com o segundo número:");
        int numero2 = ler.nextInt();
        
        System.out.println("Entre com a operação (+ - / *): ");
        String operacao = ler.next();
        
        double resultado = 0;
        boolean valida = true;
        
        switch(operacao){
            case "+": resultado = numero1 + numero2; break; 
            case "-": resultado = numero1 - numero2; break;
            case "*": resultado = numero1 * numero2; break;
            case "/": resultado = numero1 / numero2; break;
            default: 
                System.out.println("Operação inválida"); 
                valida = false;
        }
        
        if (valida){
            
            System.out.println("Resultado: " + resultado);
            
            if (resultado >=0){
                System.out.println("resultado positivo");
            } else {
                System.out.println("resultado negativo");
            }
            
            if (resultado % 2 == 0){
                System.out.println("resultado par");
            }else {
                System.out.println("resultado ímpar");
            }
        }
    }
}
