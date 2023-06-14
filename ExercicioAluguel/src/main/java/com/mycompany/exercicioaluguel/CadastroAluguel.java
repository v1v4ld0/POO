package com.mycompany.exercicioaluguel;

import java.util.ArrayList;
import java.util.List;


class CadastroAluguel {
    private List<Aluguel> alugueis;

    public CadastroAluguel() {
        this.alugueis = new ArrayList<>();
    }

    public void cadastrarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    // getters e setters
}
