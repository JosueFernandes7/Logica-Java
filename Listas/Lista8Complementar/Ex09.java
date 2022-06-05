package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] antigo = { 1 };
    int[] novo;
    int n = in.nextInt();
    while (n != 0) {
      for (int i = 0; i < antigo.length; i++) {
        System.out.print(antigo[i] + " ");
      }
      System.out.println();

      novo = new int[antigo.length + 1];
      novo[0] = 1;
      novo[novo.length - 1] = 1;
      for (int i = 1; i < novo.length - 1; i++) {
        novo[i] = antigo[i] + antigo[i - 1];
      }
      antigo = novo;
      n--;
    }
  }
}