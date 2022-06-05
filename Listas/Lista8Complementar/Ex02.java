package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[4];
    int[] vetor_Novo = new int[4];
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "] = ");
      vetor[i] = in.nextInt();
      if (i % 2 == 0) {
        vetor_Novo[i] = vetor[i] * 2;
      } else {
        vetor_Novo[i] = vetor[i] * 3;
      }
    }
    System.out.println("Vetor Normal");
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "] = " + vetor[i]);
    }
    System.out.println("Vetor Novo");
    for (int i = 0; i < vetor_Novo.length; i++) {
      System.out.println("vetor_Novo[" + i + "] = " + vetor_Novo[i]);
    }

  }
}