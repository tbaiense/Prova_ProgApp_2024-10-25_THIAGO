package prova;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Pergunta10 {
    public static void main(String[] args) throws IOException {
        int qtdProd;
        String[] nomeProd;
        double[] precoProd;
        Scanner in;
        
        System.out.print("Quantos produtos deseja cadastrar: ");
        in = new Scanner(System.in);
        qtdProd = in.nextInt();
        
        nomeProd = new String[qtdProd];
        precoProd = new double[qtdProd];
        StringBuilder strProdutos = new StringBuilder("---- PRODUTOS ----\n");
        for (int p = 0; p < qtdProd; p++) {
            System.out.printf("Nome do produto %d: ", (p+1));
            in = new Scanner(System.in);
            nomeProd[p] = in.nextLine().trim();
            strProdutos.append(nomeProd[p]);
            
            System.out.printf("Preco do produto %d: ", (p+1));
            in = new Scanner(System.in);
            precoProd[p] = in.nextDouble();
            System.out.println("\nProduto cadastrado!\n");
            strProdutos.append(String.format(" (R$ %1.2f)\n", precoProd[p]));
        }
        System.out.println("\nCadastro finalizado!\n");
        
        String produtos = strProdutos.toString();
        JOptionPane.showMessageDialog(null, produtos);
        FileWriter arquivo = new FileWriter("./PRODUTOS.txt");
        PrintWriter impressora = new PrintWriter(arquivo);
        impressora.println(produtos);
        arquivo.close();
    }
}
