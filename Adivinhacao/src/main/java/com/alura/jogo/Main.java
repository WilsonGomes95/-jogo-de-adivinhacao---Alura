package com.alura.jogo;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int numero = new Random().nextInt(100);
        int vezes = 5;
        Scanner scan = new Scanner(System.in);
        int escolha;
        System.out.println("Jogo de adivinhação");
        for(int i = 0; i < vezes; i++){
            
            System.out.print("Digite um número entre 0 e 100: ");
            escolha = scan.nextInt();
            if(escolha == numero){
                System.out.println(" Acertou!");
            }
            else if(escolha < numero){
                System.out.println("Número " + escolha + " menor");
            }
            else if(escolha > numero){
                System.out.println("Número " + escolha + " maior");  
            }
            else{
                System.out.println("Número invalido!");
            }
        }
        System.out.println("Limte de " + vezes + " tentativas esgotadas. ");
    }
}