// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero da conta: ");
        String j = in.next();

        System.out.print("Saldo: ");
        float Saldo = in.nextFloat();

        System.out.print("Debito: ");
        float Debito = in.nextFloat();

        System.out.print("Credito: ");
        float Credito = in.nextFloat();

        float saldoNovo = (float) (Saldo - Debito + Credito);
        System.out.printf("Conta numero: %s\n\t Saldo de R$ %.2f", j, saldoNovo);

    }
}