package Listas.Lista9;

import java.util.Scanner;
import java.util.Random;

public class Ex10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random aleat = new Random();

    int[][] Ma = new int[10][10];
    for (int i = 0; i < Ma.length; i++) {
      for (int j = 0; j < Ma.length; j++) {
        Ma[i][j] = aleat.nextInt(10);
        System.out.print(Ma[i][j] + "  ");
      }
      System.out.println();
    }
    // Linha
    System.out.println("Trocar segunda linha pela oitava");
    in.next();

    for (int i = 0; i < Ma.length; i++) {
      for (int j = 0; j < Ma.length; j++) {
        if (i == 1) {
          int aux = Ma[7][j];
          Ma[7][j] = Ma[1][j];
          Ma[1][j] = aux;
        }
        System.out.print(Ma[i][j] + "  ");
      }
      System.out.println();
    }
    // // Coluna
    System.out.println("Trocar quarta coluna pela decima coluna");
    in.next();
    for (int i = 0; i < Ma.length; i++) {
      for (int j = 0; j < Ma.length; j++) {
        if (j == 3) {
          int aux = Ma[i][9];
          Ma[i][9] = Ma[i][3];
          Ma[i][3] = aux;
        }
        System.out.print(Ma[i][j] + "  ");
      }
      System.out.println();
    }
    // Diagonal
    int k = Ma.length - 1;
    System.out.println("Trocar a  diagonal principal pela diagonal secundária.");
    in.next();
    for (int i = 0; i < Ma.length; i++) {
      for (int j = 0; j < Ma.length; j++) {
        if (i == j) {
          // k comeca com Ma.length-1
          int aux = Ma[i][k];
          Ma[i][k] = Ma[i][j];
          Ma[i][j] = aux;
          k--;
        }
      }
    }
    for (int i = 0; i < Ma.length; i++) {
      for (int j = 0; j < Ma.length; j++) {
        System.out.print(Ma[i][j] + "  ");
      }
      System.out.println();
    }
  }

}
