package com.example.lottery;

public class Sorteio {
    int repetido[] = new int[5];

    //=====================================================================================================================
    public Sorteio() {
    }

    //=====================================================================================================================
    public void StartAposta(Codigo codigo, Aposta aposta) {
        System.out.println("\n\t\t== Acertos ==\n");

        for (int i = 0; i < codigo.numJogo.length; i++) {
            for (int g = 0; g < aposta.numAposta.length; g++) {

                if (codigo.numJogo[i] == aposta.numAposta[g]) {
                    repetido[i] = codigo.numJogo[i];

                    System.out.println("$$$$$\tAcertou o Nº: " + repetido[i] + "\t$$$$$");
                }
            }
        }
        //-------------------------------------------------------------------------------------------------------------
    }
//=====================================================================================================================
}
