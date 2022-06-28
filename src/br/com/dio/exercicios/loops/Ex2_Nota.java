package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double nota; 
       
       do{
        System.out.println("Digite uma nota maior que 0 e menor que 10:");
        nota = scan.nextDouble();
        if(nota > 10 || nota < 0){
            System.out.println("Número digitado incorretamente!");
        }
       }while(nota > 10 || nota < 0);

    }

}
