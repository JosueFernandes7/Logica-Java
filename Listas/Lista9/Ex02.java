package Listas.Lista9;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Tamanho da Matriz: ");
    int n = in.nextInt();
    int[][] MAT = new int[n][n];
    for (int lin = 0; lin < MAT.length; lin++) {
      for (int col = 0; col < MAT[lin].length; col++) {
        if ((lin % 2 == 0 && col % 2 == 0) || (lin % 2 != 0 && col % 2 != 0)) {
          MAT[lin][col] = 0;
        } else {
          MAT[lin][col] = 1;
        }
        System.out.print(MAT[lin][col] + " ");
      }
      System.out.println();
    }
  }
}