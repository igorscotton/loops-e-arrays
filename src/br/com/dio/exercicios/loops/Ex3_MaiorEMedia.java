package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int total = 0;

        for(int i = 0; i < 5; i++){
            int num;
            System.out.println("Digite o número " + (i+1) + " :");
            num = scan.nextInt();
            maior = Math.max(num, maior);
            total += num;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (total/5));
        scan.close();
    }
}
