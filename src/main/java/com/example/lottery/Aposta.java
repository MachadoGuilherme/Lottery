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
    public void result(Codigo codigo) {
        if (codigo.numJogo[0] == 0) {
            System.out.println("\n\t\t!! Para Mostrar Nºs Sorteados É Necessario Ter Feito Ao Menos Um Jogo !!");
        }
        if (numAposta[0] == 0) {
            System.out.println("\n\t\t!! Resultados Ainda Não Disponiveis Para O Sorteio !!");
        }
        if (numAposta[0] != 0 && codigo.numJogo[0] != 0) {
            System.out.println("\nOs Numeros Sorteados Foram: " + numAposta[0] + " - " + numAposta[1] + " - " + numAposta[2] + " - " + numAposta[3] + " - " + numAposta[4]);
        }
    }

    //=================================================================================================================
    public void sortead(Codigo codigo) {
        if (codigo.numJogo[0] == 0) {
            System.out.println("\n\t\t!! Para Mostrar Nºs Sorteados É Necessario Ter Feito Ao Menos Um Jogo !!");
        }
        if (numAposta[0] == 0) {
            System.out.println("\n\t\t!! Os Nºs Sorteados Ainda Não Sairam !!");
        }
        if (numAposta[0] != 0 && codigo.numJogo[0] != 0) {
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
            //-- numeros do sorteio --
            for (int i = 0; i < 5; i++) {
                System.out.print("Entre Com o " + (i + 1) + "º Numero a Sortear: ");
                aposta = entrada.nextInt();

                if (aposta > 0 && aposta < 51) {
                    numAposta[i] = aposta;
                } else {
                    do {
                        System.out.print("\n\t!! Apenas Nºs Entre 1 e 50 !!\n\n");
                        System.out.print("Entre Com o " + (i + 1) + "º Numero a Sortear: ");
                        aposta = entrada.nextInt();
                        numAposta[i] = aposta;
                    } while (aposta <= 0 || aposta >= 51);
                }
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
                        System.out.println("\n\t\t!! Já Tem Senha Criada !!\nPara Alterar Utilize o Menu 2 - Alterar Senha !!");
                    } else {
                        System.out.println("\n\t>>> Criação De Senha <<<\n");
                        do {
                            System.out.print("Crie Sua Senha: ");
                            menuSenha = entrada.nextInt();
                            if (menuSenha <= 0 || menuSenha > 1000) {
                                System.out.println("\n\t!! Senha Deve Ser Entre 1 e 1000 !!\n");
                            }
                        } while (menuSenha <= 0 || menuSenha > 1000);
                        setSenha(menuSenha);
                        System.out.println("\nSenha Criada Com Sucesso");
                        menuPass = 3;
                    }
                }
                //-----------------------------------------------------------------------------------------------------
                if (menuPass == 2) {
                    System.out.println("\n\t>>> Alteração De Senha <<<\n");
                    System.out.print("Senha Anterior: ");
                    menuSenha = entrada.nextInt();

                    if (menuSenha != getSenha()) {
                        System.out.print("\n\t!! Senha Incorreta !!");
                    } else {
                        System.out.print("\n");
                        do {
                            System.out.print("Crie Sua Nova Senha: ");
                            menuSenha = entrada.nextInt();

                            if (menuSenha == getSenha()) {
                                System.out.println("\n\t!! Senha Não Pode Ser A Mesma !!\n");
                            }
                            if (menuSenha <= 0 || menuSenha > 1000) {
                                System.out.println("\n\t!! Senha Deve Ser Entre 1 e 1000 !!\n");
                            }
                        } while (menuSenha <= 0 || menuSenha > 1000 || menuSenha == getSenha());
                        setSenha(menuSenha);
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
