package com.mycompany.exerciciomilitares;


public class MilitarExercito {
    private boolean participouGuerra;
    private boolean ganhouGuerra;

    public MilitarExercito(boolean participouGuerra, boolean ganhouGuerra) {
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }
    
    public boolean podeProgredir() {
        if (participouGuerra && ganhouGuerra) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MilitarExercito{" + "participouGuerra=" + participouGuerra + ", ganhouGuerra=" + ganhouGuerra + '}';
    }
    
}
