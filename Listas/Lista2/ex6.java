// FEITO
package Listas.Lista2;

import java.util.Scanner;
import java.util.Date;

public class ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano, meses, dias, total;
        System.out.print("Quantos Anos voce viveu? ");
        ano = in.nextInt();
        System.out.print("Quantos Meses voce viveu? ");
        meses = in.nextInt();
        System.out.print("Quantos Dias voce viveu? d");
        dias = in.nextInt();
        total = ano * 365 + meses * 30 + dias;
        System.out.println("Voce viveu " + total + " Dias");
    }
}