package Listas.Lista9;

import java.util.Scanner;
public class Ex01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] MA = new int[3][3];
    int[][] MB = new int[3][3];
    int[][] MC = new int[3][3];
    String MatrizA = "";
    String MatrizB = "";
    // Matriz A
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA[i].length; j++) {
        MA[i][j] = in.nextInt();
        MatrizA += MA[i][j] + " ";
      }
      MatrizA += "\n";
    }
    // Matriz B
    for (int i = 0; i < MB.length; i++) {
      for (int j = 0; j < MB[i].length; j++) {
        MB[i][j] = in.nextInt();
        MatrizB += MB[i][j] + " ";
      }
      MatrizB += "\n";
    }
    System.out.println("Matriz A\n" + MatrizA);
    System.out.println("Matriz B\n" + MatrizB);
    System.out.println("Matriz C");
    // Matriz C
    for (int i = 0; i < MC.length; i++) {
      for (int j = 0; j < MC[i].length; j++) {
        MC[i][j] = MA[i][j] + MB[i][j];
        System.out.print(MC[i][j] + " ");
      }
      System.out.println();
    }

  }
}
