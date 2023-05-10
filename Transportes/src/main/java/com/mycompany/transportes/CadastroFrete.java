package com.mycompany.transportes;

import java.util.ArrayList;

public class CadastroFrete{
        private ArrayList<Frete> fretes;

        public CadastroFrete() {
                this.fretes = new ArrayList<>();
        }
        
        public void cadastrar(Frete f) {
                fretes.add(f);
        }
        
        public double calcularValorTotalFretes() {
            double total = 0;    
            for (Frete frete: fretes) {
                       total += frete.calcularFrete();
                }
            return total;
        }
}
