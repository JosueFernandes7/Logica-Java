package Listas.Lista6;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double e = 0, fatorial = 1;
        while (n != 0) {
            fatorial = 1;
            if (e == 0) {
                e = 1;
            } else {
                for (int i = 1; i <= n; i++) {
                    fatorial = fatorial * i;
                }
                e += 1 / fatorial;
            }
            n--;
        }
        System.out.printf("E = %.2f", e);
    }
}
