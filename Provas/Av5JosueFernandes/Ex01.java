import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean iguais = true;

        System.out.print("Qual o tamanho dos dois vetores: ");
        int n = in.nextInt();

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];

        // v1
        System.out.println("VETOR 1");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Vetor1[" + i + "] = ");
            vetor1[i] = in.nextInt();
        }
        // v2
        System.out.println("VETOR 2");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Vetor2[" + i + "] = ");
            vetor2[i] = in.nextInt();
        }
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                System.out.println("Posicao " + i + " tem valores diferentes");
                iguais = false;
            }
        }
        if (iguais) {
            System.out.println("Sao iguais!");
        }

    }
}