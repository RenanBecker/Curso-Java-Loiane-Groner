package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exerc05 {
public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String[][][] compromissos = new String[12][31][8];
        
        boolean sair = false;
        byte opcao;
        while (!sair){
            
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");
            
            opcao = ler.nextByte();
            
            if (opcao == 1){ //adicionar compromisso
                
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.println("Entre com o mês");
                    mes = ler.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                
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
                    if (hora >= 0 && hora <= 8){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                
                mes--;
                dia--;
                hora--;
                System.out.println("Digite o compromisso");
                compromissos[mes][dia][hora] = ler.next();
                
            } else if (opcao == 2){ //verificar compromisso
                
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.println("Entre com o mês");
                    mes = ler.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                
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
                    if (hora >= 0 && hora <= 8){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                
                mes--;
                dia--;
                hora--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[mes][dia][hora]);
                
            } else if (opcao == 0){
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }
        }
        
    }
}
