package com.mycompany.exerciciobatalhanaval;
import java.util.Arrays;
import java.util.Scanner;



public class Jogador {
    private String nome;
    private char[][] meuJogo;
    private char[][] jogoAdversario;
    private String[] eixoVertical = {"A  ", "B  ", "C  ", "D  ", "E  ", "F  ", "G  ", "H  "};
    private int qtdeArmas = 6;
    
    public Jogador(String nome) {
        this.nome = nome;
        this.meuJogo = new char[8][8];
        this.jogoAdversario = new char[8][8];
        
    }
    
    public void MatrizEspacada() {
        for (int i = 0; i < meuJogo.length; i++) {
            Arrays.fill(meuJogo[i], ' ');
            Arrays.fill(jogoAdversario[i], ' ');
        }
    }
    
    public void atirar(Jogador adversario, int LinhaParaAtirar, int ColunaParaAtirar) {
        verificarSeAcertou(adversario, LinhaParaAtirar, ColunaParaAtirar);
    }
    
    public void verificarSeAcertou(Jogador adversario, int LinhaParaAtirar, int ColunaParaAtirar) {
        /*Verifica se o tiro disparado acertou um alvo ou apenas a água*/
        
        int vertical = 0;
        int horizontal = 0;
        while(horizontal < adversario.meuJogo.length) {
            if (LinhaParaAtirar-1 == horizontal) {
                while(vertical < adversario.meuJogo[horizontal].length) {
                    if (ColunaParaAtirar-1 == vertical) {
                        switch (adversario.meuJogo[horizontal][vertical]) {
                            case 'c' -> {
                                jogoAdversario[horizontal][vertical] = 'o';
                                System.out.println("Acertou uma embarcação!");
                            }
                            case 's' -> {
                                jogoAdversario[horizontal][vertical] = 'o';
                                System.out.println("Acertou uma embarcação!");
                            }
                            case 'p' -> {
                                jogoAdversario[horizontal][vertical] = 'o';
                                System.out.println("Acertou uma embarcação!");
                            }
                            default -> {
                                jogoAdversario[horizontal][vertical] = 'x';
                                System.out.println("Acertou na água!");
                            }
                        }
                    }
                    vertical++;
                }
            }
            horizontal++;
        }
    }
    
    public boolean registrarTiro() {
        /*Registra a quantidade de tiros disparados. Se todas as embarcações de um dos lados estiverem
        afundadas, o jogo é encerrado*/
        
        int qtdeDeTirosAcertados = 0;
        for (char[] jogoAdversario1 : jogoAdversario) {
            for (int vertical = 0; vertical < jogoAdversario1.length; vertical++) {
                if (jogoAdversario1[vertical] == 'o') {
                    qtdeDeTirosAcertados += 1;
                    System.out.println("O jogador " + nome + " acertou um alvo!");
                }
            }
        }
        
        if (qtdeDeTirosAcertados == qtdeArmas) {
            System.out.println(nome + " venceu a partida");
            return true;
        }
        return false;
    }
    
    public void mostrarTabelaDoJogador() {
        //Mostra a tabela do jogador.
        
        for (int i = 1; i < 9; i ++) {
            System.out.print("     " + i);
        }
        System.out.println("");
        int horizontal = 0;
        while (horizontal < meuJogo.length) {
            System.out.print(eixoVertical[horizontal]);
            for (int vertical = 0; vertical < meuJogo[horizontal].length; vertical++) {
                System.out.print("| " + meuJogo[horizontal][vertical] + " |" + " ");             
            }
            System.out.println("");
            horizontal++;
        }
    }
    
    public void mostrarTabelaDoAdversario() {
        /*Mostra a tabela do jogador adversário. Tem a mesma estrutura do método mostrarTabelaDoJogador(), o
        que muda apenas o atributo meuJogo para jogoAdversario.*/
        
        for (int i = 1; i < 9; i ++) {
            System.out.print("     " + i);
        }
        System.out.println();
        int horizontal = 0;
        while (horizontal < jogoAdversario.length) {
            System.out.print(eixoVertical[horizontal] + "  ");
            for (int vertical = 0; vertical < jogoAdversario[horizontal].length; vertical++) {
                System.out.print("| " + jogoAdversario[horizontal][vertical] + " |" + " ");             
            }
            System.out.println();
            horizontal++;
        }
    }
    
    public void informarPosicaoDasArmas() {
        //Método para os jogadores informarem quais e onde colocarão suas armas/embarcações.
        int submarino = 3;
        int cruzador = 2;
        int portaAviao = 1;
        
        int contador = 1;
        Scanner input = new Scanner(System.in);

        
        while (contador < 7) {
            System.out.println("Adcione suas armas!");
            System.out.println("Selecione a linha (horizontal): ");
            int horizontal = input.nextInt();
            System.out.println("Selecione a coluna (vertical): ");
            int vertical = input.nextInt();
            System.out.println("Insira a " +contador+ "ª arma: ");
            System.out.println("Submarino [máximo 3], Cruzador [máximo 2], 3 - Porta-Aviões [máximo 1]");
            char arma = input.next().charAt(0);
            
            for (int ini = 0; ini < qtdeArmas; ini ++) {
                switch (arma) {
                    case 's' -> {
                        if (submarino == 0) {
                            System.out.println("MAX. DE SUBMARINOS");
                        } else {
                            meuJogo[horizontal - 1][vertical - 1] = arma;
                            submarino--;}
                    }
                    case 'c' -> {
                        if (cruzador == 0) {
                            System.out.println("MAX. DE CRUZADOR");
                        } else {
                            meuJogo[horizontal - 1][vertical - 1] = arma;
                            cruzador--;}
                    }
                    case 'p' -> {
                        if (portaAviao == 0) {
                            System.out.println("MAX. DE PORTA-AVIÃO");
                        } else {
                            meuJogo[horizontal - 1][vertical - 1] = arma;
                            portaAviao--;}
                    }
                    default -> {System.out.println("CARACTERE INVÁLIDO");
                    }
                }
            }
            contador ++;
            mostrarTabelaDoJogador();
        }
    }
    
}

/*if (arma == 's'){
                        if (submarino == 0) {
                            System.out.println("MAX. DE SUBMARINOS");
                            contador--;
                            break;
                        } else {
                            meuJogo[horizontal - 1][vertical - 1] = arma;
                            submarino--;
                            break;
                        }
                    }
                    else if (arma == 'c') {
                        if (cruzador == 0) {
                            System.out.println("MAX. DE CRUZADOR");
                            contador--;
                            break;
                        } else {
                            meuJogo[horizontal - 1][vertical - 1] = arma;
                            cruzador--;
                            break;
                        }
                    }
                    else if (arma =='p') {
                        if (portaAviao == 0) {
                            System.out.println("MAX. DE PORTA-AVIÃO");
                            contador--;
                            break;
                        } else {
                            meuJogo[horizontal - 1][vertical - 1] = arma;
                            portaAviao--;
                            break;
                        }
                    }
                    else {
                        System.out.println("CARACTERE INVÁLIDO");
                        contador--;
                        break;
                    }*/