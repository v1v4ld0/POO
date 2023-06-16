package com.mycompany.exercicioaluguel;

import java.util.ArrayList;
import java.util.List;


class CadastroResidencia {
    private List<Residencia> residencias;

    public CadastroResidencia() {
        this.residencias = new ArrayList<>();
    }

    public void cadastrarResidencia(Residencia residencia) {
        residencias.add(residencia);
    }

}