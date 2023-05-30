package com.mycompany.exerciciomercadinho;


public class Principal {
     public static void main(String[] args) {
        MixMateus mercadinho = new MixMateus(3);
        ClienteOuroVip ouroVip = new ClienteOuroVip("Vitor", 5.4);
        ClienteRegular regular = new ClienteRegular("Vivaldo", 2.8);
        ClienteVip vip = new ClienteVip("Rato", 4.7);
         
         
        mercadinho.addClientes(vip);
        mercadinho.addClientes(regular);
        mercadinho.addClientes(ouroVip);
        
        System.out.println(mercadinho.calcularTotal());
         
     }
}
