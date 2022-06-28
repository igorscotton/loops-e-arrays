package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Random;


public class Ex2_Consoantes {
    public static void main(String[] args) {
        Random random = new Random();
        char[] allChar = new char[6];
        int quantidadeConsoante = 0;
        for(int i = 0; i < 6; i++){
            char caractere = (char) (random.nextInt(26) + 'a');
            allChar[i] = caractere;
            if(caractere != 'a' && caractere != 'e' && caractere != 'i' && caractere != 'o' && caractere != 'u'){
                System.out.println(caractere);
                quantidadeConsoante++;
            }
        }       
        
        System.out.println("Total de consoantes: " + quantidadeConsoante);
    }

}
