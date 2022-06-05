package Listas.Lista8;

import java.util.Scanner;

// método simplificado
public class Ex04 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[5];
    String mostrarPar = "";
    String mostrarImpar = "";
    System.out.print("Digite " + vetor.length + " valores: ");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = in.nextInt();
      if (vetor[i] % 2 == 0) {
        mostrarPar += vetor[i] + " eh par\n";
      } else {
        mostrarImpar += vetor[i] + " eh impar\n";
      }
    }
    System.out.print(mostrarPar);
    System.out.print(mostrarImpar);
  }
}
