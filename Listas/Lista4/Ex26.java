package Listas.Lista4;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("[1]Branco [2] Nulo [3] candidatoA [4] candidatoB [5] candidatoC ");
        int voto = 0;
        int branco = 0, nulo = 0, A = 0, B = 0, C = 0;
        while (voto != -1) {
            voto = in.nextInt();
            if (voto == 1) {
                branco++;
            } else if (voto == 2) {
                nulo++;
            } else if (voto == 3) {
                A++;
            } else if (voto == 4) {
                B++;
            } else if (voto == 5) {
                C++;
            }
        }
        int eleitores = branco + nulo + A + B + C;
        String nomeVenc = "";
        if (A > B && A > C) {
            nomeVenc = "3";
        } else if (B > A && B > C) {
            nomeVenc = "4";
        } else if (C > A && C > B) {
            nomeVenc = "5";
        } else {
            eleitores++;
            if (A == B || B == C || A == C) {
                System.out.println("[3] VOTO(S) candidatoA = " + A);
                System.out.println("[4] VOTO(S) candidatoB = " + B);
                System.out.println("[5] VOTO(S) candidatoC =  " + C);
                System.out.println("DESEMPATE");
                nomeVenc = in.next();
            }
        }
        System.out.println("Numero do candidato vencedor: " + nomeVenc);
        System.out.println("Votos em Branco = " + branco);
        System.out.println("Votos nulos = " + nulo);
        System.out.println("Numero de Eleitores = " + eleitores);
    }
}
