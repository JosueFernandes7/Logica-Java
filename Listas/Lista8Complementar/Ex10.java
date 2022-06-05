package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double[] vetor = new double[4];
    double media = 0;
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "] = ");
      vetor[i] = in.nextDouble();
      media += vetor[i];
    }
    media /= vetor.length;
    // DP
    double desvioPadrao = 0;
    for (int i = 0; i < vetor.length; i++) {
      desvioPadrao += Math.pow((vetor[i] - media), 2);
    }
    desvioPadrao /= vetor.length;
    desvioPadrao = Math.sqrt(desvioPadrao);
    System.out.printf("Desvio Padrao = %.2f", desvioPadrao);

  }
}