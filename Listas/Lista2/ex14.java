// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ano atual: ");
        int atual = in.nextInt();
        System.out.print("Ano de Nascimento: ");
        int nasc = in.nextInt();
        int idade = atual - nasc;
        if (idade >= 18) {
            System.out.println("Pode votar > 18");
        } else {
            System.out.println("Nao pode votar <18");
        }

    }
}