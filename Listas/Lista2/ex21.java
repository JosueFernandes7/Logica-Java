// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Comprimento da Pista em m: ");
        float pista = in.nextFloat();

        System.out.print("Numero de voltas: ");
        float voltas = in.nextInt();

        System.out.print("Numero de reabastecimentos: ");
        float reabast = in.nextInt();

        System.out.print("Consumo de Combustivel KM/L: ");
        float Gasol = in.nextFloat();

        float litros = (float) (pista * voltas / Gasol);
        float litrosReab = (float) (litros / reabast);

        System.out.printf("O numero minimo de litros ate o primeiro reabastecimento e de %.2f L", litrosReab);

    }
}