/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author aluno
 */
public abstract class Frete implements Fretavel {
        private double distancia;
        private double valorPorKm;

        public Frete(double distancia, double valorPorKm) {
            this.distancia = distancia;
            this.valorPorKm = valorPorKm;
        }
        @Override 
        public abstract double calcularFrete();

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
            
        
        
}
