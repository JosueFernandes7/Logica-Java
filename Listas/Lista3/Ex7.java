package Listas.Lista3;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual Combustivel Voce deseja?");
        System.out.print("A->alcool\nG->gasolina\n: ");
        String tipo = in.next();
        System.out.print("Quantos litros: ");
        int litros = in.nextInt();
        double pAlcool = 3.9;
        double pGasoline = 4.3;
        double valor = 0;

        if (tipo.equals("G") || tipo.equals("g")) {
            valor = litros * pGasoline;
            if (litros <= 20) {
                valor -= valor * 3 / 100;
            } else {
                valor -= valor * 5 / 100;
            }
        }

        if (tipo.equals("A") || tipo.equals("a")) {
            valor = litros * pAlcool;
            if (litros <= 20) {
                valor -= valor * 4 / 100;
            } else {
                valor -= valor * 6 / 100;
            }
        }

        System.out.printf("Preco a ser pago = R$ %.3f", valor);
    }
}