package Listas.Lista3;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite Tres numeros: ");
        int a, b, c, maior, menor, meio;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        maior = a;
        menor = a;
        meio = a;
        if (b > maior)
            maior = b;

        if (c > maior)
            maior = c;

        if (b < menor)
            menor = b;

        if (c < menor)
            menor = c;

        if (b < maior && b > menor)
            meio = b;

        if (c < maior && c > menor)
            meio = c;

        System.out.println(menor + " " + meio + " " + maior);

    }
}