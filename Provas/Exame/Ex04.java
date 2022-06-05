package Provas.Exame;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] matriz = new int[5][5];
    Random aleat = new Random();
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = aleat.nextInt(10);
        System.out.print(matriz[i][j] + "  ");
      }
      System.out.println();
    }
    while (true) {
      System.out.print("Informe a linha e coluna: ");
      int lin = in.nextInt();
      int col = in.nextInt();
      if (lin < 0 || lin >= matriz.length || col < 0 || col >= matriz.length) {
        break;
      }
      int soma = 0;
      for (int i = 0; i < matriz.length; i++) {
        soma += matriz[lin][i];
        soma += matriz[i][col];
      }
      soma -= matriz[lin][col];
      System.out.println("Soma = " + soma);

    }
  }
}
