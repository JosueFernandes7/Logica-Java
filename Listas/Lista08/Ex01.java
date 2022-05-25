package Listas.Lista08;

import java.util.Scanner;
public class Ex01 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos Digitos: ");
        int i = in.nextInt();
        int[] vetor = new int[i];
        for (int j = 0; j < vetor.length; j++) {
            System.out.print("Valor na posicao "+j+" : ");
            vetor[j] = in.nextInt();
        }
        System.out.println("\n\n");
        for (int j = vetor.length-1; j >= 0 ; j--) {
            System.out.println("Valor na posicao "+j+" : "+vetor[j]);
        }

    }
}
