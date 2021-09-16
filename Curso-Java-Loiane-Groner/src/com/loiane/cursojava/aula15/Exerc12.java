package com.loiane.cursojava.aula15;
import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double hora,salarioHora,percentualIR,IR,inss,fgts,descontos,liquido,bruto;
		
		System.out.println("Digite o valor da hora");
		salarioHora = ler.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas");
		hora = ler.nextDouble();
		
		bruto = hora * salarioHora;
		percentualIR = 0;
		
		if(bruto > 900 && bruto <= 1500) {
			percentualIR = 5;
		}else if(bruto > 1500 && bruto <= 2500) {
			percentualIR = 10;
		}else if (bruto > 2500) {
			percentualIR = 20;
		}
		
		IR = bruto * (percentualIR/100);
		inss = bruto * 0.1;
		fgts = bruto * 0.11;
		descontos = IR + inss;
		liquido = bruto - descontos;
		
		System.out.println("Salário Bruto: (" + salarioHora + " * " + hora + "): " + bruto);
        System.out.println("(-) IR (" + percentualIR + "%):" + IR);
        System.out.println("(-) INSS ( 10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + descontos);
        System.out.println("Salário Liquido: " + liquido);
	}

}
