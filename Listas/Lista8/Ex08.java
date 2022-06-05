package Listas.Lista8;

import java.util.Scanner;

// método simplificado
public class Ex08 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[20];
    System.out.println("Escolha um numero: ");
    int escolha = in.nextInt();
    int maiores = 0, menores = 0, igual = 0;
    System.out.println("Preencha o vetor");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("posicao " + i + ": ");
      vetor[i] = in.nextInt();
      if (vetor[i] > escolha)
        maiores++;
      if (vetor[i] < escolha)
        menores++;
      if (vetor[i] == escolha)
        igual++;
    }
    System.out.println("Maiores = " + maiores);
    System.out.println("Menores = " + menores);
    System.out.println("Iguais = " + igual);
  }
}
