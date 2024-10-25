package prova;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Pergunta08 {
    public static void main(String[] args) throws IOException {
        int num;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o numero para calcular a tabuada: ");
        num = in.nextInt();
        StringBuilder strTabuada = new StringBuilder(String.format("----- TABUADA DE %s -----\n", num));
        
        for (int d = 1; d <= 10; d++) {
            strTabuada.append(String.format("%d x %d = %d\n", num, d, num*d));
        }
        
        FileWriter arquivo = new FileWriter("C:\\Users\\t.baiense\\Desktop\\TABUADA.txt");
        PrintWriter impressora = new PrintWriter(arquivo);
        impressora.println(strTabuada.toString());
        arquivo.close();
        System.out.println("Arquivo escrito!");
    }
}
