package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Qual o tamanho dos vetores: ");
    int n = in.nextInt();
    int[] v1 = new int[n];
    int[] v2 = new int[n];
    for (int i = 0; i < v1.length; i++) {
      System.out.print("v1[" + i + "] = ");
      v1[i] = in.nextInt();
    }
    System.out.println();
    for (int i = 0; i < v2.length; i++) {
      System.out.print("v2[" + i + "] = ");
      v2[i] = in.nextInt();
    }
    for (int i = 0; i < v1.length; i++) {
      if (v1[i] == v2[i]) {
        System.out.println("Valores Iguais na posicao " + i);
      } else {
        System.out.println("Valores Diferentes na posicao " + i);
      }
    }

  }
}