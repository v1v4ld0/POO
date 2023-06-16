package com.mycompany.exercicioaluguel;

import java.time.LocalDateTime;


public class Execucao {
    public static void main(String[] args) {
        
        Residencia residencia = new Residencia("Rua Pimenta Malagueta", "007", "Conjunto", "00000-000", "191", "residencia@QueroUmQuarto");
        
        Hospede vivaldo = new Hospede("Vivaldo", "123.456.789-10", "Rua Jurubeba", "190", "193", "catatau@hotmail");
        
        Quarto quarto = new Quarto(200, 10, true, true);
        
        LocalDateTime entrada = LocalDateTime.of(2018, 07, 22, 10, 15, 30);
        LocalDateTime saida = LocalDateTime.of(2018, 07, 26, 15, 27, 25);
        
        Aluguel aluguel = new Aluguel(vivaldo, quarto, entrada, saida);
        
        System.out.println(vivaldo.toString());
        System.out.println(residencia.toString());
        System.out.println(quarto.toString());
        System.out.println(aluguel.toString());
        System.out.println("Diaria: " + aluguel.calcularNumDiarias());
        System.out.println("Valor total: " + aluguel.calcularValorPago());
    }
}
