package org.caroline;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        int i = 0;

        int numeroAleatorio = random.nextInt(100) + 1; //numero entre 100 e 1

        System.out.println("Qual é o numero? ");
        int resposta = leia.nextInt();

        while(resposta != numeroAleatorio) {
            if(resposta < numeroAleatorio) {
                System.out.println("É maior");
            } else {
                System.out.println("É menor");
            }
            System.out.println("Qual é o número? ");
            resposta = leia.nextInt();
            i++;

        }

        System.out.println("Parabens! Você acertou o número.");
    }
}