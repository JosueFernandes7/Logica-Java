// FEITO
package Listas.Lista1;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, square;
        number = in.nextInt();
        square = number * number;
        System.out.print("O quadrado de " + number + " e " + square);
        // se usar Math.pow(number,2) ele retorna um float ou double;

    }
}