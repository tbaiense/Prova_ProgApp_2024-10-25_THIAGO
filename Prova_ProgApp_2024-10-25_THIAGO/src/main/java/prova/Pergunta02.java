package prova;


/**
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.

(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
 */
import java.util.Scanner;

public class Pergunta02 {
    public static void main(String[] args) {
        Scanner in;
        int anos, meses, dias;
        
        while(true) {
            System.out.print("Quantidade de anos: ");
            in = new Scanner(System.in);
            anos = in.nextInt();
            
            if (anos < 0) {
                System.out.print("Anos devem ser zero ou mais. Tente novamente.");
            } else {
                break;
            }
        }
        
        while(true) {
            System.out.print("Quantidade de meses: ");
            in = new Scanner(System.in);
            meses = in.nextInt();
            
            if (anos < 0) {
                System.out.print("Meses devem ser zero ou mais. Tente novamente.");
            } else {
                break;
            }
        }
        
        while(true) {
            System.out.print("Quantidade de dias: ");
            in = new Scanner(System.in);
            dias = in.nextInt();
            
            if (anos < 0) {
                System.out.print("Dias devem ser zero ou mais. Tente novamente.");
            } else {
                break;
            }
        }
        
        int diasTotais = anos * 365 + meses * 30 + dias;
        System.out.printf("Dias calculados: %d", diasTotais);
    }
}
