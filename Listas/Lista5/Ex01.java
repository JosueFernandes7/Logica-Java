package Listas.Lista5;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double val = in.nextDouble();
        int valor = (int) (val * 100);
        int n100, n50, n20, n10, n5, n2;
        int m1, m50, m25, m10, m5, m01;

        n100 = valor / (100 * 100);
        valor = valor % (100 * 100);

        n50 = valor / (50 * 100);
        valor = valor % (50 * 100);

        n20 = valor / (20 * 100);
        valor = valor % (20 * 100);

        n10 = valor / (10 * 100);
        valor = valor % (10 * 100);

        n5 = valor / (5 * 100);
        valor = valor % (5 * 100);

        n2 = valor / (2 * 100);
        valor = valor % (2 * 100);

        m1 = valor / (1 * 100);
        valor = valor % (1 * 100);

        m50 = valor / 50;
        valor = valor % 50;

        m25 = valor / 25;
        valor = valor % 25;

        m10 = valor / 10;
        valor = valor % 10;

        m5 = valor / 5;
        valor = valor % 5;

        m01 = valor;

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m01 + " moeda(s) de R$ 0.01");
    }
}