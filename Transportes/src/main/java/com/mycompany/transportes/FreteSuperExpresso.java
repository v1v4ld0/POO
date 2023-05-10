package com.mycompany.transportes;


public class FreteSuperExpresso extends FreteExpresso {
        private int valorSeguro;

        public FreteSuperExpresso(double distancia, double valorPorKm, int nivelUrgencia, int valorSeguro) {
                super(distancia, valorPorKm, nivelUrgencia);
                this.valorSeguro = valorSeguro;
        }
         
        public double calcularFrete() {
                return  super.calcularFrete() + valorSeguro;
        }
}
