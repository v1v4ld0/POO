package com.mycompany.exerciciomilitares;

import java.util.ArrayList;


public class CadastroMilitar {
    private ArrayList<Militar> lista;
    
    public CadastroMilitar() {
        this.lista = new ArrayList<>();
    }
    
    public void adicionar(Militar militar) {
        lista.add(militar);
    }
    
    public void progrediuPatente() {
        for (Militar militares: lista) {
            if (militares.podeProgredir()) {
                System.out.print(militares);
            }
        }
    }
    
    public void progressao() {
        for (Militar patente: lista) {
            if (patente.podeProgredir()) {
                if (patente.getPatente().equals("Soldado")) {
                    patente.setPatente("Cabo");
                }
                else if (patente.getPatente().equals("Cabo")) {
                    patente.setPatente("Tenente");
                }
                else if (patente.getPatente().equals("Tenente")) {
                    System.out.println("PATENTE MÁXIMA");
                }
                else {
                    System.out.println("PATENTE NÃO CADASTRADA");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "CadastroMilitar{" + "lista=" + lista + '}';
    }
}
