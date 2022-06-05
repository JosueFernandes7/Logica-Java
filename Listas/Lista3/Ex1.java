package Listas.Lista3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = in.nextDouble();
        if (num < 0) {
            System.out.println("NUMERO NEGATIVO");
        } else if (num == 0) {
            System.out.println("NUMERO = ZERO");
        } else {
            System.out.println("NUMERO POSITIVO");
        }
    }
}
