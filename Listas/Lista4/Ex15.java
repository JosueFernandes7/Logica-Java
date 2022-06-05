package Listas.Lista4;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, i = 1, resto = 0;
        System.out.print("Digite um numero: ");
        num1 = in.nextInt();

        while (i <= num1) {
            if (num1 % i == 0) {
                resto++;
            }
            i++;
        }
        if (resto == 2) {
            System.out.println(num1 + " e primo");
        } else {
            System.out.println(num1 + " nao primo");
        }
    }
}