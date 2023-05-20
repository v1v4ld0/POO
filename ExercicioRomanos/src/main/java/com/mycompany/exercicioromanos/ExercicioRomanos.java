package com.mycompany.exercicioromanos;
import java.util.Scanner;


public class ExercicioRomanos {

    public static void main(String[] args) {
        int[] numeros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letras = {"M", "CM", "D", "CD", "C", "XC", "L", "CL", "X", "IX", "V", "IV", "I"};
        Scanner input = new Scanner(System.in);
        
        int numero = 0;
        while (numero != -1){
            System.out.print("Digite um número INTEIRO: [Digite -1 para encerrar!] ");
            numero = input.nextInt(); 
            for (int i = 0; i < numeros.length; i ++) { // Vai até o tamanho da lista de números
                while(numero >= numeros[i]) { // Enquanto o número informado for MAIOR ou IGUAL ao número apontado na lista:
                System.out.print(letras[i]); // Printa os algarismos romanos correspondetes ao número apontado na lista
                numero -= numeros[i]; // Decrementa do número informado o número apontado na lista.
                }               
            }
            System.out.println(" ");
        }
        
    }
}
