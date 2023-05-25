package com.mycompany.exerciciomilitares;


public class MilitarMarinha {
    private boolean participouConsertoAviao;

    public MilitarMarinha(boolean participouConsertoAviao) {
        this.participouConsertoAviao = participouConsertoAviao;
    }
    
    public boolean podeProgredir() {
        if (participouConsertoAviao) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MilitarMarinha{" + "participouConsertoAviao=" + participouConsertoAviao + '}';
    }
}
