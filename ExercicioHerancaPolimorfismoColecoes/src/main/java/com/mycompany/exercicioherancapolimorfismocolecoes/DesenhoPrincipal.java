package com.mycompany.exercicioherancapolimorfismocolecoes;


public class DesenhoPrincipal {
    public static void main(String[] args) {
    CadastroDeDesenhos cadastrar = new CadastroDeDesenhos();

    Desenho retangulo = new Retangulo();
    Desenho circulo = new Circulo();
    Desenho quadrado = new Quadrado();
    Desenho pessoa = new Pessoa();

    cadastrar.adicionarDesenho(retangulo);
    cadastrar.adicionarDesenho(circulo);
    cadastrar.adicionarDesenho(quadrado);
    cadastrar.adicionarDesenho(pessoa);

    cadastrar.desenharTodos();
  }
}
