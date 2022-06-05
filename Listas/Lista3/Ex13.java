package Listas.Lista3;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual o nome do Produto: ");
        String produto = in.next();
        System.out.print("Qual Quantidade desejada: ");
        int quant = in.nextInt();
        System.out.print("Qual o valor unitario: ");
        float vUnidade = in.nextFloat();
        float valor = quant * vUnidade;
        int desconto;

        if (quant <= 5) {
            valor -= valor * 2 / 100;
            desconto = 2;
        } else if (quant > 5 && quant <= 10) {
            valor -= valor * 3 / 100;
            desconto = 3;
        } else {
            valor -= valor * 5 / 100;
            desconto = 5;
        }
        System.out.println(produto + " esta com Valor novo com desconto de " + desconto + "% RS " + valor);

    }
}
