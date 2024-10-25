package prova;

import java.util.Scanner;

public class Pergunta07 {
    public static void main(String[] args) {
        String[] jogadores = new String[2];
        String[] pistasFilme = new String[5];
        int proxPista;
        String nomeFilme;
        
        Scanner in;
        
        System.out.print("Jogador 1 - Digite seu nome: ");
        in = new Scanner(System.in);
        jogadores[0] = in.nextLine().trim();
        
        System.out.printf("%s - Digite o nome do filme: ", jogadores[0]);
        in = new Scanner(System.in);
        nomeFilme = in.nextLine().trim();
        
        for (int p = 0; p < pistasFilme.length; p++) {
            System.out.printf("%s - Digite a pista %d: ", jogadores[0], (p+1));
            in = new Scanner(System.in);
            pistasFilme[p] = in.nextLine().trim();
        }
        
        System.out.println("\n\n--------------------------------------");
        
        System.out.print("Jogador 2 - Digite seu nome: ");
        in = new Scanner(System.in);
        jogadores[1] = in.nextLine().trim();
        
        boolean pistasEsgotadas = false;
        for (proxPista = 0; proxPista < pistasFilme.length; proxPista++) {
            System.out.printf("%s, a pista %d e: %s\n%s, Qual o nome do filme? ", jogadores[1], proxPista+1, pistasFilme[proxPista], jogadores[1]);
            in = new Scanner(System.in);
            String tentativa = in.nextLine().trim();
            
            if (nomeFilme.equalsIgnoreCase(tentativa)) {
                System.out.printf("%s, voce acertou!\n", jogadores[1]);
                break;
            } else {
                System.out.printf("%s, voce errou!\n", jogadores[1]);
                if (proxPista == pistasFilme.length -1) {
                    pistasEsgotadas = true;
                }
            }
        }
        if (pistasEsgotadas) {
            System.out.print("Voce perdeu pois suas pistas foram esgotadas!");
        }
    }
}
