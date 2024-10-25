package prova;

/**
Faça um algoritmo para ler um número que é um código de usuário.
* Caso este código seja diferente de um código armazenado internamente no algoritmo 
* (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código 
* seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver 
* incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. 
* Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
 */

import java.util.Scanner;

public class Pergunta05 {
    public static void main(String[] args) {
        final int USUARIO = 1234;
        final int SENHA = 9999;
        int entradaUsuario;
        int entradaSenha;
        Scanner in;
        
        System.out.print("Insira o codigo do usuario: ");
        in = new Scanner(System.in);
        
        entradaUsuario = in.nextInt();
        if (entradaUsuario == USUARIO) {
            System.out.print("Insira a senha do usuario: ");
            in = new Scanner(System.in);

            entradaSenha = in.nextInt();
            if (entradaSenha == SENHA) {
                System.out.print("Acesso permitido!");
            } else {
                System.out.print("Senha incorreta");
            }
        } else {
            System.out.print("Usuario invalido!");
        }
                
    }
}
