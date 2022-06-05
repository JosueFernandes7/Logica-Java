package Listas.Lista4;

import java.util.Scanner;

public class Ex13a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 1;

        float nota, media = 0.0f;

        System.out.print("Nota 0: ");
        nota = in.nextFloat();

        float maior = nota, meio = nota, menor = nota;

        while (cont < 3) {
            System.out.print("Nota " + cont + " : ");
            nota = in.nextFloat();
            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota <= maior && nota >= menor) {
                meio = nota;
            }
            cont++;
        }
        media = (maior + meio) / 2;

        System.out.printf("Media = %.2f", media);
    }
}