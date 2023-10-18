package com.example.lottery;

import java.util.Scanner;

public class Aposta {

    Scanner entrada = new Scanner(System.in);
    Codigo codi = new Codigo();
    Sorteio sor = new Sorteio();
    public int apostA;
    public int apostB;
    public int apostC;
    public int apostD;
    public int apostE;
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
        if (getApostA() == 0) {
            System.out.println("\n\t\t!! Resultados Ainda Não Disponiveis Para O Sorteio !!");
        } else {
            System.out.println("\nOs Numeros Sorteados Foram: " + getApostA() + " - " + getApostB() + " - " + getApostC() + " - " + getApostD() + " - " + getApostE());
            System.out.println("Os Numeros Jogados Foram: " + codi.getNumA() + " - " + codi.getNumB() + " - " + codi.getNumC() + " - " + codi.getNumD() + " - " + codi.getNumE());
            sor.compara();
        }
    }

    //=================================================================================================================
    public void sortead() {
        if (getApostA() == 0) {
            System.out.println("\n\t\t!! Os Nºs Sorteados Ainda Não Sairam !!");
        } else {
            System.out.println("\nOs Numeros Sorteados Foram: " + getApostA() + " - " + getApostB() + " - " + getApostC() + " - " + getApostD() + " - " + getApostE());
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
            do {
                System.out.print("Entre Com o 1º Numero a Sortear: ");
                aposta = entrada.nextInt();
                if (aposta >= 1 && aposta <= 50) {
                    setApostA(aposta);
                } else {
                    System.out.println("\n\t!! Entre Com Nºs Entre 1 e 50 !!\n");
                }
            } while (aposta <= 0 || aposta >= 51);
            //-- segundo numero --
            do {
                System.out.print("Entre Com o 2º Numero a Sortear: ");
                aposta = entrada.nextInt();
                if (aposta >= 1 && aposta <= 50) {
                    setApostB(aposta);
                } else {
                    System.out.println("\n\t!! Entre Com Nºs Entre 1 e 50 !!\n");
                }
            } while (aposta <= 0 || aposta >= 51);
            //-- terceiro numero --
            do {
                System.out.print("Entre Com o 3º Numero a Sortear: ");
                aposta = entrada.nextInt();
                if (aposta >= 1 && aposta <= 50) {
                    setApostC(aposta);
                } else {
                    System.out.println("\n\t!! Entre Com Nºs Entre 1 e 50 !!\n");
                }
            } while (aposta <= 0 || aposta >= 51);
            //-- quarto numero --
            do {
                System.out.print("Entre Com o 4º Numero a Sortear: ");
                aposta = entrada.nextInt();
                if (aposta >= 1 && aposta <= 50) {
                    setApostD(aposta);
                } else {
                    System.out.println("\n\t!! Entre Com Nºs Entre 1 e 50 !!\n");
                }
            } while (aposta <= 0 || aposta >= 51);
            //-- quinto numero --
            do {
                System.out.print("Entre Com o 5º Numero a Sortear: ");
                aposta = entrada.nextInt();
                if (aposta >= 1 && aposta <= 50) {
                    setApostE(aposta);
                } else {
                    System.out.println("\n\t!! Entre Com Nºs Entre 1 e 50 !!\n");
                }
            } while (aposta <= 0 || aposta >= 51);
            //-- numeros da aposta --
            System.out.println("\nOs Numeros Escolhidos Foram: " + getApostA() + " - " + getApostB() + " - " + getApostC() + " - " + getApostD() + " - " + getApostE());
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
                            System.out.print("Crie Sua Senha: ");
                            menuSenha = entrada.nextInt();
                            setSenha(menuSenha);
                        } while (menuSenha == 0);
                        System.out.println("\nSenha Alterada Com Sucesso");
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

    public int getApostA() {
        return apostA;
    }

    public void setApostA(int apostA) {
        this.apostA = apostA;
    }

    public int getApostB() {
        return apostB;
    }

    public void setApostB(int apostB) {
        this.apostB = apostB;
    }

    public int getApostC() {
        return apostC;
    }

    public void setApostC(int apostC) {
        this.apostC = apostC;
    }

    public int getApostD() {
        return apostD;
    }

    public void setApostD(int apostD) {
        this.apostD = apostD;
    }

    public int getApostE() {
        return apostE;
    }

    public void setApostE(int apostE) {
        this.apostE = apostE;
    }
    //=================================================================================================================
}
