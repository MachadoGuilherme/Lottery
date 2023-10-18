package com.example.lottery;

import java.util.Scanner;

public class Telas {

    Scanner entrada = new Scanner(System.in);
    Codigo cod = new Codigo();
    Aposta ap = new Aposta();
    int menuInicial;
    int menuJogos;
    int menuSorteio;
    int menuReservado;

    public Telas() {
    }

    //=================================================================================================================
    public void telaInicial() {
        System.out.println("\n\t** Loterry APP **");
        do {
            System.out.println("\n\t~~ Menu Inicial ~~\n");
            System.out.println("1 - Jogos");
            System.out.println("2 - Sorteios");
            System.out.println("\n3 - Area Reservada");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha uma das opções: ");
            menuInicial = entrada.nextInt();

            if (menuInicial < 1 || menuInicial > 4) {
                System.out.println("\n\t!! Opção Invalida !!");
            } else {
                //-- inivial 01 --
                if (menuInicial == 1) {
                    do {
                        System.out.println("\n\n\t\t------ Jogos APP ------\n");
                        System.out.println("1 - Jogar");
                        System.out.println("2 - Nº Jogados");
                        System.out.println("\n3 - Voltar");
                        System.out.print("\nEscolha uma das opções: ");
                        menuJogos = entrada.nextInt();

                        if (menuJogos < 1 || menuJogos > 3) {
                            System.out.println("\n\t!! Opção Invalida !!");
                        }
                        else {
                            if (menuJogos == 1) {
                                cod.game();
                            }
                            if (menuJogos == 2) {
                                cod.numJogado();
                            }
                        }
                    }while (menuJogos != 3);
                }
                //-- inicial 02 --
                if (menuInicial == 2) {
                    do {
                        System.out.println("\n\n\t\t------ Resultados & Premios ------\n");
                        System.out.println("1 - Resultados");
                        System.out.println("2 - Nª Sorteado");
                        System.out.println("\n3 - Voltar");
                        System.out.print("\nEscolha uma das opções: ");
                        menuSorteio = entrada.nextInt();

                        if (menuSorteio < 1 || menuSorteio > 3) {
                            System.out.println("\n\t!! Opção Invalida !!");
                        }
                        else {
                            if (menuSorteio == 1) {
                                ap.result(cod);
                            }
                            if (menuSorteio == 2) {
                                ap.sortead();
                            }
                        }
                    }while (menuSorteio != 3);
                }
                //-- inicial 03 --
                if (menuInicial == 3) {
                    do {
                        System.out.println("\n\n\t\t~~~~~~ Area Reservada ~~~~~~\n");
                        System.out.println("1 - Criar Numeros Sorteio");
                        System.out.println("2 - Password");
                        System.out.println("\n3 - Voltar");
                        System.out.print("\nEscolha Uma Das Opções: ");
                        menuReservado = entrada.nextInt();

                        if (menuReservado < 1 || menuReservado > 3) {
                            System.out.println("\n\t!! Opção Invalida !!");
                        }
                        else {
                            if (menuReservado == 1) {
                                ap.fazNumAposta();
                            }
                            if (menuReservado == 2) {
                                ap.senhaPass();
                            }
                        }
                    }while (menuReservado != 3);
                }
                //-- fim menus --
            }
        } while (menuInicial != 4);
        System.out.println("\n\tCiao!!");
    }
}
//=================================================================================================================
