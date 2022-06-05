// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade atual em estoque: ");
        float estoque = in.nextFloat();

        System.out.print("quantidade maxima em estoque: ");
        float estoqueMax = in.nextFloat();

        System.out.print(" quantidade minima em estoque: ");
        float estoqueMin = in.nextFloat();

        float media = (float) ((estoqueMax - estoqueMin) / 2);
        if (estoque >= media) {
            System.out.println("Nao efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

    }
}