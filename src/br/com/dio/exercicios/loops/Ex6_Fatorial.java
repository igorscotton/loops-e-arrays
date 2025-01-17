package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Digite o número para o calculo do fatorial: ");
       
       int fatorial = scan.nextInt();
       int total = 1; 
       for(int i = fatorial; i > 0; i--){
            total *= i;
       }

       System.out.println("Valor do fatorial: " + total);
       scan.close();
    }

}
