// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        float num1 = in.nextFloat();
        System.out.print("Numero 2: ");
        float num2 = in.nextFloat();
        float div = num1 / num2;
        if (num2 == 0) {
            System.out.println("Nao e possivel dividir por zero");
        } else {
            System.out.printf("Divisao = %.2f", div);
        }

    }
}