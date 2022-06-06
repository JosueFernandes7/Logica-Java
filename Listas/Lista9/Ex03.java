package Listas.Lista9;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] MA = new int[10][10];
    // Matriz A
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA[i].length; j++) {
        MA[i][j] = in.nextInt();
      }
    }
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA[i].length; j++) {
        if (i != j) {
          System.out.print(MA[i][j] + "   ");
        } else {
          System.out.print("    ");
        }
      }
      System.out.println();
    }

  }
}
