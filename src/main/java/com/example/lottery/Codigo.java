package com.example.lottery;

import java.util.Scanner;

public class Codigo {

    Scanner entrada = new Scanner(System.in);

    public int numA;
    public int numB;
    public int numC;
    public int numD;
    public int numE;
    public int jogo;

    //=================================================================================================================
    public Codigo() {
    }

    //=================================================================================================================
    public void game() {
        System.out.println("\n\tEntre Com Seus 5 Numeros de 1 a 50\n");
        //-- primeiro numero --
        do {
            System.out.print("Entre Com o 1º Nº do Jogo: ");
            jogo = entrada.nextInt();
            if (jogo >= 1 && jogo <= 50) {
                setNumA(jogo);
            } else {
                System.out.println("\n\t!!Escolha Nºs Entre 1 e 50 !!\n");
            }
        } while (jogo <= 0 || jogo >= 51);
        //-- segundo numero --
        do {
            System.out.print("Entre Com o 2º Nº do Jogo: ");
            jogo = entrada.nextInt();
            if (jogo >= 1 && jogo <= 50) {
                setNumB(jogo);
            } else {
                System.out.println("\n\t!!Escolha Nºs Entre 1 e 50 !!\n");
            }
        } while (jogo <= 0 || jogo >= 51);
        //-- terceiro numero --
        do {
            System.out.print("Entre Com o 3º Nº do Jogo: ");
            jogo = entrada.nextInt();
            if (jogo >= 1 && jogo <= 50) {
                setNumC(jogo);
            } else {
                System.out.println("\n\t!!Escolha Nºs Entre 1 e 50 !!\n");
            }
        } while (jogo <= 0 || jogo >= 51);
        //-- quarto numero --
        do {
            System.out.print("Entre Com o 4º Nº do Jogo: ");
            jogo = entrada.nextInt();
            if (jogo >= 1 && jogo <= 50) {
                setNumD(jogo);

            } else {
                System.out.println("\n\t!!Escolha Nºs Entre 1 e 50 !!\n");
            }
        } while (jogo <= 0 || jogo >= 51);
        //-- quinto numero --
        do {
            System.out.print("Entre Com o 5º Nº do Jogo: ");
            jogo = entrada.nextInt();
            if (jogo >= 1 && jogo <= 50) {
                setNumE(jogo);
            } else {
                System.out.println("\n\t!!Escolha Nºs Entre 1 e 50 !!\n");
            }
        } while (jogo <= 0 || jogo >= 51);
        //-- numeros jogados --
        System.out.println("\nOs Numeros Jogados Foram: " + getNumA() + " - " + getNumB() + " - " + getNumC() + " - " + getNumD() + " - " + getNumE());
    }
    //=================================================================================================================
    public void numJogado() {
        if (getNumA() == 0) {
            System.out.println("\n\t\t!! Ainda Não Foram Realizados Jogos !!");
        }
        else {
            System.out.println("\nOs Numeros Jogados Foram: " + getNumA() + " - " + getNumB() + " - " + getNumC() + " - " + getNumD() + " - " + getNumE());
        }
    }
    //=================================================================================================================
    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public int getNumE() {
        return numE;
    }

    public void setNumE(int numE) {
        this.numE = numE;
    }
    //=================================================================================================================
}
//=================================================================================================================
