// FEITO
package Listas.Lista1;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int users, votoV, votoB, votoN;
        System.out.println("ELEICOES MUNICIPAIS");
        System.out.println("===================");

        System.out.print("Numero de Eleitores: ");
        users = in.nextInt();

        System.out.print("Numero de Votos Validos: ");
        votoV = in.nextInt();

        System.out.print("Numero de Votos Brancos: ");
        votoB = in.nextInt();

        System.out.print("Numero de Votos Nulos: ");
        votoN = in.nextInt();

        float percV, percB, percN;
        // para funcionar um dos termos tem que ser double, se fosse float tinha que ser
        // float
        // ( 90 / 112 ) é uma divisão de inteiros.

        // O java faz o cast pra double que arrendonda pra baixo (0) devido ao
        // resultado: 0,8035... quando é feito a multiplicação: 0 x 100 = 0

        percV = ((float) votoV / users) * 100;
        percB = ((float) votoB / users) * 100;
        percN = ((float) votoN / users) * 100;

        System.out.printf("\nPercentual de votos Validos %.2f%%\n", percV);

        System.out.printf("Percentual de votos brancos %.2f%%\n", percB);

        System.out.printf("Percentual de votos nulos %.2f%%\n", percN);
    }
}