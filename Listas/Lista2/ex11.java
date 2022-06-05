// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 = in.nextInt();
        System.out.print("Numero 2: ");
        int num2 = in.nextInt();
        int soma = num1 + num2;
        if (soma > 20) {
            soma += 8;
        } else {
            soma -= 10;
        }
        System.out.println("Nova soma = " + soma);

    }
}