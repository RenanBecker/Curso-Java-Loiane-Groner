package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exerc04 {
public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String[][] compromissos = new String[31][24];
        
        boolean sair = false;
        byte opcao;
        while (!sair){
            
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");
            
            opcao = ler.nextByte();
            
            if (opcao == 1){ //adicionar compromisso
                
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = ler.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora do compromisso");
                    hora = ler.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                
                dia--;
                System.out.println("Digite o compromisso");
                compromissos[dia][hora] = ler.next();
                
            } else if (opcao == 2){ //verificar compromisso
                
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = ler.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre coma hora do compromisso");
                    hora = ler.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                
                dia--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[dia][hora]);
                
            } else if (opcao == 0){
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }
        }
        
    }
}
