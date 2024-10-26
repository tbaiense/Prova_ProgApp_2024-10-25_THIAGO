package prova;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Pergunta11 {
    public static void main(String[] args) throws IOException {
        int qtdParticipantes;
        String[] generosFilme = new String[] {
            "Acao",
            "Comedia",
            "Aventura",
            "Romance",
            "Suspence",
            "Terror"
        };
        
        int[] qtdFavoritos = new int[generosFilme.length];
        Scanner in;
        
        System.out.print("Quantos clientes participarao da pesquisa: ");
        in = new Scanner(System.in);
        qtdParticipantes = in.nextInt();
        
        // String filmes
        StringBuilder generosBuild = new StringBuilder("---- GENEROS FILME ----\n");
        for (int g = 0; g < generosFilme.length; g++) {
            generosBuild.append(String.format("%d -- %s\n", (g+1), generosFilme[g]));
        }
        generosBuild.append("\nGenero favorito >>> ");
        String strGeneros = generosBuild.toString();
        
        for (int p = 0; p < qtdParticipantes; p++) {
            while (true) {
                System.out.print(strGeneros);
                in = new Scanner(System.in);
                int escolha = in.nextInt();

                if (escolha >= 0 && escolha <= generosFilme.length) {
                    System.out.println("Escolha registrada!\n");
                    qtdFavoritos[escolha-1]++;
                    break;
                } else {
                    System.out.println("Escolha inválida. Tente novamente.");
                }
            }
        }
        System.out.println("\nPesquisa finalizada!\n");
        
        String strFavoritos;
        {
            StringBuilder strFavoritosBuilder = new StringBuilder("---- GENEROS FAVORITOS ----\n");
            for (int g = 0; g < generosFilme.length; g++) {
                strFavoritosBuilder.append(String.format("%d favs. --- %s\n", qtdFavoritos[g], generosFilme[g]));
            }
            strFavoritos = strFavoritosBuilder.toString();
        }
        
        JOptionPane.showMessageDialog(null, strFavoritos);
        FileWriter arquivo = new FileWriter("./GENEROS-FILME.txt");
        PrintWriter impressora = new PrintWriter(arquivo);
        impressora.println(strFavoritos);
        arquivo.close();
    }
}
