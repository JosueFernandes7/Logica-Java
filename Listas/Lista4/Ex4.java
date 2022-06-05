package Listas.Lista4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String saida = "d", entrada = "a";
        float saldo = 0, aux;
        while (saida != entrada.intern()) {
            System.out.println("[a] Consulta Saldo");
            System.out.println("[b] Saque");
            System.out.println("[c] Depósito");
            System.out.println("[d] Sair");
            entrada = in.next().toLowerCase();
            // consulta
            if (entrada.equals("a")) {

                System.out.printf("Saldo = R$ %.2f\n", saldo);
            }
            // saque
            if (entrada.equals("b")) {
                System.out.printf("Quanto voce quer remover: ");
                aux = in.nextFloat();
                saldo -= aux;
                if (saldo < 0) {
                    saldo = 0;
                }
                System.out.printf("Saldo = R$ %.2f\n", saldo);
            }
            // deposito
            if (entrada.equals("c")) {
                System.out.printf("Quanto voce quer adicionar: ");
                aux = in.nextFloat();
                saldo += aux;
                System.out.printf("Saldo = R$ %.2f\n", saldo);
            }

        }
        System.out.println("voce saiu");
    }
}
