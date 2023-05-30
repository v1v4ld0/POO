package com.mycompany.exerciciomercadinho;


public abstract class Cliente{
    private String nome;
    double valorCompra;
    
    public Cliente(String nome, double valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }
    
    public abstract double calcularPagamento();

    public double getValorCompra() {
        return valorCompra;
    }
       
}
