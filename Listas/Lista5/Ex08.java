package Listas.Lista5;

import java.io.IOException;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double media, valor1, valor2, valor3;

        do {
            valor1 = in.nextDouble();
            valor2 = in.nextDouble();
            valor3 = in.nextDouble();
            media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
            System.out.printf("%.1f\n", media);
            n--;
        } while (n != 0);

    }
}
