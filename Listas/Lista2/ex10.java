// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sua idade: ");
        int idade = in.nextInt();
        System.out.println("CATEGORIA");

        if (idade >= 18) {
            System.out.println("\tAdulto");
        } else if (idade >= 14 && idade < 18) {
            System.out.println("\tJuvenil");
        } else if (idade >= 9 && idade < 14) {
            System.out.println("\tInfantil");
        } else {
            System.out.println("\tMirim");
        }

    }
}