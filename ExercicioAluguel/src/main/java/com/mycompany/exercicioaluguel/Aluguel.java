package com.mycompany.exercicioaluguel;

import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;


class Aluguel {
    private Hospede hospede;
    private Quarto quarto;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;

    public Aluguel(Hospede hospede, Quarto quarto, LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int calcularNumDiarias() {
        LocalDateTime entrada = dataEntrada;
        LocalDateTime saida = dataSaida;

        if (saida.getHour() < 12) {
            saida = saida.withHour(12).withMinute(0);
        } else {
            saida = saida.withHour(12).withMinute(0).plusDays(1);
        }
//
        long numDiarias = ChronoUnit.DAYS.between(entrada, saida);
        return (int) numDiarias;
    }

    public double calcularValorPago() {
        int numDiarias = calcularNumDiarias();
        double valorTotal = numDiarias * quarto.getDiaria();
        return valorTotal;
    }

}