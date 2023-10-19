package com.example.lottery;

import java.util.Scanner;

public class Codigo {

    Scanner entrada = new Scanner(System.in);

    public int numJogo[] = new int[5];
    boolean resultado = false;
    public int jogo;

    //=================================================================================================================
    public Codigo() {
    }

    //=================================================================================================================
    public void game() {
        System.out.println("\n\tEntre Com Seus 5 Numeros\n");

        for (int i = 0; i < 5; i++) {
            System.out.print("Entre Com o " + (i + 1) + "º Nº do Jogo: ");
            jogo = entrada.nextInt();

            if (jogo > 0 && jogo < 51) {
                numJogo[i] = jogo;
            } else {
                do {
                    System.out.print("\n\t!! Apenas Nºs Entre 1 e 50 !!\n\n");
                    System.out.print("Entre Com o " + (i + 1) + "º Nº do Jogo: ");
                    jogo = entrada.nextInt();
                    numJogo[i] = jogo;
                } while (jogo <= 0 || jogo >= 51);
            }
        }

        while (!resultado) {
            resultado = true;

            for (int i = 0; i < numJogo.length - 1; i++) {
                if (numJogo[i] > numJogo[i + 1]) {
                    resultado = false;

                    int x = numJogo[i + 1];
                    numJogo[i + 1] = numJogo[i];
                    numJogo[i] = x;
                }
            }
        }
        //-- numeros jogados --
        System.out.println("\nOs Numeros Jogados Foram: " + numJogo[0] + " - " + numJogo[1] + " - " + numJogo[2] + " - " + numJogo[3] + " - " + numJogo[4]);
    }

    //=================================================================================================================
    public void numJogado() {
        if (numJogo[0] == 0) {
            System.out.println("\n\t\t!! Ainda Não Foram Realizados Jogos !!");
        } else {
            System.out.println("\nOs Numeros Jogados Foram: " + numJogo[0] + " - " + numJogo[1] + " - " + numJogo[2] + " - " + numJogo[3] + " - " + numJogo[4]);
        }
    }
//=================================================================================================================
}
//=================================================================================================================
