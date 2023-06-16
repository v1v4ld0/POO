package com.mycompany.exercicioaluguel;

import java.util.ArrayList;
import java.util.List;


class CadastroHospede {
    private List<Hospede> hospedes;

    public CadastroHospede() {
        this.hospedes = new ArrayList<>();
    }

    public void cadastrarHospede(Hospede hospede) {
        hospedes.add(hospede);
    }

}