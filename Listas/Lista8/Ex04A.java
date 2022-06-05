package Listas.Lista8;

import java.util.Scanner;

// Esse método é para reduzir o consumo de bytes do vetor
public class Ex04A {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[5];
    int[] par = new int[5];
    int[] impar = new int[5];
    int indPar = 0, indImpar = 0;
    System.out.print("Digite " + vetor.length + " valores: ");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = in.nextInt();
      if (vetor[i] % 2 == 0) {
        par[indPar] = vetor[i];
        indPar++;
      } else {
        impar[indImpar] = vetor[i];
        indImpar++;
      }
    }
    System.out.println("Pares");
    for (int i = 0; i < indPar; i++) {
      System.out.println(par[i] + " eh par");
    }
    for (int i = 0; i < indImpar; i++) {
      System.out.println(impar[i] + " eh impar");
    }
  }
}
