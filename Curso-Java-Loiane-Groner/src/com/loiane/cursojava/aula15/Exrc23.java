package com.loiane.cursojava.aula15;


import java.util.Scanner;

public class Exrc23 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = ler.nextInt();
        
        System.out.println("Entre com a quantidade (kg):");
        double quantidade = ler.nextDouble();
        
        double precoKg = 0;
        
        if (tipo == 1){
            
            System.out.println(quantidade + "kg - file duplo");
            
            if (quantidade < 5){
               precoKg = 4.9; 
            } else {
                precoKg = 5.8;
            }
            
            
        } else if (tipo == 2){
            
            System.out.println(quantidade + "kg - alcatra");
            
            if (quantidade < 5){
               precoKg = 5.9; 
            } else {
                precoKg = 6.8;
            }
        } else if (tipo == 3){
            
            System.out.println(quantidade + "kg - picanha");
            
            if (quantidade < 5){
               precoKg = 6.9; 
            } else {
                precoKg = 7.8;
            }
        }
        
        double total = quantidade * precoKg;
        System.out.println(quantidade + "kg * " + precoKg + " = " + total);
        
        System.out.println("Compra no cartão? digite 1 para sim:");
        int cartao = ler.nextInt();
        
        if (cartao == 1){
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
    }
}
