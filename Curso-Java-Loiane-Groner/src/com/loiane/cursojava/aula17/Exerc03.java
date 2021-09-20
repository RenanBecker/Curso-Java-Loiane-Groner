package com.loiane.cursojava.aula17;
import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        boolean valida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do {
            
            System.out.println("Digite nome:");
            
            nome = ler.next();
            
            if (nome.length() >= 3){
                valida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while (!valida);
        
        
        valida = false;
        do {
            
            System.out.println("Digite idade:");
            
            idade = ler.nextInt();
            
            if (idade >= 0 && idade <= 150){
                valida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!valida);
        
        
        valida = false;
        do {
            
            System.out.println("Digite salário:");
            
            salario = ler.nextDouble();
            
            if (salario > 0){
                valida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!valida);
        
        
        valida = false;
        do {
            
            System.out.println("Digite sexo \"f\" ou \"m\"");
            
            sexo = ler.next();
            
            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                valida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!valida);
        
        valida = false;
        do {
            
            System.out.println("Entre com o estado civil:");
            
            estadoCivil = ler.next();
            
            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                valida = true;
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!valida);
        
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
    }
}