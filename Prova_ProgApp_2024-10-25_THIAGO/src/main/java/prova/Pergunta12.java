package prova;

import java.util.Arrays;
import java.util.Scanner;

public class Pergunta12 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner in;
        
        for (int n = 0; n < vetor.length; n++) {
            System.out.printf("Insira o numero %d: ", (n+1));
            in = new Scanner(System.in);
            vetor[n] = in.nextInt();
        }
        System.out.println("\nCadastro finalizado!\n");
        
        // Ordenação select
        for (int out = vetor.length-1; out > 0; out--) {
            int indexMaxNum = 0;
            for (int inner = 0; inner < out; inner++) {
                if (vetor[inner] > vetor[indexMaxNum]) {
                    indexMaxNum = inner;
                }
            }
            int copia = vetor[out];
            vetor[out] = vetor[indexMaxNum];
            vetor[indexMaxNum] = copia;
        }
        
        System.out.print("VETOR ORDERNADO:\n" + Arrays.toString(vetor));
        
        System.out.println("\nNumero adicional a ser inserido: ");
        in = new Scanner(System.in);
        int adicional = in.nextInt();
        int[] novoVetor = new int[vetor.length + 1];
        int indexInsert = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < adicional) {
                indexInsert = i + 1;
            } else {
                break;
            }
        }
        
        for (int antes = 0; antes < indexInsert; antes++) {
            novoVetor[antes] = vetor[antes];
        }
        novoVetor[indexInsert] = adicional;
        for(int depois = indexInsert+1; depois < novoVetor.length; depois++) {
            novoVetor[depois] = vetor[depois-1];
        }
        
        vetor = novoVetor;
        
        System.out.print("NOVO VETOR ORDERNADO:\n" + Arrays.toString(vetor));
    }
}
