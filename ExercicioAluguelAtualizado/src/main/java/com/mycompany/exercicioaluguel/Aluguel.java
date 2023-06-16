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

        long numDiarias = ChronoUnit.DAYS.between(entrada, saida);
        return (int) numDiarias;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double calcularValorPago() {
        int numDiarias = calcularNumDiarias();
        double valorTotal = numDiarias * quarto.getDiaria();
        return valorTotal;
    }

    @Override
    public String toString() {
        return "\nAluguel{" + "\ndataEntrada=" + dataEntrada + ", "
                + "\ndataSaida=" + dataSaida + '}';
    }
    
}