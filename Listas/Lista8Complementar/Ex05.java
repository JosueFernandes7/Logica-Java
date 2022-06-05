package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Tamanho do Vetor A: ");
    int tamanhoA = in.nextInt();
    int[] vetorA = new int[tamanhoA];
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("vetorA[" + i + "] = ");
      vetorA[i] = in.nextInt();
    }

    System.out.print("Tamanho do Vetor B: ");
    int tamanhoB = in.nextInt();
    int[] vetorB = new int[tamanhoB];
    for (int i = 0; i < vetorB.length; i++) {
      System.out.print("vetorB[" + i + "] = ");
      vetorB[i] = in.nextInt();
    }

    int cont = 0;
    for (int i = 0; i < vetorB.length; i++) {
      for (int j = 0; j < vetorA.length; j++) {
        if (vetorB[i] == vetorA[j]) {
          cont++;
          break;
        }
      }
    }
    if (cont == vetorB.length)
      System.out.println("B eh subconjunto de A");
    else
      System.out.println("B nao eh subconjunto de A");
  }
}