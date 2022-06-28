package br.com.dio.exercicios.loops;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int par = 0, impar = 0;
        System.out.println("Digite a quantidade de números: ");
        int quantNumeros = scan.nextInt();

        for(int i = 0; i < quantNumeros; i++){
            int randomNumber = random.nextInt();
            System.out.println("O número sorteado foi: " + randomNumber);
            if(randomNumber % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.println("Quantidade de Números Pares: " + par);
        System.out.println("Quantidade de Números Impares: " + impar);
        scan.close();
    }
}
