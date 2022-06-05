package Listas.Lista3;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        if (media < 6) {
            System.out.println("NOTA D");
        } else if (media < 7.5) {
            System.out.println("NOTA C");
        } else if (media < 9) {
            System.out.println("NOTA B");
        } else {
            System.out.println("NOTA A");
        }
    }
}
