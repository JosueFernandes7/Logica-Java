// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero em macas: ");
        float macas = in.nextFloat();
        float valor;
        if (macas < 12) {
            valor = (float) (macas * 1.5);
        } else {
            valor = (float) (macas * 1.3);
        }
        System.out.printf("Preco total %.2f R$", valor);

    }
}