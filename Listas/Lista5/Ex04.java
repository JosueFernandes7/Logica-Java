package Listas.Lista5;

import java.io.IOException;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int quant = in.nextInt();
        float valor = 0;

        if (num == 1) {
            valor = quant * 4;
        }
        if (num == 2) {
            valor = quant * 4.5f;
        }
        if (num == 3) {
            valor = quant * 5;
        }
        if (num == 4) {
            valor = quant * 2;
        }
        if (num == 5) {
            valor = quant * 1.5f;
        }

        System.out.printf("Total: R$ %.2f\n", valor);
    }

}