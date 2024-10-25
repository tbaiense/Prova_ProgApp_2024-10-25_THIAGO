package prova;

/**
import java.util.Scanner;
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pergunta03 {
    public static void main(String[] args) {
        Scanner in;
        
        int[] qntCafes  = new int[3];
        double[] precoCafes = new double[] {
            0.75,
            1.0,
            1.25
        };
        while(true) {
            System.out.printf("""
            ------------- CAFETERIA -------------
            [ESCOLHA UM CAFE]
                1- CAFE EXPRESSO R$ %1.2f
                2- CAFE CAPUCCINO R$ %1.2f
                3- LEITE COM CAFE R$ %1.2f
                              
            [ACOES]           
                4- TOTALIZAR VENDAS
            
            O que deseja fazer?
            Opcao >>> """, precoCafes[0], precoCafes[1], precoCafes[2]);
            in = new Scanner(System.in);
            int entrada = 0;
            try {
                entrada = in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Numero invalido! Tente novamente.\n");
                continue;
            }
            
            switch (entrada) {
                   case 1, 2, 3 -> {
                       System.out.println("Cafe comprado com sucesso!\n");
                       qntCafes[entrada-1]++;
                   }
                   case 4 -> {
                       int qntCafesTotal = 0;
                       double valorCafesTotal = 0;
                       double[] valorCafes = new double[qntCafes.length];
                       
                       for (int i =0 ; i < qntCafes.length; i++) {
                           int q = qntCafes[i];
                           double p = precoCafes[i];
                           
                           qntCafesTotal += q;
                           valorCafesTotal += valorCafes[i] = q * p;
                       }
                       
                       System.out.printf("""
                            ------------- CAFETERIA -------------
                            Relatorio de cafes:
                                %d und, R$ %1.2f vendidos -- CAFE EXPRESSO
                                %d und, R$ %1.2f vendidos -- CAFE CAPUCCINO
                                %d und, R$ %1.2f vendidos -- LEITE COM CAFE
                            Totalizando:
                                %d und, R$ %1.2f vendidos no total\n""", 
                               qntCafes[0], valorCafes[0],
                               qntCafes[1], valorCafes[1],
                               qntCafes[2], valorCafes[2],
                               qntCafesTotal, valorCafesTotal);
                   }
                   default -> System.out.print("Opcao invalida! Tente novamente.\n");
                }
        }
        
    }
}
