package Listas.Lista4;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tentativas = 1, senha;

        System.out.print("Digite a senha: ");
        senha = in.nextInt();
        while (senha != 12345) {
            System.out.println("Voce errou digite novamente");
            senha = in.nextInt();
            tentativas++;
        }
        System.out.println("Voce acertou a senha com " + tentativas + " tentativas");
    }
}
