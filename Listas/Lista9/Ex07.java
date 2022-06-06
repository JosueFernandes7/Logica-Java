package Listas.Lista9;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] MA = new int[3][3];
    // Matriz
    System.out.println("Informe os elementos da matriz\n");
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA[i].length; j++) {
        System.out.print("MATRIZ[" + i + "][" + j + "] = ");
        MA[i][j] = in.nextInt();
      }
    }
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA.length; j++) {
        System.out.print(MA[i][j] + "  ");
      }
      System.out.println();
    }
    while (true) {
      System.out.print("Valor de x informado: ");
      int x = in.nextInt();
      Boolean invalido = true;
      for (int i = 0; i < MA.length; i++) {
        int soma = 0;
        for (int j = 0; j < MA[i].length; j++) {
          soma += MA[i][j];
        }
        if (soma == x) {
          System.out.println("Linha " + i);
          invalido = false;
        }
      }
      if (invalido)
        System.out.println("Nenhuma linha soma o valor informado");

    }
  }
}