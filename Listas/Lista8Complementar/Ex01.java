package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[10];
    int[] vetor_Inverso = new int[10];
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "] = ");
      vetor[i] = in.nextInt();
      vetor_Inverso[vetor.length - 1 - i] = vetor[i];
    }
    System.out.println("Vetor Normal");
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "] = " + vetor[i]);
    }
    System.out.println("Vetor Inverso");
    for (int i = 0; i < vetor_Inverso.length; i++) {
      System.out.println("vetor[" + i + "] = " + vetor_Inverso[i]);
    }

  }
}