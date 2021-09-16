package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exerc21 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de litros vendidos");
        double litros = ler.nextDouble();
        
        System.out.println("Entre com o tipo de combustível");
        String tipo = ler.next();
        
        double gasolina = 5.6;
        double alcool = 4.5;
        int desconto = 0;
        double total = 0;
        double totalDesc = 0;
        
        if (tipo.equalsIgnoreCase("a")){
            
            if (litros <= 20){
                desconto = 3;
            } else {
                desconto = 5;
            }
            
            total = litros * alcool;
            
        } else if (tipo.equalsIgnoreCase("g")){
            
            if (litros <= 20){
                desconto = 4;
            } else {
                desconto = 6;
            }
            
            total = litros * gasolina;
        }
        
        totalDesc = (total / 100) * desconto;
        
        double precoAPagar = total - totalDesc;
        
        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}