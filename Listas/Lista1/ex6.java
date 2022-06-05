// FEITO
package Listas.Lista1;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, media;
        System.out.print("Informe a nota 1: ");
        nota1 = in.nextFloat();
        System.out.print("Informe a nota 2: ");
        nota2 = in.nextFloat();
        media = (nota1 + nota2) / 2;
        System.out.printf("MEDIA = %.2f", media);
    }
}