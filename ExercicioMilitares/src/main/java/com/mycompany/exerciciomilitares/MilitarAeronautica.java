/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciomilitares;

/**
 *
 * @author vival
 */
public class MilitarAeronautica extends Militar {
    private int anosPatente;
    private int horasVoo;

    public MilitarAeronautica(int anosPatente, int horasVoo, int matricula, String patente) {
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }
    
    public boolean podeProgredir() {
        if (anosPatente > 2 && horasVoo > 100) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MilitarAeronautica{" + "anosPatente=" + anosPatente + ", horasVoo=" + horasVoo + '}';
    }
    
}
