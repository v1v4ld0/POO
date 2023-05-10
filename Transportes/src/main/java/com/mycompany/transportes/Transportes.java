package com.mycompany.transportes;


public class Transportes {

    public static void main(String[] args) {
        CadastroFrete cadastro = new CadastroFrete();
        FreteExpresso frete = new FreteExpresso(3.2, 5.1, 7);
        cadastro.cadastrar(frete);
        System.out.println(cadastro.calcularValorTotalFretes());       
    }
    
}
