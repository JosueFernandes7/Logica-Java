package Listas.Lista6;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        String repetir = "";
        do {
            do {
                System.out.print("Digite um valor Positivo: ");
                numero = in.nextInt();
                if (numero <= 0) {
                    System.out.print("Valor Incorreto!\n");
                }
            } while (numero <= 0);
            System.out.print("Numeros pares entre 1 e " + numero + ": ");
            for (int i = 1; i < numero; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.print("\nVoce desejar repetir sim/nao: ");
            repetir = in.next();
        } while (!repetir.equals("nao"));
    }
}
