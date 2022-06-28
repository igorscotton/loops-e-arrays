package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];
        for(int i = 0; i < 6; i++){
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
        }

        System.out.println("Inversamente:");

        for(int i = 5; i >= 0; i--){
            System.out.println(numbers[i]);
        }      

    }
}
