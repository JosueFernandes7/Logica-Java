package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int aux;
    System.out.print("Tamanho do vetor: ");
    int n = in.nextInt();
    int[] vetor = new int[n];
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "] = ");
      vetor[i] = in.nextInt();
    }
    System.out.println();
    // Pares
    for (int i = 0; i < vetor.length; i++) {
      for (int j = i + 1; j < vetor.length; j++) {
        if (vetor[i] % 2 != 0 && vetor[j] % 2 == 0) {
          aux = vetor[j];
          vetor[j] = vetor[i];
          vetor[i] = aux;
        } else if (vetor[j] < vetor[i]) {
          aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }
    // Impares
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] % 2 != 0) {
        for (int j = i + 1; j < vetor.length; j++) {
          if (vetor[i] < vetor[j]) {
            aux = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = aux;
          }
        }
      }
      System.out.println("vetor[" + i + "] = " + vetor[i]);
    }
  }
}
