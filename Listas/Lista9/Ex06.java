package Listas.Lista9;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] MA = new int[5][5];
    // Matriz
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA[i].length; j++) {
        if (i == j)
          MA[i][j] = 0;
        else {
          System.out.print("MATRIZ[" + i + "][" + j + "] = ");
          MA[i][j] = in.nextInt();
        }
      }
    }
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA[i].length; j++) {
        System.out.print(MA[i][j] + "  ");
      }
      System.out.println();
    }
  }
}
