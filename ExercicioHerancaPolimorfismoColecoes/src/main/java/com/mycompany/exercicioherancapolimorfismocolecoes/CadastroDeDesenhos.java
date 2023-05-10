/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioherancapolimorfismocolecoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vival
 */
public class CadastroDeDesenhos {
    private List<Desenho> desenhos = new ArrayList<>();

  public void adicionarDesenho(Desenho desenho) {
    desenhos.add(desenho);
  }
  
   public void desenharTodos() {
    for (Desenho desenho : desenhos) {
      desenho.desenhar();
    }
  }
}
