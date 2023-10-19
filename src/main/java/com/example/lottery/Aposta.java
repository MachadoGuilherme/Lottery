package com.example.lottery;

import java.util.Scanner;

public class Aposta {

    Scanner entrada = new Scanner(System.in);
    public int numAposta[] = new int[5];
    boolean resultado = false;
    int x = 0;
    public int aposta;
    private int senha;
    public int pass;
    public int menuPass;
    public int menuSenha;

    //=================================================================================================================
    public Aposta() {
    }

    //=================================================================================================================
    public void result() {
        if (numAposta[0] == 0) {
            System.out.println("\n\t\t!! Resultados Ainda Não Disponiveis Para O Sorteio !!");
        } else {
            System.out.println("\nOs Numeros Sorteados Foram: " + numAposta[0] + " - " + numAposta[1] + " - " + numAposta[2] + " - " + numAposta[3] + " - " + numAposta[4]);
        }
    }

    //=================================================================================================================
    public void sortead() {
        if (numAposta[0] == 0) {
            System.out.println("\n\t\t!! Os Nºs Sorteados Ainda Não Sairam !!");
        } else {
            System.out.println("\nOs Numeros Sorteados Foram: " + numAposta[0] + " - " + numAposta[1] + " - " + numAposta[2] + " - " + numAposta[3] + " - " + numAposta[4]);
        }
    }

    //=================================================================================================================
    public void fazNumAposta() {
        System.out.print("\nSenha: ");
        pass = entrada.nextInt();

        if (pass != getSenha()) {
            System.out.println("\n\t\t!! Senha Invalida !!");
        } else {
            System.out.println("\n\t** Numeros A Sortear **");
            System.out.println("\n\tEntre Com Os 5 Numeros Do Sorteio\n");
            //-- primeiro numero --
            for (int i = 0; i < 5; i++) {
                System.out.print("Entre Com o " + (i + 1) + "º Numero a Sortear: ");
                aposta = entrada.nextInt();

                numAposta[i] = aposta;
            }

            while (!resultado) {
                resultado = true;

                for (int i = 0; i < numAposta.length - 1; i++) {
                    if (numAposta[i] > numAposta[i + 1]) {
                        resultado = false;

                        x = numAposta[i + 1];
                        numAposta[i + 1] = numAposta[i];
                        numAposta[i] = x;
                    }
                }
            }
            //-- numeros da aposta --
            System.out.println("\nOs Numeros Escolhidos Foram: " + numAposta[0] + " - " + numAposta[1] + " - " + numAposta[2] + " - " + numAposta[3] + " - " + numAposta[4]);
            //---- construir comparador ----
            //=================================================================================================================
        }
    }

    //=================================================================================================================
    public void senhaPass() {
        do {
            System.out.println("\n\n\t\t~~~~~~ Criar Alterar Senha ~~~~~~\n");
            System.out.println("1 - Criar Senha");
            System.out.println("2 - Alterar Senha");
            System.out.println("\n3 - Voltar");
            System.out.print("\nEscolha Uma Das Opções: ");
            menuPass = entrada.nextInt();

            if (menuPass < 1 || menuPass > 3) {
                System.out.println("\n\t!! Opção Invalida !!");
            } else {
                if (menuPass == 1) {
                    if (getSenha() != 0) {
                        System.out.println("\n\t!! Já Tem Senha Criada !! Para Alterar Utilize o Menu 2 - Alterar Senha !!");
                    } else {
                        do {
                            System.out.print("Crie Sua Senha: ");
                            menuSenha = entrada.nextInt();
                            setSenha(menuSenha);
                        } while (menuSenha == 0);
                        System.out.println("\nSenha Criada Com Sucesso");
                        menuPass = 3;
                    }
                }
                //-----------------------------------------------------------------------------------------------------
                if (menuPass == 2) {
                    System.out.print("Senha Anterior: ");
                    menuSenha = entrada.nextInt();

                    if (menuSenha != getSenha()) {
                        System.out.print("\n\t!! Senha Incorreta !!");
                    } else {
                        do {
                            System.out.print("Crie Sua Nova Senha: ");
                            menuSenha = entrada.nextInt();
                            setSenha(menuSenha);
                        } while (menuSenha == 0);
                        System.out.println("\nSenha Alterada Com Sucesso");
                        menuPass = 3;
                    }
                }
            }
        } while (menuPass != 3);
    }
    //=================================================================================================================

    private int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    //=================================================================================================================
}
