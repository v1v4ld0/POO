package com.mycompany.exercicioaluguel;

public class Quarto {
    private double diaria;
    private int maxPessoas;
    private boolean arCondicionado;
    private boolean banheiraHidromassagem;

    public Quarto(double diaria, int maxPessoas, boolean arCondicionado, boolean banheiraHidromassagem) {
        this.diaria = diaria;
        this.maxPessoas = maxPessoas;
        this.arCondicionado = arCondicionado;
        this.banheiraHidromassagem = banheiraHidromassagem;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public int getMaxPessoas() {
        return maxPessoas;
    }

    public void setMaxPessoas(int maxPessoas) {
        this.maxPessoas = maxPessoas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isBanheiraHidromassagem() {
        return banheiraHidromassagem;
    }

    public void setBanheiraHidromassagem(boolean banheiraHidromassagem) {
        this.banheiraHidromassagem = banheiraHidromassagem;
    }
    
    
    
}