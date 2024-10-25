package prova;

/**
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
Utilize:
JOptionPane.showMessageDialog
JOptionPane.showInputDialog
 */

import javax.swing.JOptionPane;

public class Pergunta04 {
    public static void main(String[] args) {
        int num;
        String strNum = JOptionPane.showInputDialog(null, "Insira um número");
        num = Integer.parseInt(strNum);
        JOptionPane.showMessageDialog(null, String.format("Número digitado: %d\nAntecessor: %d\nSucessor: %d\n", num, num-1, num+1));
    }
}
