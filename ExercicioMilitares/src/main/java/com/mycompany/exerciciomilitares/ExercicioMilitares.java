package com.mycompany.exerciciomilitares;


public class ExercicioMilitares {

    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();
        
        MilitarAeronautica aeronautica = new MilitarAeronautica(4, 300, 14, "Cabo");

        cadastro.adicionar(aeronautica);
        System.out.println(aeronautica.podeProgredir());
        cadastro.progressao();
        System.out.println(cadastro.toString());
    }
}
