package Listas.Lista9;

import java.util.Scanner;
import java.util.Random;

public class Ex05 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random aleat = new Random();
    int[][] Matriz = new int[10][10];
    for (int i = 0; i < Matriz.length; i++) {
      for (int j = 0; j < Matriz[i].length; j++) {
        Matriz[i][j] = aleat.nextInt(10);
        System.out.print(Matriz[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println("\n Abaixo da Diagonal Principal");

    // for (int k = 1; k <= i + 1; k++) {
    // System.out.print(" ");
    // }
    for (int i = 1; i < Matriz.length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(Matriz[i][j] + "  ");
      }
      System.out.println();
    }

  }
}