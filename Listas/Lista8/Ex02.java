package Listas.Lista8;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] posicoes = new int[6];
        // 0 é o numero 1, 1 é o numero 2...
        System.out.println("Numero de lancamentos : ");
        int lancamentos = in.nextInt();
        for (int i = 0; i < lancamentos; i++) {
            System.out.print("Qual face: ");
            int valor = in.nextInt() - 1;
            posicoes[valor] += 1;
        }
        for (int i = 0; i < posicoes.length; i++) {
            System.out.println("Face " + (i + 1) + " = " + posicoes[i]);
        }
    }
}
