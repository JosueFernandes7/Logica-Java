package Listas.Lista8;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[20];
    int aux;
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Posicao " + (i + 1) + ": ");
      vetor[i] = in.nextInt();
    }
    for (int i = 0; i < vetor.length / 2; i++) {
      aux = vetor[i];
      vetor[i] = vetor[i + vetor.length / 2];
      vetor[i + vetor.length / 2] = aux;
      System.out.println("Posicao " + (i + 1) + " = " + vetor[i]);

    }
    for (int i = vetor.length / 2; i < vetor.length; i++) {
      System.out.println("Posicao " + (i + 1) + " = " + vetor[i]);
    }
  }
}
