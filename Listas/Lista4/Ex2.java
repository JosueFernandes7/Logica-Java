package Listas.Lista4;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("Soma = " + soma);
    }
}
