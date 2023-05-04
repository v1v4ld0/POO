package com.mycompany.exerciciobatalhanaval;
import java.util.Scanner;


public class BatalhaNavalNoCaribe {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean pitStop = false;
        
        //player 1
        System.out.println("Nome do primeiro jogador:");
        String primeiroJogador = input.nextLine();
        
        Jogador jogador = new Jogador(primeiroJogador);
        jogador.MatrizEspacada();
        System.out.println("Matriz do primeiro jogador");
        jogador.mostrarTabelaDoJogador();
        jogador.informarPosicaoDasArmas();
        
        //player 2
        System.out.println("Nome do segundo jogador:");
        String segundoJogador = input.nextLine();
        
        Jogador adversario = new Jogador(segundoJogador);
        jogador.MatrizEspacada();
        System.out.println("Matriz do segundo jogador");
        jogador.mostrarTabelaDoAdversario();
        jogador.informarPosicaoDasArmas();
        
        while (!pitStop) {
            int i = 0;
            while (i < 2) {
                System.out.println("P1 tem permissão para atirar!");
                System.out.println("Digite a linha (horizontal) do disparo: ");
                int jogadahorizontal = input.nextInt();

                System.out.println("Digite a coluna (vertical) do disparo: ");
                int jogadavertical = input.nextInt();

                jogador.atirar(adversario, jogadahorizontal, jogadavertical);
                jogador.mostrarTabelaDoAdversario();
                if(jogador.registrarTiro()) {
                    pitStop = true;
                    break;
                };
                i++;
            }

            if (!pitStop) {
                while (i < 2) {
                    System.out.println("P2 tem permissão para atirar!");
                    System.out.println("Digite a linha (horizontal) do disparo: ");
                    int jogadahorizontal2 = input.nextInt();

                    System.out.println("Digite a coluna (vertical) do disparo: ");
                    int jogadavertical2 = input.nextInt();

                    adversario.atirar(jogador, jogadahorizontal2, jogadavertical2);
                    adversario.mostrarTabelaDoAdversario();
                    if(adversario.registrarTiro()) {
                        pitStop = true;
                        break;
                    };
                    i++;
                }
            }
        }
        }
    }

