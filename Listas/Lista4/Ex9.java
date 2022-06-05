package Listas.Lista4;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade Invalida Digite novamente: ");
            idade = in.nextInt();
        }
        System.out.println("IDADE DE " + idade + " ANOS CADASTRADA");
    }
}
