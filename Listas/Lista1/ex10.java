// FEITO
package Listas.Lista1;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float ingresso;
        int socios, criancas, normal, publico = 0;
        System.out.print("VALOR DO INGRESSO: ");
        ingresso = in.nextFloat();

        System.out.print("Numero de socios: ");
        socios = in.nextInt();

        System.out.print("Numero de nao pagantes: ");
        criancas = in.nextInt();

        System.out.print("Numero pagantes: ");
        normal = in.nextInt();

        publico = socios + criancas + normal;

        float rendaTotal, valorPerdido;

        rendaTotal = (float) ((socios * ingresso * 0.7) + (normal * ingresso));

        valorPerdido = (float) ((criancas * ingresso) + (socios * 0.3 * ingresso));

        System.out.println("\nPublico Total: " + publico);
        System.out.printf("Renda total: %.2f R$\n", rendaTotal);
        System.out.printf("Renda nao arrecadada: %.2f R$", valorPerdido);

    }
}