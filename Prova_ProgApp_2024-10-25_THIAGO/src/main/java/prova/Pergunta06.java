package prova;

/**
Construa um algoritmo para ler um número N informado pelo usuário, ao final 
* deverá ser calculado a média, soma e a quantidade dos valores digitados.
 */

import java.util.Scanner;


public class Pergunta06 {
    public static void main(String[] args) {
        int[] nums;
        int soma = 0, N = 0;
        double media;
        Scanner in;
        
        System.out.print("Digite o valor de numeros a serem inseridos: ");
        in = new Scanner(System.in);
        N = in.nextInt();
        
        nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Insira o %s. valor: ", (i+1));
            in = new Scanner(System.in);
            soma += nums[i] = in.nextInt();
        }
        media = (double)soma / N;
        System.out.printf("""
                          Numeros cadastrados!
                          
                          Media: %1.2f
                          Soma: %d
                          Quantiadade de numeros inseridos: %d
                          """, media, soma, N);
    }
}
