package Provas.Exame;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[5];
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "] = ");
      vetor[i] = in.nextInt();
    }
    for (int linha = 0; linha < vetor.length; linha++) {
      if (vetor[linha] == 0) {
        for (int apontador = linha + 1; apontador < vetor.length; apontador++) {
          if (vetor[apontador] != 0) {
            int aux = vetor[apontador];
            vetor[apontador] = vetor[linha];
            vetor[linha] = aux;
            break;
          }
        }
      }
      System.out.println("Vetor Arrumado[" + linha + "] = " + vetor[linha]);
    }
  }
}
