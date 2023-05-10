package com.mycompany.transportes;


public class FretePadrao extends Frete {

    public FretePadrao(double distancia, double valorPorKm) {
        super(distancia, valorPorKm);
    }
    
    
    
    @Override
    public double calcularFrete() {
           return getDistancia() * getValorPorKm();
    }
        
}
