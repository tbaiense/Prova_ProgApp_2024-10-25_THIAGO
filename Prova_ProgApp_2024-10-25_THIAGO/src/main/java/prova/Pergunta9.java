package prova;

import java.util.Scanner;

public class Pergunta9 {
    public static void main(String[] args) {
        double TX_IR = 0.11;
        double TX_INSS = 0.08;
        double TX_SINDICATO = 0.05;
        double salHr, salBruto, salLiquido, valorIR, valorINSS, valorSindicato;
        int hrMes;
        Scanner in;
        
        System.out.print("Valor da hora trabalhada: R$ ");
        in = new Scanner(System.in);
        salHr = in.nextDouble();
        
        System.out.print("Horas trabalhadas no mes:  ");
        in = new Scanner(System.in);
        hrMes = in.nextInt();
        
        salBruto = salHr * hrMes;
        valorIR = salBruto * TX_IR;
        valorINSS = salBruto * TX_INSS;
        valorSindicato = salBruto * TX_SINDICATO;
        salLiquido = salBruto - valorIR - valorINSS - valorSindicato;
        
        System.out.printf("""
            + Salario Bruto: R$ %1.2f
            - Imposto de Renda (11%%): R$ %1.2f
            - INSS (8%%): R$ %1.2f
            - Sindicato (5%%): R$ %1.2f
            = Salario Liquido: R$ %1.2f
                          """, salBruto, valorIR, valorINSS, valorSindicato, salLiquido);
    }
}
