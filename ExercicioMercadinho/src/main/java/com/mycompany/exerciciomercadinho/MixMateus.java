package com.mycompany.exerciciomercadinho;


public class MixMateus{
    Cliente clientes[];
    int qtde;
    
    public MixMateus(int qtde) {
        this.clientes = new Cliente[qtde];
        this.qtde = 0;
    }   
    
    public boolean addClientes(Cliente c) {
        if (qtde == this.clientes.length) {
            return false;
        }
        this.clientes[this.qtde++] = c;
        return true;
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Cliente cliente : clientes) {
            total += cliente.calcularPagamento();
        }
        return total;
    }
    
    public void imprimirClientes() {
        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }
    } 

}
