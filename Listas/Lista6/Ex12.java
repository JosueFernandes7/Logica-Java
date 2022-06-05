package Listas.Lista6;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int divisores = 1;
        int numero = 1;
        int i = 2;
        while (numero <= 1000) {
            divisores = 1;
            i = 2;
            while (i <= numero / 2) {
                if (numero % i == 0) {
                    divisores += i;
                }
                i++;
            }
            if (divisores == numero) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
