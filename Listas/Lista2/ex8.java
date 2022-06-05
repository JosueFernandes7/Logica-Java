// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int eleitores, brancos, nulos, validos;
        System.out.print("Numero de Eleitores: ");
        eleitores = in.nextInt();
        System.out.print("Votos Brancos: ");
        brancos = in.nextInt();
        System.out.print("Votos Nulos: ");
        nulos = in.nextInt();
        System.out.print("Votos Validos: ");
        validos = in.nextInt();
        float Pbrancos, Pnulos, Pvalidos;

        Pbrancos = (float) brancos / eleitores * 100;
        Pnulos = (float) nulos / eleitores * 100;
        Pvalidos = (float) validos / eleitores * 100;
        System.out.printf("Porcentagem brancos %.2f %%\n", Pbrancos);
        System.out.printf("Porcentagem nulos %.2f %%\n", Pnulos);
        System.out.printf("Porcentagem Validos %.2f %%\n", Pvalidos);
    }
}