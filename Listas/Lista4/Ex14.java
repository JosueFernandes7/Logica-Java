package Listas.Lista4;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        float numero, mult = 1, soma = 0;

        while (i < 3) {
            System.out.print("Digite um numero: ");
            numero = in.nextInt();
            if (numero >= 1 && numero <= 10) {
                mult = mult * numero;
            } else {
                soma = soma + numero;
            }
            i++;
        }
        System.out.println("Multiplicacao = " + mult);
        System.out.println("Soma = " + soma);

    }
}