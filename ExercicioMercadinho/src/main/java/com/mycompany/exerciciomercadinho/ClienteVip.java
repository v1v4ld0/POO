package com.mycompany.exerciciomercadinho;


public class ClienteVip extends Cliente {
    private String numeroCartao;

    public ClienteVip(String nome, double valorCompra) {
        super(nome, valorCompra);
        this.numeroCartao = numeroCartao;
    }
     
    public double calcularPagamento() {
        return getValorCompra() * 0.9;
    }
}
