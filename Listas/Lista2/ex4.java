// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 = in.nextInt();
        System.out.print("Numero 2: ");
        int num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println("Maior valor num1: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maior valor num2: " + num2);
        } else {
            System.out.println("Numeros iguais\nnum1: " + num1 + "\nnum2: " + num2);
        }

    }
}