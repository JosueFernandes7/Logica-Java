package Listas.Lista3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite Tres numeros: ");
        int num1, num2, num3, maior;
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        int soma;
        if (num1 > num2 && num2 > num3) {
            soma = num1 + num2;
        } else if (num2 > num3 && num3 > num1) {
            soma = num2 + num3;
        } else {
            soma = num3 + num1;
        }
        System.out.println("Soma dos Maiores = " + soma);

    }
}