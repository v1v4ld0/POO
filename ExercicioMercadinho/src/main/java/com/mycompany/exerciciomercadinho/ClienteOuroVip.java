package com.mycompany.exerciciomercadinho;


public class ClienteOuroVip extends ClienteVip {
    private String endereco;

    public ClienteOuroVip(String nome, double valorCompra) {
        super(nome, valorCompra);
        this.endereco = endereco;
    }
    
    public double calcularPagamento() {
        return getValorCompra() * 0.85;
    }
    
}
