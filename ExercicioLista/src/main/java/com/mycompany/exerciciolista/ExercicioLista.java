package com.mycompany.exerciciolista;


public class ExercicioLista {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int[] soma;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    soma = new int[] {i,j};
                    System.out.print("Posição " + soma[0] + " e " + soma[1]);
                    break;
                }
            } 
            break;
        }
    }
}
